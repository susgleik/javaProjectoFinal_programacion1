
package ProgamaGimnasio;
import java.util.Scanner;

public class PrincipalGimnasio{

public static void main(String[] args){
		
    
    int opcion = 0;
    int opcion1 =0;
    int opcion2 =0;
    String siNo; 
    try (Scanner sc = new Scanner(System.in)) {
        RegistroGimnasio rg = new RegistroGimnasio();{
        
        do{                           
        
            do{ 		
            opcion = rg.menu();
            switch(opcion){

            case 1:

            do{
            opcion1=rg.menu2();
            switch(opcion1){
            
                case 1:
                do{   
                    opcion2= rg.menu3();
                    switch(opcion2){

                        case 1:
                        rg.agregarInstructor();
                        break; 

                        case 2:
                        rg.ModificarInstructor();
                        break;

                        case 3:
                        rg.eliminarInstructor();
                        break;
                        
                        case 4:
                        System.out.println("¿Desea Volver al menú anterior? S/N");
                        siNo = sc.next(); 
                        break;                   
                    }                 
                }while (opcion2 < 3);
                break; 
            

                case 2:
                do{   
                    opcion2= rg.menu3();
                    switch(opcion2){

                        case 1:
                        rg.mostrarTabla();   
                       
                        break; 

                        case 2:
                        rg.ModificarPlanes();
                        break;

                        case 3:
                        break;

                        case 4:
                        System.out.println("¿Desea Volver al menú anterior? S/N");
                        siNo = sc.next(); 
                        break;        
                    }             
                }while (opcion2 < 3);
                break;             
                
                case 3: 
                do{   
                    opcion2= rg.menu3();
                    switch(opcion2){
                        case 1:
                        rg.registroCliente();
                        break; 

                        case 2:
                        rg.ModificarCliente();
                        break;

                        case 3:
                        rg.eliminarCliente();
                        break;
                        

                        case 4:
                        System.out.println("¿Desea Volver al menú anterior? S/N");
                        siNo = sc.next(); 
                        break;     
                    } 
                }while (opcion2 < 4);
                break;
                
                case 4:
                System.out.println("¿Desea volver al menú anterior? S/N");
                siNo = sc.next();
                break;
            }
            
        }while(opcion1 < 3);
        break; 

            case 2:
            rg.ingresarDatos1();		
            break;

            case 3:
            
            break; 
            
            case 4:
            System.exit(0);            
            }       
        }while(opcion < 3);
        break; 

    }while ("S".equals(siNo));   
}
}
}
}