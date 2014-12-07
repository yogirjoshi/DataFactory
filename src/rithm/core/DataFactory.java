/**
 * 
 */
package rithm.core;

import java.util.Collection;

/**
 * @author y2joshi
 *
 */
public abstract class DataFactory <T1 extends ProgState, T2 extends Collection<ProgState> > implements RiTHMPlugin{
	protected T2 EventQueue;
	abstract public String GetNextJSONEvent();
	abstract public void SetFile(String Inputfilename);
	abstract public void Export (String Outputfilename);
	abstract public T1 GetNextProgState();
	abstract public boolean ReserFilePosition();
	abstract public String GetJSONAt(long i);
	abstract public T1 GetProgStateAt(long i);
	abstract public String GetJSONAtTimeStamp(double Ts);
	abstract public T1 GetProgStateAtTimeStamp(double Ts);
	abstract public void ClearBuffer();
}
