package intefaces;

public class SmsLogger implements Logger{
 public void log(String message) {
	 System.out.println("Sms Gönderildi :" + message);
 }
}
