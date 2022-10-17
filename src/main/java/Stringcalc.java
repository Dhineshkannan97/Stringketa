import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringcalc {
    public static long add(String num) {
        if (num.isEmpty()) {
            return 0;
        } else {
            var splitNum = splitNum(num);
            return pars(splitNum);
        }
    }

    private static String[] splitNum(String num) {
        return num.split(",");
    }

    private static long pars(String[] split) {
        long p = 0;
        for (String s : split) {
            Pattern pattern = Pattern.compile(".*[a-zA-Z]+.*");
            Pattern sym = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(s);
            Matcher mat = sym.matcher(s);
            if (s.isEmpty() || s.contains(".") || s.contains("-") || matcher.matches() || !mat.matches()) {
                continue;
            }
            //p = Long.parseLong(s) + p;
            p = Math.addExact(Long.parseLong(s), p);
        }
        return p;
    }
}
