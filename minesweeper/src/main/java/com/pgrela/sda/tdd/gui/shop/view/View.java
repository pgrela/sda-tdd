package com.pgrela.sda.tdd.gui.shop.view;

import java.util.Arrays;
import java.util.List;

public class View {
    private String message;
    private String shoppingCardMessage;
    private List<String> availableItemsHeaders;
    private List<Row> availableItems;
    private List<String> shoppingCardHeaders;
    private List<Row> shoppingCard;

    public View() {
        message = "Welcome dear user!";
        shoppingCardMessage = "Your shopping card contains 2 items, worth $30.53 total";
        availableItemsHeaders = Arrays.asList("Name", "Price", "Actions");
        availableItems = Arrays.asList(
                new Row("id1", Arrays.asList("Camera", "$100"), Arrays.asList("BUY")),
                new Row("id2", Arrays.asList("Backpack", "$50"), Arrays.asList("BUY")),
                new Row("id3", Arrays.asList("Banana", "$1"), Arrays.asList("BUY", "BUY 10 for $6!")),
                new Row("id4", Arrays.asList("E-book reader", "$220"), Arrays.asList("BUY"))
        );
        shoppingCardHeaders = Arrays.asList("Name", "Quantity", "Price", "Actions");
        shoppingCard = Arrays.asList(
                new Row("id3", Arrays.asList("Camera", "1", "$100"), Arrays.asList("REMOVE")),
                new Row("id7", Arrays.asList("E-book reader", "2", "$440"), Arrays.asList("REMOVE", "REMOVE ALL"))
        );
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getAvailableItemsHeaders() {
        return availableItemsHeaders;
    }

    public void setAvailableItemsHeaders(List<String> availableItemsHeaders) {
        this.availableItemsHeaders = availableItemsHeaders;
    }

    public List<Row> getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(List<Row> availableItems) {
        this.availableItems = availableItems;
    }

    public List<String> getShoppingCardHeaders() {
        return shoppingCardHeaders;
    }

    public void setShoppingCardHeaders(List<String> shoppingCardHeaders) {
        this.shoppingCardHeaders = shoppingCardHeaders;
    }

    public List<Row> getShoppingCard() {
        return shoppingCard;
    }

    public void setShoppingCard(List<Row> shoppingCard) {
        this.shoppingCard = shoppingCard;
    }

    public String getShoppingCardMessage() {
        return shoppingCardMessage;
    }

    public void setShoppingCardMessage(String shoppingCardMessage) {
        this.shoppingCardMessage = shoppingCardMessage;
    }
}
