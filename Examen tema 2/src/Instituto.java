

public class Instituto {

	String localidad;
	int clases;
	boolean publico;
	String director;
	String[]jefe;
	
	
	
	Instituto(){
		
		localidad=null;
		clases=0;
		publico=false;
		director=null;
		jefe=null;
		
	}
	
	Instituto(String localidad, int clases, boolean publico, String director, String[] jefe){
		
		this.localidad=localidad;
		this.clases=clases;
		this.publico=publico;
		this.director=director;
		this.jefe=jefe;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getClases() {
		return clases;
	}

	public void setClases(int clases) {
		this.clases = clases;
	}

	public boolean isPublico() {
		return publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String[] getJefe() {
		return jefe;
	}

	public void setJefe(String[] jefe) {
		this.jefe = jefe;
	}
	
	public String toString() {
		return localidad+", "+clases+" clases,"+publico+", Director: "+director+".";
	}
	
}
