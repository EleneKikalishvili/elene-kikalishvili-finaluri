package elene.kikalishvili.elenekikalishvili2;

import elene.kikalishvili.elenekikalishvili2.model.Task;
import elene.kikalishvili.elenekikalishvili2.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    @Autowired
    TaskRepository taskRepository;

    @GetMapping("addTask")
    public void addTask() {

        Task task = new Task();
        task.setTitle("todo");
        task.setDescription("do something");
//        task.setStartDate();
//        task.setEndDate();

        taskRepository.save(task);
    }

    @GetMapping("getTasks")
    public void getPosts() {
        for (Task post : taskRepository.findAll()) {
            System.out.println(post);
        }
    }

    @GetMapping("getTask")
    public void getPost() {
        Task task = taskRepository.getOne(2L);
        System.out.println(task.getTitle());
    }
}
