package gui.listener;

import common.ArraySorter;
import common.FileWriter;
import util.Convertors;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveButtonListener implements ActionListener {
    private final JTable arrayTable;

    public SaveButtonListener(JTable arrayTable) {
        this.arrayTable = arrayTable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[][] tableArray = Convertors.toIntArray(Convertors.getTableData(arrayTable));
        int[][] finalArr = (ArraySorter.sortArray(tableArray));
        try {
            FileWriter.writeFile(finalArr);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
