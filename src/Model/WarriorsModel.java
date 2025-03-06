package Model;

// Classe que representa o modelo de um guerreiro, herdando de HeroModel
public class WarriorsModel extends HeroModel {
    // Atributo específico do guerreiro: força
    private double strength;

    // Construtor com parâmetros para idade, nome e força
    public WarriorsModel(int age, String name, double strength) {
        super(age, name); // Chama o construtor da classe pai (HeroModel)
        this.strength = strength; // Inicializa a força
    }

    // Construtor padrão (sem parâmetros)
    public WarriorsModel() {
    }

    // Implementação do metodo useSkill da classe HeroModel
    @Override
    public void useSkill() {
        System.out.println("Slashing Strike Skill!!");
        System.out.println("Critical damage! 100 damage!\n");
    }

    // Implementação do metodo useSkill2 da classe HeroModel
    @Override
    public void useSkill2() {
        System.out.println("Powerful Attack Skill!!");
        System.out.println("Critical damage! 100 damage!\n");
    }

    // Implementação do metodo useSkill3 da classe HeroModel
    @Override
    public void useSkill3() {
        System.out.println("Impenetrable Shield Skill");
        System.out.println("Critical damage! 100 damage!\n");
    }

    // Sobrescrita do metodo toString para exibir informações do guerreiro
    @Override
    public String toString() {
        StringBuilder skillsDescription = new StringBuilder();
        skillsDescription.append("Skills:\n");

        // Adiciona descrições das habilidades ao StringBuilder
        skillsDescription.append(" - Slashing Strike Skill!!\n");
        skillsDescription.append("   Damage: 100 \n");

        skillsDescription.append(" - Powerful Attack Skill!!\n");
        skillsDescription.append("   Damage: 100 \n");

        skillsDescription.append(" - Impenetrable Shield Skill\n");
        skillsDescription.append("   Damage: 100 \n");

        // Retorna a representação em string do guerreiro, incluindo força e habilidades
        return super.toString() +
                " Strength: " + strength + "\n" +
                skillsDescription.toString();
    }
}