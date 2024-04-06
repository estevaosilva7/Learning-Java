public class Lista {
    private static class No {
        public No prox; 
        public int valor; 

        public No(int val) { 
            valor = val;
            prox = null;
        }
    }

    private No inicio; 

    public Lista() { 
        inicio = null;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public boolean search(int elem) {
        for (No nodo = inicio; nodo != null; nodo = nodo.prox)
            if (elem == nodo.valor)
                return true; 
        return false; 
    }

    public void insereInicio(int elem) { 
        No novoNo = new No(elem);
        novoNo.prox = inicio; 
        inicio = novoNo; 
    }

    public void insereMeio(int elem, int posicao) { 
        if (posicao <= 0) {
            insereInicio(elem);
        } else {
            No novoNo = new No(elem);
            No anterior = inicio;
            for (int i = 0; i < posicao - 1 && anterior.prox != null; i++) {
                anterior = anterior.prox;
            }
            novoNo.prox = anterior.prox;
            anterior.prox = novoNo;
        }
    }

    public void removeInicio() { 
        inicio = inicio.prox; 
    }

    public void removeFim() { 
        if (inicio == null || inicio.prox == null) {
            inicio = null;
            return;
        }
        No anterior = inicio;
        while (anterior.prox.prox != null) {
            anterior = anterior.prox;
        }
        anterior.prox = null;
    }

    public String exibeLista() {
        if (isEmpty())
            return "Lista vazia\n"; 
        String str = "Lista Encadeada: ";
        for (No nodo = inicio; nodo != null; nodo = nodo.prox)
            str += " " + nodo.valor;
        return str + "\n";
    }
}
