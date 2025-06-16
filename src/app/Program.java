package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        // Curso A
        System.out.print("How many students for course A? ");
        int na = sc.nextInt();
        System.out.print("Enter the ID's:");
        System.out.println();
        for (int i = 0; i < na; i++) {
            int number = sc.nextInt();
            a.add(number);
        }

        // Curso B
        System.out.print("How many students for course B? ");
        int nb = sc.nextInt();
        System.out.print("Enter the ID's:");
        System.out.println();
        for (int i = 0; i < nb; i++) {
            int number = sc.nextInt();
            b.add(number);
        }

        // Curso C
        System.out.print("How many students for course C? ");
        int nc = sc.nextInt();
        System.out.print("Enter the ID's:");
        System.out.println();
        for (int i = 0; i < nc; i++) {
            int number = sc.nextInt();
            c.add(number);
        }

        // União dos conjuntos
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());
        System.out.println("Student IDs: " + total);
        
     // Detectar IDs repetidos
        Set<Integer> repeated = new HashSet<>();

        for (Integer id : a) {
            if (b.contains(id) || c.contains(id)) {
                repeated.add(id);
            }
        }

        for (Integer id : b) {
            if (c.contains(id)) {
                repeated.add(id);
            }
        }

        if (repeated.isEmpty()) {
            System.out.println("No repeated student IDs.");
        } else {
            System.out.println("Repeated student IDs (enrolled in more than one course): " + repeated);
        }

        sc.close();
    }
}
