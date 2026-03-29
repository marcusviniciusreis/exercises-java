package exercises.methods.sistemadepersonagens;

public class PersonagemTest {
    public static void main(String[] args) {
        Personagem[] personagens = new Personagem[3];

        personagens[0] = new Personagem();
        personagens[1] = new Personagem();
        personagens[2] = new Personagem();

        personagens[0].nome = "Naruto";
        personagens[0].vida = 100;

        personagens[1].nome = "Asta";
        personagens[1].vida = 100;

        personagens[2].nome = "Mashle";
        personagens[2].vida = 100;

        // atacando personagem
        personagens[0].atacarPersonagem(personagens[1]);
        personagens[1].receberDano(25);

        personagens[1].atacarPersonagem(personagens[2]);
        personagens[2].receberDano(70);

        personagens[2].curarPersonagem(70);
        personagens[1].atacarPersonagem(personagens[0]);
        personagens[0].receberDano(100);

        for (int i = 0; i < 3; i++) {
            personagens[i].exibirStatus();
        }

    }
}
