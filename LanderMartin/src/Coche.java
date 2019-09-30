
public class Coche {
	private double miVelocidad; // Velocidad en pixels/segundo
	protected double miDireccionActual; // Dirección en la que estoy mirando en grados (de 0 a 360)
	protected double posX; // Posición en X (horizontal)
	protected double posY; // Posición en Y (vertical)
	private String piloto; // Nombre de piloto
	
	
	public Coche() {
		this.miVelocidad = 0;
		this.miDireccionActual = 0;
		this.posX = 300;
		this.posY = 300;
		
		
		
	}
	 
	@Override
	public String toString() {
		return "Coche [miVelocidad=" + miVelocidad + ", miDireccionActual=" + miDireccionActual + ", posX=" + posX+ ", posY=" + posY + ", piloto=" + piloto + "]";
	}


	public double getMiVelocidad() {
		return miVelocidad;
	}


	public void setMiVelocidad(double miVelocidad) {
		this.miVelocidad = miVelocidad;
	}

	public void acelera(double aceleracion)
	  {
	    this.miVelocidad += aceleracion;
	  }
	

	public double getMiDireccionActual() {
		return miDireccionActual;
	}


	public void setMiDireccionActual(double dir) {
		 if (dir < 0.0D) {
		      dir += 360.0D;
		    }
		    if (dir > 360.0D) {
		      dir -= 360.0D;
		    }
		    this.miDireccionActual = dir;
	}


	public void gira(double giro)
	  {
	    setMiDireccionActual(this.miDireccionActual + giro);
	  }
	
	
	
	
	public double getPosX() {
		return posX;
	}


	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}


	public void setPosY(double posY) {
		this.posY = posY;
	}


	public void mueve(double tiempoDeMovimiento)
	  {
	    setPosX(this.posX + this.miVelocidad * Math.cos(this.miDireccionActual / 180.0D * Math.PI) * tiempoDeMovimiento);
	    setPosY(this.posY + this.miVelocidad * -Math.sin(this.miDireccionActual / 180.0D * Math.PI) * tiempoDeMovimiento);
	  }
	
	
	
	
	public String getPiloto() {
		return piloto;
	}


	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
/*
	public static void main(String[] args) {
	 Coche couch = new Coche();
	 couch.setPosX(150);
	 couch.setPosY(100);
	 couch.acelera(20);
	 couch.mueve(20);
	 System.out.println(couch);
	}
	*/
}
