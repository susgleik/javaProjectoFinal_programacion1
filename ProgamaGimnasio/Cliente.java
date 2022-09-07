package ProgamaGimnasio;

public class Cliente {
	
	private int IDC;
	private String nombre_cliente;
	private String correo_cliente;
    private String celular;
	private String meses;
	saldo Saldo[];
	
	
	
	public Cliente( int IDC, String nombre_cliente,  String correo_cliente, String celular,String meses, saldo[] saldo) 
	{
		this.IDC =IDC;
		this.nombre_cliente =nombre_cliente;
		this.correo_cliente= correo_cliente;
		this.celular=celular;
		this.meses=meses;
	}

	//SETTER & GETTER
	
	public Cliente(String meses2) {
	}

	public Cliente() {
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
    public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getIDC() {
		return IDC;
	}

	public void setIDC(int iDC) {
		IDC = iDC;
	}

	public String getMeses() {
		return meses;
	}

	public void setMeses(String meses) {
		this.meses = meses;
	}

	public Object Cliente(String meses2) {
		return null;
	}


	
}

