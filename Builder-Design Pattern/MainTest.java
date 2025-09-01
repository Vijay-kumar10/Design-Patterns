public class MainTest {
    public static void main(String[] args) {
        User user = new User.userBuilder()
                .setId(1)
                .setName("John Doe")
                .setEmail("KUMAR@gmail.com")
                .build();
                System.out.println(user.getName());
    }
}
