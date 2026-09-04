import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] sedes = {
                "Quito",
                "Manta",
                "Guayaquil",
                "Ambato",
                "Cuenca"
        };

        Grafo grafo = new Grafo(5);

        grafo.agregarConexion(0, 3, 150);
        grafo.agregarConexion(0, 2, 420);
        grafo.agregarConexion(3, 4, 220);
        grafo.agregarConexion(2, 4, 195);
        grafo.agregarConexion(2, 1, 190);
        grafo.agregarConexion(3, 1, 310);

        Scanner teclado = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("LOGIPACK ECUADOR - SISTEMA DE OPTIMIZACIÓN");
        System.out.println("Estudiante: Jofre Pilacuán");
        System.out.println("===============================================");
        System.out.println();

        System.out.println("Sedes disponibles:");
        System.out.println("0. Quito");
        System.out.println("1. Manta");
        System.out.println("2. Guayaquil");
        System.out.println("3. Ambato");
        System.out.println("4. Cuenca");

        System.out.println();
        System.out.print("Ingrese la sede de origen: ");
        int origen = teclado.nextInt();

        System.out.print("Ingrese la sede de destino: ");
        int destino = teclado.nextInt();

        System.out.println();

        Dijkstra.calcularRuta(
                grafo.getMatriz(),
                origen,
                destino,
                sedes
        );

        teclado.close();
    }
}