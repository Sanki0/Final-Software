package strategy;

import composite.Music;
import decorator.Playlist;
import org.jetbrains.annotations.NotNull;

public class AddPlaylist implements PlaylistOperation {
    @Override
    public void doOperation(@NotNull Playlist playlist, @NotNull Music music) {
        playlist.getPlaylistSongs().addAll(music.getMusic());
    }
}
