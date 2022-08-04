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

        System.out.println("Canciones :\n");
        Song ew = new Song("Ew");
        Song alcoholFree = new Song("Alcohol-Free");
        Song firstTime = new Song("First Time");
        Song beatIt = new Song("Beat it");
        Song bad = new Song("Bad");
        Song selfles = new Song("Selfles");
        Song lastNite = new Song("Las Nite");
        Song venezia = new Song("Venezia");
        Song sufreMamon = new Song("Sufre Mamon");
        ew.getMusic();
        ew.printName();

        System.out.println("Albumes :\n" );
        Album tasteOfLove = new Album("Taste of Love");
        Album thriller = new Album("Thriller");
        Album strokes = new Album("The Strokes");
        Album hombresG = new Album("Hombres G");

        tasteOfLove.addMusic(alcoholFree);
        tasteOfLove.addMusic(firstTime);
        thriller.addMusic(beatIt);
        thriller.addMusic(bad);
        strokes.addMusic(selfles);
        strokes.addMusic(lastNite);
        hombresG.addMusic(venezia);
        hombresG.addMusic(sufreMamon);

        tasteOfLove.getMusic();

        System.out.println("Playlist :\n");
        Playlist playlist = new TwicePlaylist(new PlaylistImpl());
        Context context = new Context(new AddPlaylist());
        context.executePlaylistOperation(playlist, ew);
        context.executePlaylistOperation(playlist, tasteOfLove);

        playlist.printSongs();

        context = new Context(new RemovePlaylist());
        context.executePlaylistOperation(playlist, alcoholFree);

        playlist.printSongs();
    }
}