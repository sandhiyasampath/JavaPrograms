class PG{
	synchronized void hlt(long l) {
		for (int i = 1; i < 3; i++) {
			System.out.println(l+"_"+i+"");
		}
	}
}
public class RunnableInterface implements Runnable{
	static PG p = new PG();
	public static void main(String[] args) {
		new Thread(new RunnableInterface()).start();
		new Thread(new RunnableInterface()).start();

	}
	@Override
	public void run() {
		p.hlt(Thread.currentThread().getId());
	}

}
