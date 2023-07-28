package repository;

import entity.Food;

import java.util.ArrayList;
import java.util.List;

public class FoodRepositoryImpl implements FoodRepository {

    private final List<Food> foodList;

    public FoodRepositoryImpl() {
        foodList = new ArrayList<>();
        foodList.add(new Food("Biskuit", 6000L, 1));
        foodList.add(new Food("Chips", 8000L, 2));
        foodList.add(new Food("Oreo", 10000L, 2));
        foodList.add(new Food("Tango", 12000L, 1));
        foodList.add(new Food("Cokelat", 15000L, 1));
    }

    @Override
    public List<Food> getAll() {
        return foodList;
    }

    @Override
    public void updateStock(Integer number) {
        foodList.get(number-1).setStock(foodList.get(number-1).getStock()-1);
    }

}
