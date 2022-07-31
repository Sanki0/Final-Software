package composite;

import java.util.ArrayList;
import java.util.List;

public class Song implements Music {
    private final String name;
    private final List<Music> songAsList;

    public Song(String name) {
        this.name = name;
        this.songAsList = new ArrayList<>();
        songAsList.add(this);
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public List<Music> getMusic() {
        return songAsList;
    }
}
