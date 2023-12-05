package rs.math.oop.g09.p12.uredjenjePredefinisani;

import java.util.Arrays;

public class UredjenjePredefinisani {

    private static void prikazi(int[] celi) {
        for (int x : celi)
            System.out.printf("%d ", x);
        System.out.println();
    }

    private static void prikazi(double[] realni) {
        for (double x : realni)
            System.out.printf("%f ", x);
        System.out.println();
    }

    private static void prikazi(String[] niske) {
        for (String x : niske)
            System.out.printf("%s ", x);
        System.out.println();
    }
    private static void prikazi(Integer[] brojevi) {
        for (int x : brojevi)
            System.out.printf("%5d", x);
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] celi = {12, 4, -3, 0, 17, 5};
        System.out.println("Пре сортирања");
        prikazi(celi);
        Arrays.sort(celi);
        System.out.println("Пoсле сортирања");
        prikazi(celi);

        double[] realni = {12.5, 4.7, -3.2e1, 0, +1.7e-1, 5};
        System.out.println("Пре сортирања");
        prikazi(realni);
        Arrays.sort(realni);
        System.out.println("Пoсле сортирања");
        prikazi(realni);

        String[] niske = {"12.5", "мики", "-3.2e1", "0", "+1.7e-1", "5", "паја"};
        System.out.println("Пре сортирања");
        prikazi(niske);
        Arrays.sort(niske);
        System.out.println("Пoсле сортирања");
        prikazi(niske);
    }
}
