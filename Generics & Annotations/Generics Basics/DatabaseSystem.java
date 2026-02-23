interface Repository<T> {
    void save(T entity);
    void delete(T entity);
}

class User { 
    String name; 
    User(String n) { this.name = n; } 
}

class UserRepository implements Repository<User> {
    public void save(User u) { System.out.println("User " + u.name + " saved to DB."); }
    public void delete(User u) { System.out.println("User " + u.name + " deleted."); }
}

public class DatabaseSystem {
    public static void main(String[] args) {
        UserRepository userRepo = new UserRepository();
        userRepo.save(new User("Alice"));
    }
}