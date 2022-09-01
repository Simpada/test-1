import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test {


    @Test
    void oneToI() {
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

    private String convertToRoman(int number) {
        if(number == 5){
            return "V";
        }

        String value = "";
        for (int i = 0; i < number; i++) {
            value += "I";
        }
        return value;
    }

}

//større penis

