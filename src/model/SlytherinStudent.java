package model;

public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerHungry;

    public SlytherinStudent(String name,
                            int magicalPower,
                            int transgressionDistance,
                            int cunning,
                            int determination,
                            int ambition,
                            int resourcefulness,
                            int powerHungry) {
        super(name, magicalPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerHungry = powerHungry;
    }

    public void printSlytherinDifferenceProperties(SlytherinStudent student) {
        if (this.getSumProperties() > student.getSumProperties()) {
            System.out.printf("%s лучше как Слизеринец, чем %s%n", this.getName(), student.getName());
        } else if (student.getSumProperties() > this.getSumProperties()) {
            System.out.printf("%s хуже как Слизеринец, чем %s%n", this.getName(), student.getName());
        } else {
            System.out.printf("%s и %s хороши как Слизеринцы в равной степени", this.getName(), student.getName());
        }
    }

    protected int getSumProperties() {
        return this.cunning + this.determination + this.ambition + this.resourcefulness + this.powerHungry;
    }

    @Override
    public String toString() {
        return "Студент Слизерина " +
                "(Имя: " + getName() +
                "; Магическая мощь: " + getMagicalPower() +
                "; Дальность трансгрессии: " + getTransgressionDistance() +
                "; Хитрость: " + cunning +
                "; Решительность: " + determination +
                "; Амбициозность: " + ambition +
                "; Находчивость: " + resourcefulness +
                "; Жажда власти: " + powerHungry + ')';
    }
}
