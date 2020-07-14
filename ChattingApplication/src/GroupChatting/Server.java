package GroupChatting;

import java.io.BufferedReader;

import java.io.*;
import java.net.*;

/*Here are one server and multiple client 
 * this is a group Chatting application 
 * here we use multi threading ,swing, buffer reader and buffer writter 
 */
public  class Server implements Runnable {
		Socket socket;
	public Server(Socket s) {						//use constructor to initiallse the value of variable
		try {
			this.socket= s;
			
		}catch(Exception e) {
			
		}
	}
	public void run () {
		try {
			BufferedReader reader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		
		while(true) {
			String str= reader.readLine().trim();
			System.out.println("Recieved"+str);
		}
		}catch (Exception e){
			
		}
	}
	
	public static void main (String []args) throws Exception {
		ServerSocket  skt = new ServerSocket (2001);
		   while(true) {
			   Socket socket= skt.accept();
			   Server server = new Server(socket);
			   Thread thread = new Thread();
			   thread.start();
		   }
		   
	}
}
