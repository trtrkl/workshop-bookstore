package demo;

import java.util.ArrayList;
import java.util.Dictionary;

public class Stock {

    Dictionary<Book,Integer> booksStock;

    public Stock(Dictionary<Book, Integer> booksStock) {
        this.booksStock = booksStock;
    }

    public Dictionary<Book, Integer> getBooksStock() {
        return booksStock;
    }

    public void setBooksStock(Dictionary<Book, Integer> booksStock) {
        this.booksStock = booksStock;
    }

    public void addNewBook(Book book,int quantity){
        booksStock.put(book,quantity);
    }

    public void removeBook(Book book){
        booksStock.remove(book);
    }
}
