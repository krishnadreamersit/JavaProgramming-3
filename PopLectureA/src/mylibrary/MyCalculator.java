package mylibrary;

public class MyCalculator {
	
	public Calculator add(Calculator c) {
		c.setNum3(c.getNum1()+c.getNum2());
		return c;
	}
}
