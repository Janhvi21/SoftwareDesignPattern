package CompositePatternAssignment;

import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();
    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }
    public void add(IComponent component) {
        this.playlist.add(component);
    }
    public void remove(IComponent component) {
        this.playlist.remove(component);
    }
    @Override
    public void play() {
        for (IComponent component : playlist) {
            component.play();
        }
        System.out.println("Playing playlist: " + this.playlistName);
    }
    @Override
    public void setPlaybackSpeed(Float speed) {
        for (IComponent component : playlist) {
            component.setPlaybackSpeed(speed);
        }
    }
    @Override
    public String getName() {
        return this.playlistName;
    }
}