
public class Ingresso {
   private int dia;
   private int hora;
   private String estadio;
   private String setor;
   private int cadeira;
   private String esporte;

   public Ingresso(String estadio, String esporte) {
        this.esporte = esporte;
  	this.estadio = estadio;
   }
   public void definirHorario(int d, int h) {
  	dia = d;
  	hora = h;
   }
   public void definirLocal(String setor, int cadeira) {
  	this.setor = setor;
  	this.cadeira = cadeira;
   }
   public void confirmarCompra() {
  	System.out.println("Local: " + estadio +", Dia: " + dia + ", Hora: " + hora + ", Setor: " + setor + ", Cadeira: " + cadeira);

   }
}
