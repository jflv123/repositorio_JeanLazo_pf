package programas;

import java.util.Scanner;

public class compras {
    public static void main(String[] args) {
        //declarando variables
        String cliente;
        double compra1, compra2, compra3, tc, promedio;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingrese el nombre del cliente: ");
        cliente = lectura.next();
        System.out.print("Ingresar primera compra: ");
        compra1 = lectura.nextDouble();
        System.out.print("Ingresar segunda compra: ");
        compra2 = lectura.nextDouble();
        System.out.print("Ingresar tercera compra: ");
        compra3 = lectura.nextDouble();
        //proceso de datos
        tc = compra1 + compra2 + compra3;
        promedio = tc/3;
        //salida de datos
        System.out.println("El total de compras es: " + tc);
        System.out.println("El promedio de compras es: " + promedio);
    }
}