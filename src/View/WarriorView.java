package View;

import Controller.HeroController;
import Model.HeroModel;
import Model.WarriorsModel;

import java.util.Scanner;

// Classe responsável por exibir e gerenciar a interface relacionada ao guerreiro
public class WarriorView {

    // Scanner para entrada de dados do usuário
    Scanner scanner = new Scanner(System.in);

    // Metodo para coletar e definir o status do guerreiro
    public void warriorStatus(HeroController controller) {
        System.out.println("Hello brave warrior! Introduce yourself to this adventure!\n");
        System.out.println("Warrior name: ");
        String name = scanner.nextLine(); // Lê o nome do guerreiro

        System.out.println("Warrior age: ");
        int age = scanner.nextInt(); // Lê a idade do guerreiro
        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.println("The strength of the warrior: ");
        double strength = scanner.nextDouble(); // Lê a força do guerreiro

        // Adiciona um novo guerreiro ao controlador
        controller.setWarriosModel(new WarriorsModel(age, name, strength));
    }

    // Metodo para exibir e gerenciar as habilidades do guerreiro
    public void warriorSkills() {
        MenuSkillsView menuSkillsView = new MenuSkillsView(); // View para o menu de habilidades
        WarriorsModel warriorsMode = new WarriorsModel(); // Instância do modelo de guerreiro
        boolean exit = false;

        // Loop para exibir o menu de habilidades
        while (!exit) {
            menuSkillsView.warriorSkills(); // Exibe o menu de habilidades do guerreiro
            int option = scanner.nextInt(); // Lê a opção do usuário

            switch (option) {
                case 1:
                    warriorsMode.useSkill(); // Executa a primeira habilidade
                    break;

                case 2:
                    warriorsMode.useSkill2(); // Executa a segunda habilidade
                    break;

                case 3:
                    warriorsMode.useSkill3(); // Executa a terceira habilidade
                    break;

                case 4:
                    exit = true; // Sai do loop e retorna ao menu principal
                    System.out.println("Returning to main menu");
                    break;

                case 5:
                    System.out.println("Leaving..."); // Sai do programa
                    break;

                default:
                    break; // Opção inválida
            }
        }
    }

    // Metodo para exibir todos os guerreiros cadastrados
    public void showWarrior(HeroController controller) {
        // Itera sobre a lista de heróis no controlador
        for (HeroModel heroModel : controller.getHeroModelList()) {
            // Verifica se o herói é uma instância de WarriorsModel
            if (heroModel instanceof WarriorsModel) {
                System.out.println(heroModel); // Exibe as informações do guerreiro
            }
        }
    }
}