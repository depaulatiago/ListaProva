public class Partida {
    private Equipe equipe1;     // uma partida é realizada entre
    private Equipe equipe2;     // duas equipes
    private String nomeEstadio; // nome do estádio onde a partida é realizada
    private boolean resultadoDefinido; // indica se a partida já tem resultado
    private int golsEquipe1;           // gols da equipe 1 no resultado da partida
    private int golsEquipe2;           // gols da equipe 2 no resultado da partida

    public Partida(String nomeEstadio)
    {
        Equipe equipe1;     // uma partida é realizada entre
        Equipe equipe2;     // duas equipes
        this.nomeEstadio = nomeEstadio; // nome do estádio onde a partida é realizada
        resultadoDefinido = false; // indica se a partida já tem resultado
        golsEquipe1 = 0;           // gols da equipe 1 no resultado da partida
        golsEquipe2 = 0;
    }

    // defina o construtor da classe
    // Método para definir o resultado de uma partida
    public void definirResultado(int golsEquipe1, int golsEquipe2) {
        this.golsEquipe1 = golsEquipe1;
        this.golsEquipe2 = golsEquipe2;
        equipe1.contabilizarPartida(golsEquipe1, golsEquipe2);
        equipe2.contabilizarPartida(golsEquipe2, golsEquipe1);
        resultadoDefinido = true;
    }

    public void resultado()
    {
        System.out.println(equipe1 + " " + golsEquipe1 + " x " + equipe2 + " " + golsEquipe2);
    }









}
