package com.prasad;


import com.prasad.impl.StringUtilImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringUtilsTest {

  private StringUtil stringUtil;

  /**
   * Setup method for test to run before each test run
   */
  @BeforeEach
  void setUp() {
    stringUtil = new StringUtilImpl();
  }

  /**
   * Test sumOfDigits for null input
   */
  @Test
    public void testForNullInput() {
    assertThrows(IllegalArgumentException.class, () -> stringUtil.sumOfDigits(null));
    }

  /**
   * Test sumOfDigits for empty string input
   */
  @Test
  public void testForEmptyInput() {
    assertThrows(IllegalArgumentException.class, () -> stringUtil.sumOfDigits(""));
  }

  /**
   * Test sumOfDigits for valid input string with numbers
   */
  @Test
  public void testValidNumbers() {
    assertEquals(10,  stringUtil.sumOfDigits("1,2,3,4"), "1");
  }

  /**
   * Test sumOfDigits for valid input string with numbers but spaces arround each valid number
   */
  @Test
  public void testSpceArroundNumbers() {
    assertEquals(10,  stringUtil.sumOfDigits("1 ,2 , 3, 4 "), "2");
  }

  /**
   * Test sumOfDigits for  input string with character sequence
   */
  @Test
  public void testInvalidStringOfCharacters() {
    assertEquals(0,  stringUtil.sumOfDigits("asdsad,asd , jhf, tertr "), "3");
  }

  /**
   * Test sumOfDigits for  input string with empty values in
   */
  @Test
  public void testEmptyValuesInValidString(){
    assertEquals(4,  stringUtil.sumOfDigits("1,,3"), "4");
  }

  /**
   * Test sumOfDigits for  input string with comma seperated string values in
   */
  @Test
  public void testIntgerValueWithStringValuesInInput(){
    assertEquals(4,  stringUtil.sumOfDigits("1,asdhsald,3"), "5");
  }

  /**
   * Test sumOfDigits for input string with comma seperated decimal values in
   */
  @Test
  public void testDecimalInInput(){
    assertEquals(6,  stringUtil.sumOfDigits("1.1,2.2,3.3"), "6");
  }


  /**
   * Test sumOfDigits for input string with comma seperated different data types
   * so this is master test case catering all cases method can handle of
   */
  @Test
  public void testMixedDataTypeInput(){
    assertEquals(31,  stringUtil.sumOfDigits("1.1,asdf,,3, ,null,9,   18   "), "7");
  }
}
