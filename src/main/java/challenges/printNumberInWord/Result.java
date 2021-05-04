package challenges.printNumberInWord;

import org.junit.Assert;
import org.junit.Test;



public class Result {
    public static String printNumberInWord(int num) {
        switch (num) {
            case 1:
                return "ONE";
            case 2:
                return "TWO";
            case 3:
                return "THREE";
            case 4:
                return "FOUR";
            case 5:
                return "FIVE";
            case 6:
                return "SIX";
            case 7:
                return "SEVEN";
            case 8:
                return "EIGHT";
            case 9:
                return "NINE";
            default: return "OTHER";
        }
    }

    @Test
    public void test () {
        String sNumber = printNumberInWord(5);
        Assert.assertEquals("FIVE",sNumber);
    }
}
