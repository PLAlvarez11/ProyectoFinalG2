package parqueosP;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class archivosP {
	private static final boolean False = false;
	public static void escribirArchivos(datpsP datos){
		try{
            File f = new File("datos.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists() && f.length()!=0){
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(datos.getNumeroParqueo()+"%"+datos.getNumeroPlaca()+"%"+datos.getNIT()+"%"+datos.getFechaRegistro());                
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(datos.getNumeroParqueo()+"%"+datos.getNumeroPlaca()+"%"+datos.getNIT()+"%"+datos.getFechaRegistro());                               
            }
            bw.close();
            fw.close();
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
	}}
    
	    public void mostrarDatosArchivosP() throws IOException{
	        File f = new File("Parqueo.txt");
	        if (f.exists()){
	            FileReader fr = new FileReader(f);
	            BufferedReader br = new BufferedReader(fr);
	            String linea;
	            while((linea=br.readLine()) != null){
	                String [] arreglo = linea.split("%");
	                datpsP datos = new datpsP(arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
	                System.out.println(datos.toString());
	            }
	        }
	    }	
}
