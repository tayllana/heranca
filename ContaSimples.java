package simples;

public class ContaSimples extends Conta {

	private double saldoPolpança;

	public double getSaldoPolpança() {
		return saldoPolpança;
	}

	public void setSaldoPolpança(double saldoPolpança) {
		this.saldoPolpança = saldoPolpança;
	}
	public static boolean DepositoPolpança(double valor) {
		if (valor > 0) {
			return true;
		}else
		return false;
	}
	public static boolean SaquePolpança(double valor) {
		if (valor > 0) {
			return true;
		}else
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPolpança=");
		builder.append(saldoPolpança);
		builder.append(", getSaldoPolpança()=");
		builder.append(getSaldoPolpança());
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
