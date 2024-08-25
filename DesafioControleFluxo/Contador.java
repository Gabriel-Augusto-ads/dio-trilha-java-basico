package DesafioControleFluxo;
import java.util.Scanner; // Importa a classe Scanner


public class Contador {
    
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Solicita o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        // Solicita o segundo parâmetro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        terminal.close(); // Fechar o objeto Scanner
        
        try {
            //chamando o método contendo a lógica de contagem                         
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage()); //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }

    }

    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o primeiro parâmetro é maior que o segundo e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Realizar a contagem e impressão dos números incrementados
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);  // Imprimir o número atual
        }

    }
    
}
