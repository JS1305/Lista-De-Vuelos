import entities.Vuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import static utils.filtro.filtro;

public class Main {
    public static void main(String[] args) {

        // ES: Definición del rango de fechas para filtrar los vuelos
        // EN: Define the date range to filter flights
        LocalDate fechaInicio = LocalDate.of(2024,1,1);
        LocalDate fechaFin = LocalDate.of(2026,12,31);
        // LocalDate fechaInicio = null;
        // LocalDate fechaFin = LocalDate.of(2025,3,31);
        // ES: Se pueden usar fechas nulas para incluir todos los vuelos desde o hasta cierta fecha
        // EN: You can use null dates to include all flights from or up to a specific date

        // ES: Creación de la lista de vuelos
        // EN: Creation of the flight list
        ArrayList<Vuelo> vuelos = new ArrayList<>();

        // ES: Agregar vuelos de ejemplo a la lista
        // EN: Add example flights to the list
        vuelos.add(new Vuelo(1, "H001-V", "Iberia", "Madrid", "Buenos Aires", LocalDate.of(2025, 5, 20), LocalDate.of(2025, 5, 20)));
        vuelos.add(new Vuelo(2, "H002-V", "Singapore Airlines", "Bangkok", "Nueva Delhi", LocalDate.of(2025, 7, 17), LocalDate.of(2025, 7, 17)));
        vuelos.add(new Vuelo(3, "H003-V", "Emirates", "Londres", "Frankfurt", LocalDate.of(2025, 3, 14), LocalDate.of(2025, 3, 14)));
        vuelos.add(new Vuelo(4, "H004-V", "Qantas", "Singapur", "Roma", LocalDate.of(2025, 4, 25), LocalDate.of(2025, 4, 25)));
        vuelos.add(new Vuelo(5, "H005-V", "Turkish Airlines", "Atenas", "Estocolmo", LocalDate.of(2025, 8, 3), LocalDate.of(2025, 8, 3)));
        vuelos.add(new Vuelo(6, "H006-V", "Air Canada", "Nueva York", "Barcelona", LocalDate.of(2025, 12, 31), LocalDate.of(2026, 1, 1)));
        vuelos.add(new Vuelo(7, "H007-V", "KLM Royal Dutch Airlines", "Ámsterdam", "São Paulo", LocalDate.of(2025, 10, 22), LocalDate.of(2025, 10, 22)));
        vuelos.add(new Vuelo(8, "H008-V", "Japan Airlines", "Tokio", "Los Ángeles", LocalDate.of(2025, 7, 21), LocalDate.of(2025, 7, 22)));
        vuelos.add(new Vuelo(9, "H009-V", "LATAM Airlines", "Bogota", "Santiago de chile", LocalDate.of(2025, 3, 18), LocalDate.of(2025, 3, 18)));
        vuelos.add(new Vuelo(10, "H0010-V", "Qatar Airways", "París", "Ciudad de México", LocalDate.of(2025, 3, 3), LocalDate.of(2025, 3, 3)));

        // ES: Mostrar los vuelos filtrados y ordenados en consola
        // EN: Display the filtered and sorted flights in the console
        System.out.println("A continuación encontrarás los detalles de los vuelos ordenados por fecha desde "
                + fechaInicio + " hasta " + fechaFin + " \n"
                + " \n" + filtro(vuelos, fechaInicio, fechaFin));
        // ES: La función 'filtro' retorna los vuelos entre las fechas indicadas y los ordena por fecha de salida
        // EN: The 'filtro' function returns flights within the specified dates and sorts them by departure date
    }
}