package model;

public class HufflepuffStudent extends HogwartsStudent {
    private int hardworking;
    private int loyalty;
    private int honest;

    public HufflepuffStudent(String name,
                             int magicalPower,
                             int transgressionDistance,
                             int hardworking,
                             int loyalty,
                             int honest) {
        super(name, magicalPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public void printHufflepuffDifferenceProperties(HufflepuffStudent student) {
        if (this.getSumProperties() > student.getSumProperties()) {
            System.out.printf("%s лучше как Пуффендуец, чем %s%n", this.getName(), student.getName());
        } else if (student.getSumProperties() > this.getSumProperties()) {
            System.out.printf("%s хуже как Пуффендуец, чем %s%n", this.getName(), student.getName());
        } else {
            System.out.printf("%s и %s хороши как Пуффендуецы в равной степени", this.getName(), student.getName());
        }
    }

    protected int getSumProperties() {
        return this.hardworking + this.loyalty + this.honest;
    }

    @Override
    public String toString() {
        return "Студент Пуффендуя " +
                "(Имя: " + getName() +
                "; Магическая мощь: " + getMagicalPower() +
                "; Дальность трансгрессии: " + getTransgressionDistance() +
                "; Трудолюбие: " + hardworking +
                "; Верность: " + loyalty +
                "; Честность: " + honest + ')';
    }
}

