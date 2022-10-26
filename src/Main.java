public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 12\n");
//  Задание включает в себя отладочную информацию, а также описание шагов, которые необходимо сделать,
//  чтобы успешно сдать задание.
//  Так как мы с вами уже изучили геттеры и сеттеры, оставлять поля открытыми (без модификатора
//  доступа private) недопустимо.
//  Продолжаем тему книг и пишем свой небольшой библиотечный справочник, где хранится информация о книгах.
//  - Отладочная информация
//  Какой бы из уровней вы ни сделали, рекомендуется создать отдельный класс, например с именем
//  Main или App, в нем объявить метод main и в нем протестировать работу вашего кода.
//  В случае с простым уровнем нужно создать несколько книг и авторов (по два, например).
//  ## Минимальный **уровень**
//  1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе
//  и годе публикации. Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
//  2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
//  3. Написать конструкторы для обоих классов, заполняющие все поля.
//  4. Создать геттеры для всех полей автора и всех полей книги.
//  5. Создать сеттер для поля «Год публикации» у книги.
//  6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор
//  (достаточно тоже двух) и инициализировать друг друга. Учесть, что авторы являются обязательными
//  членами книг и книги не могут создаться без авторов.
//  Метод main не должен находиться в классах Book и Author.
//  Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
//  7. В том же методе main изменить год публикации одной из книг с помощью сеттера.
//  **Критерии оценки**
//    1. Классы созданы корректно.
//    2. Поля созданы корректно. Использованы корректные имена и типы.
//    3. Классы корректно создаются через конструктор.
//    4. Классы имеют все необходимые геттеры и сеттеры.
//    5. Объекты в методе main созданы.

        Author author1 = new Author("Stephen", "King");
        Book book1 = new Book("Later", author1, 2021);

        System.out.println("book1.BookName = " + book1.getBookName() + "\n" + "author1.AuthorFirstName = " +
                author1.getAuthorFirstName() + "\n" + "author1.AuthorLastName = " + author1.getAuthorLastName() + "\n" +
                "book1.PublishingYear() = " + book1.getPublishingYear() + "\n");

        book1.setPublishingYear(2022);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());

        System.out.println();

        Author author2 = new Author("Joanne", "Rowling");
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", author2, 1998);

        System.out.println("book2.BookName = " + book2.getBookName() + "\n" + "author2.AuthorFirstName = " +
                author2.getAuthorFirstName() + "\n" + "author2.AuthorLastName = " + author2.getAuthorLastName() + "\n" +
                "book2.PublishingYear() = " + book2.getPublishingYear() + "\n");

        book2.setPublishingYear(2005);
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());
    }
}