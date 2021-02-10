package gui.listener;

import common.FileReader;
import util.Convertors;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class LoadButtonListener implements ActionListener {
    private final JTable arrayTable;
    DefaultTableModel tableModel;

    public LoadButtonListener(JTable arrayTable, DefaultTableModel tableModel) {
        this.arrayTable = arrayTable;
        this.tableModel = tableModel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            FileFilter filter = new FileNameExtensionFilter("Text files", "txt");
            fileChooser.addChoosableFileFilter(filter);
            File file = fileChooser.getSelectedFile();
            String filename = file.getAbsolutePath();
            try {
                String[][] array = Convertors.toStringArray(FileReader.readFile(filename));
                tableModel = new DefaultTableModel(array.length, array[0].length);
                tableModel.setRowCount(0);
                place2DArrayToTable(array);
                arrayTable.setModel(tableModel);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void place2DArrayToTable(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            tableModel.addRow(array[i]);
        }
    }
}

