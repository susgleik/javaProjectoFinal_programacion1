package inventario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Inventario {
	
	private static ArrayList<Laboratorio> laboratorios =new ArrayList<Laboratorio>();
	static Scanner sc_int =new Scanner(System.in);
	static Scanner sc_line =new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcion = 0;
		int opcion_lab = 0;
		int opcion_Med = 0;
		String nombre_lab;
		int num_lab;
		int dia;
		int mes;
		int año;
		int num_anaquel;
		int num_medicamento;
		int cantidad;
		
		 String codigo;
		 String Nombre_Comercial;
		 String Nombre_Generico;
		 String laboratorio;
		 int existencia;
		 LocalDate Caducidad;
		 LocalDate Registro;
		 
		do {
			System.out.println("UNIVERSIDAD TECNOLoGICA DE PANAMA");
            System.out.println("FACULTAD DE SISTEMAS");
            System.out.println("PROGRAMACION DE SOFTWARE I");
            System.out.println("\nEstudiantes: ");
            System.out.println("Daniela Vargas");
            System.out.println("Alanis Penalba\n");
			System.out.println("1. Registrar laboratorio");
			System.out.println("2. Registrar Medicamento");
			System.out.println("3. Consultar medicamentos en un laboratorio");
			System.out.println("4. Laboratorio con un medicamento especifico");
			System.out.println("5. Medicamentos por debajo de una cantidad");
			System.out.println("6. Medicamentos que vencen en mes y año");
			System.out.println("7. Medicamentos que vencen en los proximos n meses");
			System.out.println("8. Medicamentos en un anaquel x");
			System.out.println("9. Salir");
			
			System.out.println("Ingrese una Opcion: ");
			
			opcion = sc_int.nextInt();
			
			switch (opcion) {
			case 1:  //laboratorio
				System.out.println("1. Agregar laboratorio");
				System.out.println("2. Editar laboratorio");
				System.out.println("3. Eliminar laboratorio");

				System.out.println("Ingrese una Opcion: ");
				
				opcion_lab =sc_int.nextInt();
				
				switch (opcion_lab) {
				case 1://agregar lab
					
					System.out.println("Ingrese el nombre del laboratorio: ");
					
					nombre_lab= sc_line.nextLine();
					
					Laboratorio lab_x =new Laboratorio(nombre_lab);
					laboratorios.add(lab_x);
					
					break;
				case 2: //editar el nombre del lab
					
			
					if (laboratorios.isEmpty()) {
						System.out.println("Lo siento debe crear un laboratorio antes ");
					}else {
						System.out.println("Que laboratorio desea editar: ");
						for (int i = 0; i <laboratorios.size() ; i++) {
							System.out.println(i+"-->"+laboratorios.get(i).getNombre());
						}
						num_lab= sc_int.nextInt();
						try {
							System.out.println("Que nombre le quiera cambiar al laboratorio :"+laboratorios.get(num_lab).getNombre());
							nombre_lab=sc_line.nextLine();
							laboratorios.get(num_lab).setNombre(nombre_lab);
							System.out.println("El nombre a sido cambiado con exito");

						} catch (Exception e) {
							System.out.println(e);

						}
					}
					
					break;
				case 3:  /// eliminar lab
	
					if (laboratorios.isEmpty()) {
						System.out.println("Lo siento debe crear un laboratorio antes ");
					}else {
						System.out.println("Que laboratorio desea eliminar: ");
						for (int i = 0; i <laboratorios.size() ; i++) {
							System.out.println(i+"-->"+laboratorios.get(i).getNombre());
						}
						num_lab= sc_int.nextInt();
						try {
							laboratorios.remove(num_lab);
							System.out.println("El laboratorio a sido eliminado con exito");

						} catch (Exception e) {
							System.out.println(e);

						}
					}
					break;

				default:
					System.out.println("Esta Opcion no esta disponible");
					break;
				}
				
				break;
				
			case 2: //medicamento
				System.out.println("1. Agregar Medicamento");
				System.out.println("2. Editar Medicamento");
				System.out.println("3. Eliminar Medicamento");

				System.out.println("Ingrese una Opcion: ");
				
				opcion_Med =sc_int.nextInt();
				
				switch (opcion_Med) {
				case 1:  //agrgar med
					if (laboratorios.isEmpty()) {
						System.out.println("Lo siento debe crear un laboratorio antes ");
					}else {
						System.out.println("Que laboratorio lo desea agregar: ");
						for (int i = 0; i <laboratorios.size() ; i++) {
							System.out.println(i+"-->"+laboratorios.get(i).getNombre());
						}
						
						num_lab= sc_int.nextInt();
						
						try {
							laboratorio =laboratorios.get(num_lab).getNombre();
							
							System.out.println("Ingrese el codigo: ");
							codigo =sc_line.nextLine();
							System.out.println("Ingrese el Nombre Comercial: ");
							Nombre_Comercial =sc_line.nextLine();
							System.out.println("Ingrese el Nombre Generico: ");
							Nombre_Generico =sc_line.nextLine();						
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
							
							Medicamento med1 =new Medicamento(codigo, Nombre_Comercial, Nombre_Generico, laboratorio, existencia, Caducidad, Registro);
							
							laboratorios.get(num_lab).agregarMedicamento(med1, Nombre_Comercial);
							
							
							

						} catch (Exception e) {
							System.out.println(e);

						}
						
					}
					
					
					break;
				case 2://editar
					if (laboratorios.isEmpty()) {
						System.out.println("Lo siento debe crear un laboratorio antes ");
					}else {
						System.out.println("Que laboratorio desea editar el medicamento: ");
						for (int i = 0; i <laboratorios.size() ; i++) {
							System.out.println(i+"-->"+laboratorios.get(i).getNombre());
						}
						
						num_lab= sc_int.nextInt();
						try {
							laboratorios.get(num_lab).mostrarMedicamentos();
							System.out.println("En que anaquel se ncuentra el medicamento ");
							num_anaquel= sc_int.nextInt();
							
							if ((num_anaquel>0)&(num_anaquel<4)) {
								System.out.println("Cual es el numero del medicamento");
								num_medicamento= sc_int.nextInt();
								System.out.println("El sistema solo permite cambiar el numero"
										+ "de existencia , por seguridad en otro caso llame al"
										+ "supervisor");
								laboratorios.get(num_lab).mod_medicamento(num_anaquel, num_medicamento);

								
							}else {
								System.out.println("Este anaquel no existe");

							}

							
						} catch (Exception e) {
							System.out.println(e);
						}
						
					}
					
					
					break;
				case 3:
					if (laboratorios.isEmpty()) {
						System.out.println("Lo siento debe crear un laboratorio antes ");
					}else {
						System.out.println("Que laboratorio desea eliminar el medicamento: ");
						for (int i = 0; i <laboratorios.size() ; i++) {
							System.out.println(i+"-->"+laboratorios.get(i).getNombre());
						}
						
						num_lab= sc_int.nextInt();
						try {
							laboratorios.get(num_lab).mostrarMedicamentos();
							System.out.println("En que anaquel se ncuentra el medicamento ");
							num_anaquel= sc_int.nextInt();
							
							if ((num_anaquel>0)&(num_anaquel<4)) {
								System.out.println("Cual es el numero del medicamento");
								num_medicamento= sc_int.nextInt();
								laboratorios.get(num_lab).delete_medicamento(num_anaquel, num_medicamento);


								
							}else {
								System.out.println("Este anaquel no existe");

							}

							
						} catch (Exception e) {
							System.out.println(e);
						}
						
						
					}
					
	
					break;

				default:
					System.out.println("Esta Opcion no esta disponible");
					break;
				}
				
				break;
			case 3:///consulta de medicamentos por un lab x
				if (laboratorios.isEmpty()) {
					System.out.println("Lo siento debe crear un laboratorio antes ");
				}else {
	
					System.out.println("Que laboratorio desea ver los medicamentos: ");
					for (int i = 0; i <laboratorios.size() ; i++) {
						System.out.println(i+"-->"+laboratorios.get(i).getNombre());
					}
					num_lab= sc_int.nextInt();
					try {
						laboratorios.get(num_lab).Medicamentos_info();
					} catch (Exception e) {
						System.out.println(e);
					}
					
				}
				break;
			case 4: //laboratorio con un medicamento especifico
				
				if (laboratorios.isEmpty()) {
					System.out.println("Lo siento debe crear un laboratorio antes ");
				}else {
					System.out.println("Para buscar un medicamento , se utilizara el nombre generico");
					System.out.println("Introduzca el nombre generico :");
					Nombre_Generico=sc_line.nextLine();
					for (int i = 0; i <laboratorios.size() ; i++) {
						if(laboratorios.get(i).buscar_medicamento_nom_gen(Nombre_Generico)) {
							System.out.println("En el laboratorio "+laboratorios.get(i).getNombre()+" si existe el medicamento");
						}else {
							System.out.println("En el laboratorio "+laboratorios.get(i).getNombre()+" no existe el medicamento");
						} 
						
					}
					
					
				}
				break;
			case 5:///cantidad debajo de x

				if (laboratorios.isEmpty()) {
					System.out.println("Lo siento debe crear un laboratorio antes ");
				}else {
				System.out.println("Introduzca la cantidad que se busca");
				cantidad=sc_int.nextInt();
				System.out.println("Buscando medicamentos por debajo de "+cantidad+" en cantidad");
				for (int i = 0; i <laboratorios.size() ; i++) {
					laboratorios.get(i).cantidad_Debajo_de_X(cantidad);
					
				}}

				break;
			case 6: ///medicamentos que vencen en un mex x y año x

				if (laboratorios.isEmpty()) {
					System.out.println("Lo siento debe crear un laboratorio antes ");
				}else {
					System.out.println("Introduzca el año");
					año=sc_int.nextInt();
					System.out.println("Introduzca el mes");
					mes=sc_int.nextInt();
					for (int i = 0; i <laboratorios.size() ; i++) {
						try {
							laboratorios.get(i).medicamentos_vencimiento_mes_año(mes, año);
						} catch (Exception e) {
							System.out.println(e);

						}
						
						
					}
					
				}
				break;
			case 7: //vencimiento_n_mese
				if (laboratorios.isEmpty()) {
					System.out.println("Lo siento debe crear un laboratorio antes ");
				}else {
					System.out.println("Introduzca la cantidad de meses");
					mes=sc_int.nextInt();
					for (int i = 0; i <laboratorios.size() ; i++) {
						try {
							laboratorios.get(i).vencimiento_n_mese(mes);
						} catch (Exception e) {
							System.out.println(e);

						}
						
						
					}
					
				}
				
				
				break;
			case 8:
				if (laboratorios.isEmpty()) {
					System.out.println("Lo siento debe crear un laboratorio antes ");
				}else {
					
					System.out.println("Introduzca en que anaquel quiere revisar los medicamentos");
					System.out.println("Anaquel 1: [A-F]");
					System.out.println("Anaquel 2: [G-P]");
					System.out.println("Anaquel 3: [Q-Z]");
					
					num_anaquel = sc_int.nextInt();
					for (int i = 0; i <laboratorios.size() ; i++) {
						laboratorios.get(i).anaquel_x(num_anaquel);
					
					}
					}
				
				
				
				break;
				
			case 9:
				System.exit(0);
				break;

			default:
				System.out.println("Esta Opcion no esta disponible");
				break;
			}



		} while (opcion!=9);
		
	}	


	public static void laboratorios_func( ) {
		
		
	}
}

