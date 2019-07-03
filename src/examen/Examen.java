
package examen;

import java.util.*;

public class Examen {

    public static void main(String[] args) {

                
        Scanner leer = new Scanner(System.in);

      ArrayList<String>Nombre = new ArrayList<String>();
      ArrayList<Double>Velocidad = new ArrayList<Double>();
      ArrayList<Double>Tiempo = new ArrayList<Double>();
      
      boolean Continue=true;
      int Decision=1;
      String Nombres;
      double velocidad=0, tiempo=0;
      
      tiempo=100/velocidad;
      
      while(Continue){
          System.out.println("Ingrese el nombre del estudiante ");
          Nombre.add(leer.next());
          
          System.out.println("");
          System.out.println("Ingrese la velocidad");
          Velocidad.add(leer.nextDouble());
          
          System.out.println("");
          System.out.println("Ingrese el tiempo tardado");
          Tiempo.add(leer.nextDouble());
          
          System.out.println("");
          System.out.println("Desea seguir continuando? [1--> Continuar] - [0--> Salir] ");
          Decision=leer.nextInt();
          
          if(Decision==1){
              Continue=false;
          }
          for(int x=0;x<Nombre.size();x++){
              System.out.println("Listado " + "Nombres: " + Nombre.get(x) + " Velocidad " + " Tiempo" + tiempo );
          }
      }
        
    }
    
}
