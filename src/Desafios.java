import java.util.HashMap;

public class Desafios {

    // questão 1:
    public void Soma() {
        int indice = 13;
        int soma = 0;

        for (int k = 0; k < indice; k++) {
            soma += k;
        }
        System.out.println(soma);
        //resultado é: (soma = 78)
    }






    // Questão 2:
    public boolean Fibonacci(int num) {
        int a = 0, b = 1;
        while (b < num) {
            int c = a + b;
            a = b;
            b = c;
        }
        if (b == num) {
            System.out.println("O número: " + num + " pertence ao Fibonacci");
            return true;
        }
        System.out.println("O número: " + num + " NÃO pertence ao Fibonacci");
        return false;
    }





    //Questão 4:
    public void FaturamentoMensal() {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturado = sp + rj + mg + es + outros;

        double percentSP = (sp / totalFaturado)*100;
        double percentRJ = (rj / totalFaturado)*100;
        double percentMG = (mg / totalFaturado)*100;
        double percentES = (es / totalFaturado)*100;
        double percentOutros = (outros / totalFaturado)*100;

        System.out.printf("SP: %.2f%%\n", percentSP);
        System.out.printf("RJ: %.2f%%\n", percentRJ);
        System.out.printf("MG: %.2f%%\n", percentMG);
        System.out.printf("ES: %.2f%%\n", percentES);
        System.out.printf("Outros: %.2f%%\n", percentOutros);
    }




    // questão 5:

    public void inverteString(String text){
        System.out.println("normal: " + text);
        StringBuilder resultado = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            resultado.append(text.charAt(i));
        }
        System.out.println("Invertido: " +resultado);

        /*ou o metodo do stringbuilder reverse()
        StringBuilder text2 = new StringBuilder();
        System.out.println(text2.reverse());
        */

    }


}
