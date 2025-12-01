package entities;

import java.time.LocalDate;

public class Vuelo {

    // ES: Identificador único del vuelo
    // EN: Unique identifier for the flight
    private int id;

    // ES: Nombre o código del vuelo
    // EN: Flight name or code
    private String nombreVuelo;

    // ES: Aerolínea responsable del vuelo
    // EN: Airline responsible for the flight
    private String empresa;

    // ES: Ciudad o aeropuerto de salida
    // EN: Departure city or airport
    private String lugarSalida;

    // ES: Ciudad o aeropuerto de llegada
    // EN: Arrival city or airport
    private String lugarLlegada;

    // ES: Fecha de salida del vuelo
    // EN: Departure date of the flight
    private LocalDate fechaSalida;

    // ES: Fecha de llegada del vuelo
    // EN: Arrival date of the flight
    private LocalDate fechaLlegada;

    // ES: Constructor vacío necesario para algunas operaciones
    // EN: Empty constructor required for certain operations
    public Vuelo(){
    }

    // ES: Constructor principal para inicializar todos los atributos
    // EN: Main constructor to initialize all attributes
    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida, String lugarLlegada, LocalDate fechaSalida, LocalDate fechaLlegada) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    // ES: Método getter para obtener la fecha de salida
    // EN: Getter method to obtain the departure date
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    // ES: Método getter para obtener la fecha de llegada
    // EN: Getter method to obtain the arrival date
    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    // ES: Representación en cadena de un vuelo, útil para imprimir en consola
    // EN: String representation of a flight, useful for console output
    @Override
    public String toString() {
        return "Vuelo{" +
                "id=" + id +
                ", nombreVuelo='" + nombreVuelo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", lugarSalida='" + lugarSalida + '\'' +
                ", lugarLlegada='" + lugarLlegada + '\'' +
                ", fechaSalida=" + fechaSalida +
                ", fechaLlegada=" + fechaLlegada +
                '}';
    }
}