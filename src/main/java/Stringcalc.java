public class Stringcalc {
     public static int add(String num){
if (num.isEmpty()){
    return 0;
}else {
//       if (){
//
//       }
    var splitNum = splitNum(num);
    return pars(splitNum);
}
     }
     private static String[] splitNum(String num){
         var split = num.split(",");
         return split;
     }
     private static int pars(String[] split){
         int p = 0;
         for (String s : split) {
             p = Integer.parseInt(s) + p;
         }
         return p;
     }
}
