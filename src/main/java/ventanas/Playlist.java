package ventanas;

import decorator.PlaylistImpl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Playlist extends JDialog {
    private JPanel contentPane;
    private JButton buttonCrear;
    private JButton buttonEliminar;
    private JButton buttonRetroceder;
    private JPanel panel;
    private JTextField nombre;
    private JTable table;
    DefaultTableModel dtm = new DefaultTableModel();

    public Playlist() {
        setContentPane(contentPane);
        setModal(true);
        setSize(314,500);
        setResizable(false);
        dtm.setColumnCount(1);
        table.setModel(dtm);
        disenotabla();
        buttonRetroceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        buttonCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decorator.Playlist playlist = new decorator.TwicePlaylist(new PlaylistImpl());
                dtm.addRow(new Object[]{
                        nombre.getText()
                });
            limpiar();
            }


        });

        buttonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = table.getSelectedRow();
                dtm.removeRow(fila);
            }
        });
    }

    private void disenotabla() {
        table.setBackground(Color.BLACK);
        table.setForeground(Color.WHITE);
        table.setFont(new Font("arial",2,15));
    }


    private void limpiar() {
        nombre.setText("");
    }

}
