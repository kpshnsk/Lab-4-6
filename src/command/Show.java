package command;

import gifts.entity.PresentBox;

public class Show implements Command{

    PresentBox gift;
    public Show(PresentBox gift) {
        this.gift = gift;
    }

    @Override
    public void execute() {
        gift.showComponentsInfo();
    }

}

