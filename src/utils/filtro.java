package utils;

import entities.Vuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class filtro {

    /**
     * ES: Filtra y ordena una lista de vuelos según un rango de fechas.
     * EN: Filters and sorts a list of flights based on a date range.
     *
     * @param vuelos      ES: Lista de vuelos a filtrar. EN: List of flights to filter.
     * @param fechaInicio ES: Fecha de inicio del filtro (puede ser null).
     *                    EN: Start date for filtering (can be null).
     * @param fechafin    ES: Fecha de fin del filtro (puede ser null).
     *                    EN: End date for filtering (can be null).
     * @return ES: String con los vuelos filtrados y ordenados por fecha de salida.
     *         EN: String with filtered flights sorted by departure date.
     */
    public static String filtro(ArrayList<Vuelo> vuelos, LocalDate fechaInicio, LocalDate fechafin) {

        // ES: Crear una lista filtrada aplicando el rango de fechas y ordenando por fecha de salida
        // EN: Create a filtered list applying the date range and sorting by departure date
        List<Vuelo> filtroVuelos = vuelos.stream()
                .filter(vuelo -> {

                    LocalDate salida = vuelo.getFechaSalida(); // ES: Fecha de salida del vuelo. EN: Flight departure date.
                    LocalDate llegada = vuelo.getFechaLlegada(); // ES: Fecha de llegada del vuelo. EN: Flight arrival date.

                    // ES: Si no se especifican fechas, incluir todos los vuelos
                    // EN: If no dates are specified, include all flights
                    if (fechaInicio == null && fechafin == null) {
                        return true;
                    }

                    // ES: Si solo se especifica fecha fin, incluir vuelos cuya llegada sea antes o igual a esa fecha
                    // EN: If only end date is specified, include flights arriving on or before that date
                    if (fechaInicio == null) {
                        return !llegada.isAfter(fechafin);
                    }

                    // ES: Si solo se especifica fecha inicio, incluir vuelos cuya salida sea después o igual a esa fecha
                    // EN: If only start date is specified, include flights departing on or after that date
                    if (fechafin == null) {
                        return !salida.isBefore(fechaInicio);
                    }

                    // ES: Si se especifican ambas fechas, incluir vuelos que estén dentro del rango
                    // EN: If both dates are specified, include flights within the range
                    return !salida.isBefore(fechaInicio) &&
                            !llegada.isAfter(fechafin);
                })
                // ES: Ordenar la lista de vuelos filtrados por fecha de salida
                // EN: Sort the filtered flight list by departure date
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .toList();

        // ES: Convertir la lista filtrada a un string legible, un vuelo por línea
        // EN: Convert the filtered list to a readable string, one flight per line
        return filtroVuelos.stream()
                .map(Vuelo::toString)
                .reduce("", (a, b) -> a + b + "\n");
    }
}
