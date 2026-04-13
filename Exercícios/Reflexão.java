package Exercícios;
// a) Custo de inserção no meio. 


/* * Para inserir um elemento no meio de um array, é necessário deslocar todos os elementos subsequentes para a direita para abrir espaço para o novo elemento. 
 * Isso resulta em um custo de tempo O(n) no pior caso, onde n é o número de elementos no array. 
 * Portanto, a inserção no meio de um array é uma operação relativamente cara em termos de desempenho.
 */ 

// b) Custo de acesso por indice. 

/* * O acesso por índice em um array é uma operação de tempo constante O(1), pois os elementos do array são armazenados em posições contíguas de memória. 
 * Isso significa que, dado um índice, o elemento correspondente pode ser acessado diretamente sem a necessidade de percorrer o array. 
 * Portanto, o custo de acesso por índice em um array é muito eficiente.
 */ 


// b) Circularidade. Seria possível resolver o Problema de Josephus usando um array em vez de uma lista
//circular? Se sim, como ficaria a remoção? Seria mais ou menos eficiente?

/* * Sim, seria possível resolver o Problema de Josephus usando um array em vez de uma lista circular. 
 * No entanto, a remoção de elementos em um array é mais complexa do que em uma lista circular, pois requer o deslocamento dos elementos subsequentes para preencher o espaço vazio deixado pelo elemento removido. 
 * Isso resultaria em um custo de tempo O(n) para cada remoção, tornando a solução menos eficiente do que usar uma lista circular, onde a remoção pode ser feita em tempo constante O(1) ao ajustar os ponteiros. 
 * Portanto, embora seja possível usar um array, não seria a abordagem mais eficiente para resolver o Problema de Josephus.
 */ 




