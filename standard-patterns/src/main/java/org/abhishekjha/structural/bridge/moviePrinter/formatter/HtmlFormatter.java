package org.abhishekjha.structural.bridge.moviePrinter.formatter;

import org.abhishekjha.structural.bridge.moviePrinter.Detail;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("<th>").append("Classification").append("</th>");
        builder.append("<th>").append(header).append("</th>");

        for (Detail detail : details) {
            builder.append("<tr>");
            builder.append("<td>").append(detail.getLabel()).append("</td>");
            builder.append("<td>").append(detail.getValue()).append("</td>");
            builder.append("</tr>");
        }
        builder.append("</table>");
        return builder.toString();
    }
}
