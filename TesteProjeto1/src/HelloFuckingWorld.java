import javax.management.timer.Timer;

public class HelloFuckingWorld {
	int delay = 0;
	int interval = 1000;
	Timer timer = new Timer();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		timer.scheduleAtFixedRate (new TimerTask) {}
		System.out.println("Ana, banana...");
		System.out.println("É um real a palma da banana\n");
		
*/
		public void TarefaAnaBanana() {
			int delay = 0;   // delay de 0 seg.
			int interval = 2000;  // intervalo de 2 seg.        
	
			timer2.scheduleAtFixedRate(new TimerTask() {
					public void run() {
						System.out.println("Olá World no console");
					}
				}, delay, interval);
		}
		
	}
}