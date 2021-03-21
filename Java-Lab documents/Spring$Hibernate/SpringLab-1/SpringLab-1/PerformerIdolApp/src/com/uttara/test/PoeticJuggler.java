package com.uttara.test;

public class PoeticJuggler extends Juggler {
	
	private Poem poem;

	public Poem getPoem() {
		return poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
	}
	
	public PoeticJuggler(int num, Poem p)
	{
		super(num);
		this.poem = p;
		System.out.println("in PoeticJugglers param constr "+p+" "+num);
	}
	
	@Override
	public void perform() {
		System.out.println("I am PoeticJuggler...");
		super.perform();
		System.out.println("while reciting...");
		poem.recite();
	}
}






