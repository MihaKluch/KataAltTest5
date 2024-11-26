import java.util.Arrays;

public class Rezultat {
    static String min(String hh) {
        String r = null;
        String str1 = null;
        String str2 = null;
        int kov1 = hh.indexOf("\"");
        int kov2 = hh.indexOf("\"", 1);
        str1 = hh.substring(kov1 + 1, kov2);
        int kov3 = hh.indexOf("\"", kov2 + 1);
        int kov4 = hh.indexOf("\"", kov3 + 1);
        str2 = hh.substring(kov3 + 1, kov4);
        hh = hh.replace("\"", "");
        String hhpp = hh.replace(str2, "");
        String hhppp = hhpp.replace("-", "");

        r = "\"" + hhppp + "\"";
        return r;
    }

    static String plus(String hh) {
        String r = null;
        String str1 = null;
        String str2 = null;
        String[] arr = hh.split("[+,-,/,*]");
        str1 = arr[0];
        str2 = arr[1];
        str1 = str1.replace("\"", "");
        str2 = str2.replace("\"", "");

        r = str1 + str2;
        r = r.replace(" ", "");
        r = "\"" + r + "\"";
        return r;
    }

    static String umn(String hh) {
        String r = null;
        String str1 = null;
        String str2 = null;
        String[] arr = hh.split("[*]");
        str1 = arr[0];
        str2 = arr[1];


        str1 = str1.trim();
        str2 = str2.trim();
        str1 = str1.replace("\"", "");

        int ee = Integer.parseInt(str2);
        if (ee < 1 || ee > 10) {
            throw new MyExcepcion("число должно быть от 1 до 10");
        }

        r = str1.repeat(ee);


        r = "\"" + r + "\"";
        return r;
    }


    static String del(String hh) {
        String r = null;
        String str1 = null;
        String str2 = null;
        String[] arr = hh.split("[/]");
        str1 = arr[0];
        str2 = arr[1];
        str1 = str1.trim();
        str2 = str2.trim();
        str1 = str1.replace("\"", "");

        int tt = str1.length();



        int ee = Integer.parseInt(str2);
        if (ee < 1 || ee > 10) {
            throw new MyExcepcion("число должно быть от 1 до 10");
        }
        int kk = tt / ee;

        r = str1.substring(0, kk);
        r = "\"" + r + "\"";
        return r;
    }
}

