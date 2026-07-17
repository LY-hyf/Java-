package demo;

public class LyricsSplit {
    public static void main(String[] args) {
        String lyrics = "长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山 ";
        System.out.println("***原歌词格式***");
        System.out.println(lyrics);
        System.out.println("***拆分后歌词格式***");
        String[] lines = lyrics.split(" ");
        for (String line : lines) {
            if (!line.isEmpty()) {
                System.out.println(line);
            }
        }
    }
}
