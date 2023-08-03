public class Book {
    private String title;
    private String author;
    private Integer copies;
    private Integer borrowedCopies;

    public void borrowCopiesMoreOne(){
        borrowedCopies ++;
        copies --;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Integer getBorrowedCopies() {
        return borrowedCopies;
    }

    public void setBorrowedCopies(Integer borrowedCopies) {
        this.borrowedCopies = borrowedCopies;
    }
    public Book(String title, String author, Integer copies, Integer borrowedCopies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
        this.borrowedCopies = borrowedCopies;
    }
    public Book() {
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", copies=" + copies +
                ", borrowedCopies=" + borrowedCopies +
                '}';
    }
}
