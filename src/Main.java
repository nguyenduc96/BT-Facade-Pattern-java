import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        int max = 11;
        int min = 1;
        int size = 11;
        RandomListFacade randomListFacade = new RandomListFacade(new RandomList(), new ListFilter(), new ListPrinter(), new RandomNumber());
        randomListFacade.printRandomEvenList(list, size,max,min);
    }
}
