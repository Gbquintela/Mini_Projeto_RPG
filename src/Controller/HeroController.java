package Controller;

import Model.*;
import Model.WarriorsModel;

import java.util.List;

// Controlador responsável por gerenciar a lista de heróis (HeroModel)
public class HeroController {

    // Lista de heróis
    private List<HeroModel> heroModelList;

    // Retorna a lista de heróis
    public List<HeroModel> getHeroModelList() {
        return heroModelList;
    }

    // Construtor que inicializa a lista de heróis
    public HeroController(List<HeroModel> heroModelList) {
        this.heroModelList = heroModelList;
    }

    // Adiciona um guerreiro (WarriorsModel) à lista de heróis
    public void setWarriosModel(WarriorsModel warriosModel) {
        heroModelList.add(warriosModel);
    }

    // Adiciona um arqueiro (ArcherModel) à lista de heróis
    public void setArcherModel(ArcherModel archerModel) {
        this.heroModelList.add(archerModel);
    }

    // Adiciona um mago (WizardModel) à lista de heróis
    public void setWizardModel(WizardModel wizardModel) {
        this.heroModelList.add(wizardModel);
    }
}