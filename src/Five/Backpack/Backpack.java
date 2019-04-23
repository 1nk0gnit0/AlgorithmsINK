package Five.Backpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private List<Item> bestItems = null;

    private int maxWeight;
    private int bestPrice;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private int calcWeight(List<Item> items){
        int result = 0;
        for (Item item : items){
            result = result + item.getWeigth();
        }
        return result;
    }

    private int calcPrice(List<Item> items){
        int result = 0;
        for (Item item : items){
            result = result + item.getPrice();
        }
        return result;
    }

    private void checkBest(List<Item> items){
        if(bestItems == null){
            if(calcWeight(items) <= maxWeight){
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }else{
            if(calcWeight(items) <= maxWeight && calcPrice(items) > bestPrice){
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
    }

    public void rotate(List<Item> items){
        if(items.size() > 0){
            this.checkBest(items);
        }
        for(int i = 0; i < items.size(); i++){
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            rotate(newSet);
        }
    }

    public List<Item> getBestItems(){
        return bestItems;
    }

    public static void main(String[] args) {
        Backpack bag = new Backpack(8);
        List<Item> items = new ArrayList<>();
        items.add(new Item("Предмет 1", 1, 100));
        items.add(new Item("Предмет 2", 3, 80));
        items.add(new Item("Предмет 3", 5, 60));
        items.add(new Item("Предмет 4", 4, 70));
        items.add(new Item("Предмет 5", 2, 90));

        bag.rotate(items);
        System.out.println("В налиции:\n" + items);
        System.out.println();
        System.out.println("Лучший набор помещенный в рюкзак:\n" + bag.getBestItems());

    }



}
