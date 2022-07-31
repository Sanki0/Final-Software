package decorator;

public class TwicePlaylist extends PlaylistDecorator {
    public TwicePlaylist(Playlist list) {
        super(list);
    }

    @Override
    public String show() {
        return super.show() + type();
    }

    public String type() {
        return "Twice";
    }
}
