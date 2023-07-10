// 1 - Pacote
package intro;

// 2 - Referencia as bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Metodos e funções
    public static void main(String[] args) {
        // Condicionais = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software
        // Utilizar a classe do java para ler a escolha do usuario no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU DE OPÇÕES");
        System.out.println("C - Calcular área a modo curto curto");
        System.out.println("e - Calcular área a modo extenso");
        System.out.println("i - If Simples");
        System.out.println("d - Contar até dez");
        System.out.println("r - Contagem regressiva de 10 a 0");
        System.out.println("Digite a opção desejada");
        String opcao = scanner.next();

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software
        // String opcao = "ifSimples";

        switch (opcao) {
            case "i":
            case "I":
                System.out.println("Você escolheu executar o metodo ifSimples");
                ifSimples();
                break;
            case "c":
            case "C":
                System.out.println("Você escolheu executar o metodo calcularAreaMetodoCurto");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu executar o metodo contarAteDez");
                contarAteDez();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu executar o contagemRegressiva");
                contegemRegressiva();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o metodo calcularAreaMetodoExtenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
                break;

        }
    }

    public static void ifSimples() {
        String modo = "exte";

        if (modo == "curto") {
            calcularAreaModoCurto();
        } else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto() {
        System.out.println("Calculo de área modo curto"); // Digitar sout para ter o codigo completo
        // Calculo de área - Exemplo: O tamanho do tapete ou do piso

        // if = se
        // else =senão

        int largura = 9;
        int comprimento = 7;
        int resultato = largura * comprimento;

        System.out.println("A área é de " + resultato);
    }

    public static void calcularAreaModoExtenso() {
        // Calculo de área - Exemplo: O tamanho do tapete ou do piso
        System.out.println("Calculo de área modo extenso");
        int largura;
        int comprimento;
        int resiltado;

        largura = 5;
        comprimento = 6;
        resiltado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área é de " + resiltado);
    }

    public static void contarAteDez() {

        // Loops ou Repetições
        // for = repetição incondicional
        System.out.println("Contagem crescente");
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);

        }
    }

    public static void contegemRegressiva() {
        System.out.println("Contagem Regressiva");

        for (int numero = 10; numero > -1; numero--) {
            System.out.println(numero);
        }
    }
}