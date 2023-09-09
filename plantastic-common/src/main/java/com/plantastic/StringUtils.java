package com.plantastic;


import java.util.List;

public class StringUtils {
    private StringUtils() {
        //no-op
    }

    public static String join(List<String> source) {
        return JoinUtils.join(source);
    }

    public static List<String> split(String source) {
        return SplitUtils.split(source);
    }
}
