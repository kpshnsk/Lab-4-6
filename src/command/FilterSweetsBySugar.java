package command;
import gifts.entity.PresentBox;

public class FilterSweetsBySugar implements Command{
    PresentBox gift;
    int min, max;

    public FilterSweetsBySugar(PresentBox gift, int min, int max) {
        this.gift = gift;
        this.min = min;
        this.max = max;
    }

    @Override
    public void execute() {
        gift.filterSweetsBySugarLevel(min,max);
    }
}

