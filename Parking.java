import java.util.Date;

public class Parking {
	
	class ParkingKucica{
		public final int UKUPNO_MJESTA=100;
		public final int  CIJENA=1;
		
		private int zauzetaMjesta=0;

		public int getZauzetaMjesta() {
			return zauzetaMjesta;
		}

//		public void setZauzetaMjesta(int zauzetaMjesta) {
//			this.zauzetaMjesta = zauzetaMjesta;
//		}		
	}
	
	class Gost{
		private Date pocetnoVrijemeParkiranja;
		private Date krajnjeVrijemeParkiranja;
	}
}
