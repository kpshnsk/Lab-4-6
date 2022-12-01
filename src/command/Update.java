package command;

import gifts.entity.PresentBox;
import gifts.entity.Sweet;

public class Update implements Command{
    PresentBox gift;
    Sweet sweet;

    public Update(PresentBox gift, Sweet sweet) {
        this.gift = gift;
        this.sweet = sweet;
    }

    @Override
    public void execute() {
        gift.updateSweet(sweet);
    }
}

