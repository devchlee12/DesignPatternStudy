package iterator_pattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("책1"));
        bookShelf.appendBook(new Book("책2"));
        bookShelf.appendBook(new Book("책3"));
        bookShelf.appendBook(new Book("책4"));

        Iterator<Book> bookIterator = bookShelf.iterator();

        System.out.println("=======명시적 이터레이터 테스트=======");
        while(bookIterator.hasNext()){
            Book book = bookIterator.next();
            System.out.println(book.getName());
        }

        System.out.println("=======for each 문 사용 이터레이터 테스트=======");
        for (Book book : bookShelf){
            System.out.println(book.getName());
        }
        System.out.println("=======테스트 종료=======");
    }
}
