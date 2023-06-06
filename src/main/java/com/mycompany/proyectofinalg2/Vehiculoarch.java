package com.mycompany.proyectofinalg2;
import java.io.*;

public class Vehiculoarch { 
    public static void escribirVehiculoarch(Datosvh Vehiculo){
        try{
            
            File f = new File("vehiculo.txt");
            FileWriter fw; 
            BufferedWriter bw;
            if(f.exists() && f.length()!=0){
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(Vehiculo.getNumplaca()+"%"+Vehiculo.getMarcavh()+"%"+Vehiculo.getLineavh()+"%"+Vehiculo.getModelovh()+"%"+Vehiculo.getColorvh()+"%"+Vehiculo.getNitcliente());                
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter( fw);                 
                bw.write(Vehiculo.getNumplaca()+"%"+Vehiculo.getMarcavh()+"%"+Vehiculo.getLineavh()+"%"+Vehiculo.getModelovh()+"%"+Vehiculo.getColorvh()+"%"+Vehiculo.getNitcliente());                           
            }
            bw.close();
            fw.close();
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
    
    public void mostrarDatosVehiculoarch(){
        try{ 
            File f = new File("vehiculo.txt");
            if (f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                
                while ((linea = br.readLine())!= null){
                    String [] arreglo = linea.split("%");
                    if(!"false".equals(arreglo[6])){
                        Datosvh vh = new Datosvh (arreglo[0], arreglo[1], arreglo[2], arreglo[3], arreglo[4], arreglo[5], Boolean.parseBoolean(arreglo[6]));
                        System.out.println(vh.toString());
                    }
                }
            }
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
    
    
    
    public void buscar(String nombreBuscar){
        try{
            File f = new File ("Vehiculo.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                boolean blnEncontrado = false;
                while ((linea = br.readLine())!= null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[0].equalsIgnoreCase(nombreBuscar) && !"false".equals(arreglo[6])){
                        Vehiculo Vehiculo= new Vehiculo(arreglo[0], arreglo[1], arreglo[2], arreglo[3], arreglo[4], arreglo[5], Boolean.parseBoolean(arreglo[6]));
                        System.out.println(Vehiculo.toString());
                        blnEncontrado=true;
                }
                }
                br.close();
                fr.close();
                if (!blnEncontrado){
                    System.out.println("no existe registro con ese dato" + nombreBuscar);
                }
            } else {
                System.out.println("no existe registro");
            }
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }

