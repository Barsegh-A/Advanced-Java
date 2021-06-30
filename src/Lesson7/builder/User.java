package Lesson7.builder;

public class User {
    private final String login;
    private final String password;
    private int year;
    private boolean isAdmin;

    public User(UserBuilder builder){
        this.login = builder.login;
        this.password = builder.password;
        this.year = builder.year;
        this.isAdmin = builder.isAdmin;
    }

    public static class UserBuilder{
        private final String login;
        private final String password;
        private int year;
        private boolean isAdmin;

        public UserBuilder(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public UserBuilder year(int year){
            this.year = year;
            return this;
        }

        public UserBuilder admin(boolean isAdmin){
            this.isAdmin = isAdmin;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getYear() {
        return year;
    }
}
