package elene.kikalishvili.elenekikalishvili1;

import elene.kikalishvili.elenekikalishvili1.model.Attachment;
import elene.kikalishvili.elenekikalishvili1.model.Author;
import elene.kikalishvili.elenekikalishvili1.model.Book;
import elene.kikalishvili.elenekikalishvili1.model.Tag;
import elene.kikalishvili.elenekikalishvili1.repository.AuthorRepository;
import elene.kikalishvili.elenekikalishvili1.repository.BookRepository;
import elene.kikalishvili.elenekikalishvili1.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    TagRepository tagRepository;

    @GetMapping("addAuthor")
    public void addAuthor() {
        Author author = new Author();
        author.setFirstName("George");
        author.setLastName("Orwell");
        authorRepository.save(author);
    }

    @GetMapping("addBook")
    public void addPostWithCategoryAndAttachment() {
        Author author1 = authorRepository.getOne(2L);
        Author author2 = authorRepository.getOne(3L);
        List<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);

        Attachment attachment = new Attachment();
        attachment.setPdfUrl("image.jpg");

        Book book = new Book();
        book.setTitle("1984");
        book.setDescription("description");
        book.setAuthors(authors);

        book.setAttachment(attachment);

        bookRepository.save(book);
    }

    @GetMapping("getBooks")
    public void getBooks() {
        for (Book book : bookRepository.findAll()) {
            System.out.println(book);
        }
    }

    @GetMapping("getBook")
    public void getBook() {
        Book book = bookRepository.getOne(2L);
        System.out.println(book.getTitle());
        System.out.println(book.getTags().get(0).getText());
    }

    @GetMapping("addTag")
    public void addTag() {
        Book book = bookRepository.getOne(2L);
        Tag tag = new Tag();
        tag.setText("tag");
        tag.setBook(book);
        tagRepository.save(tag);
    }

    @GetMapping("getTags")
    public void getTags() {
        for (Tag tag : tagRepository.findAll()) {
            System.out.println(tag);
        }
    }



}
