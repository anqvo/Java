import java.net.ServerSocket;
import java.net.Socket;
import java.net.ClientSocket;
import java.io.*;

public class BasicServer {
	
	public static void main(String[] args) {
		
		// Step 1: Create a ServerSocket
		int portNumber = 5000; // must be four digits
		ServerSocket serverSocket = new ServerSocket(portNumber);
		
		// Step 2: Listen for Socket requests
		while(true) {
			// Poll until a connection received
			Socket clientSocket = serverSocket.accept();
			
			// Create tools to read from client
			InputStream clientInputStream = clientSocket.getInputStream();
			InputStreamReader clientInput = new InputStreamReader(clientInputStream);
			BufferedReader reader = new BufferedReader(clientInput);
			
			// Create tools to write to client
			OutputStream clientOutput = clientSocket.getOutputStream();
			PrintWriter writer = new PrintWriter(clientOutput);
			
			// Perform service for client
			String line;
			while((line = reader.readLine()) != null) {
				writer.println(line);
			}
			
			// Clean up resources
			writer.flush();
			writer.close();
			reader.close();
			clientSocket.close();
		}
		
	}	// End method main()
	
}	// End class BasicServer
