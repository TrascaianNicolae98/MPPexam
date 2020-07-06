package monitorCore.Repository;

import monitorCore.Model.Animal;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends AnimalContestRepository<Integer, Animal> {
    @Query("select a from Animal a where a.type=?1 and a.age=?2 and a.name=?3 ")
    List<Animal> getAnimalsByTypeAgeAndName(String type, int age, String name);

    @Query("select a from Animal a where a.points>=?1")
    public List<Animal> topNAnimals(int n);

}
