import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    //Test Data:
//{0, 1, 2, 3, 4, 5} → 15
//{-7, -3} → -10

    @Test
    public void TestSumArrayHappyPathPositive() {
        double[] array = new double[] {0, 1, 2, 3, 4, 5};
        double expectedResult = 15;

        SumArray sumArray = new SumArray();
        double actualResult = sumArray.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestSumHappyPathNegative() {
        double[] array = new double[] {-7, -3};
        double expectedResult = -10;

        SumArray sumArray = new SumArray();
        double actualResult = sumArray.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestSumPositiveNegative() {
        double[] array = new double[] {-7, -3, 0, 3, -100, 150};
        double expectedResult = 43;

        SumArray sumArray = new SumArray();
        double actualResult = sumArray.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestSumPositiveNegativeDouble() {
        double[] array = new double[] {-7.45, -3.098, 0.1, 3.4009, -100, 150};
        double expectedResult = 42.9529;

        SumArray sumArray = new SumArray();
        double actualResult = sumArray.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
