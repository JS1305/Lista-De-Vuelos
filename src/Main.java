import entities.Vuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import static utils.filtro.filtro;


public class Main {
    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.of(2024,1,1);
        LocalDate fechaFin = LocalDate.of(2026,12,31);
        //LocalDate fechaInicio = null;
        //LocalDate fechaFin = LocalDate.of(2025,3,31);

        ArrayList<Vuelo> vuelos = new ArrayList<>();

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

        System.out.println(filtro(vuelos,fechaInicio,fechaFin));
    }
}
