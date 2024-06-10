package _06_vault;

public class vaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		System.out.println(vault.tryCode(1000001));
		secretAgent secretagent = new secretAgent();
		System.out.println(secretagent.findCode(vault));
		
		
		
		
		
	}
}
