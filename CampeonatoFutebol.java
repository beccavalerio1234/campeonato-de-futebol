package Aulas;

import java.util.Scanner;

public class CampeonatoFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalJogadores = 5 * 11; // 5 times com 11 jogadores cada
        
        int jogadoresMenores18 = 0;
        double somaIdades = 0;
        double somaAlturas = 0;
        int jogadoresMais80Kg = 0;
        
        for (int i = 1; i <= totalJogadores; i++) {
            System.out.println("Informe a idade do jogador " + i + ":");
            int idade = scanner.nextInt();
            System.out.println("Informe o peso do jogador " + i + ":");
            double peso = scanner.nextDouble();
            System.out.println("Informe a altura do jogador " + i + ":");
            double altura = scanner.nextDouble();
            
            if (idade < 18) {
                jogadoresMenores18++;
            }
            
            somaIdades += idade;
            somaAlturas += altura;
            
            if (peso > 80) {
                jogadoresMais80Kg++;
            }
        }
        
        double mediaIdades = somaIdades / totalJogadores;
        double mediaAlturas = somaAlturas / totalJogadores;
        double porcentagemMais80Kg = (double) jogadoresMais80Kg / totalJogadores * 100;
        
        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenores18);
        System.out.println("Média das idades dos jogadores de cada time: " + mediaIdades);
        System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAlturas);
        System.out.println("Porcentagem de jogadores com mais de 80 kg: " + porcentagemMais80Kg + "%");
        
        scanner.close();
    }
}