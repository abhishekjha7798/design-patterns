package org.abhishekjha.structural.bridge.moviePrinter.formatter;

import org.abhishekjha.structural.bridge.moviePrinter.Detail;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
