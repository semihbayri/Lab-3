package com.example.Lab_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class validatorTest {
    validator validator = new validator();

    @Test //Test# 07
    void testValidPhoneNumber() {

        Assertions.assertTrue(com.example.Lab_3.validator.isPhoneNumberValid("0764656565"));
        System.out.println("The Phone number is valid");
    }
    //  Negative test case phone number
   @Test //Test# 08
    void testNumberIsNotStartingWithZero(){
       Assertions.assertFalse(com.example.Lab_3.validator.isPhoneNumberValid("764656565"));
       System.out.println("The Phone number is invalid");
   }
   @Test //Test# 09
    void testValidEmail(){
        Assertions.assertTrue(com.example.Lab_3.validator.isEmailValid("samuel.brist@gmail.com"));
       System.out.println("The e-mail is valid");
    }
    //Negative test case for email
    @Test //Test# 010
    void testInvalidEmail(){
        Assertions.assertFalse(com.example.Lab_3.validator.isEmailValid("samuelbrist.gmail.com"));

    }



}
