
import java.util.Hashtable;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

import weblogic.jndi.WLInitialContextFactory;
public class Sender {
	public static void main(String[] args) {
		try {
			Hashtable<String, String> env = new Hashtable<String, String>();
			env.put(Context.PROVIDER_URL, "t3://localhost:7001");
			env.put(Context.INITIAL_CONTEXT_FACTORY, WLInitialContextFactory.class.getName()); 
			Context ctx = new InitialContext(env);
			
			QueueConnectionFactory qcf = (QueueConnectionFactory) ctx.lookup("MY_QCF");
			Queue queue = (Queue) ctx.lookup("MY_Q");
			
			QueueConnection con = qcf.createQueueConnection();
			con.start();
			QueueSession session = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			
			QueueSender sender = session.createSender(queue);

			TextMessage msg = session.createTextMessage();
			msg.setText(args[0]);
			sender.send(msg);
			
			System.out.println("Message Sent:-");
			session.close();
			con.close();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
