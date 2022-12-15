package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("This is example of text to change", (text) -> text.toUpperCase());
        poemBeautifier.beautify("This is example of text to change", (text) -> "ABC " + text + " ABC");
        poemBeautifier.beautify("This is example of text to change", (text) -> text.toLowerCase());
        poemBeautifier.beautify("This is example of text to change", (text) -> "Hello" + "\n" + text + "\n" +"Bye");
    }
}