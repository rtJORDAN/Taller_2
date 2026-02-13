// Importamos el scanner para poder utilizarlo
import java.util.Scanner;

public class HolaMundo {

public static void main(String[] args) {
    
// Creamos la variable para poder almacenar el scanner
String nombre = "";

// Aqui creamos el scanner
Scanner sc = new Scanner(System.in);


// Aqui imprimimos un mensaje de bienvenida que pide digitar el nombre
System.out.println("Bienvenido, porfavor digite su nombre");

// Llamamos la variable para que se pueda almacenar el nombre que digite el usuario
nombre = sc.nextLine();

// Imprimimos un pequeño mensaje con el nombre del usuario
System.out.println("Un placer " + nombre + " a continuacion le mostraremos informacion sobre el equipo: ");


// Imprimimos mensajes con los integrantes
System.out.println("");
System.out.println("Los integrantes son:");
System.out.println("Felipe Londoño Ospina");
System.out.println("Jordan Restrepo");
System.out.println("Juan Andres Vallejo");
System.out.println("");
// Imprimimos mensajes con mas datos del equipo
System.out.println("Felipe Londoño Ospina esta encargado de los puntos:");
System.out.println("1, 5, 6, 7, 8, 9");
System.out.println("");
System.out.println("Juan Andres Vallejo esta encargado de los puntos");
System.out.println("4, 5, 6, 7, 8, 9");
System.out.println("");
System.out.println("Jordan Restrepo Tobon esta encargado de los puntos");
System.out.println("2, 3, 5, 6, 7, 8, 9");


}
}
