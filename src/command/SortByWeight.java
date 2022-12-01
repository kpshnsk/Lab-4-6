package command;

import gifts.entity.PresentBox;

public class SortByWeight implements Command{
    PresentBox gift;

    public SortByWeight(PresentBox gift) {
        this.gift = gift;
    }

    @Override
    public void execute() {
        gift.sortPresentByWeight();
    }
}
