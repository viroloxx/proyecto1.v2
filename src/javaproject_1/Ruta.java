package javaproject_1;

/**
 *
 * @author Diego A. Vivolo
 */
public class Ruta{
  
  private Ciudad ciudad;
  private float distancia;
  private int feromonas;
  private Ciudad inicio;



  public Ruta(Ciudad ciudad, float distancia,int feromonas){
    this.ciudad = ciudad;
    this.distancia = distancia;
    this.feromonas = 1;
    
  }
  public Ciudad getCiudad(){
    return ciudad;
  }

  public void setCiudad(Ciudad ciudad){
    this.ciudad = ciudad;
  }
  public float getDistancia(){
    return distancia;
  }
  public void setDistancia(float distancia)
    this.distancia = distancia;
  }
  public estaAlre(){
    return distancia < 0;
  }

  public int getFeromonas(){
    return feromonas;
  }
} 
    
}
