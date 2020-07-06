package monitorCore.Service;

import monitorCore.Model.Owner;
import monitorCore.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;
    @Override
    public List<Owner> getAllOwners() {
        return this.ownerRepository.findAll();
    }

    @Override
    public Owner getOwnerWithAnimals(Integer ownerId) {
        return this.ownerRepository.findById(ownerId).get();
    }

    @Override
    public Owner addAnimal(Integer ownerId, Integer animalId) {
        return null;
    }

    @Override
    public void deleteOwner(Integer ownerId) {
        this.ownerRepository.deleteById(ownerId);
    }
}
