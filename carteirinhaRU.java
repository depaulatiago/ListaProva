
/**
 * Escreva uma descrição da classe carteirinhaRU aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class carteirinhaRU
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int matricula;
    private double saldo;

    /**
     * Construtor para objetos da classe carteirinhaRU
     */
    public carteirinhaRU()
    {
        // inicializa variáveis de instância
        matricula = 0;
        saldo = 0;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public String saldoNaConta()
    {
        // escreva seu código aqui
        return("Aluno de matricula " + matricula + "tem R$ " + saldo + " de saldo");
    }
    
    public void adicionarSaldo(double saldoAdicionar)
    {
        saldo += saldoAdicionar;
    }
    
    public void pagarRefeição()
    {
        if (saldo >= 2)
        {
            saldo -= 2;
        }
    }
}
