public class InsertarRegistros {
    public static void main(String[] args) {
        int[] valores = new int[10];
        // Insertar registros con un for normal
        for (int indice = 0; indice < valores.length; indice++){
            valores[indice] = indice;
        }

        for (int valor : valores){
            System.out.println(valor);
        }
    }
}
