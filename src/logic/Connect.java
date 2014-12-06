package logic;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import shared.encryptionAES;

public class Connect {
	private Socket clientSocket;
	private DataOutputStream outToServer;
	private String inFromServer;
	private String ServerIP = "localhost";
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

	public void Send(String toServer) throws Exception {
		ServerConnect();
		String encrypted = encryptionAES.encrypt(toServer);
		System.out.println(encrypted);

		try {
			outToServer.writeUTF(encrypted);
			outToServer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String Recieve() throws Exception {
		inFromServer = new DataInputStream(clientSocket.getInputStream())
				.toString();
		String decrypted = encryptionAES.decrypt(inFromServer);

		return decrypted;
	}

}