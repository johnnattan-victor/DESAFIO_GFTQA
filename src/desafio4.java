/*Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um programa para
verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de
casos de teste. Cada caso de teste consiste de dois inteiros A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.

Saída
Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor, confome exemplo
abaixo.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class desafio4 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        while (n-- > 0) {
            String[] p = in.readLine().split("\\s");
            String A = p[0];
            String B = p[1];
            int lengthA = A.length();
            int lengthB = B.length();
            if (lengthB > lengthA) {
                out.println("nao encaixa");
            } else {

                out.println(A.substring(lengthA - lengthB, lengthA).equals(B) ? "encaixa" : "nao encaixa");
            }
        }
        out.close();
    }
}
