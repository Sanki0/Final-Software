package strategy;

import composite.Music;
import decorator.Playlist;
import decorator.PlaylistImpl;

public interface PlaylistOperation {
    void doOperation(Playlist playlist, Music music);
}
