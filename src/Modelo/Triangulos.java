package Modelo;

public class Triangulos extends absPropriedades
{

    public Triangulos(Double l1, Double l2, Double l3)
      {
        super(l1, l2, l3);
        this.verificar();
      }
    
    private void verificar()
      {
          setMensagem("");
          if(this.getL1().equals(this.getL2()))
          { 
              if(this.getL1().equals(this.getL3()))
              {
                setMensagem("Triangulo Equilatero");   
              }
              else
              {
                  setMensagem("Triangulo isoceles");
              }
          }
          else if(this.getL1().equals(this.getL3()))
          {
             if(this.getL1().equals(this.getL2()))
             {
                 setMensagem("Triangulo Equilatero");
             }
             else
             {
                 setMensagem("Triangulo isoceles");
             }
          }
          else if(this.getL2().equals(this.getL3()))
          {
             setMensagem("Triangulo isoceles");
          }
          else if(this.getL1().equals(this.getL2()))
          {
             setMensagem("Triangulo isoceles");
          }
          else
          {
              setMensagem("Triangulo escaleno");
          }
          
          if(getMensagem().equals("Triangulo Equilatero"))
          {
              setMensagem("Triangulo Equilatero");
          } 
          else if(this.getL1()+this.getL2()<this.getL3())
          {
              setMensagem("Não é um triangulo");
          }
          else if(this.getL1()+this.getL3()<this.getL2())
          {
              setMensagem("Não é um triangulo");
          }
          else if(this.getL2()+this.getL3()<this.getL1())
          {
              setMensagem("Não é um triangulo");
          }

      }
    
    
}
