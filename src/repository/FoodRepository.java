package repository;

import entity.Food;

import java.util.List;

public interface FoodRepository {

    List<Food> getAll();

    void updateStock(Integer number);
}
