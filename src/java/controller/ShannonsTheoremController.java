package controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.ShannonsTheoremModel;

/**
 *
 * @author Sean Proulx (prou0185@algonquinlive.com)
 */

@ManagedBean(name="controller")
@SessionScoped
public class ShannonsTheoremController implements Serializable{
    private static long serialVersionUID = -3377875199072595764L;
    private ShannonsTheoremModel model;
    
    
    public ShannonsTheoremController(){
       super();
       model = new ShannonsTheoremModel();
    }
    
    public String doCalculateMDR(){
        model.calculateMDR();
        return "index";
    }

    public ShannonsTheoremModel getModel() { return model; }
    
}
