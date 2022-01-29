package optional;

import java.util.Optional;

import static java.util.Optional.*;

public class OptionalTest {


    public String npe(Member nullMember) {
        return nullMember.getUsername();
    }

    public void orElseTest(Member nullMember) {

        Member orElseMember = optionalOfNullableNullMember(nullMember)
                .orElse(new Member("orElseUser", 20));

        System.out.println("orElse = " + orElseMember.getUsername());
    }

    public void orElseGetTest(Member nullMember) {

        Member orElseGetMember = optionalOfNullableNullMember(nullMember)
                .orElseGet(() -> new Member("orElseGetUser", 20));

        System.out.println("orElseGet = " + orElseGetMember.getUsername());
    }

    public void emptyMemberTest(Member nullMember) {

        Member emptyMember = optionalOfNullableNullMember(nullMember).orElseGet(Member::new);

        System.out.println("orElseGetNoArgsConst = " + emptyMember.getUsername());
    }

    public void isPresentTest(Member nullMember) {

        System.out.println("null.isPresent() = " + optionalOfNullableNullMember(nullMember).isPresent());

        System.out.println("notNullMember.isPresent = " + notNullMember().isPresent());
    }

    public void ifPresentTest(Member nullMember) {

        optionalOfNullableNullMember(nullMember).ifPresent(member -> System.out.println("nullMember.ifPresent"));

        notNullMember().ifPresent(member -> System.out.println("notNullMember.ifPresent"));
    }

    private Optional<Member> optionalOfNullableNullMember(Member nullMember) {
        return ofNullable(nullMember);
    }

    private Optional<Member> notNullMember() {
        return of(new Member("userA", 20));
    }
}
