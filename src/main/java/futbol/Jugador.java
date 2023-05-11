package futbol;

public class Jugador extends Futbolista  {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre,int edad,String posicion,short golesMarcados,byte dorsal) {
		super(nombre,edad,posicion);
		this.golesMarcados=golesMarcados;
		this.dorsal=dorsal;
				
	}
	
	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
		
	}
	
	public String toString() {
		return super.toString()+ " con el dorsal "+this.dorsal+ ". Ha marcado "+this.golesMarcados;
	}
	
	public boolean jugarConLasManos() {
		if (super.getPosicion().equals("Portero")) {
		return true;
		}else {
			return false;
		}	
	}
	
	public int compareTo(Object obj) {
		return Math.abs(super.getEdad()-((Futbolista)obj).getEdad());
	}

}
