public class objetosDeTexto {
    public static void main(String[] args) {
        char vetores[] = {'a', 'b', 'c'};
        String texto = String.valueOf(vetores);
        System.out.println(texto);

        long longConvertido = 12;
        String valor = String.valueOf(longConvertido);
        System.out.println(valor);

        Double valorDouble = Double.valueOf(valor);
        System.out.println(valorDouble);
    }
}
