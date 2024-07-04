/**
 * @author queiroga
 */
public class Operadores {

    public static void main(String[] args) {
        operacoesCalculoMedia();
        operacoesIncrDecr();
        operarAritmetica();
        operacoesAtribuicoes();
        operacoesRelacionais();
    }

    public static void operacoesCalculoMedia(){
        int nota1 = 5;
        int nota2 = 7;
        int nota3 = 8;
        int nota4 = 10;
        int totalNota = nota1 + nota2 + nota3 + nota4;

        float media = totalNota / 4f;

        System.out.println("A média das notas é: " + media);
    }
    public static void operacoesRelacionais(){
        int num1 =10;
        int num2 = 10;
        boolean isMaior = num1 > num2;
        System.out.println("isMaior: " + isMaior);

        boolean isIgual = num1 == num2;
        System.out.println("isIgual: " + isIgual);

        boolean isDentro = num1 >= 1 && num1 <= 10;
        System.out.println("isDentro: " + isDentro);

    }
    public static void operacoesIncrDecr(){
        System.out.println("Operacoes");
        int num1 =10;
        //add 1
        num1++;
        System.out.println(num1);
        //sub 1
        num1--;
        System.out.println(num1);

    }

    private static void operacoesAtribuicoes() {
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = numero1 + numero2;
        //dobra o valor
        numero3 += numero3;

    }

    public static void operarAritmetica(){
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;

        System.out.println(num3);
    }
}
