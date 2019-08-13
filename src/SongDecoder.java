public class SongDecoder {

    public static void main(String[] args) {
        // ABC
        System.out.println(songDecoder("WUBWUBABCWUB"));
        // RL
        System.out.println(songDecoder("RWUBWUBWUBLWUB"));
        // WE ARE THE CHAMPIONS MY FRIEND
        System.out.println(songDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }

    private static String songDecoder(String song) {
        return song.replaceAll("(WUB)+", " ").trim();
    }

}
