/*2) Create a class Song. A song has a name (String) and lyrics (String). A song can be
played. When you play, it prints out its lyrics to monitor. Create the class with 2 instance
variables with 2 setter / getter methods (setName(String str), setLyrics(String n),
getName(), getLyrics(). Make sure validate for null and empty string). Now create a
TestSong class with main(). Create 2 objects of Song and set different names and lyrics.
Invoke play() and verify if the songs are playing correctly. Now invoke setter methods to
change the lyrics and invoke play() again. Has the lyrics changed or not?
Now create a paramterized constructor to accept both name and lyrics in Song class. Put
an SOP in the constructor as well. Compile Song.java. Try to recompile TestSong.java. Is
the compilation succeeding? Why not? Change your code in TestSong to create 2 song
objects by passing parameters to constructors. Comment out the setter methods used.
Now recompile and run the program. Do you understand the usage of Constructors now?
Add another constructor to Song to be accept only name as parameter. Can we have
multiple constructor in the same class? Put SOP in this constructor too. In TestSong,
create another Song object by passing only name. Check by calling play() as to what is the
lyrics being printed. Why so? Now invoke setLyrics() and pass a lyrics string as param.
Invoke play() again on the same object. Do you now understand why to have setter
methods still in a class that contains constructors? Make sure you validate in constructors
too.*/

public class Song
{
	private String name;
	private String lyrics;
	public Song(String name,String lyrics)
	{
		System.out.println("Name and Lyrics parameterized constructor is excecuted");
		setName(name);
		setLyrics(lyrics);
	}
	public Song(String name)
	{
		System.out.println("in song name param constr");
		setName(name);
		
		
	}	
	public void setName(String str)
	{	
		System.out.println(" Setname is Excecutted");
		if(str=="null" || str==null || str.isEmpty())
		{
			System.out.println("Please Give Valid name "+str);
		}

		else
		{
			name=str;
		}
	}
	public void setLyrics(String n)
	{
		System.out.println("Setlyrics is Excecutted");
		if(n=="null" || n==null || n.isEmpty())
		{
			System.out.println("Please Give Valid lyrics "+n);
		}
		else
		{
			lyrics=n;

		}
	}	
	public String getName()
	{
		System.out.println("Getname is Excecutted");
		return name;
	}
	public String getLyrics()
	{
		System.out.println("getlyrics is Excecutted");
		return lyrics;
	}		
	public void play()
	{
		System.out.println("i am singing my favorite song "+name+" lyrics = " + lyrics);
	}
}
