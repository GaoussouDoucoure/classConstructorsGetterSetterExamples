public class Book {
    private String title = "hello";
    private String author;
    private int copies;

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getCopies(){
        return  copies;
    }

    public void setString(String title, String author, int copies){
        this.title = title;
        this.author = author;
        this.copies = copies;
    }


    Book(){
        title = "Habits";
        author = "Duke";
        copies = 10;
    }

    Book(String titre, String auteur, int nombres){
        title = titre;
        author = auteur;
        copies = nombres;
    }

    public void show(){
        System.out.printf("""
                    Title is: %s
                    Author is: %s
                    Copies are: %d
                    """, title,author,copies);
    }

}