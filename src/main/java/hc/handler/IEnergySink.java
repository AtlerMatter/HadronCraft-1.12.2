package hc.handler;

public interface IEnergySink extends IEnergyHandler {
	
	public boolean isUsing();
	public int getFreq();
	public int getVoltage();
}
