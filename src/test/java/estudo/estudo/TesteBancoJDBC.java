package estudo.estudo;

import org.junit.Test;

import conexaojdbc.SingleConnection;

public class TesteBancoJDBC {
	
	@Test
	
	public void teste_de_conexao_postgresql() {
		SingleConnection.getConnection();
	}
			
	
}
