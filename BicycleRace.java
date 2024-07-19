import java.util.ArrayList;

	public class BicycleRace {
		private String raceName;
		private int MaxBikes;
		private ArrayList<Bicycle> bicycleList;
	
		public BicycleRace (String name, int n) {
			setRaceName(name);
			MaxBikes = n;
			bicycleList = new ArrayList<Bicycle>();
	}
		
		public String getRaceName() {
			return raceName;
		}

		public void setRaceName(String raceName) {
			this.raceName = raceName;
		}

		public void addByke(Bicycle b) {
			if (bicycleList.size() < MaxBikes) {
				bicycleList.add(b);
			}
			else {
				System.out.println("no mor room");
			}
		}
		
		public int howManyMountainBykes() {
			int x =0;
			for(int i = 0; i <= bicycleList.size(); i++) {
				if(bicycleList.get(i) instanceof MountainBike) {
					x++;
				}
			}
			return x;
		}
		
		public void startIncline() {
			for(int i = 0; i <= bicycleList.size(); i++) {
				if(bicycleList.get(i) instanceof MountainBike) {
					((MountainBike) bicycleList.get(i)).dec();;
				}
			}
		}
		public boolean isAbort() {
			if(bicycleList.size() < (MaxBikes / 2)) {
				return true;
			}
			if(this.howManyMountainBykes() < (MaxBikes / 4)) {
				return true;
			}
			return false;
		}
			
		
}