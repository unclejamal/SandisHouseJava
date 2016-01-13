package com.pduda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class House {
    private static final List<String> DATA = Arrays.asList(
            "the horse and the hound and the horn that belonged to",
            "the farmer sowing his corn that kept",
            "the rooster that crowed in the morn that woke",
            "the priest all shaven and shorn that married",
            "the man all tattered and torn that kissed",
            "the maiden all forlorn that milked",
            "the cow with the crumpled horn that tossed",
            "the dog that worried",
            "the cat that killed",
            "the rat that ate",
            "the malt that lay in",
            "the house that Jack built"
    );

    public String recite() {
        return IntStream.rangeClosed(1, 12)
                .mapToObj(i -> line(i))
                .collect(Collectors.joining("\n"));
    }

    public String line(int number) {
        return String.format("This is %s.\n", phrase(number));
    }

    public String phrase(int number){
        return data().stream().skip(data().size() - number).collect(Collectors.joining(" "));
    }

    public List<String> data() {
        return DATA;
    }
}