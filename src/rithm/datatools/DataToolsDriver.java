package rithm.datatools;

public class DataToolsDriver {
	public static void main(String args[])
	{
		XMLDataFactory xdf;
		xdf = new XMLDataFactory("/home/y2joshi/TestDataTools.xml");
		String JSONStr="";
		do
		{
			JSONStr = xdf.GetNextJSONEvent();
			System.out.println(JSONStr );
		}while(!JSONStr.equals("{}"));
	}
	
}
