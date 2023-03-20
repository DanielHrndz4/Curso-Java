package libros;
import javax.swing.JOptionPane;

public class Libros {

    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public Libros(String ISBN, String titulo, String autor, int numPaginas){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getISBN(){
        return ISBN;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }
    public int getNumPaginas(){
        return numPaginas;
    }
    public String toString(){
        return "El libro "+titulo+" con ISBN "+ISBN+" creado por "+autor+" tiene "+numPaginas+" paginas";
    }
    
    public static void main(String[] args) {
        
        Libros libro1 = new Libros("‎978-151-87-1137-4","La Divina Comedia","Dante Alighieri",304);
        Libros libro2 = new Libros("978-847-88-8720-0","El Principito","Antoine de Saint-Exupéry",120);
        
        JOptionPane.showMessageDialog(null, "\nPrimer libro\n"+libro1.toString()+"\n\n"+"Segundo libro\n"+libro2.toString());
        
        if(libro1.numPaginas>libro2.numPaginas){
            JOptionPane.showMessageDialog(null, "El libro con mas paginas es '"+libro1.titulo+"' con "+libro1.numPaginas+" paginas");
        }else{
            JOptionPane.showMessageDialog(null, "El libro con mas paginas es '"+libro2.titulo+"' con "+libro2.numPaginas+" paginas");
        }
    }
    
}
