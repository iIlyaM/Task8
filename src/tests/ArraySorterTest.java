package tests;

import common.ArraySorter;
import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {

    @Test
    public void test1() {
        int[][] sourceArray = {{6, 11, 15, 4}, {4, 8, 25, 64}};
        int[][] sortedArray = ArraySorter.sortArray(sourceArray);
        int[][] expectedArray = {{4, 6, 11, 15}, {64, 4, 8, 25}};
        Assert.assertArrayEquals(sortedArray, expectedArray);
    }

    @Test
    public void test2() {
        int[][] sourceArray = {{6, 48, 125, 15, 3, 3}, {7, 6, 9, 85, 17, 148}};
        int[][] sortedArray = ArraySorter.sortArray(sourceArray);
        int[][] expectedArray = {{3, 3, 6, 15, 48, 125}, {17, 148, 7, 85, 6, 9}};
        Assert.assertArrayEquals(sortedArray, expectedArray);
    }

    @Test
    public void test3() {
        int[][] sourceArray = {{1, 1, 1, 1}, {25, 14, 2, 2}, {14, 8, 3, 3}, {5, 4, 18, 5}};
        int[][] sortedArray = ArraySorter.sortArray(sourceArray);
        int[][] expectedArray = {{1, 1, 1, 1}, {2, 2, 14, 25}, {3, 3, 8, 14}, {5, 18, 4, 5}};
        Assert.assertArrayEquals(sortedArray, expectedArray);
    }

    @Test
    public void test4() {
        int[][] sourceArray = {{25, 25, 12}, {48, 48, 56}, {36, 2, 54}, {1, 1, 1}, {48, 54, 6}};
        int[][] sortedArray = ArraySorter.sortArray(sourceArray);
        int[][] expectedArray = {{12, 25, 25}, {56, 48, 48}, {54, 2, 36}, {1, 1, 1}, {6, 54, 48}};
        Assert.assertArrayEquals(sortedArray, expectedArray);
    }

    @Test
    public void test5() {
        int[][] sourceArray = {{54, 78, 6, 7, 12, 12, 12, 44}, {5, 7, 6, 12, 47, 55, 55, 33},
                {1, 98, 45, 3, 145, 111, 111, 4}, {78, 45, 1, 3, 45, 68, 4, 67}};
        int[][] sortedArray = ArraySorter.sortArray(sourceArray);
        int[][] expectedArray = {{6, 7, 12, 12, 12, 44, 54, 78}, {6, 12, 47, 55, 55, 33, 5, 7},
                {45, 3, 145, 111, 111, 4, 1, 98}, {1, 3, 45, 4, 68, 67, 78, 45}};
        Assert.assertArrayEquals(sortedArray, expectedArray);
    }
}
