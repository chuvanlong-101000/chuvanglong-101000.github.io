public class TeamFactory {
    // Chuyên tạo ra các team . Đọc tên class đã biết chức năng
    //1 - Đọc từ file CSV 
    //2 - Đọc từ CSDL quan hệ
    //3 - Gọi lên REST API từ internet rồi đổ dữ liệu vào
    public static Team manchesterUnited() {
        Team team = new Team(
            "Manchester United", 
            "Old Trafford", 
            "Ole Gunnar Solskjær",
            "1878"
        );

        team.addPlayer(new Player("David de Gea", 01, Position.GOALKEEPER));
        team.addPlayer(new Player("Brandon Williams", 13, Position.DEFENDER));
        team.addPlayer(new Player("Phil Jones", 8, Position.DEFENDER));
        team.addPlayer(new Player("Eric Bailly", 66, Position.DEFENDER));
        team.addPlayer(new Player("Luke Shaw", 17, Position.DEFENDER));
        team.addPlayer(new Player("Juan MAta", 52, Position.MIDFIELD));
        team.addPlayer(new Player("Daniel James", 03, Position.MIDFIELD));
        team.addPlayer(new Player("Paul Pogba", 16, Position.MIDFIELD));
        team.addPlayer(new Player("Fred", 19, Position.MIDFIELD));
        team.addPlayer(new Player("Edinson Cavani", 22, Position.FORWARDER));
        team.addPlayer(new Player("Van Persi", 25, Position.FORWARDER));

        return team;
    }


    public static Team realMadrid() {
        Team team = new Team(
            "Real Madrid", 
            "Santiago Bernabéu", 
            " Zinédine Zidane",
            "1902"
        );

        team.addPlayer(new Player("Thibaut Courtois", 01, Position.GOALKEEPER));
        team.addPlayer(new Player("Marcelo", 26, Position.DEFENDER));
        team.addPlayer(new Player("Nacho", 24, Position.DEFENDER));
        team.addPlayer(new Player("Sergio Ramos", 02, Position.DEFENDER));
        team.addPlayer(new Player("Raphael Varene", 17, Position.DEFENDER));
        team.addPlayer(new Player("Luka Modric", 11, Position.MIDFIELD));
        team.addPlayer(new Player("Casemiro", 20, Position.MIDFIELD));
        team.addPlayer(new Player("Toni Kross", 16, Position.MIDFIELD));
        team.addPlayer(new Player("Karim Bezema", 19, Position.FORWARDER));
        team.addPlayer(new Player("Hugo Duro", 22, Position.FORWARDER));
        team.addPlayer(new Player("Rodrigo Goes", 25, Position.FORWARDER));

        return team;
    }


    public static Team Liverpool() {
        Team team = new Team(
            "Liverpool", 
            "Anfield", 
            " Jürgen Klopp",
            "1892"
        );

        team.addPlayer(new Player("Alisson", 01, Position.GOALKEEPER));
        team.addPlayer(new Player("Virgil van Dijk", 04, Position.DEFENDER));
        team.addPlayer(new Player("Ozan Kabak", 24, Position.DEFENDER));
        team.addPlayer(new Player("Ben Davies", 02, Position.DEFENDER));
        team.addPlayer(new Player("Wiliams", 17, Position.DEFENDER));
        team.addPlayer(new Player("Naby Keita", 11, Position.MIDFIELD));
        team.addPlayer(new Player("Fabinho", 20, Position.MIDFIELD));
        team.addPlayer(new Player("James Milner", 16, Position.MIDFIELD));
        team.addPlayer(new Player("Diago Jota", 19, Position.FORWARDER));
        team.addPlayer(new Player("Sadio Mané", 10, Position.FORWARDER));
        team.addPlayer(new Player("Mohamed Salah", 11, Position.FORWARDER));

        return team;
    }


    public static Team BayernMunich() {
        Team team = new Team(
            "Bayern Munich", 
            "BayernMunich", 
            " Hans-Dieter Flick",
            "1880"
        );

        team.addPlayer(new Player("Manuel Neuer", 01, Position.GOALKEEPER));
        team.addPlayer(new Player("Jérôme Boateng",17, Position.DEFENDER));
        team.addPlayer(new Player("David Alaba", 27, Position.DEFENDER));
        team.addPlayer(new Player("Niklas Süle", 04, Position.DEFENDER));
        team.addPlayer(new Player("Lucas Hernandez", 26, Position.DEFENDER));
        team.addPlayer(new Player("Tiago Dantas", 28, Position.MIDFIELD));
        team.addPlayer(new Player("Joshua Kimmich", 06 , Position.MIDFIELD));
        team.addPlayer(new Player("Javi Martínez", 8 , Position.MIDFIELD));
        team.addPlayer(new Player("Kingsley Coman", 29 , Position.FORWARDER));
        team.addPlayer(new Player("Thomas Müller", 25 , Position.FORWARDER));
        team.addPlayer(new Player("Robert Lewandowski", 9 , Position.FORWARDER));

        return team;
    }


    public static Team Barcenola() {
        Team team = new Team(
            "Barcenola", 
            "Camp Nou", 
            " Ronald Koeman",
            "1981"
        );

        team.addPlayer(new Player("Marc-André ter Stegen", 02, Position.GOALKEEPER));
        team.addPlayer(new Player("Jordi Alba",18, Position.DEFENDER));
        team.addPlayer(new Player("Gerard Piqué", 03, Position.DEFENDER));
        team.addPlayer(new Player("Ronald Araújo", 04, Position.DEFENDER));
        team.addPlayer(new Player("Sergiño Dest", 06, Position.DEFENDER));
        team.addPlayer(new Player("Philippe Coutinho", 14, Position.MIDFIELD));
        team.addPlayer(new Player("Frenkie de Jong", 21 , Position.MIDFIELD));
        team.addPlayer(new Player("Riqui Puig", 12 , Position.MIDFIELD));
        team.addPlayer(new Player("Sergio Busquets", 05 , Position.MIDFIELD));
        team.addPlayer(new Player("Lionel Messi", 10 , Position.FORWARDER));
        team.addPlayer(new Player("Antoine Griezmann", 07 , Position.FORWARDER));

        return team;
    }
}
