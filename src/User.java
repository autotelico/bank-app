public class User {
    public enum Role {
        ADMIN, USER, GUEST
    }

     private String username;
     private Role role;

     User(String username, Role role) {
         this.username = username;
         this.role = role;
     }

     public Role getRole() {
         return role;
     }

    public static void main(String[] args) {
        User carlos = new User("Carlos", Role.USER);
        System.out.println(carlos.getRole());
    }
}
