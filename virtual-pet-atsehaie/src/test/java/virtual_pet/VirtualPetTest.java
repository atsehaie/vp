package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {


    @Test
    public void setNameTest() {
        VirtualPet virtualPetUnderTest = new VirtualPet("Ginger");
        String result = virtualPetUnderTest.getName();
        assertEquals("Ginger", result);
    }


}


