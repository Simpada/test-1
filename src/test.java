import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    void one () {
        assertEquals("I", convertToRoman(1));
    }

    @Test
    void two(){
        assertEquals("II", convertToRoman(2));
    }

    @Test
    void five() {
        assertEquals("V", convertToRoman(5));
    }

    @Test
    void four() {
        assertEquals("IV", convertToRoman(4));
    }

    @Test
    void six() {
        assertEquals("VI", convertToRoman(6));
    }

    @Test
    void ten() {
        assertEquals("X", convertToRoman(10));
    }

    @Test
    void nine() {
        assertEquals("IX", convertToRoman(9));
    }

    @Test
    void fifteen(){
        assertEquals("XV", convertToRoman(15));
    }

    @Test
    void fourteen(){
        assertEquals("XIV", convertToRoman(14));
    }

    @Test
    void nineteen(){
        assertEquals("XIX", convertToRoman(19));
    }

    @Test
    void twenty(){
        assertEquals("XX", convertToRoman(20));
    }

    @Test
    void fifty(){
        assertEquals("L", convertToRoman(50));
    }

    @Test
    void forty(){
        assertEquals("XL", convertToRoman(40));
    }

    private String convertToRoman(int number) {
        String value = "";

        // If value +1 is divisible by 10/5 etc. add I
        if(number >= 50){
            value += "L";
            number -= 50;
        }

        while (number >= 10) {
            value += "X";
            number -= 10;
        }
        if(number == 9){
            value += "IX";
            number -= 9;
        }

        if(number >= 5){
            value += "V";
            number -= 5;
        } else if (number == 4) {
            value += "IV";
            number -= 4;
        }

        for (int i = 0; i < number; i++) {
            value += "I";
        }
        return value;
    }

}

//huge slong

