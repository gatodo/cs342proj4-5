import java.io.Serializable;

/**
 * 
 */

/**
 * @author jmarav3
 *
 */
public abstract class abstractMessage implements Serializable {
	
	public enum MESSAGETYPE{
		SCHAT, //a chat message from server to client
		CCHAT, //a chat message from client to server
		CALLME, //a request to set a user name
		INFO, //a client is requesting information
		RESP, //the server is responding to a request
		BYE, //client is disconnecting
		DEAD //the server is dropping a client
	}

	private static final long serialVersionUID = 1L;
	private MESSAGETYPE type;
	
	public abstractMessage(MESSAGETYPE t) {
		type = t;
	}
	
	public MESSAGETYPE getType(){
		return type;
	}
}
