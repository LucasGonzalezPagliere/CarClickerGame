package CookiePackage;

public class Runnable1 implements Runnable {

static boolean start = false;
	
static int MonkeySleep = 2000;

	TheClick click = new TheClick();
	
@Override
public void run() {
	while(true){
		if(start){
			
			click.TheClicker();
			
			
			
			try {
				Thread.sleep(MonkeySleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("nah nigga no incrementing going on; error");
				e.printStackTrace();
			}
			
			
			
			
		}
	}
	
}
}