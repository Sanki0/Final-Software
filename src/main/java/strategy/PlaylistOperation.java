package strategy;

import composite.Music;
import decorator.PlaylistImpl;

public interface PlaylistOperation {
    void doOperation(PlaylistImpl playlist, Music music);
}
