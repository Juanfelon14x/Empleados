package co.edu.uniquindio.poo.EmpleadosTaller;

public class EmpleadoTiempoCompleto extends Empleado{
    public double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String identificacion, double salarioMensual) {
        super(nombre, identificacion);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [" + super.toString() + "salarioMensual=" + salarioMensual + "]";
    }

//--------------------------------------------------Metodos----------------------------------------------------//

    public double calcularSalario(){
        return salarioMensual;
    }
}