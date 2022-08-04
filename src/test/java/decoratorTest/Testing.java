package decoratorTest;

import decorator.Playlist;
import decorator.PlaylistImpl;
import decorator.SadPlaylist;
import decorator.TwicePlaylist;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {


    @Test
    @DisplayName("Testeo de la clase del patron decorator")
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {

        Playlist tree1 = new SadPlaylist(new SadPlaylist(new PlaylistImpl()));
        assertEquals(tree1.show(),
                "PlaylistSadSad");

        Playlist tree2 = new TwicePlaylist(new PlaylistImpl());
        assertEquals(tree2.show(),
                "Playlist Twice");
    }

}