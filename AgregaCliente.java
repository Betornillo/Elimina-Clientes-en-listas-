import java.util.*;
//import java.util.ArrayList;
import java.io.*;
//import java.util.Iterator;
//import java.util.Scanner;

public class AgregaCliente {
    public static void main(String[]args) {
	try {

	    System.out.println("¿Quieres eliminar algun archivo?\n" +
			       "1: Leer lista\n" +
			       "2: Agregar Cliente a la Lista\n" +
			       "3: Ordenar Alfabeticamente\n" +
			       
			       "presiona cualquier otro numero para salir");
	    Scanner decidor = new Scanner(System.in);
	    int teclado = decidor.nextInt();
	    switch(teclado){
	    case 1:
		
	ArrayList<String> listaClientes = new ArrayList<String>();
	
	File baseDeDatos = new File("Clientes.txt");
	if(baseDeDatos.exists()) {
	    System.out.println("El archivo Clientes.txt no puede ser eliminado");
	    System.out.println("Encontré el archivo!");

	}

        
	BufferedReader leerLista = new BufferedReader(new FileReader("Clientes.txt"));
	String buffer;
	while((buffer = leerLista.readLine()) != null) {
	    System.out.println(buffer);
	    listaClientes.add(buffer);
	    System.out.println(listaClientes.size());
	}
	leerLista.close();
	System.out.println(listaClientes);
	break;

	    case 2:
		
	ArrayList<String> list = new ArrayList<String>();
	
	File base = new File("Clientes.txt");
	if(base.exists()) {
	    System.out.println("Derechos reservados");
	    System.out.println("Encontré el archivo!");

	}

        
	BufferedReader leer = new BufferedReader(new FileReader("Clientes.txt"));
	String buff;
	while((buff = leer.readLine()) != null) {
	    System.out.println(buff);
	    list.add(buff);
	    System.out.println(list.size());
	}
	leer.close();
	System.out.println(list);
	Scanner nuevoCliente = new Scanner(System.in);
	System.out.println("Ingresa tu nombre");
	String name = nuevoCliente.next();
	Scanner nuevoApp = new Scanner(System.in);
	System.out.println("Ingresa tu 1er apellido");
	String app = nuevoApp.next();
	Scanner nuevoApm = new Scanner(System.in);
	System.out.println("Ingresa tu 2do apellido");
	String apm = nuevoApm.next();
	String client = name + " " + app + " " + apm;
	
	//	String client = nuevoCliente.next();
	list.add(client);
	System.out.println(list);
	
	FileWriter agregar = new FileWriter("Clientes.txt");
	int espacio = list.size();
	for(int i = 0; i < espacio; i++){
	    String escritor = list.get(i).toString();
	    agregar.write(escritor);
	    if(i < espacio - 1)
		agregar.write("\n");
	}
	agregar.close();
	System.out.println(list);
	    
	
	break;

	    case 3:
	ArrayList<String> ordenable = new ArrayList<String>();
	
	File aOrdenar = new File("Clientes.txt");
	if(aOrdenar.exists()) {
	    System.out.println("Derechos reservados");
	    System.out.println("Encontré el archivo!");

	}

        
	BufferedReader lector = new BufferedReader(new FileReader("Clientes.txt"));
	String buf;
	while((buf = lector.readLine()) != null) {
	    System.out.println(buf);
	    ordenable.add(buf);
	    System.out.println(ordenable.size());
	}
	lector.close();
	System.out.println(ordenable);
	Collections.sort(ordenable);
	
	FileWriter order = new FileWriter("Clientes.txt");
	int space = ordenable.size();
	for(int i = 0; i < space; i++){
	    String writter = ordenable.get(i).toString();
	    order.write(writter);
	    if(i < space - 1)
		order.write("\n");
	}
	order.close();
	System.out.println(ordenable);
	
	
	    
	
	break;

		

	    default:
		System.out.println("Esa opcion no existe");
		
	    }		
   	}catch(IOException ex) {
	    System.out.println("exception ocurred\n " + ex);
	    System.out.println("The file does not exist or you are trying to read a file that has been deleted");
	}
    }
}

