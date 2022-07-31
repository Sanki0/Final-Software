public abstract class PlaylistDecorator implements Playlist {
    private Playlist list;

    public PlaylistDecorator(Playlist list) {
        this.list = list;
    }

    @Override
    public String show() {
        return list.show();
    }
}
