package restApi;

public class Fraccion {
	
	private int dividendo;
	
	private int divisor;
	
	public Fraccion(int dividendo, int divisor ){
		this.dividendo = dividendo;
		this.divisor = divisor;
	}
	
	public int getDividendo(){
		return dividendo;
	}
	
	public int getDivisor(){
		return divisor;
	}
	
	@Override
	public String toString(){
		return "Fraccion [dividendo=" + dividendo + ", divisor=" + divisor +"]";
	}

}
