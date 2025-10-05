import java.util.Scanner;

public class Day1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 4;
        int myInt = sc.nextInt();
        sc.nextLine();

        double d = 4;
        double myDouble = sc.nextDouble();
        sc.nextLine();

        String s = "HackerRank";
        String myString = sc.nextLine();


        System.out.println(i + myInt);
        System.out.println(d + myDouble);
        System.out.println(s + " " + myString);

    }
}
