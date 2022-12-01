package command;

import gifts.entity.PresentBox;

public class SortByCalorie implements Command{
    PresentBox gift;


    public SortByCalorie(PresentBox gift) {
        this.gift = gift;
    }

    @Override
    public void execute() {
        gift.sortPresentByCalorie();
    }
}
