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

        number = convertDigit(value, number, 1000, "M");
        number = convertDigit(value, number, 900, "CM");
        number = convertDigit(value, number, 500, "D");
        number = convertDigit(value, number, 400, "CD");
        number = convertDigit(value, number, 100, "C");
        number = convertDigit(value, number, 90, "XC");
        number = convertDigit(value, number, 50, "L");
        number = convertDigit(value, number, 40, "XL");
        number = convertDigit(value, number, 10, "X");
        number = convertDigit(value, number, 9, "IX");
        number = convertDigit(value, number, 5, "V");
        number = convertDigit(value, number, 4, "IV");
        convertDigit(value, number, 1, "I");

        return value.toString();
    }

    private int convertDigit(StringBuilder value, int number, int digitValue, String digitSymbol) {
        while (number >= digitValue) {
            value.append(digitSymbol);
            number -= digitValue;
        }
        return number;
    }

}

//colossal mega- penis 😮

//(╯°□°）╯︵ ┻━┻







































/*
Hidden update:
hei!
 */