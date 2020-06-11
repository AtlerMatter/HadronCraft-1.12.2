package hc.handler;

public interface IEnergySource extends IEnergyHandler {
	
	public boolean isProducing();
	public int getVoltage();
	public int getFreq();
}
