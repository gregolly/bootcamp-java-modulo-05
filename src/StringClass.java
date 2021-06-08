import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {
        String texto = "Mentorama - Java";
        String secondText = "Mentorama - JAVA";
        String textoVazio = "";
        System.out.println(texto.charAt(0));

        // System.out.println(secondText.compareTo(texto));
        int comparacao = secondText.compareTo(texto);
        int comparacao2 = secondText.compareToIgnoreCase(texto);
        boolean igual = secondText.equals(texto);
        boolean igualIgnore = secondText.equalsIgnoreCase(texto);

        if (igual) {
            System.out.println("É diferente");
        }

        if (igualIgnore) {
            System.out.println("É igual");
        }

        System.out.println(texto.startsWith("Men"));
        System.out.println(secondText.toUpperCase().endsWith("Java"));
        String[] textos = texto.split("-");
        for (String t: textos) {
            System.out.println(t.toLowerCase().trim());
        }

        System.out.println(texto.isEmpty());
        System.out.println(textoVazio.isEmpty());


        System.out.println(texto.substring(0, 9).toUpperCase());

        System.out.println("Carro" + " " + "veloz");
        System.out.println("Super".concat(" Mario"));
    }
}
