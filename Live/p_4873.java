
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndresFelipe
 */
public class A {
 
    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine()); //cantidad de casos
        for (int i=0;i<n;i++){
            /**
             * en esta matriz se almacenan los conteos, como es una cadena
             * de 3 caracteres, se hace una matriz tridimencional.
             * y de tan solo 2 espacios, debido a que cada caracter solo tiene 2
             * opciones.
             * 
             * 'H' es igua 0 y 'T' es igual a 1.
             */
            int[][][] mat = new int[2][2][2];
            String cas= br.readLine();
            char cad[] = br.readLine().toCharArray();
            /**iteramos sobre la cadena de entrada y prellenamos los
             * dos primeros caracteres.... luego solo tenemos que iterar
             * por el resto de la cadena realizando las comprobaciones, y moviendo
             * el nuevo caracter a pre2 y el caracter de pre2 a pre1
             * el pre1 original se puede descartar, ya que no nos va a servir mas.
            */
            int pre1= cad[0]=='H'?0:1;
            int pre2= cad[1]=='H'?0:1;
            for (int let=2;let<40;let++){ 
                int act=cad[let]=='H'?0:1;
                mat[pre1][pre2][act]++; //sumamos a nuestro contador, de acuerdo a los 3 caracteres que nos interesan
                pre1=pre2;
                pre2=act;
            }
            //imprimimos en el orden que nos piden
            System.out.println(cas+" "+mat[1][1][1]+" "+mat[1][1][0]+" "+mat[1][0][1]+" "+mat[1][0][0]+" "+mat[0][1][1]+" "+mat[0][1][0]+" "+mat[0][0][1]+" "+mat[0][0][0]);
        }
        
    }
    
}
