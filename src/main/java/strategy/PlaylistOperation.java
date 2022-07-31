package strategy;

import composite.Music;
import decorator.Playlist;

public interface PlaylistOperation {
    void doOperation(Playlist playlist, Music music);
}
