public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Juan");
        estudiante1.agregarCalificacion(90);
        estudiante1.agregarCalificacion(85);

        Estudiante estudiante2 = new Estudiante("María");
        estudiante2.agregarCalificacion(75);
        estudiante2.agregarCalificacion(88);


        GestorEstudiantes gestor = new GestorEstudiantes();


        gestor.agregarEstudiante(estudiante1);
        gestor.agregarEstudiante(estudiante2);

        gestor.mostrarInformacionEstudiantes();
    }
}
