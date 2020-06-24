package elene.kikalishvili.elenekikalishvili2.service;

import elene.kikalishvili.elenekikalishvili2.dto.Task.*;

public interface TaskService {
     AddTaskOutput addTask(AddTaskInput addTaskInput);

     DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);

    GetTaskOutput getTasks(GetTaskInput getTaskInput);
}
