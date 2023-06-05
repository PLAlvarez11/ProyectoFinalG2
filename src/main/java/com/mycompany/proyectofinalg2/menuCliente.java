package com.mycompany.proyectofinalg2;

import java.util.Scanner;

public class menuCliente {
     public static void agregarCliente (){
    String fech1;
    String fech2;
    String fech3;
    int numtel;
    String direccion;
    String name1;
    String name2;
    String ape1;
    String ape2;
    String fech;
    int cui;
    int nit;
    int estado;
    String trabajo = "";
    Boolean IsApto = false;
            
    Scanner entrada = new Scanner(System.in);
    System.out.println("Porfavor ingrese el primer nombre del cliente");
    name1 = entrada.next();
    System.out.println("Porfavor ingrese el segundo nombre del cliente");
    name2 = entrada.next();
    String name = name1+" "+name2;
    System.out.println("Porfavor ingrese el primer apellido del cliente");
    ape1 = entrada.next();
    System.out.println("Porfavor ingrese el segundo apellido del cliente");
    ape2 = entrada.next();
    String ape = ape1+" "+ape2;
    
    while(IsApto == false){
        System.out.println("porfavor ingrese el CUI del cliente");
        cui = entrada.nextInt();
        String sCui = String.valueOf(cui);
        IsApto = Validaciones.buscarcui(sCui);
    }
    
    IsApto = false;
    
    System.out.println("Porfavor ingrese el dia en que nació el cliente en 2 digitos");
    fech1 = entrada.next();
    while(fech1.length() !=2){
        System.out.println("el dia debe ingresarse en numeros de 2 digitos");
        System.out.println("Porfavor intentelo nuevamente");
        fech1= entrada.next();
    }
    
    System.out.println("Porfavor ingrese el mes en nació el cliente en 2 digitos");
    fech2 = entrada.next();
    
    while(fech2.length() !=2){
        System.out.println("el mes debe ingresarse en numeros de 2 digitos");
        System.out.println("Porfavor intentelo nuevamente");
        fech2= entrada.next();
    }
    System.out.println("Porfavor ingrese el año en que nació el cliente  en 4 digitos");
    fech3 = entrada.next();
    
    while(fech3.length() !=4){
        System.out.println("el año debe ingresarse en numeros de 4 digitos");
        System.out.println("Porfavor intentelo nuevamente");
        fech3= entrada.next();
    }
    fech = fech1+"/"+fech2+"/"+fech3;
    
    System.out.println("Porfavor ingrese la dirección del domicilio del cliente");
    direccion = entrada.next();
    System.out.println("porfavor ingrese el trabajo al que se dedica el cliente");
    trabajo = entrada.next();
    
    while(IsApto == false){
        System.out.println("Porfavor ingrese el numero de telefono del cliente");
        String sNumtel = entrada.next();
        if(sNumtel.length() == 8){
            IsApto = true;
            numtel = Integer.parseInt(sNumtel);
        }
    }
    
    while(IsApto == false){
        System.out.println("Porfavor ingrese el NIT del cliente");
        String sNit = entrada.next();
        if(sNit.length() == 9){
            IsApto = true;
            nit = Integer.parseInt(sNit);
        }
    }
    
        clientes cli = new clientes(cui, nit, direccion, trabajo, fech, name, ape, numtel, 1);
        clienteArchivo.escribir(cli);
    }
}
