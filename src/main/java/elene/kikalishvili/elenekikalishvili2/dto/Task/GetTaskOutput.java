package elene.kikalishvili.elenekikalishvili2.dto.Task;

import lombok.Data;

import java.util.List;

@Data
public class GetTaskOutput {
    private List<TaskDTO> tasks;
}
