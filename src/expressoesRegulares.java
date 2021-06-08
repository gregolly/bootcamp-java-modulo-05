import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class expressoesRegulares {
    public static void main(String[] args) {
        String regex = "\\b([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})";
        String rightCoffe = "cof?fe?e";

        String cpf = "111.111.111-11";
        String wrongCoffe = "cofii";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cpf);
        System.out.println(matcher.find());

        Pattern p = Pattern.compile(rightCoffe);
        Matcher mat = p.matcher(wrongCoffe);
        System.out.println(mat.find());
    }
}
