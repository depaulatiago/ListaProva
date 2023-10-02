import java.util.ArrayList;
public class Reuniao {
  private String assunto;
  private int dia;
  private int hora;
  private String local;
  private String organizador;

  public Reuniao(String assunto, int dia, int hora, String organizador) {
    this.assunto = assunto;
    this.dia = dia;
    this.hora = hora;
    this.organizador = organizador;
  }

  public void definirLocal(String local) {
    this.local = local;
  }
  
  public void textoCartaz()
  {
    System.out.println("Reunião : " + assunto);
    System.out.println("Dia " + dia + " às " + hora + " no " + local);
    System.out.println("Organizador: " + organizador);
  }
}
