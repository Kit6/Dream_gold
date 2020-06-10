package dg_pack;
import java.util.Random;

public class play {

	
	
	
		public static String plays() {
			Random rand = new Random();
			String [] howPlay = {"Movie","Music",};
			int playToday = rand.nextInt(howPlay.length);
			
			String how = howPlay[playToday];
			return how ;
		}

}
