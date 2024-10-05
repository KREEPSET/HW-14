public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Дэн", "Абнетт");
        Author author2 = new Author("Грэм", "Макнилл");
        Book book1 = new Book("Возвышение Хоруса", author1, 2006);
        Book book2 = new Book("Лживые боги", author2, 2007);
        book1.setYear(2008);
        System.out.println("book1.getYear() = " + book1.getYear());
        @ @ -1, 3 + 1, 5 @@
import java.util.Objects;

        public class Book {
            private String name;
            private Author author;
            private int year;

            public Book(String name, Author author, int year) {
                this.name = name;
                this.author = author;
                this.year = year;
            }

            public String getName() {
                return name;
            }

            public Author getAuthor() {
                return author;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            @Override
            public String toString() {
                return "Book{" +
                        "name='" + name + '\'' +
                        ", author=" + author +
                        ", year=" + year +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Book book = (Book) o;
                return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, author, year);
            }
        }
    }
}

