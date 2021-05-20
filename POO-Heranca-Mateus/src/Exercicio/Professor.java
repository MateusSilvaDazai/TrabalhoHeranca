package Exercicio;

public class Professor extends Pessoa {
	 private String curso;
	 private double salario;
	private double horasTrabalhadas;
	private double salarioHora;
	private int dependentes;
	 
	public Professor(String nome, String endereco, int telefone, int cpf, String curso, double salario) {
		super(nome, endereco, telefone, cpf);
		this.curso = curso;
		this.salario = salario;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	 
	public double calcularSalario() {
		this.salario = this.getSalario()*1.05;
		return this.salario;
	}
	
	public void setHorasTrabalhadas(double horasTrabalhadas){
	    this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioHora(){
	    return getSalarioHora();
	}

	public void setSalarioHora(double salarioHora){
	    this.salarioHora = salarioHora;
	}

	public int getDependentes(){
	    return getDependentes();
	}

	public void setDependentes(int dependetes){
	    this.dependentes = dependetes;
	}

	public double calcularSalarioBruto(){
	    //             0        *      0
	    return horasTrabalhadas * salarioHora +
	  // 50 *    0
	    (50 * dependentes); // resultado = 0
	}

	public double calcularDescontoINSS(){
	    double salarioBruto = calcularSalarioBruto();
	    if(salarioBruto <= 1000){
	        //           0
	        return salarioBruto * (8.5/100); // resultado = 0
	    }else{
	    	return salarioBruto * (9.0/100);
	    }
	}

	public double calcularDescontoIR(){
	    double salarioBruto = calcularSalarioBruto();
	    if(salarioBruto <= 500){
	        return 0;
	    }else if(salarioBruto <= 1000){
	        return salarioBruto * (5/100);
	    }else{
	        return salarioBruto * (7/100);
	    }
	}

	public double calcularSalarioLiquido(){
	    double salarioBruto = calcularSalarioBruto();
	    double inss = calcularDescontoINSS();
	    double ir = calcularDescontoIR();
	    return salarioBruto - inss - ir;
	}
	
}
