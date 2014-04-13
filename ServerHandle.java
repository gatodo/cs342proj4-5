import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;


public class ServerHandle extends Thread{
	
	private ServerSocket serverSocket = null;
	private Vector<Socket> clientSockets = null;
	private int portNum;
	
	public ServerHandle(int port) {
		try {
			serverSocket = new ServerSocket(port);
			portNum = serverSocket.getLocalPort();
		} catch (IOException e) {
			portNum = -1;
			System.err.println("Could not listen on port" + port);
			System.exit(-1);
		}
		
		this.start();
	}
	
	@Override
	public void run(){
		
	}

}
