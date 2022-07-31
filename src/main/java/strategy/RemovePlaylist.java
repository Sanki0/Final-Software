package strategy;

import composite.Music;
import decorator.Playlist;
import decorator.PlaylistImpl;
import org.jetbrains.annotations.NotNull;

public class RemovePlaylist implements PlaylistOperation {
    @Override
    public void doOperation(@NotNull Playlist playlist, @NotNull Music music) {
        playlist.getPlaylistSongs().removeAll(music.getMusic());
    }
}
