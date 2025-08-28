/*Crie um programa que simule uma pilha de livros. Use uma pilha para adicionar e remover livros da pilha.
Implemente as seguintes operações:
Adicionar um livro à pilha.
Remover o livro do topo da pilha.
Verificar se a pilha está vazia.
Mostrar o livro do topo da pilha (sem remover). */

package Exercicios;

public class Ex_01 {
    Object[] livros;
    int posicaoLivro;

    public Ex_01(){
        livros = new Object[5];
        posicaoLivro = -1;
    }

    //verificar se está vazia (isEmpty)
    public boolean pilhaVazia(){
        if(posicaoLivro == -1){
            return true;
        }
        return false;
    }

    //length
    public int tamanho(){
        if(pilhaVazia()){
            return 0;
        }
        return posicaoLivro+1;
    }

    //push
    public void empilhar(Object item){
        if(posicaoLivro < livros.length){
            livros[++posicaoLivro] = item;
            System.out.println(item);
        }

    }

    //pop
    public Object desempilhar(){
        if(pilhaVazia()){
            return null;
        }
        return livros[--posicaoLivro];
    }
    
    public static void main(String[] args) {
        Ex_01 livro = new Ex_01();
        livro.empilhar("livro 01");
        livro.empilhar("livro 02");
        livro.empilhar("livro 03");
        livro.empilhar("livro 04");
        livro.empilhar("livro 05");

       System.out.println("\nTamanho da pilha " + livro.tamanho()); 

       livro.desempilhar();
       System.out.println("Tamanho da pilha " + livro.tamanho()); 
       livro.desempilhar();
       System.out.println("Tamanho da pilha " + livro.tamanho()); 
       livro.desempilhar();
       System.out.println("Tamanho da pilha " + livro.tamanho()); 
       livro.desempilhar();
       System.out.println("Tamanho da pilha " + livro.tamanho()); 
       
    }
}
