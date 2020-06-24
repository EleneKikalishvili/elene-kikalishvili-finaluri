package elene.kikalishvili.elenekikalishvili2.repository;

import elene.kikalishvili.elenekikalishvili2.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
