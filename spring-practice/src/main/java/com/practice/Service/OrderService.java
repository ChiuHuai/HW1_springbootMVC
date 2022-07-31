package com.practice.Service;



import com.practice.Model.Meal;
import com.practice.Model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    List<Order> orderList; //per day
    List<Meal> mealList;
    List<Meal> mealList2;


    public OrderService(){
        this.orderList = new ArrayList<>();

//        mealList
        this.mealList = new ArrayList<>();
        this.mealList.add(new Meal("hamburger",100,"This is delicious!"));
        this.mealList.add(new Meal("Coke",50,"nice!"));
        this.orderList.add(new Order(1,calctotalPriceAMealList(mealList),"Bill", mealList));

//        mealList2
        this.mealList2 = new ArrayList<>();
        this.mealList2.add(new Meal("pancake",80,"Nice and fluffy."));
        this.mealList2.add(new Meal("coffee",50,"Locally roasted."));
        this.orderList.add(new Order(2,calctotalPriceAMealList(mealList2),"Bill", mealList2));

    }

    //calculate totalPrice in a single mealList
    public int calctotalPriceAMealList(List<Meal> lm){
        int total = 0;
        for(Meal m: lm){
            total += m.getPrice();
        }
        return total;
    }

    public Order getOrderBySeq(int seq){
        for(int i=0; i<this.orderList.size(); i++){
            if(this.orderList.get(i).getSeq()==seq) {
                return this.orderList.get(i);
            }
        }
        return null;
    }


}
