package be.stijnvanbever.adventofcode.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ReadFileTest {

    @Test
    void readLinesAsString() {
        List<String> lines = ReadFile.readLinesAsString("testfile.txt");
        assertThat(lines).containsExactly("line1", "line2", "line3");
    }
}