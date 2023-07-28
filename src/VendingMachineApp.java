import repository.FoodRepository;
import repository.FoodRepositoryImpl;
import service.FoodService;
import service.FoodServiceImpl;
import view.FoodView;

public class VendingMachineApp {
    public static void main(String[] args) {

        FoodRepository foodRepository = new FoodRepositoryImpl();
        FoodService foodService = new FoodServiceImpl(foodRepository);
        FoodView foodView = new FoodView(foodService, foodRepository);

        foodView.showFood();
    }
}
