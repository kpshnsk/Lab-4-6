public class AddCommand {
    public class Add implements AddCommand {
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
}
