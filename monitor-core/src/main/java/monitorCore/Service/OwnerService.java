package monitorCore.Service;

import monitorCore.Model.Owner;

import java.util.List;

public interface OwnerService {
    List<Owner> getAllOwners();
    Owner getOwnerWithAnimals(Integer ownerId);
    Owner addAnimal(Integer ownerId, Integer animalId);
    void deleteOwner(Integer ownerId);

}
