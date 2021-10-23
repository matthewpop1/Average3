import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedAverageTest {
    @Test
    void averageTest1() {
        Assertions.assertEquals(0, ModifiedAverage.average(-7,new int[]{1,2,3,4,5}));
    }
    @Test
    void averageTest2() {
        Assertions.assertEquals(0, ModifiedAverage.average(0,new int[]{1,2,3,4,5}));
    }
    @Test
    void averageTest3() {
        Assertions.assertEquals(2, ModifiedAverage.average(3,new int[]{1,2,3,4,5}));
    }
    @Test
    void averageTest4() {
        Assertions.assertEquals(3, ModifiedAverage.average(10,new int[]{1,2,3,4,5}));
    }
    @Test
    void averageTest5() {
        Assertions.assertEquals(0, ModifiedAverage.average(4,new int[]{}));
    }
    @Test
    void averageTest6() {
        Assertions.assertEquals(7.5, ModifiedAverage.average(4,new int[]{3,6,9,12}));
    }
    @Test
    void averageTest7() {
        Assertions.assertEquals(2.5, ModifiedAverage.average(4,new int[]{1,2,3,4,5}));
    }
}