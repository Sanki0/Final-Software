public class SadPlaylist extends PlaylistDecorator{
    public SadPlaylist(Playlist list) {
        super(list);
    }

    @Override
    public String show() {
        return super.show() + type();
    }

    public String type(){
        return "Sad";
    }
}
