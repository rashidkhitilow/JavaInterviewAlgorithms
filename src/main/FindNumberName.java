/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author rashid.khitilov
 */
public class FindNumberName {

    public static final String[] units = {
        "", //0
        "bir",//1
        "iki", //2
        "üç",//3
        "dörd",//4
        "beş",//5
        "altı",//6
        "yeddi",//7
        "səkkkiz", //8
        "doqquz",//9
        "on"//10

    };

    public static final String[] tens = {
        "", // 0
        "", // 1
        "iyirmi", // 2
        "otuz", // 3
        "qırx", // 4
        "əlli", // 5
        "altmış", // 6
        "yetmiş", // 7
        "səksən", // 8
        "doxsan" // 9
    };

    public static String convert(final int n) {
        if (n < 0) {
            return "minus " + convert(-n);
        }

        if (n <= 10) {
            if (n == 0) {
                return "sifir";
            }
            return units[n];
        }
        if (n > 10 && n < 20) {
            return "on" + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }
        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return ((units[n / 100] != "bir") ? units[n / 100] : "") + " yüz" + ((n % 100 != 0) ? " " : "") + (convert(n % 100) == "sifir" ? "" : convert(n % 100));
        }

        if (n < 1000000) {
            return ((convert(n / 1000) != "bir") ? convert(n / 1000) : "") + " min" + ((n % 1000 != 0) ? " " : "") + (convert(n % 1000) == "sifir" ? "" : convert(n % 1000));
        }

        if (n < 1000000000) {
            return convert(n / 1000000) + " milyon" + ((n % 1000000 != 0) ? " " : "") + (convert(n % 1000000) == "sifir" ? "" : convert(n % 1000000));
        }

        return convert(n / 1000000000) + " milyard" + ((n % 1000000000 != 0) ? " " : "") + (convert(n % 1000000000) == "sifir" ? "" : convert(n % 1000000000));
    }

    public static void main(final String[] args) {
        System.out.println(convert(10502));
//        System.out.printf("%10d = '%s'%n", n, convert(n));

    }
}
