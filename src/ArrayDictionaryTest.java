import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
    }

    @Test
    public void remove() {


    }

    @Test
    public void contains() {

        // set 1:
        ArrayDictionary dict1 = new ArrayDictionary(0);

        int test1[] = {0};
        String expected1[] = {"false"};
        for(int i = 0; i<test1.length; i++){
            assertEquals(String.valueOf(dict1.contains(test1[i])),expected1[i]);
        }

        // set 2:
        ArrayDictionary dict2 = new ArrayDictionary(1);
        assertTrue(dict2.add(0, 103));
        int test2[] = {2,0};
        String expected2[] = {"false","true"};
        for(int i = 0; i<test1.length; i++){
            assertEquals(String.valueOf(dict2.contains(test2[i])),expected2[i]);
        }


        // set 3:
        ArrayDictionary dict3 = new ArrayDictionary(2);
        assertTrue(dict3.add(0, 103));
        assertTrue(dict3.add(1, 105));
        int test3[] = {0,1,2,3};
        String expected3[] = {"true","true","false","false"};
        for(int i = 0; i<test1.length; i++){
            assertEquals(String.valueOf(dict3.contains(test3[i])),expected3[i]);
        }


        // set 4:
        ArrayDictionary dict4 = new ArrayDictionary(3);
        assertTrue(dict4.add(0, 103));
        assertTrue(dict4.add(1, 105));
        assertTrue(dict4.add(2, 206));
        int test4[] = {3,1};
        String expected4[] = {"false","true"};
        for(int i = 0; i<test1.length; i++){
            assertEquals(String.valueOf(dict4.contains(test4[i])),expected4[i]);
        }

        // set 5:
        ArrayDictionary dict5 = new ArrayDictionary(5);
        assertTrue(dict5.add(0, 103));
        assertTrue(dict5.add(1, 105));
        assertTrue(dict5.add(2, 206));
        assertTrue(dict5.add(4, 407));
        int test5[] = {1,4,7,8};
        String expected5[] = {"true","true","false","false"};
        for(int i = 0; i<test1.length; i++){
            assertEquals(String.valueOf(dict5.contains(test5[i])),expected5[i]);
        }



    }

}