package monitorCore.Service;

import monitorCore.Model.Animal;
import monitorCore.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> getAllAnimals() {
        return this.animalRepository.findAll();
    }

    @Override
    public List<Animal> getAnimalsByTypeAgeAndName(String type, int age, String name) {
        return this.animalRepository.getAnimalsByTypeAgeAndName(type,age,name);
    }

    @Override
    public void addAnimal(Animal animal) {
        this.animalRepository.save(animal);
    }

    @Override
    public List<Animal> topNAnimals(int n) {
        return this.animalRepository.topNAnimals(n);
    }

    @Override
    public void deleteAnimal(Integer animalId) {
        this.animalRepository.deleteById(animalId);
    }
}
