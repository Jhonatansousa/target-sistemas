package FaturamentoDistribuidora;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Faturamento {

    public static void main(String[] args) throws Exception {
        String caminhoArquivo = "faturamento.xml";
        List<FaturamentoDiario> faturamentos = lerXML(caminhoArquivo);

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double totalFaturamento = 0;
        int diasComFaturamento = 0;
        int metaSuperior = 0;

        for (FaturamentoDiario f : faturamentos) {
            if (f.valor > 0) {
                diasComFaturamento++;
                totalFaturamento += f.valor;
                if (f.valor < menorFaturamento) {
                    menorFaturamento = f.valor;
                }
                if (f.valor > maiorFaturamento) {
                    maiorFaturamento = f.valor;
                }
            }
        }
        double mediaMensal = totalFaturamento / diasComFaturamento;
        for (FaturamentoDiario f : faturamentos) {
            if (f.valor > mediaMensal) {
                metaSuperior++;
            }
        }

        System.out.printf("Menor Faturamento: %.2f\n", menorFaturamento);
        System.out.printf("Maior Faturamento: %.2f\n", maiorFaturamento);
        System.out.println("Número de dias com faturamento superior à média: " + metaSuperior);
    }

    private static List<FaturamentoDiario> lerXML(String caminhoArquivo) throws Exception {
        Path path = Paths.get(caminhoArquivo);
        String xmlConteudo = new String(Files.readAllBytes(path));


        List<FaturamentoDiario> faturamentos = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();




        return faturamentos;
    }

}

