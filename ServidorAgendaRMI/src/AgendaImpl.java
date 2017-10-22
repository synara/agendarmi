import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AgendaImpl extends UnicastRemoteObject implements IAgenda {
	
	private ArrayList<Contato> contatos;
	
	public AgendaImpl() throws RemoteException {
		contatos = new ArrayList<>();
	}
	

	@Override
	public void registrarContato(Contato contato) throws RemoteException {
		boolean existe = false;
		
		for(Contato cnt : contatos) {
			if(contato.getCod() == cnt.getCod()) {
				cnt.setNome(contato.getNome());
				cnt.setFone(contato.getFone());
				existe = true;
			}
		}
		
		if(!existe) {
			contatos.add(contato);
		}
		
		
	}

	@Override
	public Contato consultarContato(int codigo) throws RemoteException {
		Contato contato = null; 
		
		for(Contato c: contatos) {
			if(c.getCod() == codigo) {
				contato = c;
			}
		}
		
		return contato;
	}

	@Override
	public List<Contato> consultarContatos() throws RemoteException {
		return contatos;
	}
	
}
