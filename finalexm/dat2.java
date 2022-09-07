package finalexm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dat2 {
	
	private String nombre;
	private ArrayList<dat3>analquel_1 = new ArrayList<dat3>();
	private ArrayList<dat3>analquel_2 = new ArrayList<dat3>();
	private ArrayList<dat3>analquel_3 = new ArrayList<dat3>();
	static Scanner sc_int_1 =new Scanner(System.in);

	
	public dat2(String nombre){
		this.nombre =nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarCliente( dat3 cliente1,String nomString) {
		
	
		Pattern patron_1 = Pattern.compile("^([A-F]|[a-f])");
		Matcher m_1 = patron_1.matcher(nomString);
		boolean si_1 =m_1.find();
		
		Pattern patron_2 = Pattern.compile("^([G-P]|[g-p])");
		Matcher m_2 = patron_2.matcher(nomString);
		boolean si_2 =m_2.find();
		
		if(si_1) {
			this.analquel_1.add(cliente1);
			System.out.println("Se ha agregado el medicamento en el anaquel 1 del  laboratorio :"+this.nombre);
		}else if (si_2) {
			this.analquel_2.add(cliente1);
			System.out.println("Se ha agregado el medicamento en el anaquel 2 del  laboratorio :"+this.nombre);

		} else {
			this.analquel_3.add(cliente1);
			System.out.println("Se ha agregado el medicamento en el anaquel 3 del  laboratorio :"+this.nombre);

		}
		
	}
	
	public void mod_medicamento(int anaquel,int medicamento) {
		int cantidad;
		int cantidad_new = 0;
		String nombre;
		try {
			switch (anaquel) {
			case 1:
				nombre=analquel_1.get(medicamento).getNombre_cliente();
				cantidad=analquel_1.get(medicamento).getExistencia();
				System.out.println("El medicamento "+nombre+" tiene "+cantidad);
				System.out.println("Cual es la nueva cantidad de este medicamento ");
				cantidad_new = sc_int_1.nextInt();
				if (cantidad_new >=0) {
					System.out.println("la cantidad del medicamento ha sido modificada ");
					analquel_1.get(medicamento).setExistencia(cantidad_new);
				}else {
					System.out.println("No se puede introducir una cantidad negativa, lo sentimos");

				}
				
				
				

				break;
			case 2:
				
				nombre=analquel_2.get(medicamento).getNombre_cliente();
				cantidad=analquel_2.get(medicamento).getExistencia();
				System.out.println("El medicamento "+nombre+" tiene "+cantidad);
				System.out.println("Cual es la nueva cantidad de este medicamento ");
				cantidad_new = sc_int_1.nextInt();
				if (cantidad_new >=0) {
					System.out.println("la cantidad del medicamento ha sido modificada ");
					analquel_2.get(medicamento).setExistencia(cantidad_new);
				}else {
					System.out.println("No se puede introducir una cantidad negativa, lo sentimos");

				}
				
				break;
			case 3:
				nombre=analquel_3.get(medicamento).getNombre_cliente();
				cantidad=analquel_3.get(medicamento).getExistencia();
				System.out.println("El medicamento "+nombre+" tiene "+cantidad);
				System.out.println("Cual es la nueva cantidad de este medicamento ");
				cantidad_new = sc_int_1.nextInt();
				if (cantidad_new >=0) {
					System.out.println("la cantidad del medicamento ha sido modificada ");
					analquel_3.get(medicamento).setExistencia(cantidad_new);
				}else {
					System.out.println("No se puede introducir una cantidad negativa, lo sentimos");

				}
				
				
				break;

			default:
				System.out.println("Este anaquel no existe");

				break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	public void delete_medicamento(int anaquel,int medicamento) {
		
		try {
			switch (anaquel) {
			case 1:
				
				analquel_1.remove(medicamento);
				System.out.println("El medicamento a sido eliminado con exito");


				break;
			case 2:
				
				analquel_2.remove(medicamento);
				System.out.println("El medicamento a sido eliminado con exito");

				break;
			case 3:
			
				analquel_3.remove(medicamento);
				System.out.println("El medicamento a sido eliminado con exito");

				break;

			default:
				System.out.println("Este anaquel no existe");

				break;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void mostrarMedicamentos() {
		if(!analquel_1.isEmpty()) {
		System.out.println("");
		System.out.println("En el anaquel 1 tenemos :");
		for (int i = 0; i <analquel_1.size() ; i++) {
			System.out.println(i+"-->"+analquel_1.get(i).getNombre_cliente());
		}
		}
		
		if(!analquel_2.isEmpty()) {
			System.out.println("");
			System.out.println("En el anaquel 2 tenemos :");
			for (int i = 0; i <analquel_2.size() ; i++) {
				System.out.println(i+"-->"+analquel_2.get(i).getNombre_cliente());
			}
			}
		if(!analquel_3.isEmpty()) {
			System.out.println("");
			System.out.println("En el anaquel 3 tenemos :");
			for (int i = 0; i <analquel_3.size() ; i++) {
				System.out.println(i+"-->"+analquel_3.get(i).getNombre_cliente());
			}
			}
		System.out.println("");
	}

	public void medicamentos_vencimiento_mes_año(int mes , int año) {
		boolean hay =false;
		int año_us ;
		int mes_us ;
		if(!analquel_1.isEmpty()) {
			System.out.println("");
			System.out.println("En el anaquel 1 tenemos :");
			for (int i = 0; i <analquel_1.size() ; i++) {
				año_us=analquel_1.get(i).getCaducidad().getYear();
				if (año ==año_us) {
					mes_us=analquel_1.get(i).getCaducidad().getMonthValue();
					if (mes ==mes_us) {
						System.out.println("");
						System.out.println("Medicamento: ");
						System.out.println("Nombre Comercial: "+analquel_1.get(i).getNombre_cliente());
						System.out.println("Nombre Generico: "+analquel_1.get(i).getCorreo_cliente());
                        System.out.println("celular: "+analquel_3.get(i).getCelular());
						System.out.println("Laboratorio: "+this.nombre);
						System.out.println("Existencia: "+analquel_1.get(i).getExistencia());
						System.out.println("Caducidad: "+analquel_1.get(i).getCaducidad());
						System.out.println("");
						hay = true;
						
					}
					
				}
			}
			}
			
			if(!analquel_2.isEmpty()) {
				System.out.println("");
				System.out.println("En el anaquel 2 tenemos :");
				for (int i = 0; i <analquel_2.size() ; i++) {
					año_us=analquel_2.get(i).getCaducidad().getYear();
					if (año ==año_us) {
						mes_us=analquel_2.get(i).getCaducidad().getMonthValue();
						if (mes ==mes_us) {
							System.out.println("");
							System.out.println("Medicamento: ");
							System.out.println("Nombre Comercial: "+analquel_2.get(i).getNombre_cliente());
							System.out.println("Nombre Generico: "+analquel_2.get(i).getCorreo_cliente());
                            System.out.println("celular: "+analquel_3.get(i).getCelular());
							System.out.println("Laboratorio: "+this.nombre);
							System.out.println("Existencia: "+analquel_2.get(i).getExistencia());
							System.out.println("Caducidad: "+analquel_2.get(i).getCaducidad());
							System.out.println("");
							hay = true;
							
						}
						
					}
					

				}
				}
			if(!analquel_3.isEmpty()) {
				System.out.println("");
				System.out.println("En el anaquel 3 tenemos :");
				for (int i = 0; i <analquel_3.size() ; i++) {
					año_us=analquel_3.get(i).getCaducidad().getYear();
					if (año ==año_us) {
						mes_us=analquel_3.get(i).getCaducidad().getMonthValue();
						if (mes ==mes_us) {
							System.out.println("");
							System.out.println("cliente: ");
							System.out.println("Nombre del cliente: "+analquel_3.get(i).getNombre_cliente());
							System.out.println("correo del cliente: "+analquel_3.get(i).getCorreo_cliente());
                            System.out.println("celular: "+analquel_3.get(i).getCelular());
							System.out.println("id del instructor: "+this.nombre);
							System.out.println("Existencia: "+analquel_3.get(i).getExistencia());
							System.out.println("Caducidad: "+analquel_3.get(i).getCaducidad());
							System.out.println("");
							hay = true;
							
						}
						
					}
					
				}
				}
			
			if (!hay) {
				System.out.println("");
				System.out.println("En el Laboratorio "+this.nombre+" no hay medicamentos con esta fecha de caducidad");
				System.out.println("");
			}

		
		
	}

	public void Medicamentos_info(){
		if(!analquel_1.isEmpty()) {
			System.out.println("");
			System.out.println("En el anaquel 1 tenemos :");
			for (int i = 0; i <analquel_1.size() ; i++) {
				System.out.println("Medicamento "+i);
				System.out.println("Nombre Comercial: "+analquel_1.get(i).getNombre_cliente());
				System.out.println("Nombre Generico: "+analquel_1.get(i).getCorreo_cliente());
                System.out.println("celular: "+analquel_3.get(i).getCelular());
				System.out.println("Existencia: "+analquel_1.get(i).getExistencia());
				System.out.println("Fecha de caducidad: "+analquel_1.get(i).getCaducidad());
				System.out.println("");

			}
			}
			
			if(!analquel_2.isEmpty()) {
				System.out.println("");
				System.out.println("En el anaquel 2 tenemos :");
				for (int i = 0; i <analquel_2.size() ; i++) {
					System.out.println("Medicamento "+i);
					System.out.println("Nombre Comercial: "+analquel_2.get(i).getNombre_cliente());
					System.out.println("Nombre Generico: "+analquel_2.get(i).getCorreo_cliente());
                    System.out.println("celular: "+analquel_3.get(i).getCelular());
					System.out.println("Existencia: "+analquel_2.get(i).getExistencia());
					System.out.println("Fecha de caducidad: "+analquel_2.get(i).getCaducidad());
					System.out.println("");

				}
				}
			if(!analquel_3.isEmpty()) {
				System.out.println("");
				System.out.println("En el anaquel 3 tenemos :");
				for (int i = 0; i <analquel_3.size() ; i++) {
					System.out.println("Medicamento "+i);
					System.out.println("Nombre Comercial: "+analquel_3.get(i).getNombre_cliente());
					System.out.println("Nombre Generico: "+analquel_3.get(i).getCorreo_cliente());
                    System.out.println("celular: "+analquel_3.get(i).getCelular());
					System.out.println("Existencia: "+analquel_3.get(i).getExistencia());
					System.out.println("Fecha de caducidad: "+analquel_3.get(i).getCaducidad());
					System.out.println("");

				}
				}
			System.out.println("");
		}
	
	public boolean buscar_medicamento_nom_gen(String nombreString) {
		boolean existe=true;
		String nombre_usString;
		
		Pattern patron_1 = Pattern.compile("^([A-F]|[a-f])");
		Matcher m_1 = patron_1.matcher(nombreString);
		boolean si_1 =m_1.find();
		
		Pattern patron_2 = Pattern.compile("^([G-P]|[g-p])");
		Matcher m_2 = patron_2.matcher(nombreString);
		boolean si_2 =m_2.find();
		
		Pattern patron_3 = Pattern.compile("^([Q-Z]|[q-z])");
		Matcher m_3 = patron_3.matcher(nombreString);
		boolean si_3 =m_3.find();
		
		if(si_1) {
		

			for (int i = 0; i <analquel_1.size() ; i++) {
				
				nombre_usString = analquel_1.get(i).getNombre_cliente();
			
				System.out.println(nombreString.equalsIgnoreCase(nombre_usString));

				if (nombreString.equalsIgnoreCase(nombre_usString)) {
					existe=true;
					
				}
			
			}
		}else if (si_2) {
			for (int i = 0; i <analquel_2.size() ; i++) {
				nombre_usString = analquel_2.get(i).getNombre_cliente();
				if (nombreString.equalsIgnoreCase(nombre_usString)) {
					existe=true;
					
				}

		}} else {
			for (int i = 0; i <analquel_3.size() ; i++) {
				nombre_usString = analquel_3.get(i).getNombre_cliente();
				if (nombreString.equalsIgnoreCase(nombre_usString)) {
					existe=true;
					
				}

		}
			
		}
		
		return existe;
	}
	
	public void cantidad_Debajo_de_X(int cantidad) {
		boolean hay =false;
		if(!analquel_1.isEmpty()) {
			for (int i = 0; i <analquel_1.size() ; i++) {
				if(analquel_1.get(i).getExistencia()<cantidad) {
					System.out.println("");
					System.out.println("Medicamento: ");
					System.out.println("Nombre Comercial: "+analquel_1.get(i).getNombre_cliente());
					System.out.println("Nombre Generico: "+analquel_1.get(i).getCorreo_cliente());
                    System.out.println("celular: "+analquel_3.get(i).getCelular());
					System.out.println("Laboratorio: "+this.nombre);
					System.out.println("Existencia: "+analquel_1.get(i).getExistencia());
					System.out.println("");
					hay=true;
					
				}

			}
			
			}
		if(!analquel_2.isEmpty()) {
			for (int i = 0; i <analquel_2.size() ; i++) {
				if(analquel_2.get(i).getExistencia()<cantidad) {
					System.out.println("");
					System.out.println("Medicamento: ");
					System.out.println("Nombre Comercial: "+analquel_2.get(i).getNombre_cliente());
					System.out.println("Nombre Generico: "+analquel_2.get(i).getCorreo_cliente());
                    System.out.println("celular: "+analquel_3.get(i).getCelular());
					System.out.println("Laboratorio: "+this.nombre);
					System.out.println("Existencia: "+analquel_2.get(i).getExistencia());
					System.out.println("");
					hay=true;
					
				}

			}
		
			
			}
		if(!analquel_3.isEmpty()) {
			for (int i = 0; i <analquel_3.size() ; i++) {
				if(analquel_3.get(i).getExistencia()<cantidad) {
					System.out.println("");
					System.out.println("cliente: ");
					System.out.println("Nombre: "+analquel_3.get(i).getNombre_cliente());
					System.out.println("Nombre correo: "+analquel_3.get(i).getCorreo_cliente());
                    System.out.println("celular: "+analquel_3.get(i).getCelular());
					System.out.println("Laboratorio: "+this.nombre);
					System.out.println("Existencia: "+analquel_3.get(i).getExistencia());
					System.out.println("");
					hay=true;
					
				}
				

			}
			
			}
		if (!hay) {
			System.out.println("");
			System.out.println("En el Laboratorio "+this.nombre+" no hay medicamentos por debajo de esta cantidad");
			System.out.println("");
		}
	}
	
	public void vencimiento_n_mese(int meses) {
		boolean hay =false;
		int año_us ;
		int mes_us ;
		LocalDate fecha_cad = LocalDate.now();
		LocalDate fecha_medicamento ;

		fecha_cad=fecha_cad.plusMonths(meses);
		
		System.out.println("buscando medicamentos que caduzcan antes del :"+fecha_cad);
		if(!analquel_1.isEmpty()) {
			System.out.println("");
			System.out.println("En el anaquel 1 tenemos :");
			for (int i = 0; i <analquel_1.size() ; i++) {
				fecha_medicamento =analquel_1.get(i).getCaducidad();
				if (fecha_cad.compareTo(fecha_medicamento)>0) {
					System.out.println("");
					System.out.println("cliente: ");
					System.out.println("Nombre cliente: "+analquel_1.get(i).getNombre_cliente());
					System.out.println("correo del cliente: "+analquel_1.get(i).getCorreo_cliente());
                    System.out.println("celular: "+analquel_3.get(i).getCelular());
					System.out.println("Laboratorio: "+this.nombre);
					System.out.println("Existencia: "+analquel_1.get(i).getExistencia());
					System.out.println("Caducidad: "+analquel_1.get(i).getCaducidad());
					System.out.println("");
					hay = true;
					
				}	
				
			}
			}
			
			if(!analquel_2.isEmpty()) {
				System.out.println("");
				System.out.println("En el anaquel 2 tenemos :");
				for (int i = 0; i <analquel_2.size() ; i++) {
					fecha_medicamento =analquel_2.get(i).getCaducidad();
					if (fecha_cad.compareTo(fecha_medicamento)>0) {
						System.out.println("");
						System.out.println("cliente: ");
						System.out.println("Nombre del cliente: "+analquel_2.get(i).getNombre_cliente());
						System.out.println("correo del cliente: "+analquel_2.get(i).getCorreo_cliente());
						System.out.println("instructor: "+this.nombre);
						System.out.println("Existencia: "+analquel_2.get(i).getExistencia());
						System.out.println("Caducidad: "+analquel_2.get(i).getCaducidad());
						System.out.println("");
						hay = true;
						
					}		
					

				}
				}
			if(!analquel_3.isEmpty()) {
				System.out.println("");
				System.out.println("En el anaquel 3 tenemos :");
				for (int i = 0; i <analquel_3.size() ; i++) {
					fecha_medicamento =analquel_3.get(i).getCaducidad();
					if (fecha_cad.compareTo(fecha_medicamento)>0) {
						System.out.println("");
						System.out.println("Medicamento: ");
						System.out.println("Nombre Comercial: "+analquel_3.get(i).getNombre_cliente());
						System.out.println("Nombre Generico: "+analquel_3.get(i).getCorreo_cliente());
						System.out.println("Laboratorio: "+this.nombre);
						System.out.println("Existencia: "+analquel_3.get(i).getExistencia());
						System.out.println("Caducidad: "+analquel_3.get(i).getCaducidad());
						System.out.println("");
						hay = true;
						
					}	
					
				}
				}
			
			if (!hay) {
				System.out.println("");
				System.out.println("En el Laboratorio "+this.nombre+" no hay medicamentos que caduzcan en los prximos " +meses+"meses");
				System.out.println("");
			}
	}

	public void anaquel_x(int num_anaquel) {
		
		switch (num_anaquel) {
		case 1:
			if(analquel_1.isEmpty()) {
				System.out.println("En el laboratorio : "+ this.nombre +" el anaquel 1 esta vacio");
			}else {
				System.out.println("");
				System.out.println("En el laboratorio : "+ this.nombre +" los medicamentos del anaquel 1 son:");

				for (int i = 0; i <analquel_1.size() ; i++) {
						System.out.println("");
						System.out.println("Medicamento: ");
						System.out.println("Nombre Comercial: "+analquel_1.get(i).getNombre_cliente());
						System.out.println("Nombre Generico: "+analquel_1.get(i).getCorreo_cliente());
						System.out.println("Laboratorio: "+this.nombre);
						System.out.println("Existencia: "+analquel_1.get(i).getExistencia());
						System.out.println("");
						

				}
			}
			break;
		case 2:
			if(analquel_2.isEmpty()) {
				System.out.println("En el laboratorio : "+ this.nombre +"El anaquel 2 esta vacio");
			}else {
				System.out.println("");
				System.out.println("En el laboratorio : "+ this.nombre +" los medicamentos del anaquel 2 son:");
				for (int i = 0; i <analquel_2.size() ; i++) {
					
					
					System.out.println("");
					System.out.println("Medicamento: ");
					System.out.println("Nombre Comercial: "+analquel_2.get(i).getNombre_cliente());
					System.out.println("Nombre Generico: "+analquel_2.get(i).getCorreo_cliente());
					System.out.println("Laboratorio: "+this.nombre);
					System.out.println("Existencia: "+analquel_2.get(i).getExistencia());
					System.out.println("");
					

			}
				
			}
			break;
		case 3:
			if(analquel_3.isEmpty()) {
				System.out.println("En el laboratorio : "+ this.nombre +"El anaquel 3 esta vacio");
			}else {
				System.out.println("");
				System.out.println("En el laboratorio : "+ this.nombre +" los medicamentos del anaquel 3 son:");
				for (int i = 0; i <analquel_3.size() ; i++) {
					
					
					System.out.println("");
					System.out.println("Medicamento: ");
					System.out.println("Nombre Comercial: "+analquel_3.get(i).getNombre_cliente());
					System.out.println("Nombre Generico: "+analquel_3.get(i).getCorreo_cliente());
					System.out.println("Laboratorio: "+this.nombre);
					System.out.println("Existencia: "+analquel_3.get(i).getExistencia());
					System.out.println("");
					

			}
				
			}
	
	break;

		default:
			System.out.println("Este Anaquel no existe, recuerde que solo hay tres anaqueles");
			break;
		}
	}
    public static Object get(int num_lab) {
        return null;
    }
	


}
