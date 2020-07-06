package Controller;

import Dto.AnimalsDto;
import Dto.OwnersDto;
import monitorCore.Model.Owner;
import monitorCore.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AnimalController {
    @Autowired
    AnimalRepository animalRepository;




}
