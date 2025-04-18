package org.abhishekjha.structural.bridge.moviePrinter.formatter;

import org.abhishekjha.structural.bridge.moviePrinter.Detail;

import java.util.List;

public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header).append("\n");
        for (Detail detail : details) {
            builder.append(detail.getLabel()).append(": ").append(detail.getValue()).append("\n");
        }
        return builder.toString();
    }
}
