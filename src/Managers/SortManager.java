package org.gifts.logic.Managers;

import gifts.entity.Sweet;

import java.util.ArrayList;

public interface SortManager {

    void SortByCalorie(ArrayList<Sweet> listOfSweet);

    void sortBySugarLevel(ArrayList<Sweet>listOfSweet);
    void sortByPrice(ArrayList<Sweet>listOfSweet);
    void SortCriterion();
}
