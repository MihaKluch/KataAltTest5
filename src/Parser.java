import java.util.Arrays;

public class Parser {



    //   static String pop = calc.userInput;
    static String userOtput(String hh) {

        String rez = null;
//        String[] arr = hh.split("[+,-,/,*]");
        if (!hh.matches(("\"[^\"]{1,10}\"\\s*[+\\-*/]\\s*(\"[^\"]{1,10}\"|\\d+)"))){
            throw new MyExcepcion("Не коректный ввод: "+hh);
        }
        if ( hh.contains("-")){
            rez = Rezultat.min(hh);
        }else if (hh.contains("+")){
            rez = Rezultat.plus(hh);
        }else if ( hh.contains("*")){
            rez = Rezultat.umn(hh);
        }else if (hh.contains("/")){
            rez = Rezultat.del(hh);
        } else {
            throw new MyExcepcion("операция не известна :" + hh);
        }

        if (rez.length()>40){
            rez = rez.substring(0,40) +"...";
        }

        return rez;

    }

}