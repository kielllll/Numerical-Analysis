package method;

import application.Equation;

import java.util.ArrayList;

public interface BisectionMethod {
	ArrayList<Equation> solve();
	Equation setInitials();
}
