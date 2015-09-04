// September 4th , 2015. By John P. Kelly. CSE 2: Fundamentals of Computer Programming.
// The purpose of this program is to record data collected from bike rides

public class Cyclometer {
    
    
   	public static void main(String[] args) {
        int secsTrip1=480;  //Seconds it took to complete Trip 1
       	int secsTrip2=3220;  //Seconds it took to complete Trip 2
		int countsTrip1=1561;  //Wheel rotations in Trip 1
		int countsTrip2=9037; //Wheel rotations in Trip 2
		double wheelDiameter=27.0;  //Diameter of the wheel
    	double PI=3.14159; //Constant; Ratio of a circle's circumference to its diameter
  	    double feetPerMile=5280;  //Constant; Number of feet per mile
  	    double inchesPerFoot=12;   //Constant; Number of inches per foot
  	    double secondsPerMinute=60;  //Constant; Number of seconds per minute
	    double distanceTrip1, distanceTrip2,totalDistance;  //Prints out the distances for each trip, as well as total distances
        System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	    distanceTrip1=inchesPerFoot*feetPerMile; // Converts to distance in miles
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	    totalDistance=distanceTrip1+distanceTrip2;
	    System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");	

	}   
}
