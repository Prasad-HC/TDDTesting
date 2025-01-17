package com.prasad;


import com.prasad.impl.StringUtilImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


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

  @Test
  public void testForEmptyInput() {
    assertThrows(IllegalArgumentException.class, () -> stringUtil.sumOfDigits("  "));
  }

  @Test
  public void testValidNumbers() {
    assertEquals(10,  stringUtil.sumOfDigits("1,2,3,4"), "1");
  }


  @Test
  public void testSpceArroundNumbers() {
    assertEquals(10,  stringUtil.sumOfDigits("1 ,2 , 3, 4 "), "2");
  }



}
