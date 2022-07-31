package main;

import composite.Album;
import composite.Song;
import decorator.PlaylistImpl;
import strategy.AddPlaylist;
import strategy.Context;
import strategy.RemovePlaylist;

public class Client {
    public static void main(String[] args) {
        Song ew = new Song("Ew");
        Song celebrate = new Song("Celebrate");
        Song candyPop = new Song("Candy Pop");
        Album tasteOfLove = new Album("Taste of love");
        tasteOfLove.addMusic(celebrate);
        tasteOfLove.addMusic(candyPop);

        PlaylistImpl playlist = new PlaylistImpl();

        Context context = new Context(new AddPlaylist());
        context.executePlaylistOperation(playlist, ew);
        context.executePlaylistOperation(playlist, tasteOfLove);

        playlist.printSongs();

        context = new Context(new RemovePlaylist());
        context.executePlaylistOperation(playlist, celebrate);

        playlist.printSongs();
    }
}
