package simples;

public class ContaSimples extends Conta {

	private double saldoPolpan�a;

	public double getSaldoPolpan�a() {
		return saldoPolpan�a;
	}

	public void setSaldoPolpan�a(double saldoPolpan�a) {
		this.saldoPolpan�a = saldoPolpan�a;
	}
	public static boolean DepositoPolpan�a(double valor) {
		if (valor > 0) {
			return true;
		}else
		return false;
	}
	public static boolean SaquePolpan�a(double valor) {
		if (valor > 0) {
			return true;
		}else
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPolpan�a=");
		builder.append(saldoPolpan�a);
		builder.append(", getSaldoPolpan�a()=");
		builder.append(getSaldoPolpan�a());
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
