package model;

public class RavenclawStudent extends HogwartsStudent {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creative;

    public RavenclawStudent(String name,
                            int magicalPower,
                            int transgressionDistance,
                            int intelligence,
                            int wisdom,
                            int wit,
                            int creative) {
        super(name, magicalPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public void printRavenclawDifferenceProperties(RavenclawStudent student) {
        if (this.getSumProperties() > student.getSumProperties()) {
            System.out.printf("%s лучше как Когтевранец, чем %s%n", this.getName(), student.getName());
        } else if (student.getSumProperties() > this.getSumProperties()) {
            System.out.printf("%s хуже как Когтевранец, чем %s%n", this.getName(), student.getName());
        } else {
            System.out.printf("%s и %s хороши как Когтевранцы в равной степени", this.getName(), student.getName());
        }
    }

    protected int getSumProperties() {
        return this.intelligence + this.wisdom + this.wit + this.creative;
    }

    @Override
    public String toString() {
        return "Студент Когтеврана " +
                "(Имя: " + getName() +
                "; Магическая мощь: " + getMagicalPower() +
                "; Дальность трансгрессии: " + getTransgressionDistance() +
                "; Интеллект: " + intelligence +
                "; Мудрость: " + wisdom +
                "; Остроумие: " + wit +
                "; Креативность: " + creative + ')';
    }
}
