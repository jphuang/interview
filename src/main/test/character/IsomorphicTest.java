package character;

import org.junit.Assert;
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

    @Test
    public void isSubsequence() {
        Isomorphic test = new Isomorphic();
        boolean subsequence = test.isSubsequence("abc", "ahbgdc");
        Assert.assertTrue(subsequence);
        subsequence = test.isSubsequence("axc", "ahbgdc");
        Assert.assertFalse(subsequence);
        subsequence = test.isSubsequence("aaaaaa", "bbaaaa");
        Assert.assertFalse(subsequence);
        subsequence = test.isSubsequence("bb", "ahbgdc");
        Assert.assertFalse(subsequence);
    }
}
