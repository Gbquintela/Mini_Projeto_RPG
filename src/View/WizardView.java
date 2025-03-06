package View;

import Controller.HeroController;
import Model.HeroModel;
import Model.WizardModel;

import java.util.Scanner;

// Classe responsável por exibir e gerenciar a interface relacionada ao mago
public class WizardView {

    // Scanner para entrada de dados do usuário
    Scanner scanner = new Scanner(System.in);

    // Metodo para coletar e definir o status do mago
    public void wizardStatus(HeroController controller) {
        System.out.println("Hello brave wizard! Introduce yourself for this adventure!\n");
        System.out.println("Wizard name: ");
        String name = scanner.nextLine(); // Lê o nome do mago

        System.out.println("Wizard age: ");
        int age = scanner.nextInt(); // Lê a idade do mago
        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.println("The Wizard intelligence: ");
        double intelligence = scanner.nextDouble(); // Lê a inteligência do mago

        // Adiciona um novo mago ao controlador
        controller.setWizardModel(new WizardModel(age, name, intelligence));
    }

    // Metodo para exibir e gerenciar as habilidades do mago
    public void wizardSkills() {
        MenuSkillsView menuskills = new MenuSkillsView(); // View para o menu de habilidades
        WizardModel wizardModel = new WizardModel(); // Instância do modelo de mago
        boolean exit = false;

        // Loop para exibir o menu de habilidades
        while (!exit) {
            menuskills.wizardSkills(); // Exibe o menu de habilidades do mago
            int optionWizard = scanner.nextInt(); // Lê a opção do usuário

            switch (optionWizard) {
                case 1:
                    wizardModel.useSkill(); // Executa a primeira habilidade
                    break;

                case 2:
                    wizardModel.useSkill2(); // Executa a segunda habilidade
                    break;

                case 3:
                    wizardModel.useSkill3(); // Executa a terceira habilidade
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

    // Metodo para exibir todos os magos cadastrados
    public void showWizard(HeroController controller) {
        // Itera sobre a lista de heróis no controlador
        for (HeroModel heroModel : controller.getHeroModelList()) {
            // Verifica se o herói é uma instância de WizardModel
            if (heroModel instanceof WizardModel) {
                System.out.println(heroModel); // Exibe as informações do mago
            }
        }
    }
}