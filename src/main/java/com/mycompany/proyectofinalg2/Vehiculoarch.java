 package com.mycompany.proyectofinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Vehiculoarch { 
    public static void escribirVehiculoarch(Datosvh Vehiculo){
        try{
            
            File f = new File("vehiculos.txt");
            FileWriter fw; 
            BufferedWriter bw;
            if(f.exists() && f.length()!=0){
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(Vehiculo.getNumplaca()+"%"+Vehiculo.getMarcavh()+"%"+Vehiculo.getLineavh()+"%"+Vehiculo.getModelovh()+"%"+Vehiculo.getColorvh()+"%"+Vehiculo.getNitcliente());                
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);                 
                bw.write(Vehiculo.getNumplaca()+"%"+Vehiculo.getMarcavh()+"%"+Vehiculo.getLineavh()+"%"+Vehiculo.getModelovh()+"%"+Vehiculo.getColorvh()+"%"+Vehiculo.getNitcliente());                           
            }
            bw.close();
            fw.close();
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    
    public static void mostrarDatosvh(){
        try{
            File f = new File("vehiculos.txt");
            if (f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine()) != null){
                    String [] arreglo = linea.split("%");
                    vehiculo datos = new vehiculo(arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
                    System.out.println(datos.toString());
                }
            }
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
	}
    }
    public void buscar(String vehiculo){
        try{
            File f = new File ("vehiculos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                boolean blnEncontrado = false;
                while ((linea = br.readLine())!= null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[0].equalsIgnoreCase(vehiculoBuscar) && !"false".equals(arreglo[2])){
                        vehiculo  vehiculos = new vehiculoarreglo[0], arreglo[1], arreglo[2], arreglo[3]);
                        System.out.println(vehiculos.toString());
                        blnEncontrado=true;
                    }
                }
                br.close();
                fr.close();
                if (!blnEncontrado){
                    System.out.println("no existe registro con ese dato " + vehiculosBuscar);
                }
            } else {
                System.out.println("no existe registro");
            }
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
    public void buscarplaca(String placavhBuscar){
        try{
            File f = new File ("vehiculos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                boolean blnEncontrado = false;
                while ((linea = br.readLine())!= null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[2].equalsIgnoreCase(placavhBuscar) && !"false".equals(arreglo[3])){
                        vehiculo vehiculos = new vehiculosarreglo[0], arreglo[1], arreglo[2], arreglo[3]);
                        System.out.println(vehiculo.toString());
                        blnEncontrado=true;
                    }
                }
                br.close();
                fr.close();
                if (!blnEncontrado){
                    System.out.println("no existe registro con ese dato " + placavhBuscar);
                }
            } else {
                System.out.println("no existe registro");
            }
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
    public void eliminar (String eliminarDatos){
    	try {
                File f = new File("vehiculos.txt");
                if (f.exists()){
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader (fr) ;
                    String linea;
                    int numeroLineas=0;
                    while((linea = br.readLine()) !=null){
                        numeroLineas++;
                    }
                    System.out.println("Cantidad de Registros: "+ numeroLineas);
                    String contacto[] = new String[numeroLineas];
                    br.close();
                    fr.close();
                    br = new BufferedReader(new FileReader(f));
                    int i=0;
                    while ((linea=br.readLine())!=null){
                        contacto[i] = linea;
                        i++;
                    }
                    br.close(); 
                    fr.close();
                    FileWriter fw = new FileWriter(f);
                    BufferedWriter bw = new BufferedWriter (fw);
                    boolean eliminado = false;
                    boolean primerlinea = true;
                    
                    for (int j = 0; j < contacto.length; j++){
                        String nuevalinea[] = contacto[j].split ("%");
                        if (nuevalinea[0].equalsIgnoreCase (eliminarDatos) ){
                            eliminado = true;
                            System.out.println("Registro eliminado!");
                        } else {
                            if (primerlinea == true){
                                bw.write (contacto[j]);
                                primerlinea = false;
                            } else{
                                bw.newLine();
                                bw.write (contacto [j]);
                            }
                        }
                    }
                    if (eliminado==false){
                        System.out.println("No se encontro registro.");
                    }
                    bw.close();
                    fw.close();

                    if (numeroLineas == 1 && eliminado == true){
                        f.delete();
                    }
                } else{
                    System.out.println("No hay registros que eliminar.");
                }
            } 
            
            catch (Exception e){
                System.out.println("Error de E/S "+ e);   
            }
        }
}