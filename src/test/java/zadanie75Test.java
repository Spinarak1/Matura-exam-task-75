import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class zadanie75Test {
    @Test
    public void test(){
        Assert.assertEquals(Arrays.asList("dd", "dwwwwwwwd"), Main.pierwszaIOstatniaLiteraD("dd aaaad dwwwwwwwd xxx"));
        Assert.assertEquals(Arrays.asList(), Main.pierwszaIOstatniaLiteraD(""));
        Assert.assertEquals(Arrays.asList(""), Main.pierwszaIOstatniaLiteraD("  "));
        Assert.assertEquals(Arrays.asList(""), Main.pierwszaIOstatniaLiteraD("aa aaaad wpwpwp dhhhhhh"));
    }
    @Test
    public void test1(){
       /* Assert.assertEquals(, Main.klucze("hah heh", new Klucz(3, 7)));
        Assert.assertEquals(, Main.klucze());
        Assert.assertEquals(, Main.klucze());
        Assert.assertEquals(, Main.klucze());*/
    }
}
//
