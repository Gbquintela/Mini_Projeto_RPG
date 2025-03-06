package Model;

// Classe que representa o modelo de um arqueiro, herdando de HeroModel
public class ArcherModel extends HeroModel {
    // Atributo específico do arqueiro: destreza
    private double dexterity;

    // Construtor padrão
    public ArcherModel() {
    }

    // Construtor com parâmetros para idade, nome e destreza
    public ArcherModel(int age, String name, double dexterity) {
        super(age, name); // Chama o construtor da classe pai (HeroModel)
        this.dexterity = dexterity; // Inicializa a destreza
    }

    // Implementação do metodo useSkill da classe HeroModel
    @Override
    public void useSkill() {
        System.out.println("Precise Shot Skill!!");
        System.out.println("Critical damage! 100 damage!\n");
    }

    // Implementação do metodo useSkill2 da classe HeroModel
    @Override
    public void useSkill2() {
        System.out.println("Arrow Rain Skill");
        System.out.println("Critical damage! 100 damage!\n");
    }

    // Implementação do metodo useSkill3 da classe HeroModel
    @Override
    public void useSkill3() {
        System.out.println("Poison Arrow Skill");
        System.out.println("Critical damage! 100 damage!\n");
    }

    // Sobrescrita do metodo toString para exibir informações do arqueiro
    @Override
    public String toString() {
        StringBuilder skillsDescription = new StringBuilder();
        skillsDescription.append("Skills:\n");

        // Adiciona descrições das habilidades ao StringBuilder
        skillsDescription.append(" - Precise Shot Skill!!\n");
        skillsDescription.append("   Damage: 100 \n");

        skillsDescription.append(" - Arrow Rain Skill\n");
        skillsDescription.append("   Damage: 100 \n");

        skillsDescription.append(" - Poison Arrow Skill\n");
        skillsDescription.append("   Damage: 100 \n");

        // Retorna a representação em string do arqueiro, incluindo destreza e habilidades
        return super.toString() +
                " dexterity: " + dexterity + "\n" +
                skillsDescription.toString();
    }
}