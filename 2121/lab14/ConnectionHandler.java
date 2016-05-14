import java.net.Socket;
import java.

public class ConnectionHandler implements Runnable{
	private Socket clientSocket;
	
	public ConnectionHandler(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}
	
	public void run() {
		try {
			InputStream clientInputStream = clientSocket.getInputStream();
			InputStreamReader clientInput = new InputStreamReader(clientInputStream);
			BufferedReader reader = new BufferedReader(clientInput);
			OutputStream clientOutput = clientSocket.getOutputStream();
			PrintWriter writer = new PrintWriter(clientOutput);
			String line;
			while((line = reader.readLine()) != null) {
				writer.println(line);
			}
			writer.close();
			reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
