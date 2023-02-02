/**
 * @Class name: Cycle
 * @Author: Ashley Seerattan
 * @Version: 1.0
 * @Date 01 February 2023
 * Description: : Cycle
 */
public class cycle {
     static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of wheels. ");
        int wheels=sc();
        int tri=(wheels-20)/3;
        System.out.println("Number of tricycles are "+tri);
}

