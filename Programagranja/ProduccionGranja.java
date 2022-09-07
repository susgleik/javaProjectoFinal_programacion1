package Programagranja;

import java.util.Arrays;
import java.util.Scanner;


public class ProduccionGranja {

	private String[] array_meses= new String[6];
	private String [] array_productos = new String [5];
	private double[] array_precio = new double [5];
	private int [][] array_registro = new int [5][6];
	private int[] totalproducto;	
	
    //Setters & Getters

	public String[] getArray_meses() {
		return array_meses;
	}

	public void setArray_meses(String[] array_meses) {
		this.array_meses = array_meses;
	}

	public String[] getArray_productos() {
		return array_productos;
	}

	public void setArray_productos(String[] array_productos) {
		this.array_productos = array_productos;
	}

	public double[] getArray_precio() {
		return array_precio;
	}

	public void setArray_precio(double[] array_precio) {
		this.array_precio = array_precio;
	}

	public int[][] getArray_registro() {
		return array_registro;
	}

	public void setArray_registro(int[][] array_registro) {
		this.array_registro = array_registro;
	}
	
	
	// Otros Metodos

	//TOTAL POR PRODUCTO
	public int [] totalproducto(){
	   int  suma=0;
	   int i,j;
	   int [] array_aux = new int [5];
		   
		for(i=0;i<array_productos.length;i++)
	    {
			for(j=0;j<array_meses.length;j++) {
				
			   suma = suma + array_registro[i][j];	     
		   }
			
		    array_aux[i]= suma;
		    suma = 0;
			
	    }		  
		  
		  return array_aux;
		}
	
		public void mostrarTotal(){

			totalproducto = totalproducto();

			int i;
			
			String [] array_productos = new String [5];
			array_productos[0]= "Tomate:\t";
			array_productos[1]= "Lechuga:";
			array_productos[2]= "Repollo:";
			array_productos[3]= "Zanahoria:";
			array_productos[4]= "Papa:\t"; 
			
			double [] resultado = new double [5];
			resultado[0]= 5.00*totalproducto[0];
			resultado[1]= 3.00*totalproducto[1];
			resultado[2]= 2.00*totalproducto[2];;
			resultado [3]= 4.00*totalproducto[3];;
			resultado[4]= 2.50*totalproducto[4];;
			
			System.out.println("El total de Producido en kilogramos y en vendido dolares por Producto es de:");
			System.out.println("\n");

			for (i=0; i<5; i=i+1){
			System.out.println(array_productos[i]+ "\t"+totalproducto[i]+"kg\t"+resultado[i]+"$");
			}
		}
	
	//RENDIMIENTO
	public void calcularRendimiento(){
		
		totalproducto= totalproducto();
		int mayor, menor;
		int i;

		mayor=menor=totalproducto[0]; 
	
		for(i=0; i<totalproducto.length; i++){
			if(totalproducto[i]> mayor){
				mayor= totalproducto[i];
			}
			if(totalproducto[i]< menor){
				menor= totalproducto[i];
			}
		}
        
		System.out.println("El Mayor Rendimiento en kilogramos fue de: \t"+mayor+"kg");
		System.out.println("El Menor Rendimiento en kilogramos fue de: \t"+menor+"kg");
	}

	//PRODUCTCTIVIDAD
	public void MostrarProductividad(){

		totalproducto=totalproducto();
		double mayorD, menorD;
		int i; 
		
		double [] resultado = new double [5];
		resultado[0]= 5.00*totalproducto[0];
		resultado[1]= 3.00*totalproducto[1];
		resultado[2]= 2.00*totalproducto[2];;
		resultado [3]= 4.00*totalproducto[3];;
		resultado[4]= 2.50*totalproducto[4];

		mayorD=menorD=resultado[0];
		for(i=0; i<resultado.length; i++){
			if(resultado[i]> mayorD){
				mayorD= resultado[i];
			}
			if(resultado[i]< menorD){
				menorD= resultado[i];
			}
		}

		System.out.println("La Mayor venta en dolares fue de: \t"+mayorD+"$");
		System.out.println("La Menor venta en dolares fue de: \t"+menorD+"$");


	}

	//MESES

