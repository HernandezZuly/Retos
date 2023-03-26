import java.util.Scanner;

public class RetoIV {
    public static void main(String[] args) {
        String nombre, opcion;
        int edad, opcionMaquina;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Digite su nombre");
        nombre=lectura.nextLine();
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
            System.out.println("Escoja piedra, papel o tijera");
            opcion=lectura.next();
            System.out.println(" 1. primera opción \n 2. segunda opción \n 3. tercera opción");
            System.out.println("Digite el numero de la opción que quiera");
            opcionMaquina=lectura.nextInt();
            switch (opcionMaquina) {
            case 1:
                if (opcion.equals("tijera")) {
                    System.out.println("La maquina escogió piedra, has perdido");
                } else if (opcion.equals("papel")){
                    System.out.println("Has ganado, la maquina escogió piedra");
                } else {
                    System.out.println("La maquina escogió piedra, has quedado en empate con la maquina");
                }
            break;
            case 2:
                if (opcion.equals("tijera")) {
                    System.out.println("Has ganado, la maquina escogió papel");
                } else if (opcion.equals("piedra")){
                    System.out.println("La maquina escogió papel, has perdido");
                } else {
                    System.out.println("La maquina escogió papel, has quedado en empate con la maquina");
                }
            break;
            case 3:
                if (opcion.equals("papel")) {
                    System.out.println("La maquina escogió tijera, has perdido");
                } else if (opcion.equals("piedra")){
                    System.out.println("Has ganado, la maquina escogió tijera");
                } else {
                    System.out.println("La maquina escogió tijera, has quedado en empate con la maquina");
                }
            break;
            default:
            System.out.println("Esa opción no esta disponible");
            break;
            }
        }
        lectura.close();
    }
}
