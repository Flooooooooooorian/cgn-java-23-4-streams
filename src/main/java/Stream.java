import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<String> names = List.of("Max", "Maria", "John", "Jane", "Florian");

        Integer totalLength = names.stream()
                .map(name -> name.length())
                .filter(size -> size >= 4)
                .peek(value -> System.out.println(value))
                .sorted()
                .reduce(0, (sum, value) -> sum + value);

        System.out.println(totalLength);


        List<Person> persons = List.of(new Person("1", "Florian", List.of()));

        persons.stream()
                .filter(person -> person.friends().stream()
                        .filter(f -> f.equals("Florian"))
                        .collect(Collectors.toList())
                        .size() > 5)
                .collect(Collectors.toList());
    }
}
