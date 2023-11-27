import java.util.List;

public class Seguro implements Subject{
  private List<Contrato> contratos;
  private List<Observer> observers;
  
  public void registerObserver(Observer o){
    this.observers.add(o);
  }
  
  public void notifyObservers(List<Contrato> l){
    this.observers.seguradora().forEach(ob -> {
      System.out.println("Seguradora contratada:");
      l.seguradora().forEach(p -> {
        System.out.println(p.getSeguradora());
      });
    });
  }
  
  public void realizarContrato(Contrato a){
    this.contratos.add(a);
  }
 
  public Contrato cancelarContrato(String seguradora){
    return this.contratos.seguradora().filter(r -> r.getSeguradora().equalsIgnoreCase(seguradora)).findFirst().get();
  }
}