package service;

import entity.Food;
import repository.FoodRepository;
import util.FormatCurrency;

import java.util.List;

public class FoodServiceImpl implements FoodService{

    private FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public void showFood() {
        var foods = foodRepository.getAll();

        System.out.println();
        System.out.println("=====================> Jenis Makanan <=====================");
        for (int i = 0; i < foods.size(); i++) {
            var food = foods.get(i);
            var no = i + 1;

            if (food != null) {
                System.out.println(no + ". " + food.getType()+" ("+food.getStock()+") - "+ FormatCurrency.RupiahCurrencyFormat(food.getPrice()));
            }
        }
        System.out.println();
    }

    @Override
    public void getFood(Integer number, long nominalInput) {
        List<Food> foodList = foodRepository.getAll();
        validationData(number, foodList, nominalInput);

    }

    private void validationData(int number, List<Food> foodList, long nominalInput) {
        if ((number-1) >= foodList.size()) {
            System.out.println("Nomor yang anda pilih tidak benar!");

        } else if (foodList.get(number-1).getStock() < 1){
            System.out.println("Mohon maaf stock habis!");

        } else {
            validateNominalInput(number, foodList, nominalInput);
        }
    }

    private void validateNominalInput(Integer number, List<Food> foodList, long nominalInput) {
        long price = foodList.get(number-1).getPrice();

        if (nominalInput < price) {
            System.out.println("Mohon maaf uang anda tidak cukup");
            System.out.println("Silahkan ambil Kembali Uang anda");

        } else {
            foodRepository.updateStock(number);
            long change = nominalInput - price;
            if (change > 0) {
                System.out.println("Kembalian untuk anda : "+ FormatCurrency.RupiahCurrencyFormat(change));
            }
            System.out.println("Silahkan diambil " + foodList.get(number-1).getType() + " anda");
        }
    }
}
