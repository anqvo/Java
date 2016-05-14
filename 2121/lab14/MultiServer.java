import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiServer {
	
	public static void main(String[] args) {
		int portNumber = 5555;
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		try {
			serverSocket = new ServerSocket(portNumber);
			ExecutorService service;
			service = Executors.newCachedThreadPool();
			clientSocket = serverSocket.accept();
			ConnectionHandler handler = new ConnectionHandler(clientSocket);
			service.execute(handler);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				clientSocket.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