	public void CalcularVentasM(){
        totalproducto=totalproducto();
		int i;
		double mayorM,menorM;

		String [] array_meses = new String [6];
		array_meses[0]= "enero";
		array_meses[1]= "febrero";
		array_meses[2]= "marzo";
		array_meses[3]= "abril";
		array_meses[4]= "mayo";
		array_meses[5]= "junio";

		double [] Ventames= new double [6];
		Ventames[0]= array_registro[0][0]*5.00 + array_registro[1][0]*3.00 + array_registro[2][0]*2.00 + array_registro[3][0]*4.00 + array_registro[4][0]*2.50;
		Ventames[1]= array_registro[0][1]*5.00 + array_registro[1][1]*3.00 + array_registro[2][1]*2.00 + array_registro[3][1]*4.00 + array_registro[4][1]*2.50;
		Ventames[2]= array_registro[0][2]*5.00 + array_registro[1][2]*3.00 + array_registro[2][2]*2.00 + array_registro[3][2]*4.00 + array_registro[4][2]*2.50;
		Ventames[3]= array_registro[0][3]*5.00 + array_registro[1][3]*3.00 + array_registro[2][3]*2.00 + array_registro[3][3]*4.00 + array_registro[4][3]*2.50;
		Ventames[4]= array_registro[0][4]*5.00 + array_registro[1][4]*3.00 + array_registro[2][4]*2.00 + array_registro[3][4]*4.00 + array_registro[4][4]*2.50;
		Ventames[5]= array_registro[0][5]*5.00 + array_registro[1][5]*3.00 + array_registro[2][5]*2.00 + array_registro[3][5]*4.00 + array_registro[4][5]*2.50;
		
		System.out.println("El total vendido durante cada mes es de :");
		System.out.println("\n");
		for (i=0; i<6; i=i+1){
		System.out.printf(array_meses[i]+"\t"+Ventames[i]+"$");
		System.out.println("\n");
		}

		mayorM=menorM=Ventames[0]; 
		
		for(i=0; i<Ventames.length; i++){
			if(Ventames[i]> mayorM){
				mayorM= Ventames[i];
			}
			if(Ventames[i]< menorM){
				menorM= Ventames[i];
			}
		}      
		System.out.println("La meyor venta mensual fue de: \t"+mayorM+"$");
		System.out.println("La Menor venta mensual fue de: \t"+menorM+"$");

	}

	public int menu()
	   {
	   	 int opcion; 
	   	 Scanner sc = new Scanner (System.in);
	   	 System.out.println();
	   	 System.out.println("1. Tabla de precios");
		 System.out.println("2. registro de datos");
	   	 System.out.println("3. Totales en Kilogramos y Dolares");
	   	 System.out.println("4. Rendimiento por preducto");
		 System.out.println("5. Producto mejor y peor vendido ");
	   	 System.out.println("6. mejor y peor mes de ventas");
	   	 System.out.println("7.  Salir");
	   	 System.out.println("\n\nSeleccione una opcion:");
	   	 opcion = sc.nextInt();
		 System.out.println("\n");
	   	 return opcion;
	   }
	   
	   public void mostrarTabla(){

		int k;

		String [] array_productos = new String [5];
		array_productos[0]= "Tomate:\t";
		array_productos[1]= "Lechuga:";
		array_productos[2]= "Repollo:";
		array_productos[3]= "Zanahoria:";
		array_productos[4]= "Papa:\t";

		double [] array_precio = new double [5];
	    array_precio[0]= 5.00;
		array_precio[1]= 3.00;
		array_precio[2]= 2.00;
		array_precio [3]= 4.00;
		array_precio[4]= 2.50;
			
	   System.out.println("\n-------------------------------------------------------- \n");
	   System.out.println("\n                  Tabla de precios                       \n");
       System.out.println("\n-------------------------------------------------------- \n");

	   Scanner sc= new Scanner(System.in);

		for (k=0; k<5; k=k+1){
		System.out.printf("\n"+array_productos[k]+ "\t"+array_precio[k]+"$");
		}
		System.out.println();
		System.out.println("\n");		
	}
	           
	
	   public void ingresarDatos(){
	   	
	   	int i, j;
		
	   	String [] array_productos = new String [5];
		array_productos[0]= "Tomate";
		array_productos[1]= "Lechuga";
		array_productos[2]= "Repollo";
		array_productos[3]= "Zanahoria";
		array_productos[4]= "Papa";


	   	String [] array_meses = new String [6];
		array_meses[0]= "enero";
		array_meses[1]= "febrero";
		array_meses[2]= "marzo";
		array_meses[3]= "abril";
		array_meses[4]= "mayo";
		array_meses[5]= "junio";

	    int  [][] array_registro = new int[5][6];
	   	
	       Scanner sc = new Scanner (System.in);

	   for (i=0; i<5; i=i+1){     
		  for (j=0; j<6; j=j+1){
	    	   
	       	   System.out.println("Ingrese la cantidad de kilos producidos de " + array_productos[i] + " en el mes de " + array_meses[j]);   
	       	   array_registro[i][j]= sc.nextInt();
			   System.out.println("\n");
	           
	                  
	        }
	   }
	       setArray_productos(array_productos);
	       setArray_meses(array_meses);
	       setArray_registro(array_registro);
	       
	       //VERIFICAR SI SE CARGAN LOS ARREGLOS
	       System.out.println(Arrays.toString(array_meses));
	       System.out.println(Arrays.toString(array_productos));
	       System.out.println(Arrays.deepToString(array_registro));
	       
	      
	}


	
}	    
