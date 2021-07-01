public class ChuanHoaXau {
    public String ChuanHoa(String str) {
        String chuoi = "";
        str = str.toLowerCase();
        String[] ss= str.split(" ");
        for ( String s: ss){
            if( !s.equals("") && !s.equals(null)){
                chuoi += String.valueOf(s.charAt(0)) . toUpperCase() + s.substring(1) +" ";
            }
        }
        if(!chuoi.equals("")  && !chuoi.equals(null)){
            chuoi = chuoi.substring(0, chuoi.length()-1);
        }
        return chuoi;
    }
    
}
