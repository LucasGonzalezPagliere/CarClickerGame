package CookiePackage;



public class Runnable2 implements Runnable {

static boolean startSoccerMom = false;
	
static int SoccerMomSleep = 200;

	TheClick click = new TheClick();
	
@Override
public void run() {
	while(true){
		if(startSoccerMom){
			
			click.TheClicker();
			
			
			
			try {
				Thread.sleep(SoccerMomSleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("nah nigga no incrementing going on; error");
				e.printStackTrace();
			}
			
			
			
			
		}
	}
	
}
}