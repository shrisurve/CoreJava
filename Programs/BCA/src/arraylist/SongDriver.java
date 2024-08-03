package arraylist;
import java.util.ArrayList;
public class SongDriver 
{

	public static void main(String[] args) 
	{
		ArrayList<Song> playList=new ArrayList<Song>();
		addSong(playList, new Song("Jai Ganesha", "Vishal Mishra", "Ganapath"));
        addSong(playList, new Song("ARJAN VAILLY", " Bhupinder B", "ANIMAL"));
        addSong(playList, new Song("Saari Duniya Jalaa Denge", "B Praak", "ANIMAL")); 
        addSong(playList, new Song("Mockingbird", "Eminem", "Album"));
        addSong(playList, new Song("Hymn For The Weekend", "Coldplay", "Album"));
        addSong(playList, new Song("Night Changes", "One Direction", "Album"));
		addSong(playList, new Song("jAi Ganesha", "Vishal Mishra", "Ganapath"));
		addSong(playList, new Song("Mockingbird", "Eminem", "Album"));
//		searchBySong(playList,"Jai Ganesha");
		searchByMovie(playList, "AniMaL");
         
	}
	public static void addSong(ArrayList<Song>playlist,Song newSong)
	{
		if(!playlist.contains(newSong))
		{
			playlist.add(newSong);
		}
		else
		{
			System.out.println("New Song Is Already Present");
		}
	}
	
	public static void searchBySong(ArrayList<Song> playList,String songName)
	{
		boolean b=false;
		for(Song s:playList)
		{
			if(s.getSongName().equalsIgnoreCase(songName))
			{
				System.out.println("Song Is Present In Play List");
				System.out.println(s);
				b=true;
				break;
			}
		}
		if(!b)
		{
			System.out.println("Song Is Not Present In PlayList");
		}
		
	}
	public static void searchBySinger(ArrayList<Song> playList,String singerName)
	{
		boolean b=false;
		for(Song s:playList)
		{
			if(s.getSingerName().equalsIgnoreCase(singerName))
			{
				System.out.println(s);
				b=true;
			}
		}
		if(!b)
		{
			System.out.println("Song Is Not Present In PlayList");
		}
		
	}
	public static void searchByMovie(ArrayList<Song> playList,String movieName)
	{
		boolean b=false;
		for(Song s:playList)
		{
			if(s.getMovieName().equalsIgnoreCase(movieName))
			{
				System.out.println(s);
				b=true;
			}
		}
		if(!b)
		{
			System.out.println("Song Is Not Present In PlayList");
		}
		
	}
	 
}