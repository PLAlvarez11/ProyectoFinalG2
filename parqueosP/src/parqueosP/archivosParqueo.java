package parqueosP;
import java.io.IOException;
import java.util.Scanner;
public class archivosParqueo {
	public archivosParqueo() {
	}
	public static void main(String[] args) throws IOException {
		 archivosP archivo = new archivosP();
	        Scanner sc = new Scanner(System.in);
	        int salida =0;
	        int opcion =0;
	        while(salida!=1){
	        try{ 
	        } catch(Exception e){
	            System.out.println("opcion no valida");
	        }
	        
	            menu();
	            opcion=sc.nextInt();
	            switch(opcion){
	                case 1:
	              System.out.println("ingrese numero de Parqueo");
	              String numPar = sc.next();
	              System.out.println("ingrese numero de Placa");
	              String numPlaca = sc.next();
	              System.out.println("ingrese numero de NIT");
	              String numN = sc.next();
	              System.out.println("ingrese la fecha de registro");
	              String Fecha = sc.next();
	              datpsP dat = new datpsP(numPar, numPlaca, numN, Fecha);
	              archivosP.escribirArchivos(dat);
	                break;
	                case 2:
	                	System.out.println("__________DATOS__________");
	                	archivo.mostrarDatosArchivosP();
	                break;
	                case 3:
	                	System.out.println("Salio del Programa"); 
	                salida = 0;
	                break;
	            }
	        }
	}
	private static void menu() {
		System.out.println("*   *   *   *   *   *   *"); 
		System.out.println("  *   *   MENU    *   *  ");
		System.out.println("*   *   *   *   *   *   *");  
        System.out.println("-------------------------"); 
        System.out.println("Ingresar datos---------1 ");   
        System.out.println("Mostrar resultados-----2 ");
        System.out.println("Salir del programa-----6 "); 
        System.out.println("-------------------------");
	}

}
