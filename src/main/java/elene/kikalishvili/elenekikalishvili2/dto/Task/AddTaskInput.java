package elene.kikalishvili.elenekikalishvili2.dto.Task;
import lombok.Data;

import java.util.Date;

@Data
public class AddTaskInput {
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;

}