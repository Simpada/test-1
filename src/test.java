import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test {


    @Test
    void oneToI () {
        assertEquals("I", convertToRoman(1));
    }

    @Test
    void twoToII(){
        assertEquals("II", convertToRoman(2));
    }

    @Test
    void fiveToV() {
        assertEquals("V", convertToRoman(5));
    }

    @Test
    void fourtoIV() {
        assertEquals("IV", convertToRoman(4));
    }

    @Test
    void sixToVI() {
        assertEquals("VI", convertToRoman(6));
    }

    @Test
    void tenToX() {
        assertEquals("X", convertToRoman(10));
    }

    @Test
    void nineToIX() {
        assertEquals("IX", convertToRoman(9));
    }

    private String convertToRoman(int number) {
        String value = "";

        if (number >= 10) {
            value += "X";
            number -= 10;
        }

        if(number >= 5){
            value += "V";
            number -= 5;
        } else if (number == 4) {
            return "IV";
        }

        for (int i = 0; i < number; i++) {
            value += "I";
        }
        return value;
    }

}

//micro penis

