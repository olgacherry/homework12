import homework12.Author;
import homework12.Book;

public class Main {
    public static void main(String[] args) {
        Author mikhailBulgakov = new Author("Михаил", "Булгаков");
        System.out.println("Имя автора - " + mikhailBulgakov.getFirstName());
        System.out.println("Фамилия автора - " + mikhailBulgakov.getLastName());
        Book masterAndMargarita = new Book("Мастер и Маргарита",1967);
        System.out.println("Название - "+ masterAndMargarita.getBookName());
        System.out.println("Год - "+ masterAndMargarita.getPublishingYear());
        masterAndMargarita.setPublishingYear(1966);
        System.out.println("masterAndMargarita.getPublishingYear()="+masterAndMargarita.getPublishingYear());
        Author levTolstoy = new Author("Лев","Толстой");
        System.out.println("Имя автора - " + levTolstoy.getFirstName());
        System.out.println("Фамилия автора - " + levTolstoy.getLastName());
        Book annaKarenina = new Book("Анна Каренина",1877);
        System.out.println("Название - "+ annaKarenina.getBookName());
        System.out.println("Год - "+ annaKarenina.getPublishingYear());
    }
}



