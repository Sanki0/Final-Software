package strategy;

import composite.Music;
import decorator.Playlist;

public class Context {
    private final PlaylistOperation playlistOperation;

    public Context(PlaylistOperation playlistOperation) {
        this.playlistOperation = playlistOperation;
    }

    public void executePlaylistOperation(Playlist playlist, Music music) {
        playlistOperation.doOperation(playlist, music);
    }
}
