public class DyskSSD extends Decorator {

	Computer pc;

	public DyskSSD(Computer pc) {
		this.pc = pc;
	}

	@Override
	public int price() {
		return pc.price() + 500;
	}

	@Override
	public String about() {
		return pc.about() + " Rozszerzona o Dysk SSD";
	}

}
