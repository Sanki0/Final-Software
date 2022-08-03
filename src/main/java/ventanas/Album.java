package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Album extends JDialog {
    private JPanel contentPane;
    private JButton buttonAgregar;
    private JButton buttonEliminar;
    private JButton buttonRetroceder;

    public Album(JDialog jDialog, boolean b) {
        setContentPane(contentPane);
        setModal(true);
        setSize(300,500);
        buttonRetroceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }


}
