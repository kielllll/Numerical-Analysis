package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Equation {
	private final IntegerProperty i;
	private final DoubleProperty xl;
	private final DoubleProperty xu;
	private final DoubleProperty xr;
	private final DoubleProperty ea;
	private final DoubleProperty et;
	
	public Equation() {
		this(0,0.0,0.0,0.0,0.0,0.0);
	}
	
	public Equation(int i,double xl,double xu,double xr,double ea,double et) {
		super();
		this.i = new SimpleIntegerProperty(i);
		this.xl = new SimpleDoubleProperty(xl);
		this.xu = new SimpleDoubleProperty(xu);
		this.xr = new SimpleDoubleProperty(xr);
		this.ea = new SimpleDoubleProperty(ea);
		this.et = new SimpleDoubleProperty(et);
	}
	
	public void setI(int i) {
		this.i.set(i);
	}
	
	public void setXL(double xl) {
		this.xl.set(xl);
	}
	
	public void setXU(double xu) {
		this.xu.set(xu);
	}
	
	public void setXR(double xr) {
		this.xr.set(xr);
	}
	
	public void setEA(double ea) {
		this.ea.set(ea);
	}
	
	public void setET(double et) {
		this.et.set(et);
	}
	
	public int getI() {
		return i.get();
	}
	
	public IntegerProperty iProperty() {
		return i;
	}
	
	public double getXL() {
		return xl.get();
	}
	
	public DoubleProperty xlProperty() {
		return xl;
	}
	
	public double getXU() {
		return xu.get();
	}
	
	public DoubleProperty xuProperty() {
		return xu;
	}
	
	public double getXR() {
		return xr.get();
	}
	
	public DoubleProperty xrProperty() {
		return xr;
	}
	
	public double getEA() {
		return ea.get();
	}
	
	public DoubleProperty eaProperty() {
		return ea;
	}
	
	public double getET() {
		return et.get();
	}
	
	public DoubleProperty etProperty() {
		return et;
	}
	
	public String toString() {
		return i.get()+" "+xl.get()+" "+xu.get()+" "+xr.get()+" "+ea.get()+" "+et.get();
	}
}
