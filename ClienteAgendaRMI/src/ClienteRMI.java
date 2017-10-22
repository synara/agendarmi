import java.rmi.Naming;
import java.util.List;

public class ClienteRMI {
	public static void main(String [] args) {
		
		try {
			IAgenda agenda 
				= (IAgenda) Naming.lookup("//localhost:2020/AgendaServer");
			
			Contato c1 = new Contato();
			c1.setCod(1);
			c1.setNome("Synara");
			c1.setFone("85 86213111");
			agenda.registrarContato(c1);
			
			
			Contato c2 = new Contato();
			c2.setCod(2);
			c2.setNome("Uhuuuu");
			c2.setFone("85 86213111");
			agenda.registrarContato(c2);
			
			List<Contato> contatos = agenda.consultarContatos();
			
			for(Contato c: contatos) {
				System.out.println(c.getNome() + " " + c.getFone());
				
			}
			
			
		} catch(Exception e) {
			System.out.println("HelloClient exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
