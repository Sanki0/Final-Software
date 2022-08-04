package compositeTest;

import decorator.Playlist;
import decorator.PlaylistImpl;
import decorator.SadPlaylist;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import composite.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class comp {
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
    @DisplayName("Testeo de la clase del patron Decorator")
    public void testComposite(){
        List<Music> listaAlbum= tasteOfLove.getMusic();
        System.out.println(listaAlbum.get(0));
        assertAll("Verificando elementos de album",
                () -> assertEquals(alcoholFree, listaAlbum.get(0)),
                () -> assertEquals(firstTime, listaAlbum.get(1))
        );
    }
}
