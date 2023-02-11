import homework12.Author;
import homework12.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Михаил", "Булгаков");
        Book masterAndMargarita = new Book("Мастер и Маргарита",  author1, 1967);
        System.out.println("Название - " + masterAndMargarita.getBookName());
        System.out.println("Автор - " + masterAndMargarita.getAuthor());
        System.out.println("Год - " + masterAndMargarita.getPublishingYear());
        masterAndMargarita.setPublishingYear(1966);
        System.out.println("masterAndMargarita.getPublishingYear()=" + masterAndMargarita.getPublishingYear());

        Author author2 = new Author("Лев", "Толстой");
        Book annaKarenina = new Book("Анна Каренина",  author2, 1877);
        System.out.println("Название - " + annaKarenina.getBookName());
        System.out.println("Имя автора - " + annaKarenina.getAuthor());
        System.out.println("Год - " + annaKarenina.getPublishingYear());

        System.out.println(masterAndMargarita);
        System.out.println(annaKarenina);
        System.out.println(masterAndMargarita.hashCode());
        System.out.println(annaKarenina.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        }

    }







