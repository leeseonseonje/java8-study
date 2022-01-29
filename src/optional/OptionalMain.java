package optional;

import javax.swing.text.html.Option;
import java.util.*;

public class OptionalMain {

    public static void main(String[] args) {

        OptionalTest optionalTest = new OptionalTest();

//        optionalTest.npe(null); -> NPE 발생

        optionalTest.orElseTest(null);
        optionalTest.orElseGetTest(null);
        optionalTest.emptyMemberTest(null);

        optionalTest.isPresentTest(null);
        optionalTest.ifPresentTest(null);

        OptionalListTest optionalListTest = new OptionalListTest();

        optionalListTest.listTest();
    }

}
