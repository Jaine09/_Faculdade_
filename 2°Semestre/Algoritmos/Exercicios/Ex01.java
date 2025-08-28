import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Digite dois números: ");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        resto(num1, num2);
        subtracao(num1, num2);
    }

    public static void resto(int num1, int num2){ 
        int resto = num1%num2;
        System.out.println("O resto da divisão entre " + num1 + " e " + num2 + " é " + resto);
    }

    public static void subtracao(int num1, int num2){
        if(num1 > num2){
            int sub = num1-num2;
            System.out.println(" A diferença entre " + num1 + " e " + num2 + " é " + sub);
        } else if (num2 > num1){
            int sub = num2-num1;
            System.out.println(" A diferença entre " + num2 + " e " + num1 + " é " + sub);
        }else{
            System.out.println(" A diferença entre " + num1 + " e " + num2 + " é 0");
        }

    }
}
