package com.home.backend.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author guxc
 * @date 2020/9/6
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserUtil {

    public static final String DEFAULT_USER = "system";

    public static String getCombName() {
        return "system";
    }
}
