package com.example.Lab_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class calculatorTest {
    calculator calculator=new calculator();
    int a, b, result;

    @Test //Test# 01
    void testAddition(){
        a=6;
        b=8;
        result =calculator.add(a,b);

        Assertions.assertEquals(14,result);
        System.out.println("Addition function is working");

    }
    @Test //Test# 02
    void  testSubstruction(){
        a= 15;
        b= 5;
        result= calculator.subtract(a,b);

        Assertions.assertEquals(10,result);
        System.out.println("Substruction function is working");
    }
    @Test //Test# 03
    void testMultiply(){
        a=3;
        b=8;
    result= calculator.multiply(a,b);
        Assertions.assertEquals(24,result);
        System.out.println("Multiplication function is working");
    }
    @Test //Test# 04
    void testDivision(){
        a=9;
        b=3;
       double result= calculator.divide(a,b);
        Assertions.assertEquals(3,result);
        System.out.println("Division function is working");
    }
    @Test //Test# 05
    void testSquareRoofOf (){
         a=5 ;
        double expectedResult= 2.23606797749979;
        double result= calculator.squareRootOf(a);
        Assertions.assertEquals(expectedResult, result);
        System.out.println("squareRoofOf function is working");
    }
    @Test //Test# 06
    void testGetArea (){
        // PI= 3.141592653589793
        a= 4;
        double expectedArea=50.27;
        double calculatedArea =calculator.getArea(a);
        Assertions.assertEquals(expectedArea,calculatedArea);
        System.out.println("Area function is working");
    }

}
