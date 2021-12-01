package be.stijnvanbever.adventofcode.util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;

public class ReadFile {
    public static List<String> readLinesAsString(String fileName) {
        try {
            URI uri = ReadFile.class.getClassLoader().getResource(fileName).toURI();
            return Files.readAllLines(Path.of(uri));
        } catch (IOException | URISyntaxException e) {
            throw new IllegalStateException("error reading file", e);
        }
    }

    public static <E> E readLinesAndTransform(String fileName, Function<List<String>, E> function) {
        return function.apply(readLinesAsString(fileName));
    }
}
