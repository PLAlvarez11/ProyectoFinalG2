package com.mycompany.proyectofinalg2;
import java.util.Scanner;

public class Menuvh {

   public static void AgregarVehiculo() {
         Scanner entrada = new Scanner(System.in);
         
                    System.out.println("ingrese Número de Placa");
                    //entrada.nextLine();
                    String  Numplaca = entrada.next();
                    
                    System.out.println("ingrese Marca del vehículo ");
                    //entrada.nextLine();
                    String Marcavh = entrada.next();
                    
                     System.out.println("ingrese Linea  del vehículo");
                    //entrada.nextLine();
                    String Lineavh = entrada.next();
                    
                    System.out.println("ingrese Modelo del vehículo");
                    //entrada.nextLine();
                    String Modelovh = entrada.next();
                    
                    System.out.println("Ingrese Color del vehículo ");
                    //entrada.nextLine();
                    String  Colorvh= entrada.next();
                    
                    System.out.println("ingrese NIT propietario");
                    int Nitp= entrada.nextInt();
                   
                    Datosvh vh = new Datosvh ( Numplaca, Marcavh, Lineavh , Modelovh, Colorvh, Nitp);
                    Vehiculoarch.escribirVehiculoarch(vh); 
}
}


