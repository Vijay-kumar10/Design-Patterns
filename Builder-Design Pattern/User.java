public class User {
    private final int id;
    private final String name;
    private final String email;

    public User(User.userBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    static class userBuilder {
        private int id;
        private String name;
        private String email;

        public userBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public userBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public userBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }

        @Override
        public String toString() {
            return "userBuilder [id=" + id + ", name=" + name + ", email=" + email + "]";
        }

        
    }
}
