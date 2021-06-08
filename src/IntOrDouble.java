public class IntOrDouble {
    public static void main(String[] args) {
/*        Integer valor1 = 12;
        Integer valor2 = 8;

        Integer resultado = valor1 / valor2;

        System.out.println(resultado);*/

        int valor1 = 12;

        long valorLong = valor1;

        System.out.println(valorLong);

        int valorInt = (int)valorLong;

        System.out.println(valorInt);

        double valorDouble = valorInt;

        System.out.println(valorDouble);

        long outroLong = (long)valorDouble;

        System.out.println("Essa variavel é do tipo long: "+outroLong);
    }
}
