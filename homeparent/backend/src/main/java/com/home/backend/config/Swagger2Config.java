package com.home.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问地址：localhost:8861/busiflow/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("v0")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.home.backend.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("common-web")
                .description("common web test platform")
                .termsOfServiceUrl("www.kaoyao.com")
                .version("v0.0")
                .build();
    }


    @Bean
    public Docket api() {
        //可以添加多个header或参数
        ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder
                .parameterType("header") //参数类型支持header, cookie, body, query etc
                .name("token") //参数名
                .defaultValue("token") //默认值
                .description("header中token字段测试")
                .modelRef(new ModelRef("string"))//指定参数值的类型
                .required(false).build(); //非必需，这里是全局配置，然而在登陆的时候是不用验证的
        List<Parameter> aParameters = new ArrayList<Parameter>();
        aParameters.add(aParameterBuilder.build());
        return new Docket(DocumentationType.SWAGGER_2).groupName("v1")
                .select().apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.ant("/test/**")).build()
                .paths(PathSelectors.any()).build()
                .apiInfo(apiInfo1()).globalOperationParameters(aParameters);
    }

    private ApiInfo apiInfo1() {
        return new ApiInfoBuilder()
                .title("exampleApi 0.01")
                .termsOfServiceUrl("www.example.com")
                .contact(new Contact("liumei","http://blog.csdn.net/pc_gad","hilin2333@gmail.com"))
                .version("v1.0")
                .build();
    }
}
