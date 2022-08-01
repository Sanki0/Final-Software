import decorator.Playlist;
import decorator.PlaylistImpl;
import decorator.SadPlaylist;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {


    @Test
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        Playlist tree1 = new SadPlaylist(new SadPlaylist(new PlaylistImpl()));
        assertEquals(tree1.show(),
                "PlaylistSadSad");

        Playlist tree2 = new PlaylistImpl();
        assertEquals(tree2.show(),
                "Playlist");
    }

}