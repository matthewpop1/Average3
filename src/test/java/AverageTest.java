import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageTest {
    @Test
    void averageTest1() {
        Assertions.assertEquals(0, Average.average(-7,new int[]{1,2,3,4,5}));
    }
    @Test
    void averageTest2() {
        Assertions.assertEquals(0, Average.average(0,new int[]{1,2,3,4,5}));
    }
    @Test
    void averageTest3() {
        Assertions.assertEquals(2, Average.average(3,new int[]{1,2,3,4,5}));
    }
    @Test
    void averageTest4() {
        Assertions.assertEquals(3, Average.average(10,new int[]{1,2,3,4,5}));
    }
    @Test
    void averageTest5() {
        Assertions.assertEquals(0, Average.average(4,new int[]{}));
    }
    @Test
    void averageTest6() {
        Assertions.assertEquals(7.5, Average.average(4,new int[]{3,6,9,12}));
    }
    @Test
    void averageTest7() {
        Assertions.assertEquals(2.5, Average.average(4,new int[]{1,2,3,4,5}));
    }
}
