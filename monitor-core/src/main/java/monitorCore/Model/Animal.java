package monitorCore.Model;

import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@Entity(name="Animal")
public class Animal extends BaseEntity implements Serializable {
    private String breed;
    private String name;
    private int age;
    private String type;
    private int points;
}
