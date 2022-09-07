package finalexm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dat1{
	private static ArrayList<dat2> instructor =new ArrayList<dat2>();
	static Scanner sc_int =new Scanner(System.in);
	static Scanner sc_line =new Scanner(System.in);
	public static void main(String[] args){
		 
		int opcion = 0;      boolean off=false;
		int opcion_lab = 0;
		int opcion_Med = 0;
		int opcion_catalgo=0;
		String nombre_lab;
		int num_lab;
		int dia;
		int mes;
		int año;
		int num_anaquel;
		int num_medicamento;
		//int cantidad;
		
         String IDcliente;
		 String nombre_cliente;
		 String correo_cliente;
		 int celular;
		 String laboratorio;
		 int existencia;
		 LocalDate Caducidad;
		 LocalDate Registro;

		 do{
			System.out.println();
	   	 System.out.println("1. Catálogo (registrar instructor)");
	     System.out.println("2. Catálogo (registrar cliente)");
		 System.out.println("2. Registro de ingresos por mes");
	   	 System.out.println("3. Reportes o consultas");
	   	 System.out.println("4.  salir");	
	   	 System.out.println("\n\nSeleccione una opcion:");
			
         opcion = sc_int.nextInt();
		 switch (opcion){
			case 1:
			do{
				System.out.println("1. Agregar instructor");
				System.out.println("2. agregar cliente");
				System.out.println("3. agregar paquete");

				System.out.println("Ingrese una Opcion: ");
				
				opcion_catalgo =sc_int.nextInt();
				switch (opcion_catalgo){
					case 1://agregar lab
				do{
				System.out.println("1. Agregar instructor");
				System.out.println("2. Editar instructor");
				System.out.println("3. Eliminar instructor");

				System.out.println("Ingrese una Opcion: ");
				
				opcion_lab =sc_int.nextInt();
				switch (opcion_lab){
					case 1:

					System.out.println("Ingrese el nombre del instructor: ");
					
					nombre_lab= sc_line.nextLine();
					
					dat2 lab_x =new dat2(nombre_lab);
					instructor.add(lab_x);
					
					break;
				case 2: //editar el nombre del lab
				
			
					if (instructor.isEmpty()) {
						System.out.println("Lo siento debe crear un instructor antes ");
					}else {
						System.out.println("Que instructor desea editar: ");
						for (int i = 0; i <instructor.size() ; i++) {
							System.out.println(i+"-->"+instructor.get(i).getNombre());
						}
						num_lab= sc_int.nextInt();
						try {
							System.out.println("Que nombre le quiera cambiar al laboratorio :"+instructor.get(num_lab).getNombre());
							nombre_lab=sc_line.nextLine();
							instructor.get(num_lab).setNombre(nombre_lab);
							System.out.println("El nombre a sido cambiado con exito");

						} catch (Exception e) {
							System.out.println(e);

						}
					}
					
					break;
				case 3:  /// eliminar lab
	
					if (instructor.isEmpty()) {
						System.out.println("Lo siento debe crear un laboratorio antes ");
					}else {
						System.out.println("Que laboratorio desea eliminar: ");
						for (int i = 0; i <instructor.size() ; i++) {
							System.out.println(i+"-->"+instructor.get(i).getNombre());
						}
						num_lab= sc_int.nextInt();
						try {
							instructor.remove(num_lab);
							System.out.println("El laboratorio a sido eliminado con exito");

						} catch (Exception e) {
							System.out.println(e);

						}
					}
					break;
					case 4:
					off =true;
					break;


				default:
					System.out.println("Esta Opcion no esta disponible");
					//revisar whileeeee esta malo
				
				
				}
				}while(!off);
				break;
				case 2: //medicamento
			     do{
					System.out.println("1. Agregar cliente");
				System.out.println("2. Editar cliente");
				System.out.println("3. Eliminar cliente");

				System.out.println("Ingrese una Opcion: ");
				
				opcion_Med =sc_int.nextInt();
				
				switch (opcion_Med){
					case 1:  //agrgar med
					if (instructor.isEmpty()) {
						System.out.println("Lo siento debe crear un instructor antes ");
					}else {
						System.out.println("Que laboratorio lo desea agregar: ");
						for (int i = 0; i <instructor.size() ; i++) {
							System.out.println(i+"-->"+instructor.get(i).getNombre());
						}
						
						num_lab= sc_int.nextInt();
						
						try {
							laboratorio =instructor.get(num_lab).getNombre();
							
							System.out.println("Ingrese el codigo: ");
							IDcliente =sc_line.nextLine();
							System.out.println("Ingrese el Nombre del cliente: ");
							nombre_cliente =sc_line.nextLine();
							System.out.println("Ingrese el correo del cliente: ");
							correo_cliente =sc_line.nextLine();		
                            System.out.println("Ingrese el celular del cliente: ");
							celular =sc_line.nextInt();					
							System.out.println("Ingrese la cantidad: ");
							existencia =sc_int.nextInt();
							System.out.println("Ingrese la fecha de caducidad: ");
							System.out.println(" ");
							System.out.println("Las fecha o los valore se introducen en numeros");
							System.out.println(" ");
							System.out.println("Ingrese el año:");
							año =sc_int.nextInt();
							System.out.println("Ingrese el mes ");
							mes=sc_int.nextInt();
							System.out.println("Ingrese el dia ");
							dia=sc_int.nextInt();
							
							Caducidad=LocalDate.of(año, mes, dia);
							Registro= LocalDate.now();
							
							dat3 med1 = new dat3(IDcliente, nombre_cliente, correo_cliente, celular, existencia, Caducidad, Registro);
							
							((dat2) dat2.get(num_lab)).agregarCliente(med1,nombre_cliente);//ver esto!!!!
							
							

						} catch (Exception e) {
							System.out.println(e);

						}
						
					}
					
					
					break;
				case 2://editar
					if (instructor.isEmpty()) {
						System.out.println("Lo siento debe crear un instructor antes ");
					}else {
						System.out.println("Que laboratorio desea editar el medicamento: ");
						for (int i = 0; i <instructor.size() ; i++) {
							System.out.println("ID: "+ i + instructor.get(i).getNombre());
						}
						
						num_lab= sc_int.nextInt();
						try {
							instructor.get(num_lab).mostrarMedicamentos();
							System.out.println("En que anaquel se ncuentra el medicamento ");
							num_anaquel= sc_int.nextInt();
							
							if ((num_anaquel>0)&(num_anaquel<4)) {
								System.out.println("Cual es el numero del medicamento");
								num_medicamento= sc_int.nextInt();
								System.out.println("El sistema solo permite cambiar el numero"
										+ "de existencia , por seguridad en otro caso llame al"
										+ "supervisor");
								instructor.get(num_lab).mod_medicamento(num_anaquel, num_medicamento);

								
							}else {
								System.out.println("Este anaquel no existe");

							}

							
						} catch (Exception e) {
							System.out.println(e);
						}
						
					}
					
				
					break;
				case 3:
					if (instructor.isEmpty()) {
						System.out.println("Lo siento debe crear un laboratorio antes ");
					}else {
						System.out.println("Que laboratorio desea eliminar el medicamento: ");
						for (int i = 0; i <instructor.size() ; i++) {
							System.out.println(i+"-->"+instructor.get(i).getNombre());
						}
						
						num_lab= sc_int.nextInt();
						try {
							instructor.get(num_lab).mostrarMedicamentos();
							System.out.println("En que anaquel se ncuentra el medicamento ");
							num_anaquel= sc_int.nextInt();
							
							if ((num_anaquel>0)&(num_anaquel<4)) {
								System.out.println("Cual es el numero del medicamento");
								num_medicamento= sc_int.nextInt();
								instructor.get(num_lab).delete_medicamento(num_anaquel, num_medicamento);


								
							}else {
								System.out.println("Este anaquel no existe");

							}

							
						} catch (Exception e) {
							System.out.println(e);
						}
						
					
					}
					break;
				
				case 4:
				off =true;
				break;
				
				default:
					System.out.println("Esta Opcion no esta disponible");
					break;
				
				}

				 }while(!off);
				 break;
				 case 3:
				 off =true;
		break;
				
		default:
		System.out.println("Esta Opcion no esta disponible");
				
				}
			}while(!off);
			break;
			case 2:
			System.exit(0);
		break;
		default:
		System.out.println("Esta Opcion no esta disponible");
		 }
		 
		 }while(opcion!=2);
	}
}