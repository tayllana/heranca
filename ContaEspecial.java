package simples;

public class ContaEspecial extends Conta{
	private int diaSemJuros;
	private double limite;
	
	public int getDiaSemJuros() {
		return diaSemJuros;
	}
	public void setDiaSemJuros(int diaSemJuros) {
		this.diaSemJuros = diaSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public static boolean DepositoEspecial(double valor) {
		if (valor > 0) {
			return true;
		}else
		return false;
	}
	public static boolean SaqueEspecial(double valor) {
		if (valor > 0) {
			return true;
		}else
		return false;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diaSemJuros=");
		builder.append(diaSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", getDiaSemJuros()=");
		builder.append(getDiaSemJuros());
		builder.append(", getLimite()=");
		builder.append(getLimite());
		builder.append(", getAgencia()=");
		builder.append(getAgencia());
		builder.append(", getNumeroConta()=");
		builder.append(getNumeroConta());
		builder.append(", getBanco()=");
		builder.append(getBanco());
		builder.append(", getSaldo()=");
		builder.append(getSaldo());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
}
