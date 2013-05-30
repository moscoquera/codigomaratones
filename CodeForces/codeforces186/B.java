
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndresFelipe
 */
public class B {
    static int mapa[];
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] texto = br.readLine().toCharArray();
        mapa = new int[texto.length];
        char anterior=texto[0];
        mapa[0]=0;
        for(int i=1;i<texto.length;i++){
            if (texto[i]==anterior){
                mapa[i-1]++;
            }
            mapa[i]=mapa[i-1];
            anterior=texto[i];
        }
        int m = Integer.valueOf(br.readLine());
        StringTokenizer st;
        for (int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int l = Integer.valueOf(st.nextToken())-2;
            int r = Integer.valueOf(st.nextToken())-2;
            int res = (l>=0)?mapa[r]-mapa[l]:mapa[r];
            System.out.println(res);
        }
    }
    
}
