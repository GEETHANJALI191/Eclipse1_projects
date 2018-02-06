package jmspro;
	import java.util.Scanner;

import javax.jms.Connection;
	import javax.jms.ConnectionFactory;
	import javax.jms.Destination;
	import javax.jms.JMSException;
	import javax.jms.MessageProducer;
	import javax.jms.Session;
	import javax.jms.TextMessage;
	import org.apache.activemq.ActiveMQConnection;
	import org.apache.activemq.ActiveMQConnectionFactory;

	public class Sender {
	private ConnectionFactory factory = null;
	private Connection connection = null;
	private Session session = null;
	private Destination destination = null;
	private MessageProducer producer = null;

	public Sender() {

	}

	public String sendMessage(String str) {

	try {
	factory = new ActiveMQConnectionFactory(
	ActiveMQConnection.DEFAULT_BROKER_URL);
	connection = factory.createConnection();
	connection.start();
	session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
	destination = session.createQueue("SAMPLEQUEUE");
	producer = session.createProducer(destination);
	TextMessage message = session.createTextMessage();
	message.setText(str);
	producer.send(message);
	System.out.println("Sent: " + message.getText());
	session.close();
	return message.getText();
	
	}
	catch (JMSException e)
	{
	e.printStackTrace();
	return "null";
	}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Sender sender = new Sender();
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	sender.sendMessage(str);
	}

	}



