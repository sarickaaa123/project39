package project38;
	class Min {
	    int min;

	    void minFun(int n1, int n2) { // Method - min od dva broja; min=n1; //pretpostaven minimum
	        min = n1; // Assign the initial value to min
	        if (min > n2) {
	            min = n2;
	        }
	        System.out.println("Od broevite " + n1 + " i " + n2 + " pomal e " + min);
	    }

	    void minFun(int n1, int n2, int n3) { // Method - min od tri broja
	        min = n1; // Assign the initial value to min
	        if (min > n2) {
	            min = n2;
	        }
	        if (min > n3) {
	            min = n3;
	        }
	        System.out.println("Od broevite " + n1 + " " + n2 + " " + n3 + " najmal e " + min);
	    }

	    public static void main(String[] args) {
	        Min najmal = new Min(); // kreiraj objekt
	        najmal.minFun(11, 6); // povik na metod - min od dva broja
	        najmal.minFun(6, 3, 4); // povik na metod - min od tri broja
	    }
	}
