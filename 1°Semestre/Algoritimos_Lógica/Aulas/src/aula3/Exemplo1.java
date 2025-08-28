package aula3;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) throws Exception {
        Scanner nota = new Scanner(System.in);
        char conceito;
        
        System.out.println("Digite três notas: ");
        int n1 = nota.nextInt();
        int n2 = nota.nextInt();
        int n3 = nota.nextInt();
        double media = (n1+n2+n3)/3;
        

        if(9<= media && media <= 10){
            conceito = 'A';
        }else if (8 <= media && media < 9){
            conceito = 'B';
        }else if (7 <= media && media < 8) {
            conceito = 'C';
        } else if (6 <= media && media < 7){
            conceito = 'D';
        }else{
            conceito = 'E';
        }


        

        switch (conceito) {
            case 'A':
                System.out.println("Excelente!");
                break;
            case 'B':
                System.out.println("Muito bom!");
                break;
            case 'C':
                System.out.println("Bom!");
                break;
            case 'D':
                System.out.println("Regular!");
                break;
            case 'E':
                System.out.println("Tente novamente!");
                break;
            default:
                System.out.println("Conceito inválido");
        }

        nota.close();
    }
}
