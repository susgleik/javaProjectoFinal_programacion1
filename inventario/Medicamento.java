package inventario;

import java.time.LocalDate;


public class Medicamento {
	
	private String codigo;
	private String Nombre_Comercial;
	private String Nombre_Generico;
	private String laboratorio;
	private int existencia;
	private LocalDate Caducidad;
	private LocalDate Registro;
	
	public Medicamento( String codigo, String Nombre_Comercial,  String Nombre_Generico , String laboratorio,  int existencia, LocalDate Caducidad,LocalDate Registro) 
	{
		this.codigo =codigo;
		this.Nombre_Comercial =Nombre_Comercial;
		this.Nombre_Generico= Nombre_Generico;
		this.laboratorio=laboratorio;
		this.existencia=existencia;
		this.Caducidad=Caducidad;
		this.Registro=Registro;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre_Comercial() {
		return Nombre_Comercial;
	}
	public void setNombre_Comercial(String nombre_Comercial) {
		Nombre_Comercial = nombre_Comercial;
	}
	public String getNombre_Generico() {
		return Nombre_Generico;
	}
	public void setNombre_Generico(String nombre_Generico) {
		Nombre_Generico = nombre_Generico;
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