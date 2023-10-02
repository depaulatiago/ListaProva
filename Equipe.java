public class Equipe {
    private String nome;           // nome da equipe
    private int totalGolsFeitos;   // total de gols feitos pela equipe no campeonato
    private int totalGolsSofridos; // total de gols sofridos pela equipe no campeonato
    private int totalPontos;       // total de pontos obtidos pela equipe no campeonato

    public Equipe(String nome) {
        this.nome = nome;
        totalGolsFeitos= 0;
        totalGolsSofridos = 0;
        totalPontos = 0;
    }
    public String getNome() {
        return nome;
    }
    public int getTotalGolsFeitos() {
        return totalGolsFeitos;
    }
    public int getTotalGolsSofridos() {
        return totalGolsSofridos;
    }
    public int getTotalPontos() {
        return totalPontos;
    }
    // Método para tratar o resultado de uma partida realizada pela equipe
    public void contabilizarPartida(int golsFeitos, int golsSofridos) 
    {
        totalGolsFeitos += golsFeitos;
        totalGolsSofridos += golsSofridos;
        
        if (totalGolsFeitos > totalGolsSofridos)
        {
            totalPontos += 3;
        }
        if (totalGolsFeitos == totalGolsSofridos)
        {
            totalPontos += 1;
        }
    }
}

