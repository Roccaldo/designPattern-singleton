public class User {
    private String nome;
    private Integer age;
    private static User user;

    private User() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public void mostraInformazioni() {
        System.out.println("nome: " + nome + " anni: " + age);
    }

    @Override
    public String toString() {
        return "User{" + "nome='" + nome + '\'' + ", age=" + age + '}';
    }
}
