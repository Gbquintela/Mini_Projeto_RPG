package Controller;

import Model.HeroModel;
import View.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Controlador principal que gerencia o menu e as interações do usuário
public class MainMenuController {

    // Lista de heróis
    List<HeroModel> heroModelList = new ArrayList<>();

    // Controlador de heróis
    HeroController heroController = new HeroController(heroModelList);

    // Views para exibir informações de arqueiro, guerreiro e mago
    ArcherView archerView = new ArcherView();
    WarriorView warriorView = new WarriorView();
    WizardView wizardView = new WizardView();

    // View para exibir o menu de habilidades
    MenuSkillsView menuSkillsView = new MenuSkillsView();

    // Menu principal de heróis
    HeroMenu heroMenu = new HeroMenu();

    // Scanner para entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Metodo principal que exibe e gerencia o menu
    public void mainMenu() {
        boolean exitmenu =true;

        // Loop principal do menu
        while (exitmenu) {
            heroMenu.heroMenu(); // Exibe o menu de heróis
            int option = scanner.nextInt(); // Lê a opção do usuário

            switch (option) {
                case 1:
                    boolean exitCreateAdventurer = true;
                    while (exitCreateAdventurer){
                        heroMenu.heroCreateMenu();
                        int optionAdventurer = scanner.nextInt();
                        switch (optionAdventurer){
                            case 1:

                                archerView.archerStatus(heroController); // Exibe status do arqueiro
                                break;

                            case 2:

                                warriorView.warriorStatus(heroController); // Exibe status do guerreiro
                                break;

                            case 3:
                                wizardView.wizardStatus(heroController); // Exibe status do mago
                                break;

                            case 4:
                                    exitCreateAdventurer = false; //sai do menu de criação de personagem
                                    break;

                            case 5:
                                exitCreateAdventurer = false;
                                exitmenu = false;


                        }
                    }
                            break;

                case 2:
                    boolean exitMenuSkills = false;

                    // Loop do menu de habilidades
                    while (!exitMenuSkills) {
                        heroMenu.heroSkillMenu(); // Exibe o menu de habilidades
                        int optionMenu = scanner.nextInt(); // Lê a opção do usuário

                        switch (optionMenu) {
                            case 1:
                                scanner.nextLine();
                                archerView.archerSkills(); // Exibe habilidades do arqueiro
                                break;

                            case 2:
                                scanner.nextLine();
                                warriorView.warriorSkills(); // Exibe habilidades do guerreiro
                                break;

                            case 3:
                                scanner.nextLine();
                                wizardView.wizardSkills(); // Exibe habilidades do mago
                                break;

                            case 4:
                                scanner.nextLine();
                                System.out.println("Returning to main menu"); // Retorna ao menu principal
                                exitMenuSkills = true;
                                break;

                            case 5:
                                scanner.nextLine();
                                exitMenuSkills = true;
                                exitmenu = false; // Sai do programa
                                break;

                            default:
                                break;
                        }
                    }
                    break;

                case 3:
                    boolean exitStatus = false;

                    // Loop do menu de status
                    while (!exitStatus) {
                        heroMenu.heroStatus(); // Exibe o menu de status
                        int optinStatus = scanner.nextInt(); // Lê a opção do usuário

                        switch (optinStatus) {
                            case 1:
                                archerView.showArcher(heroController); // Exibe status do arqueiro
                                break;

                            case 2:
                                scanner.nextLine();
                                warriorView.showWarrior(heroController); // Exibe status do guerreiro
                                break;

                            case 3:
                                scanner.nextLine();
                                wizardView.showWizard(heroController); // Exibe status do mago
                                break;

                            case 4:
                                exitStatus = true;
                                System.out.println("Returning to main menu"); // Retorna ao menu principal
                                break;

                            case 5:
                                System.out.println("Leaving..."); // Sai do programa
                                exitStatus = true;
                                exitmenu = true;
                                break;
                        }
                    }
                    break;

                case 4:
                    exitmenu = true;
                    System.out.println("Leaving..."); // Sai do programa
                    break;

                default:
                    break; // Opção inválida
            }
        }
    }
}