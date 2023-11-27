public class Carro implements Plano {
    private View view;
    private Streaming streaming;

    public void assinarPlano() {
        System.out.println("Você contratou o seguro de carro.");
    }

  public void setView(View v){
    this.view = v;
  }
}