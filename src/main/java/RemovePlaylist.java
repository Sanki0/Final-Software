import org.jetbrains.annotations.NotNull;

public class RemovePlaylist implements PlaylistOperation {
    @Override
    public void doOperation(@NotNull PlaylistImpl playlist, @NotNull Music music) {
        playlist.playlistSongs.removeAll(music.getMusic());
    }
}
