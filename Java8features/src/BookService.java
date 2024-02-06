import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort(){
        List<Book> books = new BookDao().getBooks();
        Collections.sort(books,((o1, o2) -> o2.getName().compareTo(o1.getName())));
        return books;
    }
}

//class MyComparator implements Comparator<Book>{
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }


//}
