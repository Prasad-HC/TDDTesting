package com.prasad;


import com.prasad.impl.StringUtilImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class StringUtilsTest {

  private StringUtil stringUtil;

  @BeforeEach
  void setUp() {
    stringUtil = new StringUtilImpl();
  }

  @Test
    public void testForNullInput() {

    }
}
