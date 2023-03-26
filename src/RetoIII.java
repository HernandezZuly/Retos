import java.util.Scanner;

public class RetoIII {
    public static void main(String[] args) {
        String nombre, opcion1, opcion2;
        int edad;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Digite su nombre");
        nombre=lectura.next();
        System.out.println("Digite su edad");
        edad=lectura.nextInt();
        if (edad<=0) {
            System.out.println("Usted digito una edad no adecuada");
        } else if (edad<=17) {
            System.out.println("Usted es menor de edad, no puede jugar");
        } else if (edad>=100) {
            System.out.println("Usted no puede jugar");
        } else {
            System.out.println("Si puede jugar");
            System.out.println("Elija cara o sello");
            opcion1=lectura.next();
            System.out.println("Ahora lance una moneda al aire y digite lo que le salio (cara o sello)");
            opcion2=lectura.next();
            if (opcion1.equals(opcion2)) {
                System.out.println(nombre + " felicitaciones a ganado");
            } else {
                System.out.println(nombre + " has perdido, intentalo de nuevo");
        }
        }
        lectura.close();
    }
} 
