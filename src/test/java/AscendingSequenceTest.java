import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {

    @Order(1)
    @Test
    public void testAscendingSequenceHappyPath() {
//        0, 1, 2, 3, 4, 5,
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumbers() {
        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathFromNegativeToPositive() {
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testAscendingStartLargerThanEnd() {
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testAscendingSequenceNegativeStep() {
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testAscendingSequenceStepZero() {
//        0, 1, 2, 3, 4, 5,
        int start = 0;
        int end = 5;
        int step = 0;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
