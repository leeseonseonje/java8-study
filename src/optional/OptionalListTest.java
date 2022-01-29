package optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.*;

public class OptionalListTest {

    public void listTest() {
        Optional<List<Member>> optionalMembers = ofNullable(null);
        List<Member> members = optionalMembers.orElse(Collections.emptyList());
        members.forEach(System.out::println);
    }
}
