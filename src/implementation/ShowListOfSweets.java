package implementation;

import gifts.entity.Sweet;

import java.util.ArrayList;

public class ShowListOfSweets {
    public void ShowSweets(ArrayList<Sweet> listOfSweets){
        for(int i = 0; i < listOfSweets.size();i++){

            System.out.println(i+1 + " - " + listOfSweets.get(i).getInfo());
        }
    }
}
