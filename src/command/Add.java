package command;

import gifts.entity.PresentBox;
import gifts.entity.Sweet;

public class Add implements Command{
    PresentBox gift;
    Sweet sweet;
    public Add(PresentBox gift, Sweet sweet) {
        this.gift = gift;
        this.sweet = sweet;
    }

    @Override
    public void execute() {
        gift.addSweet(sweet);
    }
}



