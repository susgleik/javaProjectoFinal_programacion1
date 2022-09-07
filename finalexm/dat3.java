package finalexm;

import java.time.LocalDate;


public class dat3 {
	
	private String IDcliente;
	private String nombre_cliente;
	private String correo_cliente;
    private int celular;
	private String laboratorio;
	private int existencia;
	private LocalDate Caducidad;
	private LocalDate Registro;
	
	public dat3( String IDcliente, String nombre_cliente,  String correo_cliente, int celular,  int existencia, LocalDate Caducidad,LocalDate Registro) 
	{
		this.IDcliente =IDcliente;
		this.nombre_cliente =nombre_cliente;
		this.correo_cliente= correo_cliente;
		this.celular=celular;
		this.existencia=existencia;
		this.Caducidad=Caducidad;
		this.Registro=Registro;
	}
	
	
	public String getIDcliente() {
		return IDcliente;
	}
	public void setIDcliente(String IDcliente) {
		this.IDcliente = IDcliente;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getCorreo_cliente() {
		return correo_cliente;
	}
	public void setCorreo_cliente(String correo_cliente) {
		this.correo_cliente = correo_cliente;
	}
    public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	public LocalDate getCaducidad() {
		return Caducidad;
	}
	public void setCaducidad(LocalDate caducidad) {
		Caducidad = caducidad;
	}
	public LocalDate getRegistro() {
		return Registro;
	}
	public void setRegistro(LocalDate registro) {
		Registro = registro;
	}
	
	
	

}