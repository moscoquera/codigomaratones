
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndresFelipe
 */
public class C {
    static long contador[];
    static int n;
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine());
        double base = Math.log(4);
        n= (int)(Math.log(num)/base);
        contador = new long[num];
        String numeros = br.readLine();
                for (int i=0;i<num;i++){
           // int d = Integer.valueOf(st.nextToken());
            
        }
    }
    
   
    
}
