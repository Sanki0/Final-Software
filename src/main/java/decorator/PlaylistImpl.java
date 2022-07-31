package decorator;

import composite.Music;

import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist{
    private final List<Music> playlistSongs;

    public PlaylistImpl() {
        this.playlistSongs = new ArrayList<>();
    }

    @Override
    public String show() {
        return "Playlist";
    }

    public void printSongs() {
        playlistSongs.forEach(Music::printName);
    }

    public List<Music> getPlaylistSongs() {
        return playlistSongs;
    }
}
