package com.uttara.test;

public class Singer implements Performer {

	private String favSong = "dil se re...";
	
	public Singer() {
		System.out.println("no-arg constr of Singer");
	}
	
	
	public Singer(String favSong) {
		super();
		this.favSong = favSong;
		System.out.println("in param constr of Singer "+favSong);
	}


	@Override
	public void perform() {
		System.out.println("Singer singing la..la..o..la "+favSong);
		

	}

	public String getFavSong() {
		return favSong;
	}
	public void setFavSong(String favSong) {
		this.favSong = favSong;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((favSong == null) ? 0 : favSong.hashCode());
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
		Singer other = (Singer) obj;
		if (favSong == null) {
			if (other.favSong != null)
				return false;
		} else if (!favSong.equals(other.favSong))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Singer [favSong=" + favSong + "]";
	}
	
}
