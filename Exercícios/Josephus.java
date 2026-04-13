package Exercícios;
public class Josephus {

    public static void main(String[] args){
        int N = 6; // número de pessoas
        int M = 3; //salto(elimina a cada M contagens)

        Node primeiro = new Node(1);
        Node atual = primeiro;
        for (int i = 2; i <= N; i++) {
            atual.next = new Node(i);
            atual = atual.next;
        }

        Node anterior = atual; // mantém referência ao último nó para fechar o círculo
        atual = primeiro; // reinicia para o primeiro nó 

        System.out.println("Ordem de eliminação:");

        while 
        (atual.next != atual) { // enquanto houver mais de um nó
            for (int i = 1; i < M; i++) { // conta até M-1
                anterior = atual;
                atual = atual.next;
            }
            System.out.println(atual.item); // imprime o item do nó a ser eliminado
            anterior.next = atual.next; // remove o nó atual da lista
            atual = anterior.next; // move para o próximo nó
        }
        System.out.println("\nSobreviventes:" + atual.item); // imprime o item do último nó restante


    }
}