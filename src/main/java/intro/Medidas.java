// 1 - Pacote
package intro;

// 2 - Referencia as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Metodos e funções
    public static void main(String[] args) {
    calcularAreaModoCurto();
    calcularAreaModoExtenso();
    }

    public static void calcularAreaModoCurto(){
        System.out.println("Calculo de área modo curto"); // Digitar sout para ter o codigo completo

        // Calculo de área - Exemplo: O tamanho do tapete ou do piso

        int largura = 7;
        int comprimento = 8;
        int resultato = largura * comprimento;

        System.out.println("A área é de " + resultato);
    }

    public static void calcularAreaModoExtenso(){
        // Calculo de área - Exemplo: O tamanho do tapete ou do piso
        System.out.println("Calculo de área modo extenso");
        int largura;
        int comprimento;
        int resiltado;

        largura = 5;
        comprimento = 6;
        resiltado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +"m a área é de " + resiltado);
    }
}
