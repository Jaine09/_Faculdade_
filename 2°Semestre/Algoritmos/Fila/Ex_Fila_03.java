public class Ex_Fila_03 {
    public static void main(String[] args) {
        FilaInteiro fila = new FilaInteiro(10);
        fila.enqueue(10);
        fila.ExibirFila();
        fila.dequeue();
        fila.ExibirFila();

        fila.enqueue(103);
        fila.ExibirFila();
        fila.enqueue(120);
        fila.ExibirFila();
        fila.enqueue(150);
        fila
                .ExibirFila();
        fila.dequeue(); // SAI

        ;
        fila.enqueue(110);
        fila
                .ExibirFila();
    }
}
