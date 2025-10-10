import java.util.Scanner;

public class Day_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        //int j = 0;

        for (int t = 0; t < T; t++){
            //String s = sc.next();
            //char[] ch = s.charAt(j);
            String s = sc.nextLine();

            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();

            for (int i = 0; i < s.length(); i++){
                if (i % 2 == 0){
                    evenChars.append(s.charAt(i));

                }else oddChars.append(s.charAt(i));
            }
            System.out.println(evenChars + " " + oddChars);
        }

        //System.out.println(evenChar);
    }
}
