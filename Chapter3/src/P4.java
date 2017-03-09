
public class P4 {
	private double ftemp;
	
	public P4(double ftemp) {
		// TODO Auto-generated constructor stub
		this.ftemp = ftemp;
		
		
	}
	public void setFehrenheit(double ftemp){
		this.ftemp = ftemp;
	}

	public double getFehrenheit(){
		return ftemp;
	}
	
	public double getCelsius(){
		double Celsius = ( 5.0 / 9.0) * (ftemp - 32.0);
		return Celsius;
	}
	
	public double getKelvin(){
		double Kelvin = ((5.0 / 9.0) * (ftemp - 32.0)) + 273.0;
		return Kelvin;
	}
}
