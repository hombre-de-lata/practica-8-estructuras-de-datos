
import java.util.*;

public class Estudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Nombre = new String[5];
        double[] Edad = new double[5];
        String nombreEstudiante;
        double edadEstudiante;
        int i = 0;
 System.out.print("Digite el nombre del " +
         "Estudiante: " + (i + 1 ) + ": ");
        Nombre[i] = sc.nextLine();
        System.out.print("Digite la edad del alumno: ");
        Edad[i] = sc.nextDouble();
        edadEstudiante = Edad[i];
        nombreEstudiante = Nombre[i];
        for (i = 1; i < Nombre.length; i++) {
            sc.nextLine();
            System.out.print("Digite el nombre del estudiante " + (i + 1) + ": ");
            Nombre[i] = sc.nextLine();
            System.out.print("Digite la edad del Estudiante: ");
            Edad[i] = sc.nextDouble();
            System.out.println("Digite * para parar el codigo");

            /// compara
            if (Edad[i] > edadEstudiante ) {
                edadEstudiante = Edad[i];
                nombreEstudiante = Nombre[i];
            }
        }
        System.out.println("Estudiante con mayor edad: " + nombreEstudiante );

        System.out.println("Edad: " + edadEstudiante);

    }


}
