
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AndresFelipe
 */
public class C {

    static Integer contador[];
    static int n;

    public static void main(String Args[]) throws IOException {
        StreamTokenizer br = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        br.nextToken();
        int num = (int)br.nval;
        double base = Math.log(4);
        n = (int) (Math.log(num) / base);
        contador = new Integer[num];
        for (int i = 0; i < num; i++) {
            br.nextToken();
            contador[i]=(int)br.nval;
        }
        Arrays.sort(contador);
        long salida=0;
        int lim=num-(int)Math.pow(4, n-1);
        long mult=1;
        for (int i=0;i<num;i++){
            if (i>=lim){
                n--;
                lim=num-(int)Math.pow(4, n-1);
                mult++;
            }
            salida+=(contador[i]*mult);
        }
        System.out.println(Long.toString(salida));
    }
}

