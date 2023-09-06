package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder builder = new StringBuilder();

        int i = 0;
        while (i < chars.length) {
            builder.append(chars[i]);
            i++;
        }

        String phrase = builder.toString();
        System.out.print(phrase);
    }
}
