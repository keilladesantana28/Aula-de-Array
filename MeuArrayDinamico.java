public class MeuArrayDinamico{
    private int[ ] dados; 
    private int tamanho;


    public MeuArrayDinamico(int capacidadeInicial) {
        this.dados = new int[capacidadeInicial];
        this.tamanho = 0;
    }


    private void resize() {
        int novaCapacidade = this.dados.length * 2;
        int[] novoArray = new int[novaCapacidade];
        for (int i = 0; i < this.tamanho; i++) {
            novoArray[i] = this.dados[i];
        }
        this.dados = novoArray;
    }

    public void add(int valor) {
        if (this.tamanho == this.dados.length) {
            resize();
        }
        this.dados[this.tamanho] = valor;
        this.tamanho++;
    }

    public int get(int indice) {
        if (indice < 0 || indice >= this.tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
        return this.dados[indice];
    }

    public int size() {
        return this.tamanho;
    }

    public void imprimir() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.tamanho; i++) {
            sb.append(this.dados[i]);
            if (i < this.tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }


    public static void main(String[] args) {
        MeuArrayDinamico arr = new MeuArrayDinamico(2);
        arr.add(10);
        arr.add(20);
        arr.add(30); // Isso vai acionar o resize
        arr.imprimir(); // Deve imprimir: [10, 20, 30]
        System.out.println("Tamanho: " + arr.size()); // Deve imprimir: Tamanho: 3
    }



}