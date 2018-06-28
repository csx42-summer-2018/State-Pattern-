package fourWayStreetLights.driver;


import fourWayStreetLights.service.StretLightsContext;
import fourWayStreetLights.util.FileProcessor;
import fourWayStreetLights.util.Results;
import fourWayStreetLights.util.Logger;
public class Driver {
	public static void main(String[] args) {
		try{
		//It create Results and myArrayList objects and passes them to the test me function
				if (args.length != 2) {
					System.out.println("Please Enter Both Input and Output Files");
					System.exit(0);
				}
				String abc = args[0];
				String abc1 = args[1];
				String a=args[2];
				int q=Integer.parseInt(args[2]);
				StretLightsContext sx=new StretLightsContext();
				FileProcessor fp = new FileProcessor(abc);
				Results rs = Results.Instance();
				Logger.setDebugValue(q);
				String s="";
				while(s!=null){
					s=fp.readline();
				if(s!=null){
					sx.action(s);
				}
				}
				
				rs.writeToFile(abc1);
		}
		catch(Exception e){
			System.out.print("CANNOT READ THE INPUT AND OUTPUT FILES");
			e.printStackTrace();
			System.exit(0);
		}
	}
}
