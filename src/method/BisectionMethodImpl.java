package method;

import java.util.ArrayList;

import application.Equation;

public class BisectionMethodImpl implements BisectionMethod {
	
	private Formula f = new FormulaImpl();
	
	@Override
	public ArrayList<Equation> solve() {
		// TODO Auto-generated method stub
		ArrayList<Equation> output = new ArrayList<>();
		output.add(setInitials());
		/*
		 * LET ea = approximate error
		 * et = true error
		 * xl = lower limit
		 * xu = upper limit
		 * xr = center
		 * xxr = new center
		 */
		int i = 1;
		double ea = 100.00;
		
		while(ea>0.005) {
			Equation e = output.get(output.size()-1);
			Equation e2 = new Equation();
			
			e2.setXL(e.getXL());
			e2.setXU(e.getXU());
			double xr = e.getXR();
			double xrf = f.function(xr);
			
			if(xrf<0) {
				e2.setXL(xr);
			}else {
				e2.setXU(xr);
			}
			
			e2.setI(i+1);
			ea = f.approxError(e2.getXL(), e2.getXU());
			double et = f.trueError(ea);
			double xxr = f.bisection(e2.getXL(), e2.getXU());
			e2.setET(et);
			e2.setEA(ea);
			e2.setXR(xxr);
			
			output.add(e2);
			
			i++;
		}
		
		return output;
	}

	@Override
	public Equation setInitials() {
		// TODO Auto-generated method stub
		Equation e = new Equation();
		
		e.setI(1);
		e.setXL(1);
		e.setXU(7);
		
		
		double xr = f.bisection(e.getXL(), e.getXU());
		e.setXR(xr);
		return e;
	}

}
