import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"RS Aggarwal",257));
        books.add(new Book(2,"RD Sharma",253));
        books.add(new Book(3,"S chand",2572));
        books.add(new Book(4,"NCERT",251));
        books.add(new Book(5,"GEETA",256));
        books.add(new Book(6,"Aggarwal",257));
        books.add(new Book(7,"RS Aggarwal",258));

        return books;
    }
}
