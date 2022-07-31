package decorator;

public abstract class PlaylistDecorator implements Playlist {
    private final Playlist list;

    protected PlaylistDecorator(Playlist list) {
        this.list = list;
    }

    @Override
    public String show() {
        return list.show();
    }
}
