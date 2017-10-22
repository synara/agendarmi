import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;

public class ServidorRMI {
	public static void main(String[] args) {
		
		try {
			AgendaImpl agenda = new AgendaImpl();
			LocateRegistry.createRegistry(2020);
			Naming.rebind("//localhost:2020/AgendaServer", agenda);
			
			System.out.println("Servidor ativo.");
		} catch(Exception e) {
			System.out.println("Servidor erro: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
