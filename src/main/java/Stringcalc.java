public class Stringcalc {
    public static int add(String num) {
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

    private static int pars(String[] split) {
        int p = 0;
        for (String s : split) {
            if (!Character.isDigit(s.charAt(0))) {
                continue;
            }
            p = Integer.parseInt(s) + p;
        }
        return p;
    }
}
