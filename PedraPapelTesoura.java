import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha pedra, papel ou tesoura: ");
        String playerChoice = scanner.nextLine();
        String result = play(playerChoice);
        System.out.println(result);
    }

    public static String play(String playerChoice) {
        String[] choices = {"pedra", "papel", "tesoura"};
        String aiChoice = choices[new Random().nextInt(choices.length)];
        
        if (playerChoice.equals(aiChoice)) {
            return "Empate! Você escolheu: " + playerChoice + ". IA escolheu: " + aiChoice + ".";
        } else if ((playerChoice.equals("pedra") && aiChoice.equals("tesoura")) ||
                   (playerChoice.equals("papel") && aiChoice.equals("pedra")) ||
                   (playerChoice.equals("tesoura") && aiChoice.equals("papel"))) {
            return "Você ganhou! Você escolheu: " + playerChoice + ". IA escolheu: " + aiChoice + ".";
        } else {
            return "IA ganhou! Você escolheu: " + playerChoice + ". IA escolheu: " + aiChoice + ".";
        }
    }
}
