package Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import monitorCore.Model.Owner;

import java.util.ArrayList;


@AllArgsConstructor
@Data
public class OwnersDto {
    ArrayList<Owner> owners;

    public OwnersDto(){
        this.owners=new ArrayList<>();
    }

}
