package challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ChallengeTest {
    
    @Test
    public void testCase1() {
        int[] list = {7, 6, 4, -1, 1, 2};
        var outList = SumCombination.fourNumberSum(list, 16);
        assertEquals(2, outList.size());
        for (int[] integers : outList) {
            Integer reduce = Arrays.stream(integers).reduce(0, Integer::sum);
            assertEquals(16, reduce);
        }
    }
    
    @Test
    public void testCase2() {
        int[] list = {7, 6, 4, -1, 1, 2};
        var outList = SumCombination.fourNumberSum(list, 10);
        assertEquals(1, outList.size());
        for (int[] integers : outList) {
            Integer reduce = Arrays.stream(integers).reduce(0, Integer::sum);
            assertEquals(10, reduce);
        }
    }
    
    @Test
    public void testCase3() {
        int[] list = {5, -5, -2, 2, 3, -3};
        var outList = SumCombination.fourNumberSum(list, 0);
        assertEquals(3, outList.size());
        for (int[] integers : outList) {
            Integer reduce = Arrays.stream(integers).reduce(0, Integer::sum);
            assertEquals(0, reduce);
        }
    }
    
    @Test
    public void testCase4() {
        int[] list = {-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var outList = SumCombination.fourNumberSum(list, 4);
        assertEquals(4, outList.size());
        for (int[] integers : outList) {
            Integer reduce = Arrays.stream(integers).reduce(0, Integer::sum);
            assertEquals(4, reduce);
        }
    }
    
    @Test
    public void testCase5() {
        int[] list = {-1, 22, 18, 4, 7, 11, 2, -5, -3};
        var outList = SumCombination.fourNumberSum(list, 30);
        assertEquals(5, outList.size());
        for (int[] integers : outList) {
            Integer reduce = Arrays.stream(integers).reduce(0, Integer::sum);
            assertEquals(30, reduce);
        }
    }
    
    @Test
    public void testCase6() {
        int[] list = {-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5};
        var outList = SumCombination.fourNumberSum(list, 20);
        assertEquals(7, outList.size());
        for (int[] integers : outList) {
            Integer reduce = Arrays.stream(integers).reduce(0, Integer::sum);
            assertEquals(20, reduce);
        }
    }
    
    @Test
    public void testCase7() {
        int[] list = {1, 2, 3, 4, 5};
        var outList = SumCombination.fourNumberSum(list, 100);
        assertEquals(0, outList.size());
        for (int[] integers : outList) {
            Integer reduce = Arrays.stream(integers).reduce(0, Integer::sum);
            assertEquals(100, reduce);
        }
    }
    
    @Test
    public void testCase8() {
        int[] list = {1, 2, 3, 4, 5, -5, 6, -6};
        var outList = SumCombination.fourNumberSum(list, 5);
        assertEquals(6, outList.size());
        for (int[] integers : outList) {
            Integer reduce = Arrays.stream(integers).reduce(0, Integer::sum);
            assertEquals(5, reduce);
        }
    }
    
}
