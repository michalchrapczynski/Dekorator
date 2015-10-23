public class Ram extends Decorator {

	Computer pc;

	public Ram(Computer pc) {
		this.pc = pc;
	}

	@Override
	public int price() {
		return pc.price() + 1000;
	}

	@Override
	public String about() {
		return pc.about() + " Rozszerzona o 8GB RAM";
	}

}
