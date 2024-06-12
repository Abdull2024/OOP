//Coder name: Abdullah Fouzi Naji
//ID: 22012364

class Review {
    private String text;
    private String reviewer;

    public Review(String text, String reviewer) {
        this.text = text;
        this.reviewer = reviewer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String toString() {
        return reviewer + ": " + text;
    }
}
