package mylibrary;

public class MyCalculator {
	
	public Calculator add(Calculator c) {
		c.setNum3(c.getNum1()+c.getNum2());
		return c;
	}
	//sub
	public Calculator sub(Calculator c) {
		c.setNum3(c.getNum1()-c.getNum2());
		return c;
	}
	
	//prd
	public Calculator prd(Calculator c) {
		c.setNum3(c.getNum1()*c.getNum2());
		return c;
	}
	
	//div
	public Calculator div(Calculator c) {
		c.setNum3(c.getNum1()/c.getNum2());
		return c;
	}
	//rem
	public Calculator rem(Calculator c) {
		c.setNum3(c.getNum1()%c.getNum2());
		return c;
	}
	//pow
	public Calculator pow(Calculator c) {
		c.setNum3((int) Math.pow(c.getNum1(), c.getNum2()));
		return c;
	}
}