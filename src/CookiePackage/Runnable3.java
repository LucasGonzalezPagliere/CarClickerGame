package CookiePackage;



public class Runnable3 implements Runnable {

static boolean RacerStart = false;
	
public static int RacerSleep = 20;

	TheClick click = new TheClick();
	
@Override
public void run() {
	while(true){
		if(RacerStart){
			
			click.TheClicker();
			
			
			
			try {
				Thread.sleep(RacerSleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("nah nigga no incrementing going on; error");
				e.printStackTrace();
			}
			
			
			
			
		}
	}
	
}
}