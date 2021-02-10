package util;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;


public class Convertors {

    public static String[][] toStringArray(List<String> list) {
        String[][] arr = new String[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).split("\\s*(\\s|,|!|\\.)\\s*");
        }
        return arr;
    }

    public static String[][] toStringArray(int[][] arr) {
        String[][] array = new String[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                array[i][j] = String.valueOf(arr[i][j]);
            }
        }
        return array;
    }

    public static int[][] toIntArray(String[][] arr) {
        int[][] array = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                array[i][j] = Integer.parseInt(arr[i][j]);
            }
        }
        return array;
    }

    public static int[][] toIntArray(Object[][] arr) {
        int[][] array = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                array[i][j] = Integer.parseInt(String.valueOf(arr[i][j]));
            }
        }
        return array;
    }

    public static Object[][] getTableData(JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++)
            for (int j = 0; j < nCol; j++)
                tableData[i][j] = dtm.getValueAt(i, j);
        return tableData;
    }
}
