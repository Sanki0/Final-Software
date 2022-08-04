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
        Song song = new Song();
        Album album = new Album();
        Playlist playlist = new Playlist();

        buttonAlbum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                album.setVisible(true);
            }
        });
        buttonSong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                song.setVisible(true);
            }
        });
        buttonPlaylist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playlist.setVisible(true);
            }
        });
    }


    private void initComponents() {


    }

}
