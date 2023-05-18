package paquete04;

//@author JosephMatheo

import java.util.Scanner;
import paquete02.Vendedor;
public class Principal {
    
    public static void main(String[] args) {
        
       // variables para ingreso de datos
        String nombre;
        int edad;
        double sMinino;
        int autos;
        byte bandera;
        String opcion;
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal;
        // Inicio de proceso iterativo 
        bandera = 1;
        cadenaFinal = ""; // inicializo la variable que contendrá la cadena
        // final.
        while (bandera < 4) { // bandera == true
            System.out.println("Ingrese el nombre del vendedor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = entrada.nextInt();

            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino, 
                    autos);
            v.calcularPagoMensual();
            cadenaFinal = String.format("%sDatos de Vendedor\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario mínimo: %.2f\n"
                    + "Número de autos: %d\n"
                    + "Pago mensual: %.2f\n\n",
                    cadenaFinal,
                    v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());

            entrada.nextLine(); // limpieza del buffer
            
            bandera++;

        }
        // cuando se sale del ciclo repetitivo debemos presentar en pantalla
        // el valor de cadena final
        System.out.printf("");
        System.out.printf("%s\n", cadenaFinal);
    }
}
