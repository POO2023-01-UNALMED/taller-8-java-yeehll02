package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal; 
	
	public Portero(String nombre,int edad,short golesRecibidos,byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
	}
	
	public String toString() {
		return super.toString()+ " con el dorsal "+this.dorsal+ ". Le han marcado "+this.golesRecibidos;
	}
	
	public boolean jugarConLasManos() {
		if (super.getPosicion().equals("Portero")) {
		return true;
		}else {
			return false;
		}
	}
	public int compareTo(Object obj) {
		Portero port1=(Portero)obj;
		return Math.abs(golesRecibidos-port1.golesRecibidos);
	}
}
