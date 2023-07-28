package view;

import entity.Food;
import repository.FoodRepository;
import service.FoodService;
import util.InputUtil;
import util.Validation;


public class FoodView {

    private FoodService foodService;

    private FoodRepository foodRepository;

    public FoodView(FoodService foodService, FoodRepository foodRepository) {
        this.foodService = foodService;
        this.foodRepository = foodRepository;
    }


    public void showFood() {

        while (true) {
            foodService.showFood();

            long nominalInput = InputUtil.inputLong("Masukan Uang");
            var isValid = Validation.nominalInputValidation(nominalInput);

            if (!isValid) {
                System.out.println("Mohon maaf anda hanya bisa memasukan uang pecahan 2000 / 5000 / 10000 /20000 / 50000");
            } else {
                int input = InputUtil.inputInt("Pilih Nomor Makanan");
                foodService.getFood(input, nominalInput);
            }

            boolean allOutOfStock = true;
            for (Food food : foodRepository.getAll()) {
                if (food.getStock() > 0) {
                    allOutOfStock = false;
                    break;
                }
            }

            if (allOutOfStock) {
                System.out.println();
                System.out.println("!!! Semua Stock makanan sudah habis !!!");
                break;
            }
        }
    }
}
