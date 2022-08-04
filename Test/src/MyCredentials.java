public class MyCredentials {

    public static void main(String[] args) {
        Credentials credentials = new Credentials("Hakan", 38);

        credentials.setUsername("haaktar");
        credentials.setPassword("1234");

        System.out.println(credentials.getUsername());
        System.out.println(credentials.getPassword());
    }
}
