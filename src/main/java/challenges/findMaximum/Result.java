package challenges.findMaximum;

import org.junit.Assert;
import org.junit.Test;

public class Result {
    public static Integer maximum(Integer[] numList) {

        int currentMax = numList[0];
        for (int i = 1; i <numList.length ; i++) {
            if(numList[i]>currentMax)
                currentMax=numList[i];
        }
        return currentMax;
    }

    @Test
    public void test() {
        Integer[] numbers = {121,123,124,124,600,599,600,501,2,32};
        Assert.assertEquals (Integer.valueOf(600),maximum(numbers));
    }
}
