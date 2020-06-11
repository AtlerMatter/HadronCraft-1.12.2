package hc.handler;

public interface IEnergyHandler {
	
	//TODO Flesh out the system. This interface will be used on tile entities that transmit energy. Afterwards make one for entities that store it and/or use it.
	//make a class for a network, handled by the cables (create network on creating cable, split it on deleting cable, etc)
	/*
	 * How to implement the whole network system???
	 * Ideas:
	 * 		-Very simplistic way, in which most energy minecraft mods are made. Only thing that exists is Power and Energy
	 * 
	 * 		##-Simplistic way, but in which networks have a certain voltage and you must be careful about it (like Universal Electricity). Must assume AC to be able to step voltage.
	 * 		
	 * 		###-You have both AC and DC (with voltage implementation). Simulating cable resistance, cable heating, current generated from each source depending on circuit resistance. !Handle AC in RMS!
	 * 		
	 * 		#-AC and DC, with the above circuit simulation (resistance, current, etc), but handle AC current in actual Sine (or Cosine), and implement capacitance and inductance and their effects on the circuit.
	 * 		
	 * 		-The above option, but with a more in-depth circuit simulation. Transient circuit, Magnetic fields (and electric?), EM interference?, three-fase circuits, Harmonics, Deformed Power?, Resonant frequency, 
	 * 			Hysteresis losses, Foucault Current losses, (...)
	 * 		
	 * 		-Full blown circuit simulation, in which every component has two poles and you must complete the circuit for it to work, allowing you to install components in either series or parallel. All the above circuits 
	 * 			are as if we're assuming each cable Block has both positive and negative wires inside it.
	 * 
	 * More Questions:
	 * 		-Add insulated and uninsulated wires?
	 */
	
	public boolean joinNetwork(EnergyNetwork network);
	
	public boolean quitNetwork(EnergyNetwork network);
	
	public boolean hasNetwork();
	
	public EnergyNetwork getNetwork();
	
	public int getResistance();
	
	public int getCapacitane();
	
	public int getInductance();
	
	//public int Freq?
	
}
