import java.util.ArrayList;

public class ListaParte2{
    private ArrayList<Integer> lista;

    public ListaParte2() {
        this.lista = new ArrayList<>();
    }

    public void removerNaoOrdenada(int elemento) {
        lista.remove(Integer.valueOf(elemento));
    }

    public void removerOrdenada(int elemento) {
        lista.remove(Integer.valueOf(elemento));
    }

    public void inserirNaoOrdenada(int elemento) {
        lista.add(elemento);
    }

    public void inserirOrdenada(int elemento) {
        int i = 0;
        while (i < lista.size() && lista.get(i) < elemento) {
            i++;
        }
        lista.add(i, elemento);
    }

    public boolean buscarNaoOrdenada(int elemento) {
        return lista.contains(elemento);
    }

    public static void main(String[] args) {
        ListaParte2 lista = new ListaParte2();

        lista.inserirNaoOrdenada(5);
        lista.inserirNaoOrdenada(3);
        lista.inserirNaoOrdenada(8);
        System.out.println("Lista não ordenada antes da remoção: " + lista.lista);
        lista.removerNaoOrdenada(3);
        System.out.println("Lista não ordenada após a remoção: " + lista.lista);

        lista.inserirOrdenada(7);
        lista.inserirOrdenada(2);
        lista.inserirOrdenada(6);
        System.out.println("Lista ordenada antes da remoção: " + lista.lista);
        lista.removerOrdenada(6);
        System.out.println("Lista ordenada após a remoção: " + lista.lista);

        System.out.println("O elemento 8 está na lista não ordenada? " + lista.buscarNaoOrdenada(8));
        System.out.println("O elemento 4 está na lista não ordenada? " + lista.buscarNaoOrdenada(4));
    }
}
