package javaproject_1;

/**
 *
 * @author Diego A. Vivolo
 */
public class Ciudad {
  private String name;
  private final HormigaList hormigas = new HormigaList();
  private final RutaList rutas = new RutaList();

  public Ciudad(String name){
    this.name = name;
  }

    Ciudad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

      public HormigaList getStock() {
          return hormigas;
      }  

      public RutaList getRoutes() {
          return rutas;
      }   
  }
  