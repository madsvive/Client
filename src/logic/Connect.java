package logic;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import shared.encryptionAES; 

public class Connect {
	private Socket clientSocket;
	private DataOutputStream outToServer;
	private String ServerIP = "172.17.167.195";
	private int Port = 8888;

	public void ServerConnect() {

		try {
			clientSocket = new Socket(ServerIP, Port);
			outToServer = new DataOutputStream(clientSocket.getOutputStream());
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
		
		ServerConnect();
		String  encrypted = encryptionAES.encrypt(gsonString);
		System.out.println(encrypted);
		
		try {
			outToServer.writeUTF(encrypted);
			outToServer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}