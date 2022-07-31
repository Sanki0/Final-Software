package decorator;

import composite.Music;

import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist{
    public List<Music> playlistSongs;

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

    //agregar un setter y getter
}
