package mylibrary;

public class MyCalculator {

	// clcSum()
	public Calculator calcSum(Calculator c) {
		c.setNum3(c.getNum1() + c.getNum2());
		return c;
	}

	// clcSum()
	public Calculator calcSub(Calculator c) {
		c.setNum3(c.getNum1() - c.getNum2());
		return c;
	}

	// calcPrd()	
	public Calculator calcPrd(Calculator c) {
		c.setNum3(c.getNum1() * c.getNum2());
		return c;
	}
	// calcDiv()
	public Calculator calcDiv(Calculator c) {
		c.setNum3(c.getNum1() / c.getNum2());
		return c;
	}
	
	// calcRem()
	public Calculator calcRem(Calculator c) {
		c.setNum3(c.getNum1() % c.getNum2());
		return c;
	}
	
	// calcPow()
	public Calculator calcPow(Calculator c) {
		c.setNum3((int)Math.pow(c.getNum1() , c.getNum2()));
		return c;
	}
}
