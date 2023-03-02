package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void shouldFeedAllOrganic() {
        VirtualPetShelter VirtualPetShelterUnderTest = new VirtualPetShelter();
        VirtualPetShelterUnderTest.feedAllOrganic();
        Organic organicDog = VirtualPetShelterUnderTest.getPet("Organic Dog");
        assertEquals(1, organicDog.getHungerLevel());
    }

    @Test
    public void shouldWalkAllRobotic() {
        VirtualPetShelter VirtualPetShelterUnderTest = new VirtualPetShelter();
        VirtualPetShelterUnderTest.walkAllRobotic();
        Collection<Robotic> RoboticDogs = VirtualPetShelterUnderTest.getAllRobotic();
        assertEquals(2, RoboticDogs.iterator().next().getOilNeeded());
    }

    @Test
    public void shouldNapAllOrganic() {
        VirtualPetShelter VirtualPetShelterUnderTest = new VirtualPetShelter();
        VirtualPetShelterUnderTest.napAllOrganic();
        Organic organicCat = VirtualPetShelterUnderTest.getPet("Organic Cat");
        assertEquals(3, organicCat.getFatigue());
    }
}
