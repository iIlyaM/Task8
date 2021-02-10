package gui.view;

import gui.listener.LoadButtonListener;
import gui.listener.SaveButtonListener;
import gui.listener.SortButtonListener;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Panel extends JPanel {
    JTable arrayTable = new JTable();
    JScrollPane arrayScrollPane = new JScrollPane(arrayTable);
    DefaultTableModel tableModel;
    private final JButton loadArrayButton = new JButton("Load Array");
    private final JButton sortArrayButton = new JButton("Sort it!");
    private final JButton saveArrayButton = new JButton("Save to file");

    Panel() {
        this.setBackground(new Color(6, 51, 94));
        addTable();
        addLoadArrayButton();
        addSortArrayButton();
        addSaveArrayButton();
    }

    private void addTable() {
        add(arrayScrollPane);
        arrayScrollPane.setPreferredSize(new Dimension(550, 350));
        arrayScrollPane.setOpaque(false);
        arrayScrollPane.getViewport().setOpaque(false);
        arrayTable.setTableHeader(null);
        arrayTable.setRowHeight(35);
        arrayTable.setFont(new Font("Common", Font.PLAIN, 20));
        arrayTable.setForeground(new Color(255, 255, 255));
        arrayTable.setOpaque(false);
        ((DefaultTableCellRenderer) arrayTable.getDefaultRenderer(Object.class)).setOpaque(false);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) arrayTable.getDefaultRenderer(Object.class);
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void addLoadArrayButton() {
        add(loadArrayButton);
        loadArrayButton.setBounds(250, 450, 100, 30);
        loadArrayButton.setBackground(new Color(27, 238, 5));
        loadArrayButton.addActionListener(new LoadButtonListener(arrayTable, tableModel));
    }

    private void addSortArrayButton() {
        add(sortArrayButton);
        sortArrayButton.setBounds(250, 350, 100, 30);
        sortArrayButton.addActionListener(new SortButtonListener(arrayTable, tableModel));
        sortArrayButton.setBackground(new Color(10, 255, 218));
    }

    private void addSaveArrayButton() {
        add(saveArrayButton);
        saveArrayButton.setBounds(370, 350, 100, 30);
        saveArrayButton.setBackground(new Color(128, 94, 255));
        saveArrayButton.addActionListener(new SaveButtonListener(arrayTable));
    }
}
