package composite;

import java.util.ArrayList;
import java.util.List;

public class Album implements Music {
    private final String name;
    private final List<Music> albumSongs;

    public Album(String name) {
        this.name = name;
        this.albumSongs = new ArrayList<>();
    }

    @Override
    public void printName() {
        albumSongs.forEach(Music::printName);
    }

    public void addMusic(Music music) {
        albumSongs.add(music);
    }

    @Override
    public List<Music> getMusic() {
        return albumSongs;
    }
}
