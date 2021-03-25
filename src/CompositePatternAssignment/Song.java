package CompositePatternAssignment;

public class Song implements IComponent {
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist ) {
        this.songName = songName;
        this.artist = artist;
    }
    @Override
    public void play() {
        System.out.println("Playing song:" + this.songName);
    }
    @Override
    public void setPlaybackSpeed(Float speed) {
        this.speed=speed;
        System.out.println("Playing song at a speed of " + speed);
    }
    @Override
    public String getName() {
        return this.songName;
    }
    public String getArtist() {
        return this.artist;
    }
}