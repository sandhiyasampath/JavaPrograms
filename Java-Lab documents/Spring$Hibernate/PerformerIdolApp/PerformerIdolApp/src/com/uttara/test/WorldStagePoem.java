package com.uttara.test;

public class WorldStagePoem implements Poem {

	public WorldStagePoem() {
		System.out.println("in WAS no-arg constr");
	}
	
	String[] lines = {"All the world's a stage,","And all the men and women merely players","They have their exits and their entrances,","And one man in his time plays many parts,","His acts being seven ages. At first, the infant,"};
	@Override
	public void recite() {
		for(int i = 0 ; i < lines.length ; i++)
			System.out.println(lines[i]);
	}

}
