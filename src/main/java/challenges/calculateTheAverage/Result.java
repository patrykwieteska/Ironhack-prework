package challenges.calculateTheAverage;

import org.junit.Assert;
import org.junit.Test;

public class Result {

    public double average(Integer[] numList) {
        double sum=0;

        for (int d:numList) {
            sum=sum+d;
        }
        return sum / numList.length;
    }


    @Test
    public void test() {
        Integer[] numbers = {15,2,3,4,5,10,11,15};

        Assert.assertEquals(8.125, average(numbers),0.0);
    }
}
