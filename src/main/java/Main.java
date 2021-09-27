import model.User;
import repository.UserRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        User user = new User("Ivanichi","Ivanovichev",33);
        userRepository.addUser(user);
        User user1 = new User("Petr","Petrov",34);
        userRepository.addUser(user1);
        User user2 = new User("Maksim","Maksimov",35);
        userRepository.addUser(user2);
        User user3 = new User("Michail","Michailov",36);
        userRepository.addUser(user3);
        User user4 = new User("Yakut","SukaOtdohnulOnUebiche!",99);
        userRepository.addUser(user4);
        User user5 = new User("Vasilii","Vasiliev",37);

        userRepository.deleteUser(user);
        userRepository.deleteByIdUser(3);
        userRepository.updateUser(user5);

        User user6 = userRepository.findByIdUser(2);
        userRepository.addUser(user6);

        List<User> list = userRepository.findAll();
        System.out.println(list);

        userRepository.deleteUsers(list);
    }
}
