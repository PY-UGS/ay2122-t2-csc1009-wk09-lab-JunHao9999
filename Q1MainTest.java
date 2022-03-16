import org.junit.jupiter.api.Test;

import static java.lang.Character.isLetterOrDigit;
import static org.junit.jupiter.api.Assertions.*;


class Q1MainTest {
    Wk09Q1 q1=new Wk09Q1();
    @Test   //test if return is char
    void testRandomCharacter() {
        assertTrue(isLetterOrDigit(q1.getRandomCharacter()));
    }
    @Test //is Prime
    void testRandomDigitCharacter(){
        int value=(int)q1.getRandomDigitCharacter()-48; //to get actual value
        assertTrue(isPrime(value));
    }

    public boolean isPrime(int num){
        if (num<=1)
                return false;
        for(int i=2;i<num;i++){
            if (num%i==0) //divisable therefore not prime
                return false;
        }
        return true;
    }

}