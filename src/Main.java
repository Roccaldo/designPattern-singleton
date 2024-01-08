public class Main {
    public static void main(String[] args) {
        User user1 = User.getUser();
        user1.mostraInformazioni();

        User user2 = User.getUser();
        user2.setNome("Rocco");
        user2.setAge(50);
        user2.mostraInformazioni();
    }
}