
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndresFelipe
 */
public class A {
    
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num<0){
            int d1 = num%10;
            d1*=-1;
            num/=10;
            int d2 = num%10;
            d2*=-1;
            num/=10;
            num*=10;
            num-=(d1<d2)?d1:d2;
        }
        System.out.println(num);
    }
    
}
