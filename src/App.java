import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temprature:");
        heat = input.nextInt();

        if (heat<5){
            System.out.println("Skiing");
        }else if(5<=heat && heat<=15){
            System.out.println("Cinema");
        } else if(15<=heat && heat<=25){
            System.out.println("Picnic");
        }else if(heat>25){
            System.out.println("Swimming");
        }


    }
}
 