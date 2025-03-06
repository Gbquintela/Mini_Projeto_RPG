package View;

import Controller.HeroController;
import Model.ArcherModel;
import Model.HeroModel;

import java.util.Scanner;

// Classe responsável por exibir e gerenciar a interface relacionada ao arqueiro
public class ArcherView {

    // Scanner para entrada de dados do usuário
    Scanner scanner = new Scanner(System.in);

    // Metodo para coletar e definir o status do arqueiro
    public void archerStatus(HeroController controller) {
        System.out.println("Hello brave archer! Introduce yourself to this adventure!\n");
        System.out.println("Archer name: ");
        String name = scanner.nextLine(); // Lê o nome do arqueiro

        System.out.println("Archer age: ");
        int age = scanner.nextInt(); // Lê a idade do arqueiro
        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.println("The dexterity of the archer: ");
        double dexterity = scanner.nextDouble(); // Lê a destreza do arqueiro

        // Adiciona um novo arqueiro ao controlador
        controller.setArcherModel(new ArcherModel(age, name, dexterity));
    }

    // Metodo para exibir e gerenciar as habilidades do arqueiro
    public void archerSkills() {
        MenuSkillsView menuSkillsView = new MenuSkillsView(); // View para o menu de habilidades
        ArcherModel archerModel = new ArcherModel(); // Instância do modelo de arqueiro
        boolean exit = false;

        // Loop para exibir o menu de habilidades
        while (!exit) {
            menuSkillsView.archerSkills(); // Exibe o menu de habilidades do arqueiro
            int option = scanner.nextInt(); // Lê a opção do usuário

            switch (option) {
                case 1:
                    archerModel.useSkill(); // Executa a primeira habilidade
                    break;

                case 2:
                    archerModel.useSkill2(); // Executa a segunda habilidade
                    break;

                case 3:
                    archerModel.useSkill3(); // Executa a terceira habilidade
                    break;

                case 4:
                    exit = true; // Sai do loop e retorna ao menu principal
                    System.out.println("Returning to main menu");
                    break;

                case 5:
                    System.out.println("Leaving..."); // Sai do programa
                    exit = true;
                    break;

                default:
                    break; // Opção inválida
            }
        }
    }

    // Metodo para exibir todos os arqueiros cadastrados
    public void showArcher(HeroController controller) {
        // Itera sobre a lista de heróis no controlador
        for (HeroModel heroModel : controller.getHeroModelList()) {
            // Verifica se o herói é uma instância de ArcherModel
            if (heroModel instanceof ArcherModel) {
                System.out.println(heroModel); // Exibe as informações do arqueiro
            }
        }
    }
}