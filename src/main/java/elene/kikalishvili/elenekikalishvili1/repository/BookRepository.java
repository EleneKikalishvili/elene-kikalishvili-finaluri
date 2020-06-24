package elene.kikalishvili.elenekikalishvili1.repository;

import elene.kikalishvili.elenekikalishvili1.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
