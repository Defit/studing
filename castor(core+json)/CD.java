import java.util.ArrayList;
import java.util.List;

public class CD implements java.io.Serializable {

	private String name = null;

	private String artist = null;

	private List tracks = null;

	public CD() {
		super();
	}

	public CD(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setTracks(List tracks) {
		this.tracks = tracks;
	}

	public List getTracks() {
		return tracks;
	}

	public void addTrack(String trackName) {
		if (tracks == null) {
			tracks = new ArrayList();
		}
		tracks.add(trackName);
	}
}