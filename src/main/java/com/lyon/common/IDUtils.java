package com.lyon.common;

import java.util.UUID;

public class IDUtils {
    public static String getId(){
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("\\-", "");
    }
}
