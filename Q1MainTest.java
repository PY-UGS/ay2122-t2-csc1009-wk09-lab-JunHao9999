import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static java.lang.Character.isLetterOrDigit;
import static org.junit.jupiter.api.Assertions.*;


class Q1MainTest {
    Wk09Q1 q1=new Wk09Q1();
    @RepeatedTest(15)    //test if return is char
    void testRandomCharacter() {
        char testChar=q1.getRandomCharacter();
        System.out.println("Q1 value: "+testChar);
        boolean isLD = isLetterOrDigit(testChar);
        if (isLD==true){
            System.out.println(testChar+" is character");
        }
        else{
            System.out.println(testChar+" is character");
        }
        assertTrue(isLetterOrDigit(testChar));
    }
    @RepeatedTest(15) //is Prime
    void testRandomDigitCharacter(){
        int value=(int)q1.getRandomDigitCharacter()-48; //to get actual value
        System.out.println("Q2 value: "+value);
        boolean isPrimeBool=isPrime(value);
        if (isPrimeBool==true){
            System.out.println(value+" is prime");
        }
        if (isPrimeBool==false){
            System.out.println(value+" is not prime");
        }
        assertTrue(isPrime(value));
    }

    public boolean isPrime(int num){
        if (num<=0)
            return false;
        if (num==1)
                return true;
        for(int i=2;i<num;i++){
            if (num%i==0) //divisable therefore not prime
                return false;
        }
        return true;
    }

}