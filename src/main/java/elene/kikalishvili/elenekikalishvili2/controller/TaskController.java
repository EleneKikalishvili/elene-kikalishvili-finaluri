package elene.kikalishvili.elenekikalishvili2.controller;

import elene.kikalishvili.elenekikalishvili2.dto.Task.*;
import elene.kikalishvili.elenekikalishvili2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/TaskController")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping("getTasks")
    public GetTaskOutput getTasks(@RequestBody GetTaskInput getTaskInput) {
        return taskService.getTasks(getTaskInput);
    }

    @PostMapping("addTask")
    public AddTaskOutput addPost(@RequestBody AddTaskInput addTaskInput) {
        return taskService.addTask(addTaskInput);
    }

    @PostMapping("deleteTask")
    public DeleteTaskOutput deleteTask(@RequestBody DeleteTaskInput deleteTaskInput) {
        return taskService.deleteTask(deleteTaskInput);
    }
}
