import java.util.ArrayList;


public class Estudiante {
    
    private String nombre;
    private ArrayList<Double> calificaciones;

    
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

 
    public void agregarCalificacion(double calificacion) {
        calificaciones.add(calificacion);
    }

 
    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0.0;
        }

        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }

 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Calificaciones: " + calificaciones);
        System.out.println("Promedio de calificaciones: " + calcularPromedio());
    }
}
