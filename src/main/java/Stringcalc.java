import java.util.regex.Matcher;
import java.util.regex.Pattern;
class InvalidInputExp extends Exception {
    InvalidInputExp(String msg) {
        super(msg);
    }
}

public class Stringcalc {
    public static long add(String num) throws InvalidInputExp {
        if (num.isEmpty()) {
            return 0;
        } else {
            var splitNum = splitNum(num);
            return pars(splitNum);
        }
    }

    private static String[] splitNum(String num) {
        return num.split(",|\n");
    }

    private static long pars(String[] split) throws InvalidInputExp {
        long p = 0;
        for (String s : split) {
            Pattern pattern = Pattern.compile(".*[a-zA-Z]+.*");
            Pattern sym = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(s);
            Matcher mat = sym.matcher(s);
            if (s.isEmpty() || s.contains(".") || s.contains("-") || matcher.matches() ||!mat.matches()) {
                continue;
            }
            p = Long.parseLong(s) + p;
//            p = Math.addExact(Long.parseLong(s), p);
        }
        if (p >= 9223372036854775807L) {
            InvalidInputExp myExp = new InvalidInputExp("wrong input");
            throw myExp;
        }
        return p;
    }

    public static void main(String[] args) throws InvalidInputExp { add("9223372036854775809,5");
}}
