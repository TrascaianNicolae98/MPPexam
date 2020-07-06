package monitorCore.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;
import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@Entity(name="Owner")
public class Owner extends BaseEntity implements Serializable {
    private String name;
    private String email;
    ArrayList<Animal> animals;
}
