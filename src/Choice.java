public class Choice {
    private String text;
    private Chapter nextChapter;

    public Choice(String text, Chapter nextChapter) {
        this.text = text;
        this.nextChapter = nextChapter;
    }

    public String getText() {
        return this.text;
    }

    public Chapter getChapter() {
        return this.nextChapter;
    }
}
