import com.company.Animal;
import com.company.Cat;
import com.company.Dog;
import com.company.Pig;
import static  org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class AnimalTest {

    private String name;

    private Animal animal;

    public AnimalTest(Animal animal, String name) {
        this.name = name;
        this.animal = animal;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        List<Object[]> results = new ArrayList<>();
        results.add(new Object[] {new Dog(), "Dog"});
        results.add(new Object[] {new Cat(), "Cat"});
        results.add(new Object[] {new Pig(), "Pig"});
        return results;
    }

    @Test
    public void testAnimal() {
        assertEquals(name, animal.whoIam());
    }

}
