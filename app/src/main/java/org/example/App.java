package org.example;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class App {
  public static void main(String[] args) {
    System.out.println(
        (new DateTimeFormatterBuilder()).append(
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssz"))
            .toFormatter()
            .parse("2018-01-02T03:04:05+01:00")
            .toString());
  }
}
