import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        /* DESAFIO 2 */
        String [] candidatos = {"A", "B","C", "D", "E", "F", "G"};
        Integer candidatosSelecionados = 0;
        for (String candidato : candidatos) {
            if (analisarCandidato(salarioPretendido())) {
                System.out.println("Candidato : " + candidato + " Selecionado");
                candidatosSelecionados++;
                if (candidatosSelecionados > 4) {
                    break;
                }
            }
        }

    }

    public static Double salarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static Boolean analisarCandidato(Double salarioPretendido) {
        final Double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
            return true;
        } else if (salarioBase == salarioPretendido) {
            System.out.println("AGENDAR CANDIDATO");
            return true;
        } else {
            System.out.println("ANALISAR OUTROS CANDIDATOS");
            return false;
        }
    }
}
