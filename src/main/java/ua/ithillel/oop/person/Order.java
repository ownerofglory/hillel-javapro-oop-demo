package ua.ithillel.oop.person;

import java.util.Date;

public class Order {
    private String name;
    private String description;
    private double cost;
    private Date date;

    private Order() {}

    public static class OrderBuilder {
        private Order instance;

        private String name;
        private String description;
        private double cost;
        private Date date;

        public OrderBuilder() {
            instance = new Order();
        }

        public OrderBuilder setName(String name) {
            instance.name = name;
            return this;
        }

        public OrderBuilder setDescription(String description) {
            instance.description = description;

            return this;
        }

        public OrderBuilder setCost(double cost) {
            instance.cost = cost;
            return this;
        }

        public OrderBuilder setDate(Date date) {
            instance.date = date;
            return this;
        }

        public Order build() {
            return instance;
        }
    }

    public String getName() {
        return name;
    }


    public Date getDate() {
        return date;
    }



    public String getDescription() {
        return description;
    }


    public double getCost() {
        return cost;
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

}
