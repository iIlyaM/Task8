package gui.listener;

import common.ArraySorter;
import util.Convertors;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortButtonListener implements ActionListener {
    private final JTable arrayTable;
    DefaultTableModel tableModel;


    public SortButtonListener(JTable arrayTable, DefaultTableModel tableModel) {
        this.arrayTable = arrayTable;
        this.tableModel = tableModel;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        int[][] sourceArray = Convertors.toIntArray(Convertors.getTableData(arrayTable));
        int[][] sortedArr = (ArraySorter.sortArray(sourceArray));
        String[][] arr = Convertors.toStringArray(sortedArr);
        tableModel = new DefaultTableModel(arr.length, arr[0].length);
        tableModel.setRowCount(0);
        place2DArrayToTable(arr);
        arrayTable.setModel(tableModel);
    }

    private void place2DArrayToTable(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            tableModel.addRow(array[i]);
        }
    }
}
