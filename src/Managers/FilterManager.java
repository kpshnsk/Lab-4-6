package Managers;

import gifts.entity.Sweet;

import java.util.ArrayList;

public interface FilterManager {
    boolean filterSweetsByName(ArrayList<Sweet> listOfSweets, String name);
}
