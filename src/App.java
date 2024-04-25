import interfaces.OptionsType;
import utils.BetterInput;

public class App {
    public static void main(String[] args) throws Exception {
        Double salarioPretendido = (Double) BetterInput.input("Digite o seu salario pretendido: ", OptionsType.Double);
        analisarCandidato(salarioPretendido);
    }

    static void analisarCandidato(Double salarioPretendido) {
        final Double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("AGENDAR CANDIDATO");
        } else {
            System.out.println("ANALISAR OUTROS CANDIDATOS");
        }
    }
}
