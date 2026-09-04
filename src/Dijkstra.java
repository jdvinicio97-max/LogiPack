import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dijkstra {

    public static void calcularRuta(int[][] grafo, int origen, int destino, String[] sedes) {

        int cantidad = grafo.length;

        int[] distancias = new int[cantidad];
        boolean[] visitados = new boolean[cantidad];
        int[] anteriores = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            distancias[i] = Integer.MAX_VALUE;
            anteriores[i] = -1;
        }

        distancias[origen] = 0;

        for (int i = 0; i < cantidad - 1; i++) {

            int actual = obtenerNodoMenorDistancia(distancias, visitados);

            if (actual == -1) {
                break;
            }

            visitados[actual] = true;

            for (int vecino = 0; vecino < cantidad; vecino++) {

                if (!visitados[vecino]
                        && grafo[actual][vecino] > 0
                        && distancias[actual] != Integer.MAX_VALUE
                        && distancias[actual] + grafo[actual][vecino] < distancias[vecino]) {

                    distancias[vecino] =
                            distancias[actual] + grafo[actual][vecino];

                    anteriores[vecino] = actual;
                }
            }
        }

        mostrarResultado(
                grafo,
                origen,
                destino,
                sedes,
                distancias,
                anteriores
        );
    }

    private static int obtenerNodoMenorDistancia(
            int[] distancias,
            boolean[] visitados) {

        int menor = Integer.MAX_VALUE;
        int indiceMenor = -1;

        for (int i = 0; i < distancias.length; i++) {

            if (!visitados[i] && distancias[i] < menor) {
                menor = distancias[i];
                indiceMenor = i;
            }
        }

        return indiceMenor;
    }

    private static void mostrarResultado(
            int[][] grafo,
            int origen,
            int destino,
            String[] sedes,
            int[] distancias,
            int[] anteriores) {

        List<Integer> ruta = new ArrayList<>();

        int actual = destino;

        while (actual != -1) {
            ruta.add(actual);
            actual = anteriores[actual];
        }

        Collections.reverse(ruta);

        System.out.println("===============================================================================");
        System.out.println("LOGIPACK ECUADOR - SISTEMA DE OPTIMIZACIÓN");
        System.out.println("Estudiante: Jofre Pilacuán");
        System.out.println("===============================================================================");

        System.out.println();

        System.out.println(
                "[Ruta seleccionada]: "
                        + sedes[origen].toUpperCase()
                        + " (" + origen + ") --> "
                        + sedes[destino].toUpperCase()
                        + " (" + destino + ")"
        );

        System.out.println();
        System.out.println("[Grafica de la ruta óptima]:");

        for (int i = 0; i < ruta.size(); i++) {

            int nodo = ruta.get(i);

            System.out.print(
                    "[" + nodo + "] "
                            + sedes[nodo].toUpperCase()
            );

            if (i < ruta.size() - 1) {

                int siguiente = ruta.get(i + 1);
                int distancia = grafo[nodo][siguiente];

                System.out.print(
                        " --(" + distancia + " km)--> "
                );
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("[Detalle del Despacho]:");

        System.out.println(
                " • Origen: "
                        + sedes[origen]
                        + " [Sede "
                        + origen
                        + "]"
        );

        System.out.println(
                " • Destino: "
                        + sedes[destino]
                        + " [Sede "
                        + destino
                        + "]"
        );

        System.out.print(" • Secuencia Óptima: ");

        for (int i = 0; i < ruta.size(); i++) {

            System.out.print(sedes[ruta.get(i)]);

            if (i < ruta.size() - 1) {
                System.out.print(" -> ");
            }
        }

        System.out.println();

        System.out.println(
                " • Distancia Total: "
                        + distancias[destino]
                        + " km"
        );

        System.out.println("===============================================================================");
    }
}