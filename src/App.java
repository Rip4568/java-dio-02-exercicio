import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    private static ArrayList<String> candidatosSelecionados = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        /* DESAFIO 2 */
        String [] candidatos = {"A", "B","C", "D", "E", "F", "G"};
        Integer candidatosSelecionadosQuantidade = 0;
        for (String candidato : candidatos) {
            if (analisarCandidato(salarioPretendido())) {
                System.out.println("Candidato : " + candidato + " Selecionado");
                selecionarCandidato(candidato);
                candidatosSelecionadosQuantidade++;
                if (candidatosSelecionadosQuantidade > 4) {
                    break;
                }
            }
        }
    }

    public static void imprimirCandidatosSelecionados() {
        for (int index = 0; index < candidatosSelecionados.size(); index++) {
            System.out.println("Candidato N°: " + index + " selecionado, nome: " + candidatosSelecionados.get(index));
        }
    }

    static void selecionarCandidato(String candidato) {
        candidatosSelecionados.add(candidato);
    }

    public static Double salarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static Boolean analisarCandidato(Double salarioPretendido) {
        final Double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            /* System.out.println("LIGAR PARA O CANDIDATO"); */
            return true;
        } else if (salarioBase == salarioPretendido) {
            /* System.out.println("AGENDAR CANDIDATO"); */
            return true;
        } else {
            /* System.out.println("ANALISAR OUTROS CANDIDATOS"); */
            return false;
        }
    }
}
