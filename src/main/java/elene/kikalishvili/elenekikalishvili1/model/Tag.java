package elene.kikalishvili.elenekikalishvili1.model;
import lombok.Data;
import lombok.ToString;
import javax.persistence.*;

@Data
@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;

    @ToString.Exclude
    @ManyToOne()
    private Book book;
}
