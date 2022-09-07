package ProgamaGimnasio;
public class saldo {
    private String meses;
    private double saldo;

   public saldo(String meses, double saldo) {
       this.meses = meses;
       this.saldo = saldo;
   }

   public saldo(String meses2) {
}

public String getNumeromeses() {
       return meses;
   }

   public double getSaldo() {
       return saldo;
   }


    
   public void depositarDinero(double cantidad){
       saldo += cantidad;
   }
   
   public void retirarDinero(double cantidad){
       saldo -= cantidad;
   }

   public String getMeses(){
    String mesesC;
    mesesC="carro";
    

    return mesesC;
   }
}
