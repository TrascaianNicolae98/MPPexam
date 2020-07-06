package Controller;

import Dto.OwnerDto;
import Dto.OwnersDto;
import monitorCore.Model.Animal;
import monitorCore.Model.Owner;
import monitorCore.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;

@RestController
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @RequestMapping(value = "/getOwners", method = RequestMethod.GET)
    OwnersDto getOwners() {
        return new OwnersDto((ArrayList<Owner>) this.ownerService.getAllOwners());
    }

    @RequestMapping(value = "/getOwnerDetail", method = RequestMethod.POST)
    OwnerDto getOwnerDetail(@RequestBody Integer ownerId) {
        return new OwnerDto(this.ownerService.getOwnerWithAnimals(ownerId));
    }





}
