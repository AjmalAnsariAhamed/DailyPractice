package com.Threads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        Files.walk( Paths.get(".")).forEach(System.out::println);

        Files.lines(Paths.get("src/com/Threads/OnePiece.txt")).forEach(System.out::println);
        Files.write(Paths.get("src/com/Threads/OnePiece.txt"), List.of("hello","this","is","onePiece"), StandardCharsets.UTF_8, StandardOpenOption.APPEND);

    }
}
