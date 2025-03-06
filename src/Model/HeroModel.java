package Model;

// Classe abstrata que representa o modelo base para heróis
public abstract class HeroModel {
    // Atributos comuns a todos os heróis: nome e idade
    private String name;
    private int age;

    // Construtor com parâmetros para inicializar nome e idade
    public HeroModel(int age, String name) {
        this.name = name;
        this.age = age;
    }

    // Construtor padrão (sem parâmetros)
    public HeroModel() {
    }

    // Métodos abstratos que devem ser implementados pelas classes filhas
    public abstract void useSkill();  // Habilidade 1
    public abstract void useSkill2(); // Habilidade 2
    public abstract void useSkill3(); // Habilidade 3

    // Sobrescrita do metodo toString para exibir informações básicas do herói
    @Override
    public String toString() {
        return "Adventurer Status: " + "\n" +
                " Name: " + name + "\n" +
                " Age: " + age;
    }
}