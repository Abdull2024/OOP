//Coder name: Abdullah Fouzi Naji
//Coder ID: 22012364


public class Review {
    private String text;
    private String reviewer;

    public Review(String text, String reviewer) {
        this.text = text;
        this.reviewer = reviewer;
    }

    public String getText() {
        return text;
    }

    public String getReviewer() {
        return reviewer;
    }

    @Override
    public String toString() {
        return reviewer + ": " + text;
    }
}
