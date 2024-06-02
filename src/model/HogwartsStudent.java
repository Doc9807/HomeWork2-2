package model;

import java.util.Objects;

public class HogwartsStudent {
    private final String name;
    private final int magicalPower;
    private final int transgressionDistance;

    public HogwartsStudent(String name, int magicalPower, int transgressionDistance) {
        this.name = name;
        this.magicalPower = magicalPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicalPower() {
        return magicalPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printPowerDifference(HogwartsStudent student) {
        if (this.getSumPower() > student.getSumPower()) {
            System.out.printf("%s более сильный маг, чем %s%n", this.getName(), student.getName());
        } else if (student.getSumPower() > this.getSumPower()) {
            System.out.printf("%s слабее магически, чем %s%n", this.getName(), student.getName());
        } else {
            System.out.printf("%s и %s обладают равной магической мощью", this.getName(), student.getName());
        }
    }

    protected int getSumPower() {
        return this.magicalPower + this.transgressionDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HogwartsStudent that = (HogwartsStudent) o;
        return magicalPower == that.magicalPower && transgressionDistance == that.transgressionDistance && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magicalPower, transgressionDistance);
    }
}


