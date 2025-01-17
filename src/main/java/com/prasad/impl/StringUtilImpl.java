package com.prasad.impl;

import com.prasad.StringUtil;

public class StringUtilImpl implements StringUtil {


    @Override
    public Double sumOfDigits(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return 0.0;
    }
}
