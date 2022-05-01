import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {
//        //Test Data:
////-345 →  “Odd”
////0 →  “Even”
////222222 →  “Even”
////2147483647 + 1 →  “Undefined”

    @Test
    public void testOddEvenHappyPathOddNegative() {

        int number = -345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven() ;
        String actualResult = oddEven.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenHappyPathEvenZero() {

        int number = 0;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven() ;
        String actualResult = oddEven.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenHappyPathEvenPositive() {

        int number = 222222;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven() ;
        String actualResult = oddEven.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenHappyPathMoreThenMax() {

        long number = 2147483648L;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testOddEvenZero() {

        long number = 0;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }



}
