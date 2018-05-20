package daniel.semana2;

public class Datos {
    private String nombre;
    private String fecha;
    private String telefono;
    private String mail;
    private String descripcion;

    public Datos(String nombre, String fecha, String telefono, String mail, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.telefono = telefono;
        this.mail = mail;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
