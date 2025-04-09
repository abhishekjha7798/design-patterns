package org.abhishekjha.structural.bridge.moviePrinter;

import org.abhishekjha.structural.bridge.moviePrinter.formatter.Formatter;
import org.abhishekjha.structural.bridge.moviePrinter.formatter.HtmlFormatter;
import org.abhishekjha.structural.bridge.moviePrinter.formatter.PrintFormatter;
import org.abhishekjha.structural.bridge.moviePrinter.printer.MoviePrinter;
import org.abhishekjha.structural.bridge.moviePrinter.printer.Printer;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printResult = moviePrinter.print(printFormatter);
        System.out.println(printResult);

        Formatter htmlFormatter = new HtmlFormatter();
        String htmlResult = moviePrinter.print(htmlFormatter);
        System.out.println(htmlResult);
    }
}
