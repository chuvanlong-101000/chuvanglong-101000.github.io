package abstractencapsulate.russia;

public class Mig35 extends RussianFighter {
    public Mig35() {
        super("Mig35");
    }

    public void launchAntiSubmarineMissiles() {
        System.out.println(" Phóng tên lửa diệt tàu ngầm");       
    }

    @Override
    public void callOtherJetFighter( RussianFighter otherJetFigher){
        System.out.println(" I am Mig 35 from Rusian.Show me your secret code.\n\t" + otherJetFigher.secretCodeCommunicate());
    }
}
