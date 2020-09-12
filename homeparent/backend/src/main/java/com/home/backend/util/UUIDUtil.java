package com.home.backend.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author GTsung
 * @date 2020/9/6
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UUIDUtil {

    public static String UUID32() {
        return UUID.randomUUID().toString().replace("-","");
    }

    public static void main(String[] args) {
        System.out.println(UUIDUtil.UUID32());
    }
}
