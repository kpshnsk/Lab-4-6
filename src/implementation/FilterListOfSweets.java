package implementation;

import Managers.FilterManager;

import gifts.entity.Sweet;


import java.util.ArrayList;

public class FilterListOfSweets implements FilterManager {
    @Override
    public boolean filterSweetsByName(ArrayList<Sweet> listOfSweets, String name) {
        int k = 0;
        for(int i = 0; i < listOfSweets.size();i++) {
            if(listOfSweets.get(i).getTitle().equals(name)) {
                System.out.println(i+1 + " - " + listOfSweets.get(i).getInfo());
                k++;
            }
        }
        if (k == 0) {
            System.out.println("Sweets with title ("+ name +") is not found");
            return false;
        }
        return true;
    }
}


