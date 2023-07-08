import java.util.Scanner;

public class TopperProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reg_no = scanner.nextInt(), even = 0, odd = 0;
        while (reg_no>0){
            int rem = reg_no%10;
            if(rem%2==0){
                even+=rem;
            }else{
                odd+=rem;
            }
            reg_no/=10;
        }
        if(even == odd){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
