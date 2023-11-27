import java.util.List;

public class View implements Observer{
  private Plano plano;
  private List<Contrato> contratos;
  
  public void setPlano(Contrato a){
    this.plano = a;
  }
  
  public void update(List<Contrato> l){
    this.contratos = l;
  }
}