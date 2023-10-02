
/**
 * Escreva uma descrição da classe MedalhaPais aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MedalhaPais
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int nroOuro;
    private int nroPrata;
    private int nroBronze;

    /**
     * Construtor para objetos da classe MedalhaPais
     */
    public MedalhaPais()
    {
        nroOuro = 0;
        nroPrata = 0;
        nroBronze = 0;
    }
    
    public MedalhaPais(int ouro,int prata,int bronze)
    {
        nroOuro = ouro;
        nroPrata = prata;
        nroBronze = bronze;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int pontuaçãoPais()
    {
        int pont = (nroOuro * 10) + (nroPrata * 5) + nroBronze;
        
        return pont;
    }
    
    public void addOuro(int medalha)
    {
        nroOuro += medalha; 
    }
    
    public void addPrata(int medalha)
    {
        nroPrata += medalha; 
    }
    
    public void addBronze(int medalha)
    {
        nroBronze += medalha; 
    }
}
