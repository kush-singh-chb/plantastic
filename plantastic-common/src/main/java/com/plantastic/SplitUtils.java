package com.plantastic;

import java.util.LinkedList;
import java.util.List;

class SplitUtils {

    private SplitUtils() {
        //no-op
    }

    public static List<String> split(String source) {
        int lastFind = 0;
        int currentFind = 0;
        var result = new LinkedList<String>();

        while ((currentFind = source.indexOf(" ", lastFind)) != -1) {
            String token = source.substring(lastFind);
            if (currentFind != -1) {
                token = token.substring(0, currentFind - lastFind);
            }

            addIfValid(token, result);
            lastFind = currentFind + 1;
        }

        String token = source.substring(lastFind);
        addIfValid(token, result);

        return result;
    }

    private static void addIfValid(String token, List<String> list) {
        if (isTokenValid(token)) {
            list.add(token);
        }
    }

    private static boolean isTokenValid(String token) {
        return !token.isEmpty();
    }
}
