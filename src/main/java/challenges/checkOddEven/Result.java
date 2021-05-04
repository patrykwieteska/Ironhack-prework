package challenges.checkOddEven;

import org.junit.Test;

public class Result {
    public void checkOddEven(int num) {
        if(num % 2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }


    @Test
    public void test() {
        checkOddEven(3242);
        checkOddEven(3581);
    }
}
