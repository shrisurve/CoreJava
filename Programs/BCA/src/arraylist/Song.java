package arraylist;

public class Song 
{
	private String songName;
	private String singerName;
	private String movieName;
	
	public Song()
	{
		
	}

	public Song(String songName, String singerName, String movieName) 
	{
		super();
		this.songName = songName;
		this.singerName = singerName;
		this.movieName = movieName;
	}
	
	@Override
	public String toString() {
		return "Song [songName=" + songName + ", singerName=" + singerName + ", movieName=" + movieName + "]";
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public boolean equals(Object obj) 
	{
		Song s=(Song)obj;
		return s.singerName.equalsIgnoreCase(this.singerName) && s.songName.equalsIgnoreCase(this.songName) && s.movieName.equalsIgnoreCase(this.movieName);
	}
	
	public int hashCode()
	{
		return singerName.hashCode()+songName.hashCode()+movieName.hashCode();
	}

}