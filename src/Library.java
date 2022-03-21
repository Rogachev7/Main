import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books;
    private final List<Reader> readers;

    public Library() {
        books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 2021));
        books.add(new Book("Пушкин", "1830", 2020));
        books.add(new Book("Гоголь", "1845", 2021));
        books.add(new Book("Толстой", "1900", 2022));
        //и так далее для других книг

        readers = new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Петров Пётр Петрович", "petrov.email@test.ru", false));
        readers.add(new Reader("Алексеев Алексей Алексеевич", "alekseev.email@test.ru", true));
        //и так далее для других читателей

        readers.get(0).getBooks().add(books.get(0));
        readers.get(0).getBooks().add(books.get(1));
        readers.get(1).getBooks().add(books.get(2));
        //и так далее для других читателей и взятых книг
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
