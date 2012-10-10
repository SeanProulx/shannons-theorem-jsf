package model;

import java.io.Serializable;

/**
 *
 * @author Sean Proulx (prou0185@algonquinlive.com)
 */
public class ShannonsTheoremModel implements Serializable {
    
    private static long serialVersionUID = -8037464308471058986L; 
    private Double bandwidth;
    private Double maximumDataRate;
    private Double signalToNoise;
    
    public ShannonsTheoremModel(){
        this(0.0D, 0.0D);
    }
    
    public ShannonsTheoremModel (Double bandwidth, Double signalToNoise){
        super();
        
        this.bandwidth = bandwidth;
        this.signalToNoise = signalToNoise;
        this.maximumDataRate = 0.0D;
    }
    
    public void calculateMDR(){
        maximumDataRate = (this.getBandwidth() * (Math.log(1 +
                Math.pow(10, this.getSignalToNoise() / 10)) / Math.log(2)));
    }

    public Double getBandwidth() { return bandwidth;}
    public Double getMaximumDataRate(){ return this.maximumDataRate; }
    public Double getSignalToNoise(){ return this.signalToNoise; }
    public void setBandwidth(Double bandwidth){ this.bandwidth = bandwidth; }
    public void setSignalToNoise(Double signalToNoise){ this.signalToNoise = signalToNoise; }
    
    @Override
    public String toString(){
        return ("ShannonsTheoremModel[bandwidth=" + this.bandwidth
                + " ,signalToNoise=" + this.signalToNoise
                + " ,maximumDataRate=]" + this.maximumDataRate);
    }
}
