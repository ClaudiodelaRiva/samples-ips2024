package giis.demo.tkrun;

public class InscripcionEntity {
	
	private String id;
 	private String fechaInscripcion;
 	private String idCarrera;
 	private String idAtleta;
 	
 	public String getId() { return this.id; }
 	public String getFechaInscripcion() { return this.fechaInscripcion; }
 	public String getIdCarrera() { return this.idCarrera; }
 	public String getIdAtleta(){ return this.idAtleta; }
 	
 	public void setId(String value) { this.id=value; }
 	public void setFechaInscripción(String value) { this.fechaInscripcion=value; }
 	public void setIdCarrera(String value) { this.idCarrera=value; }
 	public void setIdAtleta(String value) { this.idAtleta=value; }

}
