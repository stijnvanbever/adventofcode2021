package be.stijnvanbever.adventofcode.day1;

import be.stijnvanbever.adventofcode.Day;
import be.stijnvanbever.adventofcode.util.ReadFile;

import java.util.List;
import java.util.stream.Collectors;

public class Day1 extends Day {

     public String resultPart1() {
        List<Integer> depths = ReadFile.readLinesAndTransform("day1.txt", list -> list.stream().map(Integer::valueOf).collect(Collectors.toUnmodifiableList()));
        DepthIncreases depthIncreases = new DepthIncreases();
        return depthIncreases.countDepthIncreases(depths).toString();
    }

    public String resultPart2() {
        List<Integer> depths = ReadFile.readLinesAndTransform("day1.txt", list -> list.stream().map(Integer::valueOf).collect(Collectors.toUnmodifiableList()));
        DepthIncreases depthIncreases = new DepthIncreases();
        return depthIncreases.countWithSlidingWindows(depths).toString();
    }
}
