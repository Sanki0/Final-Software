import java.util.ArrayList;
import java.util.List;

public class Song implements Music{
    private final String name;
    private List<Music> song;

    public Song(String name) {
        this.name = name;
        this.song= new ArrayList<>();
        song.add(this);
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    public void addSong(Song song1){
        song.add(song1);
    }

    @Override
    public List<Music> getMusic() {
        return song;
    }
}
