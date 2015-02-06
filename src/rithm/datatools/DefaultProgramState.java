package rithm.datatools;

import java.util.HashMap;

import rithm.core.ProgState;

public class DefaultProgramState extends ProgState{
	public HashMap<String, String> field_dictionary;
	public DefaultProgramState(double timestamp) {
		// TODO Auto-generated constructor stub
		super(timestamp);
		field_dictionary = new HashMap<String, String>();
	}
	public String GetVal(String key)
	{
		if(field_dictionary.containsKey(key))
			return field_dictionary.get(key);
		return null;
	}
	public double GetTimestamp()
	{
		return this.timestamp;
	}
	public boolean SetVal(String key,String Val)
	{
		if(field_dictionary.containsKey(key))
			return false;
		else
			field_dictionary.put(key, Val);
		return true;
	}
	public HashMap<String, String> getDictionary()
	{
		return this.field_dictionary;
	}
}
