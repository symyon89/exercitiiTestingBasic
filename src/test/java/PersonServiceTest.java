import entity.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.PersonService;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {
    private PersonService personService;

    @BeforeEach
    public void setUp() {
        personService = new PersonService(initPersonList());
    }

    @Test
    public void findByIdTest() {
        //given
        Integer id = 2;
        Person expected = new Person(2, "danerys", "targaryan", 19);
        //when
        Person result = personService.findById(id);
        //tehn
        assertNotNull(result);
        assertEquals(expected.getFirstName(), result.getFirstName());
        assertEquals(expected.getLastName(), result.getLastName());
        assertEquals(expected.getAge(), result.getAge());
    }

    @Test
    public void findByIdTestWhereNull() {
        //given
        Integer id = 50;
        Person expected = null;
        //when
        Person result = personService.findById(id);
        //tehn
        assertNull(result);
        assertEquals(expected, result);
    }

    @Test
    public void addPersonTest() {
        //given
        Person person = new Person(0, "ion", "ion", 33);
        Person expected = new Person(0, "ion", "ion", 33);
        //when
        Person result = personService.addPerson(person);
        Person checkPerson = personService.findById(0);
        int idExpected = checkPerson.getId();
        //tehn
        assertNotNull(result);
        assertEquals(idExpected, result.getId());
        assertEquals(expected.getLastName(), result.getLastName());
        assertEquals(expected.getFirstName(), result.getFirstName());
        assertEquals(expected.getAge(), result.getAge());
    }

    @Test
    public void addPersonTestNull() {
        //given
        Person person = new Person(1, "john", "snow", 22);
        Person expected = null;
        //when
        Person result = personService.addPerson(person);
        //tehn
        assertNull(result);
        assertEquals(expected, result);

    }

    @Test
    public void findByIFirstNameTest() {
        //given
        String firstname = "john";
        Person expected = new Person(1, "john", "snow", 22);
        //when
        Person result = personService.findByFirstName(firstname);
        //tehn
        assertNotNull(result);
        assertEquals(expected, result);
        assertEquals(expected.getLastName(), result.getLastName());
        assertEquals(expected.getFirstName(), result.getFirstName());
        assertEquals(expected.getAge(), result.getAge());
    }

    @Test
    public void findByIFirstNameNullTest() {
        //given
        String firstname = "";
        Person expected = null;
        //when
        Person result = personService.findByFirstName(firstname);
        //tehn
        assertNull(result);
        assertEquals(expected, result);
    }

    @Test
    public void findAllTest() {
        //given
        //when
        List<Person> result = personService.findAll();
        //tehn
        assertNotNull(result);
        // assertEquals(expected, result);
    }


    @Test
    public void finatAllAssertTest() {
        Person johnSnow = new Person(1, "john", "snow", 22);
        Person danerys = new Person(2, "danerys", "targaryan", 19);
        Person littleFinger = new Person(3, "little", "finger", 44);
        Person drogo = new Person(4, "little", "finger", 44);

        List<Person> personsList = personService.findAll();

        assertThat(personsList).isNotEmpty().hasSize(3).contains(johnSnow, danerys).doesNotContain(drogo);
        assertThat(johnSnow).isNotEqualTo(drogo).isIn(personsList);
        assertThat(johnSnow.getAge()).isGreaterThan(10).isLessThanOrEqualTo(100).isBetween(1,200).isEqualTo(22);
        assertNotNull(personsList);
        assertEquals(22,johnSnow.getAge());
    }
    //TODO de scris in continuare

    private List<Person> initPersonList() {
        List<Person> personList = new ArrayList<>();
        Person johnSnow = new Person(1, "john", "snow", 22);
        personList.add(johnSnow);
        Person danerys = new Person(2, "danerys", "targaryan", 19);
        personList.add(danerys);
        Person littleFinger = new Person(3, "little", "finger", 44);
        personList.add(littleFinger);
        return personList;
    }
}
