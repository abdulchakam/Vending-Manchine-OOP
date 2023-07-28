package test.service;

import repository.FoodRepository;
import repository.FoodRepositoryImpl;
import service.FoodService;
import service.FoodServiceImpl;

public class FoodServiceTest {
    public static void main(String[] args) {
        testGetFood();
    }

    public static void testShowFood() {
        FoodRepository foodRepository = new FoodRepositoryImpl();
        FoodService foodService = new FoodServiceImpl(foodRepository);

        foodService.showFood();
    }

    public static void testGetFood() {
        FoodRepository foodRepository = new FoodRepositoryImpl();
        FoodService foodService = new FoodServiceImpl(foodRepository);

        foodService.showFood();
        foodService.getFood(1, 2000L);

        foodService.showFood();
        foodService.getFood(1, 20000L);

        foodService.showFood();
        foodService.getFood(4, 20000L);

        foodService.showFood();
        foodService.getFood(10, 20000L);
    }
}
