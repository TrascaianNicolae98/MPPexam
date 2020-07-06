package Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import monitorCore.Model.Animal;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class AnimalsDto {
    ArrayList<Animal> animals;

    public AnimalsDto(){
        this.animals=new ArrayList<>();
    }
}
