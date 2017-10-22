import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IAgenda extends Remote {
	void registrarContato(Contato contato) throws RemoteException;
	Contato consultarContato(int codigo) throws RemoteException;
	List<Contato> consultarContatos() throws RemoteException;
}
