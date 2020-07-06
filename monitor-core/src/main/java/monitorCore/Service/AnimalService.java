package monitorCore.Service;

import monitorCore.Model.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal> getAllAnimals();
    List<Animal> getAnimalsByTypeAgeAndName(String type, int age, String name);
    void addAnimal(Animal animal);
    List<Animal> topNAnimals(int n);
    void deleteAnimal(Integer animalId);

}
