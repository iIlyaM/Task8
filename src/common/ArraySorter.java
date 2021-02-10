package common;

public class ArraySorter {

    public static int[][] sortArray(int[][] arr) {
        for (int c = 0; c < arr[0].length; c++) {
            int minIndex = c;
            for (int i = c + 1; i < arr[0].length; i++) {
                if (compareColumns(arr, minIndex, i) > 0) {
                    minIndex = i;
                }
            }
            swapColumns(arr, c, minIndex);
        }
        return arr;
    }

    private static void swapColumns(int[][] arr, int c1, int c2) {
        for(int[] row : arr) {
            int temp = row[c1];
            row[c1] = row[c2];
            row[c2] = temp;
        }
    }

    private static int compareColumns(int[][] arr, int col1, int col2) {
        int diff = 0;
        for(int row = 0; row < arr.length; row++) {
            diff = arr[row][col1] - arr[row][col2];
            if(diff != 0) {
                break;
            }
        }
        return diff;
    }
}
