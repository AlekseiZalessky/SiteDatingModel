package by.custom.site.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class JsonUtil {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static <T> List<T> readList(Path path, Class<T> clazz) {
        try {
            if (Files.notExists(path)) return new ArrayList<>();
            return MAPPER.readValue(path.toFile(),
                    MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении JSON: " + path, e);
        }
    }

    public static <T> void writeCollection(Path path, Collection<T> data) {
        try {
            Files.createDirectories(path.getParent());
            MAPPER.writerWithDefaultPrettyPrinter().writeValue(path.toFile(), data);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при записи JSON: " + path, e);
        }
    }
}
