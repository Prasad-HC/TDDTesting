package com.prasad;


import com.prasad.impl.StringUtilImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;


public class StringUtilsTest {

  private StringUtil stringUtil;

  @BeforeEach
  void setUp() {
    stringUtil = new StringUtilImpl();
  }

  @Test
    public void testForNullInput() {
    assertThrows(IllegalArgumentException.class, () -> stringUtil.sumOfDigits(null));
    }
}
