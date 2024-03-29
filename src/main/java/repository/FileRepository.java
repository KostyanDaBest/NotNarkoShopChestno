package repository;

import entity.User;

import java.io.*;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class FileRepository implements ShopRepository {
    private final String filePath = "user.servlet";
    private final List<User> users;

    public FileRepository() {

        users = deserializeUsers();
    }

    @Override
    public void add(User user) {

        users.add(user);
        serializeUsers();
    }




    @Override
    public void deleteById(Long userId) {
        users.removeIf(user -> Objects.equals(user.getId(), userId));
        serializeUsers();
    }


    @Override
    public Collection<User> allUsers() {
        return users;
    }
    private void serializeUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(users);

        } catch (IOException e) {
            System.err.println("Ошибка при сериализации пользователей: " + e.getMessage());
        }
    }

    private List<User> deserializeUsers() {
        File file = new File(filePath);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации пользователей: " + e.getMessage());
        }
        return new ArrayList<>();
    }
}
