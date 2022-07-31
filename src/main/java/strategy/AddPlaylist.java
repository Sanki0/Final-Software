package strategy;

import composite.Music;
import decorator.PlaylistImpl;
import org.jetbrains.annotations.NotNull;

public class AddPlaylist implements PlaylistOperation{
    @Override
    public void doOperation(@NotNull PlaylistImpl playlist, @NotNull Music music) {
        playlist.playlistSongs.addAll(music.getMusic());
    }
}