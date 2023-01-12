public class RecorrerArreglos {
    public static void main(String[] args) {
        int[] calificaciones = {10, 10, 10, 10, 10, 10, 7, 8, 10, 10};
        int suma = 0;

        for (int calificacion : calificaciones) {
            suma += calificacion;
        }

        float promedio = suma / calificaciones.length;
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}
