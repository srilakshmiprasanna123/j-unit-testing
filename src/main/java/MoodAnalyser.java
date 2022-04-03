import org.jetbrains.annotations.Nullable;

public class MoodAnalyser {

    public static @Nullable String analyseMood(String mood) {
        if (mood.toLowerCase().contains("happy")) {
            return "Entry Successful";
        } else if (mood.toLowerCase().contains("sad")) {
            return "Entry Failed";
        } else return null;
    }
}