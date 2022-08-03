package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
    private JPanel contentPane;
    private JButton buttonAlbum;
    private JButton buttonSong;
    private JButton buttonPlaylist;

    public Principal(JDialog jDialog, boolean b) {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPane);
        setResizable(false);

        buttonAlbum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Album album = new Album(new javax.swing.JDialog(),true);
                album.setVisible(true);
            }
        });
        buttonSong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Playlist song = new Playlist(new javax.swing.JDialog(),true);
                song.setVisible(true);
            }
        });
        buttonPlaylist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Playlist playlist = new Playlist(new javax.swing.JDialog(),true);
                playlist.setVisible(true);
            }
        });
    }

    private void initComponents() {


    }

}
