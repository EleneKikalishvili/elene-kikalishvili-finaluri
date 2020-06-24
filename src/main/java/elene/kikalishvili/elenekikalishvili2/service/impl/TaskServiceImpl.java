package elene.kikalishvili.elenekikalishvili2.service.impl;

import elene.kikalishvili.elenekikalishvili2.dto.Task.*;
import elene.kikalishvili.elenekikalishvili2.model.Task;
import elene.kikalishvili.elenekikalishvili2.repository.TaskRepository;
import elene.kikalishvili.elenekikalishvili2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;


    @Override
    public GetTaskOutput getTasks(GetTaskInput getTaskInput) {

        List<TaskDTO> taskDTOList = new ArrayList<>();
        for (Task task : taskRepository.findAll()) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setStartDate(task.getStartDate());
            taskDTOList.add(taskDTO);
        }

        GetTaskOutput getPostOutput = new GetTaskOutput();
        getPostOutput.setTasks(taskDTOList);
        return getPostOutput;
    }

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());


        taskRepository.save(task);

        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setMsg("task added");
        return addTaskOutput;
    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        Task task = taskRepository.getOne(deleteTaskInput.getTaskId());
        taskRepository.delete(task);

        DeleteTaskOutput deleteTaskOutput = new DeleteTaskOutput();
        deleteTaskOutput.setMsg("task deleted");
        return deleteTaskOutput;
    }

}
