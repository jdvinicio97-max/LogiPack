public class Grafo {

    private int[][] matriz;

    public Grafo(int numeroSedes) {
        matriz = new int[numeroSedes][numeroSedes];
    }

    public void agregarConexion(int origen, int destino, int distancia) {
        matriz[origen][destino] = distancia;
        matriz[destino][origen] = distancia;
    }

    public int[][] getMatriz() {
        return matriz;
    }
}