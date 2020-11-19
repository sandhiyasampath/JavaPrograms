public class TestSong
{
	public static void main(String[] args)
	{		
		Song s1 = new Song("namachivaya","namachivaya namachivaya OM namachivaya...");
		System.out.println("name = " + s1.getName() + " Lyrics = " + s1.getLyrics());

		Song s2 = new Song("naraayana","naraayana naraayana naraayana ......");
		System.out.println("name = " + s2.getName() + " Lyrics = " + s2.getLyrics());

		Song s3 = new Song("dURGA");
		s3.setLyrics("Ayagiri nandhini nandhitha mathini ...");
		System.out.println("name = " + s3.getName() + " Lyrics = " + s3.getLyrics());
	}
}
