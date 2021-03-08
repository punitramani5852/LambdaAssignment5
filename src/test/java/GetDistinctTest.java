import com.knoldus.GetDistinctStringsImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetDistinctTest {


    GetDistinctStringsImpl obj = new GetDistinctStringsImpl();

    @Test
    public void test1()
    {
        List<String> Test1 = Arrays.asList("clojure","java","scala");
        List<String> actual = obj.get.distinctStrings(new ArrayList<>(Arrays.asList("java","scala","java","clojure","clojure")));

        Assert.assertEquals(Test1,actual);
    }

    @Test
    public void test2()
    {
        List<String> Test2 = Arrays.asList("a","an","the","three");
        List<String> actual = obj.get.distinctStrings(new ArrayList<>(Arrays.asList("three","the","three","an","an","a")));

        Assert.assertEquals(Test2,actual);
    }

    @Test
    public void test3()
    {
        List<String> Test3 = Arrays.asList("");
        List<String> actual = obj.get.distinctStrings(new ArrayList<>(Arrays.asList("")));

        Assert.assertEquals(Test3,actual);
    }



    @Test
    public void test4()
    {
        List<String> expected = Arrays.asList("Hello","Hello");
        List<String> actual = obj.get.distinctStrings(new ArrayList<>(Arrays.asList("Hello","Hello","Hello")));

        Assert.assertNotEquals(expected,actual);
    }


}