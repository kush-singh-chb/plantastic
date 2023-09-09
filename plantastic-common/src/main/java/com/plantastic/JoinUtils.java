package com.plantastic;

import java.util.List;

class JoinUtils {

    private JoinUtils() {
        //no-op
    }

    public static String join(List<String> source) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < source.size(); ++i) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(source.get(i));
        }

        return result.toString();
    }
}
