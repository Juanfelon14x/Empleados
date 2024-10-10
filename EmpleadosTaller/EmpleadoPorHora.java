package co.edu.uniquindio.poo.EmpleadosTaller;

public class EmpleadoPorHora extends Empleado{
    public int horasTrabajadas;
    public double salarioPorHora;

    public EmpleadoPorHora(String nombre, String identificacion, int horasTrabajadas, double salarioPorHora) {
        super(nombre, identificacion);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [" + super.toString() + " salarioPorHora= " + salarioPorHora + "]";
    }

//--------------------------------------------------Metodos----------------------------------------------------//

    public double calcularSalario(){
        double salario = horasTrabajadas * salarioPorHora;
        return salario;
    }
}