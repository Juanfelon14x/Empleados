package co.edu.uniquindio.poo.EmpleadosTaller;

public class EmpleadoFreelance extends Empleado{
    public int proyectosCompletados;
    public double pagoPorProyecto;

    public EmpleadoFreelance(String nombre, String identificacion, int proyectosCompletados, double pagoPorProyect) {
        super(nombre, identificacion);
        this.proyectosCompletados = proyectosCompletados;
        this.pagoPorProyecto = pagoPorProyect;
    }

    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [" + super.toString() + "pagoPorProyecto=" + pagoPorProyecto + "]";
    }

//--------------------------------------------------Metodos----------------------------------------------------//

    public double calcularSalario(){
        double salario =  proyectosCompletados * pagoPorProyecto;
        return salario;
    }
}