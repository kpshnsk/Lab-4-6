package command;

import gifts.entity.PresentBox;
import gifts.entity.Sweet;

public class Delete implements Command{
    PresentBox gift;
    Sweet sweet;
    public Delete(PresentBox gift, Sweet sweet) {
        this.gift = gift;
        this.sweet = sweet;
    }

    @Override
    public void execute() {
        gift.deleteSweet(sweet);
    }

}
