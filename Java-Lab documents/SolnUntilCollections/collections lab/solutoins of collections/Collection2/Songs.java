package uttara.solutions.Collection2;

public class Songs implements Comparable {
	private String songname;
	private int length;
	private Singer s;
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public int getLength() {
		return length;
	}
	@Override
	public String toString() {
		return "Songs [songname=" + songname + ", length=" + length + ", s=" + s + "]";
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Singer getS() {
		return s;
	}
	public void setS(Singer s) {
		this.s = s;
	}
	public Songs(String songname, int length, Singer s) {
		super();
		this.songname = songname;
		this.length = length;
		this.s = s;
	}
	public Songs() {
		super();
		
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Songs)
		{
			Songs s=(Songs)o;
			return this.length-s.length;
		}
		else
			throw new IllegalArgumentException("plz pass only Songs objects to comopare");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		result = prime * result + ((songname == null) ? 0 : songname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Songs other = (Songs) obj;
		if (length != other.length)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		if (songname == null) {
			if (other.songname != null)
				return false;
		} else if (!songname.equals(other.songname))
			return false;
		return true;
	}

}
