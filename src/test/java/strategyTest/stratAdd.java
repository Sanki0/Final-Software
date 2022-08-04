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


public class stratAdd {
    Song ew = new Song("Ew");
    Song alcoholFree = new Song("Alcohol-Free");
    Song firstTime = new Song("First Time");
    Album tasteOfLove = new Album("Taste of love");

    @Before
    public void setUp() {

        tasteOfLove.addMusic(alcoholFree);
        tasteOfLove.addMusic(firstTime);

    }

    @Test
    @DisplayName("Testeo de la clase del patron Decorator, añadir musica")
    public void testStrategy() {
        Playlist playlist = new TwicePlaylist(new PlaylistImpl());
        Context context = new Context(new AddPlaylist());

        context.executePlaylistOperation(playlist, ew);
        context.executePlaylistOperation(playlist, tasteOfLove);
        List<Music> listaTest =playlist.getPlaylistSongs();


        assertAll("Verificando elementos de album",
                () -> assertEquals(ew, listaTest.get(0)),
                () -> assertEquals(alcoholFree, listaTest.get(1)),
                () -> assertEquals(firstTime, listaTest.get(2))
        );
        context = new Context(new RemovePlaylist());
        context.executePlaylistOperation(playlist, alcoholFree);

        assertAll("Verificando elementos de album",
                () -> assertEquals(ew, listaTest.get(0)),
                () -> assertEquals(firstTime, listaTest.get(1))
        );

    }



    }

