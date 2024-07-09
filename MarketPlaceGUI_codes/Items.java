import java.util.ArrayList;
import java.util.List;

public class Items {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public List<Item> getItemList() {
        return itemList;
    }
}
