package character;

import org.junit.Test;

public class IsomorphicTest {

    @Test
    public void isIsomorphic() {
        Isomorphic test = new Isomorphic();
        boolean isomorphic = test.isIsomorphic("egg", "add");
        assert isomorphic;
        isomorphic = test.isIsomorphic("foo", "bar");
        assert !isomorphic;
        isomorphic = test.isIsomorphic("paper", "title");
        assert isomorphic;
        isomorphic = test.isIsomorphic("badc", "baba");
        assert !isomorphic;
    }
}
