import java.util.Scanner;

public class RetoVII {
    public static void main(String[] args) {
        String nombres, apellidos, direccion, tipIdentificacion;
        int edad, cel, telefono, identificacion, i=0, cargarJuego;
        Scanner lectura = new Scanner (System.in);
        do{
                System.out.println("REGISTRO DE USUARIOS");
                System.out.println("Digite su nombre completo");
                nombres=lectura.next();
                System.out.println("Digite sus apellidos completos");
                apellidos=lectura.next();
                System.out.println("Digite su edad");
                edad=lectura.nextInt();
                System.out.println("Digite su tipo de documento");
                tipIdentificacion=lectura.next();
                System.out.println("Digite su numero de documento");
                identificacion=lectura.nextInt();
                System.out.println("Digite la dirección de su vivienda");
                direccion=lectura.next();
                System.out.println("digite su numero de celular");
                cel=lectura.nextInt();
                System.out.println("Digite su numero de telefono fijo");
                telefono=lectura.nextInt();
            System.out.println("Desea registrar otra respuesta? 1.Si o 2.No");
            cargarJuego=lectura.nextInt();
            i++;
        } while (cargarJuego==1);
        System.out.println("Registro exitosamente " + i + " usuarios");
        lectura.close();
    }
}
