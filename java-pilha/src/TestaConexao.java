
public class TestaConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("aconteceu um erro na conexao");
		}
		
		
//		Conexao conexao = null;
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//		}catch(IllegalStateException ex) {
//			System.out.println("erro");		
//		}finally {
//			if(conexao != null)
//			conexao.fecha();
//		}

	}

}
