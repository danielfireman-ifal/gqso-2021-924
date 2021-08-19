public abstract class Soma {
    private double Numb1;
    private double Numb2;

     public void Soma ( double Numb1, double Numb2){
         double resultado;
         resultado = Numb1 + Numb2;
         
         return resultado;
     }
     
     public double getNumb1(){
         return Numb1;
     }
     public void setNumb1(double Numb1){
         this.Numb1 = Numb1;
     }
      public double getNumb2(){
         return Numb2;
     }
     public void setNumb2(double Numb2){
         this.Numb2 = Numb2;
     }
     
}