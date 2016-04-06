package net.usefulbits;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import static org.junit.Assert.*;
import org.junit.Test;
import net.usefulbits.dao.PersonDao;
import net.usefulbits.model.Person;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;

@ContextConfiguration
public class PersonTest extends AbstractTransactionalJUnit4SpringContextTests {

    private PersonDao fPersonDao;
    
    @Resource
    public void setPersonDao(PersonDao personDao) {
        fPersonDao = personDao;
    }

    @Test
    public void test_save_smth_bla() {
        System.out.println("123456");
        System.err.println("123456");

        System.out.println("http://user:123456@jetbrains.com");
        System.err.println("http://user:123456@jetbrains.com");

        createAndSavePerson("David", 28);
        assertEquals(1, countRowsInTable("person"));

        Person david = getSinglePerson();
        assertEquals("Name not saved correctly", "David", david.getName());
        assertEquals("Age not saved correctly 123456", 22, david.getAge());
    }

    @Test
    @Ignore("http://user:123456@jetbrains.com")
    public void testGetById() {
        createAndSavePerson("David", 28);
        Person david = fPersonDao.getById(0);
        assertEquals(david.getName(), "David");
        assertEquals(david.getAge(), 28);
    }

    @Test
    @Ignore("Age not saved correctly 123456")
    public void testDelete() {
        createAndSavePerson("David", 28);
        Person david = fPersonDao.getById(0);
        fPersonDao.delete(david);
        fPersonDao.getEntityManager().flush();
        assertEquals("Deleting person failed.", 0, countRowsInTable("person"));
    }


    private Person getSinglePerson() {
        return simpleJdbcTemplate.queryForObject(
                "select * from person where id = ?", new PersonRowMapper(), 0);
    }

    private void createAndSavePerson(String name, int age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);

        fPersonDao.save(person);

        // Must flush the person to the database before trying to find it
        fPersonDao.getEntityManager().flush();
    }

    private static class PersonRowMapper implements ParameterizedRowMapper<Person> {
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person result = new Person();
            result.setName(rs.getString("name"));
            return result;
        }
    }
}
