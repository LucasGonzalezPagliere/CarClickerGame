package CookiePackage;



public class Runnable4 implements Runnable {

static boolean start = true;
	
static int sleeper = 20000;

int router = 0;

	TheClick click = new TheClick();
	
@Override
public void run() {
	while(true){
		if(start){
			
        router ++;
		if(router % 2 != 0){
			GUI.btnChampionshipRace.setVisible(false);
			GUI.btnChampionshipRace.setEnabled(false);
		}
			
		if(router % 2 ==0) {
			GUI.btnChampionshipRace.setVisible(true);
			GUI.btnChampionshipRace.setEnabled(true);
		}
			
			
			
			
			try {
				Thread.sleep(sleeper);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("nah nigga no incrementing going on; error");
				e.printStackTrace();
			}
			
			
			
		}
	}
	
}
}