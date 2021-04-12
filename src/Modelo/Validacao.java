package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String lado1, String lado2, String lado3)
      {
        super(lado1, lado2, lado3);
        this.validar();
      }

    
    private void validar()
      {
          this.setMensagem("");
          try
          {
              this.setL1(Double.parseDouble(this.getLado1()));
              this.setL2(Double.parseDouble(this.getLado2()));
              this.setL3(Double.parseDouble(this.getLado3()));
          }
          catch (Exception e)
          {
              setMensagem("Digite um numero valido");
          }
      }
    
}
