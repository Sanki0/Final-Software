package strategyTest;

import decorator.Playlist;
import decorator.PlaylistImpl;
import decorator.TwicePlaylist;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import composite.*;
import strategy.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class stratRemove {
    Song ew = new Song("Ew");
    Song alcoholFree = new Song("Alcohol-Free");
    Playlist playlist = new TwicePlaylist(new PlaylistImpl());
    @Before
    public void setUp() {

        Context context = new Context(new AddPlaylist());
        context.executePlaylistOperation(playlist, ew);
        context.executePlaylistOperation(playlist, alcoholFree);
        context = new Context(new RemovePlaylist());
        context.executePlaylistOperation(playlist, alcoholFree);

    }
    @Test
    public void strat2(){

        List<Music> listaTest =playlist.getPlaylistSongs();
        assertAll("Verificando elementos de album",
                () -> assertEquals(ew, listaTest.get(0)),
                () -> assertEquals("2", "2")
        );
    }
}
