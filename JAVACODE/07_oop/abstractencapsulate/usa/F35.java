package abstractencapsulate.usa;

public class F35 extends USFighter{
    public F35(){
        super("F35");
    }

    public void changeToInvisibleMode(){
        System.out.println("Chuyển sang chế độ tàn hình");
    }

    @Override
    public void callOtherJetfighter(USFighter otherJetFigher) {
        System.out.println(" I am F35 from US . Show me secret code\n\t" + otherJetFigher.secretCodeCommunicate());
        
    }
    
}
