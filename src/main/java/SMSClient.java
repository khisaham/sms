import javax.comm.NoSuchPortException;
import javax.swing.JOptionPane;

/*
 * 
 * @author : Khisa Ham
 *
*/
public class SMSClient implements Runnable{

  public final static int SYNCHRONOUS=0;
  public final static int ASYNCHRONOUS=1;
  private Thread myThread=null;

  private int mode=-1;
  private static String recipient=null;
  private static String message=null;

  public int status=-1;
  public long messageNo=-1;


  public SMSClient(int mode) {
      this.mode=mode;
    }

  public SMSClient(String recipient2, String message2) {
	// TODO Auto-generated constructor stub
}

public int sendMessage (String recipient, String message){
    this.recipient=recipient;
    this.message=message;
    //System.out.println("recipient: " + recipient + " message: " + message);
    myThread = new Thread(this);
    myThread.start();
//    run();
    return status;
    }
    public void run(){

    Sender aSender = new Sender(recipient,message);

    try{
      //send message
          aSender.send ();

         // System.out.println("sending ... ");

      //in SYNCHRONOUS mode wait for return : 0 for OK, -2 for timeout, -1 for other errors
      if (mode==SYNCHRONOUS) {
          while (aSender.status == -1){
            myThread.sleep (1000);
          }
      }
      if (aSender.status == 0) messageNo=aSender.messageNo ;

    }catch (Exception e){

        e.printStackTrace();

    }

    this.status=aSender.status ;

    aSender=null;


  }
    public static void main(){
    	SMSClient sms = new SMSClient(recipient,message);
    	try{
		
    		sms.sendMessage("+254705493142", "Ham");
			sms.sending(generated);
    		JOptionPane.showConfirmDialog(null,"Message send");
    	}
    	catch(Exception e){
    		System.out.println("No such number");
    		
    	}
    	
    	//sms.setVisible(true);
    	
    }
   
}