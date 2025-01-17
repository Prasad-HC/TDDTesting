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
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
