//Second homwork assignment for CSE 2
//Due September 8th, 2015, by John Kelly
//(‘$’ is part of the variable name)

public class Arithmetic {
    
    public static void main(String[] args) {
        
        double taxPercent=0.06;
        double taxMultiplier = taxPercent + 1;
        
        int nSocks=3; //Number of pairs of socks
        double sockCost$=2.58;  //Cost per pair of socks
        
        double totalSockCost$ = sockCost$ * nSocks; //total cost of socks
        double sockTax$ = ((int)(totalSockCost$ * taxPercent)*100)/100; //tax on socks
        double socksPostTax$ = ((int)(totalSockCost$ * taxMultiplier)*100)/100; //cost of socks after tax
        
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        
        double totalGlassCost$ = glassCost$ * nGlasses; //total cost of glasses
        double glassTax$ = ((int)(totalGlassCost$ * taxPercent)*100); //tax on glass
        double glassPostTax$ = ((int)(totalGlassCost$ * taxMultiplier)*100)/100; //cost of glasses after tax
        
        
        int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        
        double totalEnvelopeCost$ = envelopeCost$ * nEnvelopes; //total cost of envelopes
        double envelopeTax$ = ((int)(totalEnvelopeCost$ * taxPercent)*100); //tax on envelopes
        double envelopePostTax$ = ((int)(totalEnvelopeCost$ * taxMultiplier)*100)/100; //cost of envelopes after tax
        
        
        System.out.println(totalSockCost$); //print out total cost of socks
        System.out.println(sockTax$); //print out socks tax
        System.out.println(socksPostTax$); //print out socks cost post-tax
        System.out.println(totalGlassCost$); //print out total cost of glasses
        System.out.println(glassTax$); //print out glass tax
        System.out.println(glassPostTax$); //print out glass cost post-tax
        System.out.println(totalEnvelopeCost$); //print out total cost of envelopes
        System.out.println(envelopeTax$); //print out evelope tax
        System.out.println(envelopePostTax$); //print out enevelope cost post-tax
        
        
    }
        

}