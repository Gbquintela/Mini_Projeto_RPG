package Model;

// Classe que representa o modelo de um mago, herdando de HeroModel
public class WizardModel extends HeroModel {
    // Atributo específico do mago: inteligência
    private double intelligence;

    // Construtor com parâmetros para idade, nome e inteligência
    public WizardModel(int age, String name, double intelligence) {
        super(age, name); // Chama o construtor da classe pai (HeroModel)
        this.intelligence = intelligence; // Inicializa a inteligência
    }

    // Construtor padrão (sem parâmetros)
    public WizardModel() {
    }

    // Implementação do metodo useSkill da classe HeroModel
    @Override
    public void useSkill() {
        System.out.println("Fireball Skill!!");
        System.out.println("Critical damage! 100 damage!\n");
    }

    // Implementação do metodo useSkill2 da classe HeroModel
    @Override
    public void useSkill2() {
        System.out.println("Freezing Ray Skill!!");
        System.out.println("Critical damage! 100 damage!\n");
    }

    // Implementação do metodo useSkill3 da classe HeroModel
    @Override
    public void useSkill3() {
        System.out.println("Healing Skill");
        System.out.println("Critical healing! More 100 HP!!\n");
    }

    // Sobrescrita do metodo toString para exibir informações do mago
    @Override
    public String toString() {
        StringBuilder skillsDescription = new StringBuilder();
        skillsDescription.append("Skills:\n");

        // Adiciona descrições das habilidades ao StringBuilder
        skillsDescription.append(" - Fireball Skill!!\n");
        skillsDescription.append("   Damage: 100 \n");

        skillsDescription.append(" - Freezing Ray Skill!!\n");
        skillsDescription.append("   Damage: 100 \n");

        skillsDescription.append(" - Healing Skill\n");
        skillsDescription.append("   Healing: 100 HP \n");

        // Retorna a representação em string do mago, incluindo inteligência e habilidades
        return super.toString() +
                " Intelligence: " + intelligence + "\n" +
                skillsDescription.toString();
    }
}