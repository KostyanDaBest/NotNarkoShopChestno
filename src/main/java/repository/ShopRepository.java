package repository;

import entity.User;

import java.util.Collection;

public interface ShopRepository {

    public void add(User user);


    void deleteById(Long userId);



    public Collection<User> allUsers();
}
