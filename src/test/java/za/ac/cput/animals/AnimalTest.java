/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Levi
 */
public class AnimalTest {
    
    private Animal animal1;
    private Animal animal2;
    private Animal animal3;
    
    public AnimalTest() {
    }
    
    
    
    @BeforeEach
    public void setUp() {
        animal1 = new Animal();
        animal2 = new Animal();
        animal3 = animal1;
    }
    
    @Test
    public void testEquality(){
    assertEquals(animal1,animal3);
    }
    
    @Test
    public void testIdentity(){
    assertSame(animal1,animal3);
    }
    
    @Test
    @Disabled
    public void testSetAnimal(){
    System.out.println("Ignore Test");
    }
    
    @Test
    public void testGetAnimal(){
        fail("This will fail");
    assertEquals(animal1,animal3);
    }
    
   
    
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
