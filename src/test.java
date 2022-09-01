import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test {


    @Test
    void oneToI () {
        assertTrue(convertToRoman(1) == "I");
    }

    @Test
    void twoToII(){
        assertTrue(convertToRoman(2) == "II");
    }

    private String convertToRoman(int number) {
        return "I";
    }

}

//liten penis
