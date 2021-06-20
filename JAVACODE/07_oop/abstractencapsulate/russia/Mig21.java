package abstractencapsulate.russia;

public class Mig21 extends RussianFighter {
    public Mig21() {
        super( "Mig21");
    }

    @Override
    public void callOtherJetFighter(RussianFighter otherJrtFigher) {
        System.out.println(" I am Mig21 from Ukraina. Show me your secret code.\n\t" +otherJrtFigher.secretCodeCommunicate());
    }
    
}
