import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomNumber randomNumber;

    public RandomListFacade(RandomList randomList, ListFilter listFilter, ListPrinter listPrinter, RandomNumber randomNumber) {
        this.randomList = randomList;
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
        this.randomNumber = randomNumber;
    }

    public void printRandomEvenList(List<Integer> list, int size, int max, int min) {
        this.randomList.generateList(size, max, min);
        this.listFilter.filterOdd(list);
        this.listPrinter.printList(list);
        this.randomNumber.generateInteger(min, max);
    }
}
