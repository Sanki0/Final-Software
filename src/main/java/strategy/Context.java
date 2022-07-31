package strategy;

import composite.Music;
import decorator.PlaylistImpl;

public class Context {
    public PlaylistOperation playlistOperation;

    public Context(PlaylistOperation playlistOperation) {
        this.playlistOperation = playlistOperation;
    }
    public void executePlaylistOperation(PlaylistImpl playlist, Music music){
        playlistOperation.doOperation(playlist,music);
    }
}
