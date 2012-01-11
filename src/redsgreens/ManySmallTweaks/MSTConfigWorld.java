package redsgreens.ManySmallTweaks;

public class MSTConfigWorld {

	public Boolean FloatingLadders = false;
	public Boolean FloatingRails = false;
	public Boolean FloatingHatch = false;
	public Boolean ButtonsOnMoreBlocks = false;
	public Boolean ProjectileTriggers = false;
	public Double PercentSaddledPigs = 0D;
    public Double PercentColorSheep = 0D;
    public Boolean KeepSaddleOnPigDeath = false;
    public Boolean RedstoneIgnitesNetherrack = false;
    public Boolean InfiniteCauldrons = false;

	public MSTConfigWorld(Boolean floatingLadders, Boolean floatingRails, Boolean floatingHatch, Boolean buttonsOnMoreBlocks, 
			Boolean projectileTriggers, Double percentSaddledPigs, Double percentColorSheep, Boolean keepSaddleOnPigDeath, Boolean redstoneIgnitesNetherrack,
			Boolean infiniteCauldrons)
	{
		FloatingLadders = floatingLadders;
		FloatingRails = floatingRails;
		FloatingHatch = floatingHatch;
		ButtonsOnMoreBlocks = buttonsOnMoreBlocks;
		ProjectileTriggers = projectileTriggers;
		PercentSaddledPigs = percentSaddledPigs;
		PercentColorSheep = percentColorSheep;
		KeepSaddleOnPigDeath = keepSaddleOnPigDeath;
		RedstoneIgnitesNetherrack = redstoneIgnitesNetherrack;
		InfiniteCauldrons = infiniteCauldrons;
	}
}