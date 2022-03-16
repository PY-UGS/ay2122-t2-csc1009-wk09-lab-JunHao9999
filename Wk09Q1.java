import java.util.*;
public class Wk09Q1 {
    Random r = new Random();
    //Method to return random lower case letters <<int for ASCII>>
    public char getRandomLowerCaseLetter() {
        return (char) (r.nextInt(26) + 'a');
    }
    //Method to return random Upper case letters
    public char getRandomUpperCaseletter(){
        return (char) (r.nextInt(26) + 'A');
    }
    public char getRandomDigitCharacter(){
        int temp=48; //ASCII '0' = 48
        return (char)(temp+r.nextInt(10));
    }
    public char getRandomCharacter(){
        int selected=0;
        selected=r.nextInt(3);
        if(selected==0){
            return getRandomLowerCaseLetter();
        }
        else if(selected==1){
            return getRandomUpperCaseletter();
        }
        else if(selected==2){
            return getRandomDigitCharacter();
        }
        else
            return '1'; //
    }
}

