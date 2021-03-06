package repository;

import models.GroceryList;

import java.util.List;

public interface GroceryListDAO {
    List<GroceryList> getAllListsGivenUserId(Integer userId);
    void createList(GroceryList groceryList);
    void deleteList(Integer listId);
}
