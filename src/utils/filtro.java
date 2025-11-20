package utils;
import entities.Vuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class filtro {
    public static String filtro(ArrayList<Vuelo> vuelos, LocalDate fechaInicio, LocalDate fechafin) {

        List<Vuelo> filtroVuelos = vuelos.stream()
                .filter(vuelo -> {

                    LocalDate salida = vuelo.getFechaSalida();
                    LocalDate llegada = vuelo.getFechaLlegada();

                    if (fechaInicio == null && fechafin == null) {
                        return true;
                    }

                    if (fechaInicio == null) {
                        return !llegada.isAfter(fechafin);
                    }

                    if (fechafin == null) {
                        return !salida.isBefore(fechaInicio);
                    }

                    return !salida.isBefore(fechaInicio) &&
                            !llegada.isAfter(fechafin);
                })
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .toList();

        return filtroVuelos.stream()
                .map(Vuelo::toString)
                .reduce("", (a, b) -> a + b + "\n");
    }
}
