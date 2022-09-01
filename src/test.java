import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    void one() {
        assertEquals("I", convertToRoman(1));
    }

    @Test
    void two() {
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
    void fifteen() {
        assertEquals("XV", convertToRoman(15));
    }

    @Test
    void fourteen() {
        assertEquals("XIV", convertToRoman(14));
    }

    @Test
    void nineteen() {
        assertEquals("XIX", convertToRoman(19));
    }

    @Test
    void twenty() {
        assertEquals("XX", convertToRoman(20));
    }

    @Test
    void fifty() {
        assertEquals("L", convertToRoman(50));
    }

    @Test
    void forty() {
        assertEquals("XL", convertToRoman(40));
    }

    @Test
    void fortyNine() {
        assertEquals("XLIX", convertToRoman(49));
    }

    @Test
    void hundred() {
        assertEquals("C", convertToRoman(100));
    }

    @Test
    void ninety() {
        assertEquals("XC", convertToRoman(90));
    }

    @Test
    void fiveHundred() {
        assertEquals("D", convertToRoman(500));
    }

    @Test
    void fourHundred() {
        assertEquals("CD", convertToRoman(400));
    }

    @Test
    void thousand() {
        assertEquals("M", convertToRoman(1000));
    }

    @Test
    void nineHundred() {
        assertEquals("CM", convertToRoman(900));
    }

    @Test
    void ultimateTest() {
        assertEquals("MCMXCVI", convertToRoman(1996));
        assertEquals("MCMXCIX", convertToRoman(1999));
        assertEquals("MDCCCLIV", convertToRoman(1854));
        assertEquals("MMMMDCCCLIV", convertToRoman(4854));
        assertEquals("MMDCLII", convertToRoman(2652));
        assertEquals("MMMMMMMDXXIII", convertToRoman(7523));
        assertEquals("MMMMCMXCIX", convertToRoman(4999));
    }
    // ( •_•)>⌐■-■
    // (⌐■_■)


    private String convertToRoman(int number) {
        StringBuilder value = new StringBuilder();

        while (number >= 1000) {
            value.append("M");
            number -= 1000;
        }
        if (number >= 900) {
            value.append("CM");
            number -= 900;
        }

        if (number >= 500) {
            value.append("D");
            number -= 500;
        } else if (number >= 400) {
            value.append("CD");
            number -= 400;
        }

        while (number >= 100) {
            value.append("C");
            number -= 100;
        }
        if (number >= 90) {
            value.append("XC");
            number -= 90;
        }

        if (number >= 50) {
            value.append("L");
            number -= 50;
        } else if (number >= 40) {
            value.append("XL");
            number -= 40;
        }

        while (number >= 10) {
            value.append("X");
            number -= 10;
        }
        if (number == 9) {
            value.append("IX");
            number -= 9;
        }

        if (number >= 5) {
            value.append("V");
            number -= 5;
        } else if (number == 4) {
            value.append("IV");
            number -= 4;
        }

        for (int i = 0; i < number; i++) {
            value.append("I");
        }
        return value.toString();
    }

}

//colossal mega- penis 😮

//(╯°□°）╯︵ ┻━┻







































/*
Hidden update:
hei!
 */