
package beans;

import org.apache.logging.log4j.*;

public class HolaMundoAction {
    Logger log = LogManager.getLogger(HolaMundoAction.class);
    private String saludosAtr;
    
    public String execute() {
        log.info("ejecutando método execute desde struts2");
        this.setSaludosAtr("Adios desde struts2");
        return "exito";
    }
    
    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
}
