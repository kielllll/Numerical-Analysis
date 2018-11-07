package method;

public interface Formula {
	double function(double num);
	double bisection(double x0,double x1);
	double approxError(double x0,double x1);
	double trueError(double ea);
}
