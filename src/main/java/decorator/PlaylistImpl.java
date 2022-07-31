package decorator;

import composite.Music;

import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist {
    private final List<Music> playlistSongs;

    public PlaylistImpl() {
        this.playlistSongs = new ArrayList<>();
    }

    @Override
    public String show() {
        return "Playlist";
    }

    @Override
    public List<Music> getPlaylistSongs() {
        return playlistSongs;
    }

    @Override
    public void printSongs() {
        System.out.println("Empty Playlist");
    }
}
