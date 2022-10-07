public class LandCalc
{

    public static void main(string[] arg)
    {

        int AcreSize= 43560;        //Size of Acre
        int tractorofland = 389767;      //Tract of land
        
        double numAcres;
       
        //Calculate no. of acres in this land tract
        numAcres = (double) tractorofland / AcreSize;
        
        System.out.println("The number of acres is" + tractorofland+ "is" numAcres);
    }

}
