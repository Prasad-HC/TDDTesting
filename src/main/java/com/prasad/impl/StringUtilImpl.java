package com.prasad.impl;

import com.prasad.StringUtil;

import java.util.stream.Stream;

public class StringUtilImpl implements StringUtil {


    @Override
    public int sumOfDigits(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        return Stream.of(str.split(","))
                .map(String::trim)
                .filter(this::isNumeric)
                .mapToInt(s -> (int) Double.parseDouble(s))
                .sum();
    }


    /**
     * Checks if a string can be parsed as a number.
     */
    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
