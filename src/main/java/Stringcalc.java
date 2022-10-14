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
            if (s.isEmpty() || Character.isAlphabetic(s.charAt(0)) || s.contains(".")||s.contains("-")) {
                continue;
            }
            p = Long.parseLong(s) + p;
        }
        return p;
    }
}
