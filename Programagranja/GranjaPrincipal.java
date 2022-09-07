package Programagranja;

import java.text.DecimalFormat;

public class GranjaPrincipal{

public static void main(String[] args){
		
    
    int opcion = 0;
    final DecimalFormat df = new DecimalFormat("0.00");
    
    ProduccionGranja pg = new ProduccionGranja();{
    
    while (opcion < 7)
    { 		
        opcion = pg.menu();
        switch(opcion){

        case 1:
        pg.mostrarTabla();
        break;
        
        case 2:
        pg.ingresarDatos();		
        break;

        case 3:
        pg.mostrarTotal();
        break;

        case 4:
        pg.calcularRendimiento();          
        break;
        
        case 5:
        pg.MostrarProductividad();			
        break;

        case 6:
        pg.CalcularVentasM();
        break; 
        
        case 7:
        System.exit(0);            
        }
    }

}
}

private static final DecimalFormat df = new DecimalFormat("0.00");


}




