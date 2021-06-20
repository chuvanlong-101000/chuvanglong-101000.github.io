package abstractencapsulate.usa;

import abstractencapsulate.JetFighter;

public abstract class USFighter extends JetFighter {

    protected USFighter(String model){
        super("USA" , model);
    }

    @Override
    protected String secretCodeCommunicate() {
        return " New York Pearl Harboue ";
    }

    public abstract void callOtherJetfighter ( USFighter otherJetFigher );
    
}
