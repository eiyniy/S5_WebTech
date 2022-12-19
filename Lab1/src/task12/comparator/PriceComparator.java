package task12.comparator;

import task12.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        if (book1.getPrice() > book2.getPrice()){
            return 1;
        } else if (book1.getPrice() < book2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
