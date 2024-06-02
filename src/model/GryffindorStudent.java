package model;

public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name,
                             int magicalPower,
                             int transgressionDistance,
                             int nobility,
                             int honor,
                             int bravery) {
        super(name, magicalPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void printGryffindorDifferenceProperties(GryffindorStudent student) {
        if (this.getSumProperties() > student.getSumProperties()) {
            System.out.printf("%s лучше как Гриффиндорец, чем %s%n", this.getName(), student.getName());
        } else if (student.getSumProperties() > this.getSumProperties()) {
            System.out.printf("%s хуже как Гриффиндорец, чем %s%n", this.getName(), student.getName());
        } else {
            System.out.printf("%s и %s хороши как Гриффиндорцы в равной степени", this.getName(), student.getName());
        }
    }

    protected int getSumProperties() {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    public String toString() {
        return "Студент Гриффиндора " +
                "(Имя: " + getName() +
                "; Магическая мощь: " + getMagicalPower() +
                "; Дальность трансгрессии: " + getTransgressionDistance() +
                "; Благородство: " + nobility +
                "; Честь: " + honor +
                "; Храбрость: " + bravery + ')';
    }
}
