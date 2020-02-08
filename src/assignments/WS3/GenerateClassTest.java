package assignments.WS3;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/3
 * @Content:workshop
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GenerateClassTest {

    private GenerateClass AnimalOneClass, AnimalTwoClass, AnimalThreeClass,
            AnimalFourClass;

    @BeforeEach
    public void init() {
        String classname1 = "Animal1";
        String[] variableNames1 = { "name", "Variety" };
        String[] variableTypes1 = { "String", "String" };
        AnimalOneClass = new GenerateClass(classname1, variableNames1, variableTypes1);

        String classname2 = "Animal2";
        String[] variableNames2 = { "name", "Variety", "length" };
        String[] variableTypes2 = { "String", "String", "int" };
        AnimalTwoClass = new GenerateClass(classname2, variableNames2, variableTypes2);

        String classname3 = "Animal3";
        String[] variableNames3 = { "name" };
        String[] variableTypes3 = { "String" };

        AnimalThreeClass = new GenerateClass(classname3, variableNames3, variableTypes3);

        String classname4 = "Animal4";
        String[] variableNames4 = {};
        String[] variableTypes4 = {};

        AnimalFourClass = new GenerateClass(classname4, variableNames4, variableTypes4);

    }

    /**
     * I wrote a test about the writeFile() method myself.
     * And output 4 classes if you run this test.
     * I did not use the Date class to write this test myself. However,
     * I have attached the Date class to this folder.
     * It may be used if you use your own tests.
     */
    @Test
    public void testWriteFile() {
        AnimalOneClass.writeFile();
        AnimalTwoClass.writeFile();
        AnimalThreeClass.writeFile();
        AnimalFourClass.writeFile();
    }


    @Test
    public void test1() {
        String expectedFields = "  private String name;\n" + "  private " +
                "String Variety;\n\n";
        String actualFields = AnimalOneClass.makeFields();
        assertEquals(expectedFields, actualFields);
    }

    @Test
    public void test2() {
        String expectedConstructor = "  public Animal1(String name, String Variety){\n" + "    this.name = name;\n"
                + "    this.Variety = Variety;\n" + "  }\n";
        String actualConstructor = AnimalOneClass.makeConstructor();
        assertEquals(expectedConstructor, actualConstructor);
    }

    @Test
    public void test3() {
        String expectedGetters = "  public String getName(){\n" + "    return name;\n" + "  }\n"
                + "  public String getVariety(){\n" + "    return Variety;\n" + "  }\n";
        String actualGetters = AnimalOneClass.makeGetters();
        assertEquals(expectedGetters, actualGetters);
    }

    @Test
    public void test4() {
        String expectedSetters = "  public void setName(String name){\n" + "    this.name = name;\n" + "  }\n"
                + "  public void setVariety(String Variety){\n" + "    this.Variety = Variety;\n" + "  }\n";
        String actualSetters = AnimalOneClass.makeSetters();
        assertEquals(expectedSetters, actualSetters);
    }


    @Test
    public void test5() {
        String expectedFields = "  private String name;\n" + "  private String Variety;\n" + "  private int length;\n\n";
        String actualFields = AnimalTwoClass.makeFields();
        assertEquals(expectedFields, actualFields);
    }

    @Test
    public void test6() {
        String expectedConstructor = "  public Animal2(String name, String Variety," +
                " int length){\n"
                + "    this.name = name;\n" + "    this.Variety = Variety;\n" + "    this.length = length;\n" + "  }\n";
        String actualConstructor = AnimalTwoClass.makeConstructor();
        assertEquals(expectedConstructor, actualConstructor);
    }

    @Test
    public void test7() {
        String expectedGetters = "  public String getName(){\n" + "    return name;\n" + "  }\n"
                + "  public String getVariety(){\n" + "    return Variety;\n" + "  }\n" + "  public int getLength(){\n"
                + "    return length;\n" + "  }\n";
        String actualGetters = AnimalTwoClass.makeGetters();
        assertEquals(expectedGetters, actualGetters);
    }

    @Test
    public void test8() {
        String expectedSetters = "  public void setName(String name){\n" + "    this.name = name;\n" + "  }\n"
                + "  public void setVariety(String Variety){\n" + "    this.Variety = Variety;\n" + "  }\n"
                + "  public void setLength(int length){\n" + "    this.length" +
                " = length;\n" + "  }\n";
        String actualSetters = AnimalTwoClass.makeSetters();
        assertEquals(expectedSetters, actualSetters);
    }


    @Test
    public void test9() {
        String expectedFields = "  private String name;\n\n";
        String actualFields = AnimalThreeClass.makeFields();
        assertEquals(expectedFields, actualFields);
    }

    @Test
    public void test10() {
        String expectedConstructor = "  public Animal3(String name){\n" + "    this.name = name;\n" + "  }\n";
        String actualConstructor = AnimalThreeClass.makeConstructor();
        assertEquals(expectedConstructor, actualConstructor);
    }

    @Test
    public void test11() {
        String expectedGetters = "  public String getName(){\n" + "    return name;\n" + "  }\n";
        String actualGetters = AnimalThreeClass.makeGetters();
        assertEquals(expectedGetters, actualGetters);
    }

    @Test
    public void test12() {
        String expectedSetters = "  public void setName(String name){\n" + "    this.name = name;\n" + "  }\n";
        String actualSetters = AnimalThreeClass.makeSetters();
        assertEquals(expectedSetters, actualSetters);
    }


    @Test
    public void test13() {
        String expectedFields = "\n";
        String actualFields = AnimalFourClass.makeFields();
        assertEquals(expectedFields, actualFields);
    }

    @Test
    public void test14() {
        String expectedConstructor = "  public Animal4(){}\n";
        String actualConstructor =  AnimalFourClass.makeConstructor();
        assertEquals(expectedConstructor, actualConstructor);
    }

    @Test
    public void test15() {
        String expectedGetters = "";
        String actualGetters =  AnimalFourClass.makeGetters();
        assertEquals(expectedGetters, actualGetters);
    }

    @Test
    public void test16() {
        String expectedSetters = "";
        String actualSetters =  AnimalFourClass.makeSetters();
        assertEquals(expectedSetters, actualSetters);
    }

}

