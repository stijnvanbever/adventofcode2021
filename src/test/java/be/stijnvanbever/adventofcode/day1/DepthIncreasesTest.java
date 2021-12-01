package be.stijnvanbever.adventofcode.day1;

import be.stijnvanbever.adventofcode.util.ReadFile;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class DepthIncreasesTest {

    @Test
    void testPart1() {
        DepthIncreases depthIncreases = new DepthIncreases();

        int result = depthIncreases.countDepthIncreases(ReadFile.readLinesAndTransform("day1-example.txt", list -> list.stream().map(Integer::valueOf).collect(Collectors.toUnmodifiableList())));

        assertThat(result).isEqualTo(7);
    }

    @Test
    void testPart2() {
        DepthIncreases depthIncreases = new DepthIncreases();

        int result = depthIncreases.countWithSlidingWindows(ReadFile.readLinesAndTransform("day1-example.txt", list -> list.stream().map(Integer::valueOf).collect(Collectors.toUnmodifiableList())));

        assertThat(result).isEqualTo(5);
    }
}