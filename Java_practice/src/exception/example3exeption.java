package exception;



import java.net.MalformedURLException;
import java.net.URL;

public class example3exeption {





	public static void main(String a[]){
		example3exeption mmcb = new example3exeption();
	mmcb.execute(1);
	mmcb.execute(2);
	   }

	public void execute(int i){
	try{
	if(i == 2){
	getIntValue("7u");
	           } else {
	getUrlObj("www.junksite.com");
	           }
	       } catch (NumberFormatException nfe){
	System.out.println("Inside NumberFormatException... "+nfe.getMessage());
	       } catch (MalformedURLException mue){
	System.out.println("Inside MalformedURLException... "+mue.getMessage());
	       }
	   }
	public int getIntValue(String num){
	return Integer.parseInt(num);
	   }

	public URL getUrlObj(String urlStr) throws MalformedURLException{
	return new URL(urlStr);
	   }

	}

