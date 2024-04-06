public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

      
        System.out.println("A lista está vazia? " + lista.isEmpty());

        lista.insereInicio(5);
        lista.insereInicio(10);
        lista.insereInicio(15);

        System.out.println(lista.exibeLista());

        System.out.println("A lista está vazia? " + lista.isEmpty());

        int elementoBuscado = 10;
        System.out.println("O elemento " + elementoBuscado + " está na lista? " + lista.search(elementoBuscado));

        lista.removeInicio();
        System.out.println("Após a remoção do primeiro elemento:");
        System.out.println(lista.exibeLista());

        elementoBuscado = 15;
        System.out.println("O elemento " + elementoBuscado + " está na lista? " + lista.search(elementoBuscado));
    }
}
