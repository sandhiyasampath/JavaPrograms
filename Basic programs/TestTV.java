public class TestTV
{
	public static void main(String[] args)
	{
		TV t = new TV();
		t.setName("Sony");
		t.setVolume(50);
		t.setChannel(71);
		t.switchOn();
		t.incrementChannel();
		t.decrementChannel();
		t.incrementVolume();
		t.decrementVolume();
		t.changeChannel(38);
		t.display();
		t.switchOff();
	}
}
