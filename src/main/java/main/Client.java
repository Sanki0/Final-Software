package main;

import composite.Album;
import composite.Song;
import decorator.Playlist;
import decorator.PlaylistImpl;
import decorator.TwicePlaylist;
import strategy.AddPlaylist;
import strategy.Context;
import strategy.RemovePlaylist;
import ventanas.Principal;

import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        Principal v1 = new Principal(new JDialog(), true);
        v1.setSize(300,500);
        v1.setTitle("Reproductor");
        v1.setVisible(true);

        Song ew = new Song("Ew");
        Song alcoholFree = new Song("Alcohol-Free");
        Song firstTime = new Song("First Time");
        Album tasteOfLove = new Album("Taste of love");
        tasteOfLove.addMusic(alcoholFree);
        tasteOfLove.addMusic(firstTime);

        Playlist playlist = new TwicePlaylist(new PlaylistImpl());

        Context context = new Context(new AddPlaylist());
        context.executePlaylistOperation(playlist, ew);
        context.executePlaylistOperation(playlist, tasteOfLove);

        playlist.printSongs();

        context = new Context(new RemovePlaylist());
        context.executePlaylistOperation(playlist, alcoholFree);

        playlist.printSongs();

        System.out.println(playlist.show());
    }
}