import java.util.List;

public record Person(
        String id,
        String name,
        List<String> friends
) {
}
