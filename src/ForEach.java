public class ForEach {
    public static void main(String[] args) {
        float[] calificaciones = {10, (float) 9.3, (float) 8.2};
        float suma = 0;

        for (float calificacion : calificaciones) {
            suma += calificacion;
        }

        float promedio = suma / calificaciones.length;
        System.out.println("El promedio es: " + promedio);

    }
}
