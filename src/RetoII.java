import java.util.Scanner;

public class RetoII {
    public static void main(String[] args) {
        String nombreBebe, nombreMedico, vacuna, eps;
        int peso, meses, dosisVacuna=0;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Digite el nombre del bebe");
        nombreBebe=lectura.next();

        System.out.println("Digite el nombre de la enfermera a cargo");
        nombreMedico=lectura.next();

        System.out.println("Digite el nombre de la vacuna que se aplicara");
        vacuna=lectura.next();

        System.out.println("Digite la EPS del bebe");
        eps=lectura.next();

        System.out.println("Digite el peso del bebe");
        peso=lectura.nextInt();

        System.out.println("Cuantos meses tiene el bebe");
        meses=lectura.nextInt();

        if (meses>=1 && meses<=12) {
            dosisVacuna = 10*(peso + 15)/(meses*15);
            System.out.println("A el/la bebe " + nombreBebe + " se le debe aplicar " + dosisVacuna + " dosis de " + vacuna); 
            System.out.println("El bebe fue atendido por " + nombreMedico);
        } else {
            System.out.println("Digito mal los meses del bebe RECUERDE que despues de los 12 meses pasa de ser un bebe a un niño");
        }
        lectura.close();
    }
    
}
