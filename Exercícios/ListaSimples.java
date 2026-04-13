package Exercícios;
public class ListaSimples{
    private Node head; 


    public ListaSimples() {
        this.head = null;
    }

    public Node find(Object item){
        Node atual = head;
        while(atual!=null){
            if(atual.item.equals(item)){
                return atual;
            }
            atual = atual.next;
        }
        return null;
    }

    public void InsertAfter(Node x,Object item){
        if (x == null) return;
        Node novoNode = new Node(item, x.next);
        x.next = novoNode;
    }


    public void insertFirst(Object item){
        head = new Node(item, head);
    }



    public void imprimir(){
        Node atual = head;
        while(atual!=null){
            System.out.print(atual.item + " ->");
            atual = atual.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.insertFirst("C");
        lista.insertFirst("B");
        lista.insertFirst("A");
        lista.imprimir(); // Deve imprimir: A -> B -> C -> null
        Node noB = lista.find("B"); 
        if (noB != null) {
            lista.InsertAfter(noB, "B2");
        }
        lista.imprimir(); // Deve imprimir: A -> B -> B2 -> C -> null

        Node noZ = lista.find("Z"); 
        System.out.println("Busca por Z: " + noZ); // Deve imprimir: null
    }
}