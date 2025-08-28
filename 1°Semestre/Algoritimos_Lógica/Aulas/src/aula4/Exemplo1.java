package aula4;

public class Exemplo1 {
    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++){
            System.out.println("i: " + i);
        }

        for(int i = 1; i <= 20; i++){
            if(i%2 == 0){
                System.out.println(i + " é PAR");
            }
        }
    }
}
