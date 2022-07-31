package decorator;

import composite.Music;

import java.util.List;

public interface Playlist {
    String show();

    List<Music> getPlaylistSongs();

    void printSongs();
}
