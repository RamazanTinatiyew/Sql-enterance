package mentor130825;

import java.util.ArrayList;
import java.util.List;

public class Conteiner <T> {
    private List<T> myList = new ArrayList<>();

    public void addItem (T item){
        myList.add(item);
    }
    public T getList(int index) {
        return myList.get(index);
    }
}
