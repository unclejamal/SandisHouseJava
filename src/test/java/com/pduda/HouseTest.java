package com.pduda;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseTest {
    private House tale;

    @Before
    public void setUp() throws Exception {
        this.tale = new House();
    }

    @Test
    public void testLine1() throws Exception {
        String expected = "This is the house that Jack built.\n";
        assertEquals(expected, tale.line(1));
    }

    @Test
    public void testLine2() throws Exception {
        String expected = "This is the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(2));
    }

    @Test
    public void testLine3() throws Exception {
        String expected = "This is the rat that ate the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(3));
    }

    @Test
    public void testLine4() throws Exception {
        String expected = "This is the cat that killed the rat that ate the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(4));
    }

    @Test
    public void testLine5() throws Exception {
        String expected = "This is the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(5));
    }

    @Test
    public void testLine6() throws Exception {
        String expected = "This is the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(6));
    }

    @Test
    public void testLine7() throws Exception {
        String expected = "This is the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(7));
    }

    @Test
    public void testLine8() throws Exception {
        String expected = "This is the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(8));
    }

    @Test
    public void testLine9() throws Exception {
        String expected = "This is the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(9));
    }

    @Test
    public void testLine10() throws Exception {
        String expected = "This is the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(10));
    }

    @Test
    public void testLine11() throws Exception {
        String expected = "This is the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(11));
    }

    @Test
    public void testLine12() throws Exception {
        String expected = "This is the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n";
        assertEquals(expected, tale.line(12));
    }

    @Test
    public void testAllTheLines() throws Exception {
        String expected = "This is the house that Jack built.\n" +
                "\n" +
                "This is the malt that lay in the house that Jack built.\n" +
                "\n" +
                "This is the rat that ate the malt that lay in the house that Jack built.\n" +
                "\n" +
                "This is the cat that killed the rat that ate the malt that lay in the house that Jack built.\n" +
                "\n" +
                "This is the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n" +
                "\n" +
                "This is the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n" +
                "\n" +
                "This is the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n" +
                "\n" +
                "This is the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n" +
                "\n" +
                "This is the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n" +
                "\n" +
                "This is the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n" +
                "\n" +
                "This is the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n" +
                "\n" +
                "This is the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.\n";

        assertEquals(expected, tale.recite());
    }
}
