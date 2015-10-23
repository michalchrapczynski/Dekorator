public class Grafika extends Decorator {

	Computer pc;

	public Grafika(Computer pc) {
		this.pc = pc;
	}

	@Override
	public int price() {
		return pc.price() + 1000;
	}

	@Override
	public String about() {
		return pc.about() + " Rozszerzona o lepsza grafike";
	}

}
