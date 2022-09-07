package ProgamaGimnasio;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


public class RegistroGimnasio {



	private ArrayList<Instructor> ListaInstructores = new ArrayList<Instructor>();
	private ArrayList<Cliente> ListaClientes = new ArrayList<Cliente>();
	private ArrayList<Planes> listaPlanes = new ArrayList<Planes>();
	private String nombre;
	private int IDI;
	private int IDC;
	
	 

	static Scanner sc= new Scanner(System.in);
	

	
    
	//SETTERS &  GETTERS
	public int getIDC() {
		return IDC;
	}

	public void setIDC(int iDC) {
		IDC = iDC;
	}
	
	public ArrayList<Instructor> getListaInstructores() {
		return ListaInstructores;
	}

	public void setListaInstructores(ArrayList<Instructor> listaInstructores) {
		ListaInstructores = listaInstructores;
	}

	public ArrayList<Cliente> getListaClientes() {
		return ListaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		ListaClientes = listaClientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIDI() {
		return IDI;
	}

	public void setIDI(int iDI) {
		IDI = iDI;
	}
	public static Scanner getSc() {
		return sc;
	}

	public static void setSc(Scanner sc) {
		RegistroGimnasio.sc = sc;
	}

	//OTROS METODOS

	//METODOS INSTRUCTOR
	public void agregarInstructor() {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int i=IDI=IDI+1; 

		System.out.println("Ingrese el nombre del instructor que desea agregar");
		nombre = sc.nextLine();
		System.out.println("\n");

		Instructor ins= new Instructor(nombre, IDI);
		ListaInstructores.add(ins);
		

		System.out.println("Se ha agregado el instructor :"+nombre+"\t con numero de ID:"+IDI);
		System.out.println("\n");

		System.out.println("===LISTA DE INSTRUCTORES===");
        System.out.println("\n");
		for (Instructor instructor : ListaInstructores) {
			System.out.println("ID:"+instructor.getIDI()+"\tInstructor:\t"+instructor.getNombre());
			
		}	
	}

	public void ModificarInstructor(){
		Scanner sc_line = new Scanner (System.in);
		Scanner sc_int = new Scanner (System.in);
		String nombre; 
		int indice;


			System.out.println("Elija un numero para seleccionar instructor desea editar:");
			System.out.println("\n");
			for (int i = 0; i <ListaInstructores.size() ; i++) {
				System.out.println(i+"\tID:"+ListaInstructores.get(i).getIDI()+"\tInstructor:\t"+ListaInstructores.get(i).getNombre());
			}
			System.out.println("\n");
			indice= sc_int.nextInt();

			    System.out.println("\n");
				System.out.println("¿Como desea renombrar al instructor? :"+ListaInstructores.get(indice).getNombre());

				nombre=sc_line.nextLine();
				ListaInstructores.get(indice).setNombre(nombre);
				System.out.println("\n");

				System.out.println("¡El nombre a sido cambiado con exito!");
				System.out.println("\n");

				System.out.println("La lista de Instructores Ha sido actualizada");
				System.out.println("\n");
				
				for (Instructor instructor : ListaInstructores) {
					System.out.println("ID:"+instructor.getIDI()+"\tInstructor:\t"+instructor.getNombre());
					
				}		
			}


	public void eliminarInstructor() {
		Scanner sc_int2 = new Scanner (System.in);
		int indice;

			System.out.println("Elija un numero para seleccionar el instructor que desea elimina");
			System.out.println("\n");
			for (int i = 0; i <ListaInstructores.size() ; i++) {
				System.out.println(i+"\tID:"+ListaInstructores.get(i).getIDI()+"\tInstructor:\t"+ListaInstructores.get(i).getNombre());
			}			
			System.out.println("\n");
			indice= sc_int2.nextInt();
		
				ListaInstructores.remove(indice);
				System.out.println("\n");
				System.out.println("¡El instructor ha sido eliminado con exito!");
				System.out.println("\n");
				
				System.out.println("La lista de Instructores Ha sido actualizada");
				System.out.println("\n");

				for (Instructor instructor : ListaInstructores) {
					System.out.println("ID:"+instructor.getIDI()+"\tInstructor:\t"+instructor.getNombre());					
				}	
				System.out.println("\n");	
			}

	//METODOS CLIENTE

	public void registroCliente(){
		
		Scanner sc = new Scanner(System.in);
		
		String nombre_cliente,correo_cliente;
		int i=IDC=IDC+1;
		String celular;  

		System.out.println("Ingrese el nombre del cliente que desea agregar");
		nombre_cliente= sc.nextLine();
		System.out.println("\n");

		System.out.println("Ingrese el correo del cliente que desea agregar");
		correo_cliente= sc.nextLine();
		System.out.println("\n");

		System.out.println("Ingrese el celular del cliente que desea agregar");
		celular= sc.nextLine();
		System.out.println("\n");

		Cliente clins= new Cliente(IDC,nombre_cliente,correo_cliente,celular, celular, null); 
		ListaClientes.add(clins);
		

		System.out.println("¡Se ha agregado el cliente de manera exitosa!");
		System.out.println("\n");

		System.out.println("===LISTA DE CLIENTES===");
        System.out.println("\n");

		for (Cliente cliente : ListaClientes) {
			System.out.println("ID:"+cliente.getIDC()+"\tCliente:\t"+cliente.getNombre_cliente()+"\n"+"\tCorreo:\t\t"+ cliente.getCorreo_cliente()+"\n"+"\tCelular:\t"+ cliente.getCelular()+"\n");
			
		}
		
	
    }

	public void ModificarCliente(){
				Scanner sc_line = new Scanner (System.in);
				Scanner sc_int = new Scanner (System.in);
				String nombre_cliente, correo_cliente,celular;
				

				int indice,opcion;
		
		
					System.out.println("Elija un numero para seleccionar cliente desea editar:");
					System.out.println("\n");
					for (int i = 0; i <ListaClientes.size() ; i++) {
						System.out.println(i+"\tID:"+ListaClientes.get(i).getIDC()+ "\tCliente:\t"+ListaClientes.get(i).getNombre_cliente()); 
					}
					System.out.println("\n");

					
					indice= sc_int.nextInt();   //Se realizan los cambios según la posición seleccionada
						System.out.println("\n");
						System.out.println("desea cambiar el nombre del cliente\n 1. SI   2.NO ");
						opcion = sc.nextInt();
					
						if(opcion == 1){
							System.out.println("¿Como desea renombrar al cliente? :"+ListaClientes.get(indice).getNombre_cliente());
						nombre_cliente=sc_line.nextLine();
						ListaClientes.get(indice).setNombre_cliente(nombre_cliente);;
					  System.out.println("\n");}
					  else if (opcion ==2){
						System.out.println("has elejido no");
					  }
					  else{
						System.out.println("valor invalido");
					  }
					
						System.out.println("\n");

						System.out.println("¿desea un cambiar el correo del cliente?\n 1. SI   2.NO ");
						opcion = sc.nextInt();
						if(opcion==1 ){
						System.out.println("¿Como desea renombrar el correo del cliente? :"+ListaClientes.get(indice).getCorreo_cliente());
						correo_cliente=sc_line.nextLine();
						ListaClientes.get(indice).setCorreo_cliente(correo_cliente);}
						else if(opcion==2){
							System.out.println("has elejido no");
						}
						else{
							System.out.println("valor invalido");
						}

						System.out.println("\n");
						System.out.println("¿desea cambiar el numero del cliente?\n 1. SI   2.NO ");
						opcion = sc.nextInt();
						if(opcion==1){
						System.out.println("¿Como desea renombrar el numero del cliente? :"+ListaClientes.get(indice).getCelular());
						celular=sc_line.nextLine();
						ListaClientes.get(indice).setCelular(celular);}
						else if(opcion==2){
							System.out.println("has elejido no");
						}
						else{
							System.out.println("valor invalido");
						}
						System.out.println("\n");
		
		
						System.out.println("¡Los cambios se han realizado con exito!");
						System.out.println("La lista de Instrctores Ha sido actualizada");
						System.out.println("\n");
						
						for (Cliente cliente : ListaClientes) {  //muestra los cambios realizados
							System.out.println("ID:"+cliente.getIDC()+"\tCliente:\t"+cliente.getNombre_cliente()+"\n"+"\tCorreo:\t \t"+ cliente.getCorreo_cliente()+"\n"+ "\tCelular:\t"+ cliente.getCelular()+"\n");
						}			
			}
	
	public void eliminarCliente() {
		Scanner sc_int2 = new Scanner (System.in);
		int indic;

			System.out.println("Elija un numero para seleccionar el cliente que desea eliminar: ");
			System.out.println("\n");
			for (int i = 0; i <ListaClientes.size() ; i++) {
				System.out.println(i+"\tID:"+ListaClientes.get(i).getIDC()+"\tCliente:\t"+ListaClientes.get(i).getNombre_cliente());
			}			
			System.out.println("\n");
			indic= sc_int2.nextInt();
		
				ListaClientes.remove(indic);
				System.out.println("\n");
				System.out.println("¡El cliente ha sido eliminado con exito!");
				System.out.println("\n");
				
				System.out.println("La lista de Clientes Ha sido actualizada");
				System.out.println("\n");

				for (Cliente cliente : ListaClientes) {
					System.out.println("ID:"+cliente.getIDC()+"\tCliente:\t"+cliente.getNombre_cliente()+"\n"+"\tCorreo:\t\t"+ cliente.getCorreo_cliente()+"\n"+"\tCelular:\t"+ cliente.getCelular()+"\n");					
				}	
			}


//MENUS
	public int menu()
	   {
	   	 int opcion; 
	   	 Scanner sc = new Scanner (System.in);
	   	 System.out.println();
		 System.out.println("===MENÚ PRINCIPAL===");
		 System.out.println();
	   	 System.out.println("1. Catálogo");
		 System.out.println("2. Registro de ingresos por mes");
	   	 System.out.println("3. Reportes o consultas");
	   	 System.out.println("4. salir");
	   	 System.out.println("\n\nSeleccione una opcion:");
	   	 opcion = sc.nextInt();
		 System.out.println("\n");
	   	 return opcion;
	   }

	   public int menu2()
	   {
	   	 int opcion1; 

	   	 Scanner sc = new Scanner (System.in);
	   	 System.out.println();
		 System.out.println("===MENÚ DE MANTENIMIENTO===");
		 System.out.println();
	   	 System.out.println("1. Istructores");
		 System.out.println("2. Planes");
	   	 System.out.println("3. Clientes");
		 System.out.println("4. Regresar");
	   	 System.out.println("\n\nSeleccione una opcion:");
	   	 opcion1 = sc.nextInt();
		 System.out.println("\n");
	   	 return opcion1;
	   }

	   public int menu3()
	   {
	   	 int opcion2; 

	   	 Scanner sc = new Scanner (System.in);
	   	 System.out.println();
		 System.out.println("===OPCIONES DE MANTENIMIENTO===");
		 System.out.println();
	   	 System.out.println("1. Crear");
		 System.out.println("2. Modificar");
	   	 System.out.println("3. Eliminar");
		 System.out.println("4. Regresar");
	   	 System.out.println("\n\nSeleccione una opcion:");
	   	 opcion2 = sc.nextInt();
		 System.out.println("\n");
	   	 return opcion2;
	   }

	   public int menu4()
	   {
	   	 int opcion2; 

	   	 Scanner sc = new Scanner (System.in);
	   	 System.out.println();
		 System.out.println("===OPCIONES DE PLANES===");
		 System.out.println();
	   	 System.out.println("1. Mostrar Planes");
		 System.out.println("2. Modificar");
	   	 System.out.println("3. Eliminar");
		 System.out.println("4. Regresar");
	   	 System.out.println("\n\nSeleccione una opcion:");
	   	 opcion2 = sc.nextInt();
		 System.out.println("\n");
	   	 return opcion2;
	   }



	   // METODOS PLANES

	   public void mostrarTabla(){

		Scanner sc = new Scanner (System.in);

		int k;
		

		listaPlanes.add(new Planes("Básico", 7, 20.00));
		listaPlanes.add(new Planes("Intermedio", 10, 50.00));
		listaPlanes.add(new Planes("Avanzado", 15, 80.00));

			
	   System.out.println("\n-------------------------------------------------------- \n");
	   System.out.println("\n                  Tabla de precios                       \n");
       System.out.println("\n-------------------------------------------------------- \n");

	

	   for (Planes planes : listaPlanes) {
		System.out.println("Plan:\t\t\t\t"+planes.getNombre_plan()+"\nHoras Semanales:\t\t"+planes.getHoras()+"\nPrecio:\t\t\t\t"+ planes.getPrecio()+"$"+"\n");
		
	}
		System.out.println();
		System.out.println("\n");
				
	}

	public void ModificarPlanes(){
		Scanner sc_line = new Scanner (System.in);
				Scanner sc_int = new Scanner (System.in);
				Scanner sc_double = new Scanner (System.in);
				String nombre_cliente, correo_cliente,celular;
				int horas;
				double precio;

				int indice,opcion;
		
		
					System.out.println("Elija un numero para seleccionar cliente desea editar:");
					System.out.println("\n");
					for (int i = 0; i <listaPlanes.size() ; i++) {
						System.out.println(i+"\tHoras semanales:"+listaPlanes.get(i).getHoras()+ "\tprecio:\t"+listaPlanes.get(i).getPrecio()); 
					}
					System.out.println("\n");

					
					indice= sc_int.nextInt();   //Se realizan los cambios según la posición seleccionada
						System.out.println("\n");
						System.out.println("desea cambiar la hora\n 1. SI   2.NO ");
						opcion = sc.nextInt();
					
						if(opcion == 1){
							System.out.println("¿Como desea cambiar la hora? :"+listaPlanes.get(indice).getHoras());
						horas=sc_int.nextInt();
						listaPlanes.get(indice).setHoras(horas);
					  System.out.println("\n");}
					  else if (opcion ==2){
						System.out.println("has elejido no");
					  }
					  else{
						System.out.println("valor invalido");
					  }
					
						System.out.println("\n");

						System.out.println("¿desea un cambiar el precio?\n 1. SI   2.NO ");
						opcion = sc.nextInt();
						if(opcion==1 ){
						System.out.println("¿Como desea renombrar el correo del cliente? :"+listaPlanes.get(indice).getPrecio());
						precio=sc_double.nextDouble();
						listaPlanes.get(indice).setPrecio(precio);
					}
						else if(opcion==2){
							System.out.println("has elejido no");
						}
						else{
							System.out.println("valor invalido");
						}
						System.out.println("¡Los cambios se han realizado con exito!");
						System.out.println("La lista de planes Ha sido actualizada");
						System.out.println("\n");
						
						for (Planes planes : listaPlanes) {
							System.out.println("Plan:\t\t\t\t"+planes.getNombre_plan()+"\nHoras Semanales:\t\t"+planes.getHoras()+"\nPrecio:\t\t\t\t"+ planes.getPrecio()+"$"+"\n");
							
						}		
	}
	//METODOS REGISTRO 
	public void ingresarDatos1(){
		
		Scanner sc_line = new Scanner (System.in);
		Scanner sc_int = new Scanner (System.in);
		String nombre_cliente; 
		int indice;
		int indice2; 
		int k, j, i, m; 

		
		String [] array_meses = new String [3];
		array_meses[0]= "enero";
		array_meses[1]= "febrero";
		array_meses[2]= "marzo";


		System.out.println("Elija un numero para seleccionar cliente:");
		System.out.println("\n");
		for ( k = 0; k <ListaClientes.size() ; k++) {
			System.out.println(k+"\tID:"+ListaClientes.get(k).getIDC()+ "\tCliente:\t"+ListaClientes.get(k).getNombre_cliente());
			indice2= sc_int.nextInt(); 
			System.out.println("\n");

		System.out.println("Elija un numero para seleccionar el mes de la venta");
		System.out.println("\n");
		for (m = 0; m <3 ; m++){
		System.out.println(m+"\t"+array_meses[m]);
		}
		m= sc_int.nextInt();
		System.out.println("\n");

		System.out.println("Elija un numero para seleccionar el Plan");
		System.out.println("\n");
		for (j = 0; j <3 ; j++){
		System.out.println(j+"\t"+listaPlanes.get(j).getNombre_plan());
		}
		j= sc_int.nextInt();
		System.out.println("\n");


		System.out.println("Elija un numero para seleccionar el instructor que desea seleccionar");
		System.out.println("\n");
		for ( i = 0; i <ListaInstructores.size() ; i++) {
			System.out.println(i+"\tID:"+ListaInstructores.get(i).getIDI()+"\tInstructor:\t"+ListaInstructores.get(i).getNombre());
			}
			indice= sc_int.nextInt();
			System.out.println("\n");		

			System.out.println("\n");
		    System.out.println("\nCliente:\t"+ListaClientes.get(indice2).getNombre_cliente()+"\nInstructor:\t"+ListaInstructores.get(indice).getNombre()+"\nMes:\t\t"+array_meses[m]+"\nPlan:\t\t"+listaPlanes.get(j).getNombre_plan());
		    System.out.println("\n");
		}
		
		

		
		
	}
			
		}
		
	
		






