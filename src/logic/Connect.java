package logic;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connect {
	
	private Socket clientSocket;
	private PrintWriter outToServer;
	private String ServerIP = "localhost";
	private int Port = 8888;
	private BufferedReader inFromServer; 

	public void ServerConnect() {

		try {
			clientSocket = new Socket(ServerIP, Port);
			outToServer = new PrintWriter(clientSocket.getOutputStream());
			System.out.println("Connected with IP: " + ServerIP
					+ " through Port: " + Port);
		} catch (UnknownHostException e) {
			System.out.println("No Host found -Connection not established");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Connection not established");
			e.printStackTrace();
		}
	}

	public void Send(String gsonString) throws Exception {
		outToServer = new PrintWriter(clientSocket.getOutputStream());

//		String encrypted = encryption.encrypt(toServer);
		System.out.println(gsonString);

		outToServer.write(gsonString);
		outToServer.flush();
	}

	public String Recieve(String gsonString) throws Exception {
		
		inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		String stringFromServer = inFromServer.readLine(); 
//		String decrypted = encryption.decrypt(stringFromServer);

		return stringFromServer;
	}

}