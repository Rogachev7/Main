import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        User u1 = new User(1L, "Ivan", "Petrov", 30, true);
        User u2 = new User(2L, "Petr", "Kozak", 54, true);
        User u3 = new User(3L, "Eugeniy", "Kruglov", 43, true);
        User u4 = new User(4L, "Oleg", "Permilovskiy", 45, true);
        User u5 = new User(5L, "Pavel", "Sobachkin", 13, true);
        User u6 = new User(6L, "Anastasia ", "Kalyagina", 78, false);
        User u7 = new User(7L, "Ksenia", "Kovalenko", 35, false);
        User u8 = new User(8L, "Valentine", "Volkova", 29, false);
        User u9 = new User(9L, "Valeria", "Permilovskaya", 27, false);
        User u10 = new User(10L, "Polina", "Polyakova", 50, false);

        List<User> users = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10));

    }
}
