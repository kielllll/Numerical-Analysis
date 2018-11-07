package method;

public class FormulaImpl implements Formula{

	@Override
	public double function(double num) {
		// TODO Auto-generated method stub
		//Static formula = x^6 - 69
		return Math.pow(num, 6)-69;
	}

	@Override
	public double bisection(double x0, double x1) {
		// TODO Auto-generated method stub
		return (x1+x0)/2;
	}

	@Override
	public double approxError(double x0, double x1) {
		// TODO Auto-generated method stub
		return Math.abs((x1-x0)/x1)*100;
	}

	@Override
	public double trueError(double ea) {
		// TODO Auto-generated method stub
		double et = 2.025232315 -  ea;
		return Math.abs(et/2.025232315);
	}
}
