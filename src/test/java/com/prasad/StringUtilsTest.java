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
    assertThrows(IllegalArgumentException.class, () -> stringUtil.sumOfDigits(""));
  }

  @Test
  public void testValidNumbers() {
    assertEquals(10,  stringUtil.sumOfDigits("1,2,3,4"), "1");
  }


  @Test
  public void testSpceArroundNumbers() {
    assertEquals(10,  stringUtil.sumOfDigits("1 ,2 , 3, 4 "), "2");
  }

  @Test
  public void testInvalidStringOfCharacters() {
    assertEquals(0,  stringUtil.sumOfDigits("asdsad,asd , jhf, tertr "), "3");
  }

  @Test
  public void testEmptyValuesInValidString(){
    assertEquals(4,  stringUtil.sumOfDigits("1,,3"), "4");
  }

  @Test
  public void testIntgerValueWithStringValuesInInput(){
    assertEquals(4,  stringUtil.sumOfDigits("1,asdhsald,3"), "5");
  }


  @Test
  public void testDecimalInInput(){
    assertEquals(6,  stringUtil.sumOfDigits("1.1,2.2,3.3"), "6");
  }

  @Test
  public void testMixedDataTypeInput(){
    assertEquals(31,  stringUtil.sumOfDigits("1.1,asdf,,3, ,null,9,   18   "), "7");
  }
}
