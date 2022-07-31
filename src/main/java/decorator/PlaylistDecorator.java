package decorator;

import composite.Music;

import java.util.List;

public abstract class PlaylistDecorator implements Playlist {

    private Playlist list;
    public List<Music> playlistSongs = new PlaylistImpl().getPlaylistSongs();


    public PlaylistDecorator(Playlist list) {
        this.list = list;
    }

    @Override
    public String show() {
        return list.show();
    }

    @Override
    public void printSongs() {
        playlistSongs.forEach(Music::printName);
    }

    @Override
    public List<Music> getPlaylistSongs() {
        return this.playlistSongs;
    }
}
