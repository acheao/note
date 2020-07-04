package httpServer;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServer{
	public static void main(String[] args){
		int port = 8080;
		try(ServerSocket serverSocket = new ServerSocket(port)){
			System.out.println("create the Internet now ...");
			
			while(true){
				final Socket socket = serverSocket.accept();
				System.out.println("the server is listening the port:"+serverSocket.getLocalPort());
				System.out.println("create a new tcp connection with client , it host is :"
				+socket.getInetAddress()+":"+socket.getPort());
				service(socket);
			}
			
		}catch(Exception e){
			e.printStackTrace();			
		}
		
	}

	private static void service(Socket socket) throws InterruptedException {
		try(InputStream is = socket.getInputStream();) {
			int size = is.available();
			byte[] buffer =new byte[size];
			is.read(buffer);
			String request = new String(buffer);		
			System.out.println(request);
			Thread.sleep(5000);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
