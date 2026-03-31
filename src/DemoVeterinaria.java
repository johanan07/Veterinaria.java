import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoVeterinaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<PacienteMascota> listaMascotas = new ArrayList<>();

        System.out.println("=== REGISTRO DE MASCOTAS ===");

        // Ingreso manual como tú lo ibas a hacer
        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrese nombre mascota:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese nombre dueño:");
            String dueno = scanner.nextLine();

            System.out.println("Ingrese peso ideal:");
            int peso = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Seleccione especie: 1.CANINO 2.FELINO 3.EXOTICO");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            Especie especie = null;
            LocalDate fecha = null;

            if (opcion == 1) {
                especie = Especie.CANINO;
                fecha = LocalDate.of(2026, 4, 15);
            }
            if (opcion == 2) {
                especie = Especie.FELINO;
                fecha = LocalDate.of(2026, 5, 10);
            }
            if (opcion == 3) {
                especie = Especie.EXOTICO;
                fecha = LocalDate.of(2026, 6, 5);
            }

            PacienteMascota mascota = new PacienteMascota(nombre, fecha, especie, peso, dueno);
            listaMascotas.add(mascota);
        }

        // MENÚ simple como te gusta
        int opcionMenu;

        do {

            System.out.println("2. Dias para vacuna");
            System.out.println("3. Cambiar nombre red");
            System.out.println("0. Salir");

            opcionMenu = scanner.nextInt();

            if (opcionMenu == 1) {
                for (PacienteMascota m : listaMascotas) {
                    m.MostrarPaciente();
                }
            }

            if (opcionMenu == 2) {
                for (PacienteMascota m : listaMascotas) {
                    System.out.println(m.DiasParaVacuna() + " dias restantes");
                }
            }

            if (opcionMenu == 3) {
                PacienteMascota.ActualizarNombresRed("Letirinaria");
                System.out.println("Nombre actualizado");
            }

        } while (opcionMenu != 0);

    }
}