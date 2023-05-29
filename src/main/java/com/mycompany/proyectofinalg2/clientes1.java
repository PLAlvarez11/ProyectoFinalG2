package main.java.com.mycompany.proyectofinalg2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class clientes1{
    private static final boolean False = false;
    public void Clientes1(Clientes clientes){
        try{
            File f = new File("clientes.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists() && f.length()!=0){
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(clientes.GetName()+"%"+clientes.GetApe+"%"+clientes.GetCui+"%"+clientes.GetNumtel);                
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(clientes.GetName()+"%"+clientes.GetApe+"%"+clientes.GetCui+"%"+clientes.GetNumtel);                               
            }
            bw.close();
            fw.close();
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
    public void mostrar(){
        File f = new File("clientes.txt");
        if (f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                String[] arreglo = linea.split("%");
                clientes clientes = new clientes(arreglo[0], arreglo[1], arreglo[2], arreglo[3], arreglo[4], arreglo[5], arreglo[6], arreglo[7], arreglo[8], arreglo[9]);
                System.out.println(clientes.toString());
            }
        }
    }
    public void buscar(String nombreBuscar){
        try{
            File f = new File ("clientes.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                boolean blnEncontrado=False;
                while ((linea=br.readLine())!=null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[0].equalsIgnoreCase(nombreBuscar)){
                        clientes clientes = new clientes(arreglo[0], arreglo[1], arreglo[2], arreglo[3], arreglo[4], arreglo[5], arreglo[6], arreglo[7], arreglo[8], arreglo[9]);
                        System.out.println(clientes.toString());
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
            }catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
}