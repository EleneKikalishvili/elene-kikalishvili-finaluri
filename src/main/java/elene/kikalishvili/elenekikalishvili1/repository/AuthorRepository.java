package elene.kikalishvili.elenekikalishvili1.repository;

import elene.kikalishvili.elenekikalishvili1.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
