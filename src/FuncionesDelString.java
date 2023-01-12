public class FuncionesDelString {
    public static void main(String[] args) {
        String mensaje = "Hola mundo feo";
        System.out.println(mensaje.length());

        char letraH = mensaje.charAt(3);
        System.out.println(letraH);

        int indice = mensaje.indexOf("f");
        System.out.println(indice);

        int indice2 = mensaje.lastIndexOf("o");
        System.out.println(indice2);

        String mensaje2 = "Este mensaje posee muchas letras a";
        int indicePrimeraA = mensaje2.indexOf("a");
        int indiceSegundaA = mensaje2.indexOf("a", indicePrimeraA + 1);
        System.out.println(indicePrimeraA);
        System.out.println(indiceSegundaA);

        int indiceLetraM = mensaje.indexOf("m");
        String subString = mensaje.substring(indiceLetraM);
        System.out.println(subString);

        String subString2 = mensaje.substring(indiceLetraM, indiceLetraM + 7);
        System.out.println(subString2);




    }
}
