package Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class SensNameDto {
    ArrayList<String> sensNames;
    public SensNameDto(){
        this.sensNames=new ArrayList<>();
    }
}
