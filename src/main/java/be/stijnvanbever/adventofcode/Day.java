package be.stijnvanbever.adventofcode;

public abstract class Day {
    public void doDay() {
        System.out.printf("Part 1 - %s%n", resultPart1());
        System.out.printf("Part 2 - %s%n", resultPart2());
    }

    protected abstract String resultPart1();

    protected abstract String resultPart2();
}
