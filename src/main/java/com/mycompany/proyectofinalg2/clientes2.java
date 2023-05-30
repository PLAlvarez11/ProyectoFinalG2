package main.java.com.mycompany.proyectofinalg2;

import java.util.Scanner;

public class clientes2{
    int fech1;
    int fech2;
    int fech3;
    int numtel;
    String direccion;
    String name1;
    String name2;
    String ape1;
    String ape2;
    int cui;
    int nit;
    int estado;
    String trabajo = "";
    Scanner entrada = new Scanner(System.in);
    System.out.println("Porfavor ingrese el primer nombre del cliente");
    name1 = entrada.next();
    System.out.println("Porfavor ingrese el segundo nombre del cliente");
    name2 = entrada.next();
    name = name1+" "+name2;
    System.out.println("Porfavor ingrese el primer apellido del cliente");
    ape1 = entrada.next();
    System.out.println("Porfavor ingrese el segundo apellido del cliente");
    ape2 = entrada.next();
    ape = ape1+" "+ape2;
    System.out.println("porfavor ingrese el CUI del cliente")
    cui = entrada.nextint();
    while(cui.length!=13){
        System.out.println("la cantidad de numeros ingresados es invalida, porfavor intentelo nuevamente")
        cui = entrada.nextint();
    }
    if(cui.length==13){
        public void buscarcui(String Buscarcui){
            try{
                File f = new File ("departamento.txt");
                if(f.exists()){
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    String linea;
                    boolean blnEncontrado=False;
                    while ((linea=br.readLine())!=null){
                        String [] arreglo = linea.split("%");
                        if (arreglo[0].equalsIgnoreCase(nombreBuscar)){
                            blnEncontrado=true;
                        }
                    }
                    br.close();
                    fr.close();
                    if (!blnEncontrado){
                        System.out.println("El CUI ingresado no es un numero CUI valido");
                    }
                } else {
                    System.out.println("no existe registro");
                    }
                }catch(Exception e){
                System.out.println("Error de E/S" + e);
            }
        }
    }
    System.out.println("Porfavor ingrese el dia en que nació el cliente en 2 digitos");
    fech1 = entrada.nextint();
    while(fech1.length!=2){
        System.out.println("el dia debe ingresarse en numeros de 2 digitos");
        System.out.println("Porfavor intentelo nuevamente");
        fech1= entrada.nextint();
    }
    System.out.println("Porfavor ingrese el mes en nació el cliente en 2 digitos");
    fech2 = entrada.nextint();
    while(fech2.length!=2){
        System.out.println("el mes debe ingresarse en numeros de 2 digitos");
        System.out.println("Porfavor intentelo nuevamente");
        fech2= entrada.nextint();
    }
    System.out.println("Porfavor ingrese el año en que nació el cliente  en 4 digitos");
    fech3 = entrada.nextint();
    while(fech3.length!=4){
        System.out.println("el año debe ingresarse en numeros de 4 digitos");
        System.out.println("Porfavor intentelo nuevamente");
        fech3= entrada.nextint();
    }
    fech = fech1+"/"+fech2+"/"+fech3;
    System.out.println("Porfavor ingrese la dirección del domicilio del cliente");
    direccion = entrada.next();
    System.out.println("porfavor ingrese el trabajo al que se dedica el cliente");
    trabajo = entrada.next();
    System.out.println("Porfavor ingrese el numero de telefono del cliente");
    numtel = entrada.nextint();
    while(numtel!=8){
        System.out.println("el numero debe ingresarse en numeros de 8 digitos");
        System.out.println("Porfavor intentelo nuevamente");
        numtel= entrada.nextint();
    }
    System.out.println("Porfavor ingrese el NIT del cliente");
    nit = entrada.nextint();
    while(nit!=9){
        System.out.println("el numero debe ingresarse en numeros de 9 digitos");
        System.out.println("Porfavor intentelo nuevamente");
        nit= entrada.nextint();
    }
}