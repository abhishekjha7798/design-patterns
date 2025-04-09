package org.abhishekjha.structural.bridge.moviePrinter.printer;

import org.abhishekjha.structural.bridge.moviePrinter.Detail;
import org.abhishekjha.structural.bridge.moviePrinter.formatter.Formatter;

import java.util.List;

public abstract class Printer {
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();
}
