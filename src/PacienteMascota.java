import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PacienteMascota {

    private LocalDate FechaProximaVacuna;
    private String NombreMascota;
    private int pesoIdeal;
    private Especie Especie;
    private static String NombreRedVeterinaria = "VetPlus";
    private String NombreDueno;

    public PacienteMascota(String nombreMascota, LocalDate fechaProximaVacuna, Especie especie, int pesoIdeal, String nombreDueno) {
        this.NombreMascota = nombreMascota;
        this.Especie = especie;
        this.NombreDueno = nombreDueno;
        this.pesoIdeal = pesoIdeal;
        this.FechaProximaVacuna = fechaProximaVacuna;
    }


    public void FechasDeVacunacionProgramadas() {

        if (Especie == Especie.CANINO) {
            System.out.println("Fecha campaña: 15-04-2026");
        }

        if (Especie == Especie.FELINO) {
            System.out.println("Fecha campaña: 10-05-2026");
        }

        if (Especie == Especie.EXOTICO) {
            System.out.println("Fecha campaña: 05-06-2026");
        }
    }


    public int DiasParaVacuna() {
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), this.FechaProximaVacuna);
        return (int) dias;
    }


    public void MostrarPaciente() {
        System.out.println("Mascota: " + NombreMascota);
        System.out.println("Dueño: " + NombreDueno);
        System.out.println("Especie: " + Especie);
        System.out.println("Peso ideal: " + pesoIdeal);
        System.out.println("Fecha proxima vacuna: " + FechaProximaVacuna);
        System.out.println("Red: " + NombreRedVeterinaria);

    }


    public static void ActualizarNombresRed(String nuevoNombre) {
        NombreRedVeterinaria = nuevoNombre;
    }
}
