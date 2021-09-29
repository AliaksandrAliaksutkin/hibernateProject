import model.Address;
import model.Auto;
import model.User;
import repository.UserRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        User user = new User("Ivanichi","Ivanovichev",33,
                new Address("Beryoza","Komsomolskaya",52),
                new Auto("Audi A5","white",2001));
        userRepository.addUser(user);

        User user1 = new User("Petr","Petrov",34,
                new Address("Beryoza","Lenina",52),
                new Auto("BMW X5", "blue",2010));
        userRepository.addUser(user1);

        User user2 = new User("Maksim","Maksimov",35,
                new Address("Beloozersk","Pobedy",244),
                new Auto("Opel Zafira", "black",2010));
        userRepository.addUser(user2);

        User user3 = new User("Michail","Michailov",36,
                new Address("Beloozersk","Oktybrskaya",52),
                new Auto("Audi B4","orange",1999));
        userRepository.addUser(user3);

        User user4 = new User("Yakut","SukaOtdohnulOnUebiche!",99,
                new Address("Brest","Mira",4),
                new Auto("Citroen C4","grey",2006));
        userRepository.addUser(user4);

        User user5 = new User("Vasilii","Vasiliev",37,
                new Address("Brest","Kosmonavtov",45),
                new Auto("Peguet 406","blue",2004));
        userRepository.addUser(user5);

        userRepository.deleteUser(user1);

        List<User> listUser = userRepository.findByHouse(52);
        System.out.println(listUser);
    }
}
