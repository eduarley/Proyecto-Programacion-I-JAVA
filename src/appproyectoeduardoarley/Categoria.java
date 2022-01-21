
package appproyectoeduardoarley;

public class Categoria {
    private int codigo;
    private String nombre;
    private Enum_Categorias categorias;
    
    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        
    }
  
    public int getCodigo() {
        return codigo;
    }

    public void setCategorias(Enum_Categorias categorias) {
        this.categorias = categorias;
    }

    public Enum_Categorias getCategorias() {
        return categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return ","+" Categoría: "+nombre;
    }
    
}
