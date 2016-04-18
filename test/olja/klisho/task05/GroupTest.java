package olja.klisho.task05;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Ola-Mola on 17/04/16.
 */
public class GroupTest {

    @Test
    public void testRemoveStudent() throws Exception {
        Group group = new Group(Disciplines.ENGLISH);
        Student student1 = new Student("Vasya", "Pupkin", 1994);
        Student student2 = new Student("Vova", "Popkin", 1993);
        Student student3 = new Student("Sveta", "Gopkina", 1991);

        group.addStudent(student1);
        group.addStudent (student2);

        assertTrue(group.removeStudent(student1));
        assertTrue(group.removeStudent(student2));
        assertFalse(group.removeStudent(student3));

        assertFalse(group.removeStudent(student1));
        assertFalse(group.removeStudent(student2));
        assertFalse(group.removeStudent(student3));

    }


    @Test
    public void testHasStudent() throws Exception {

        Group group = new Group(Disciplines.ENGLISH);
        Student student1 = new Student("Vasya", "Pupkin", 1994);
        Student student2 = new Student("Vova", "Popkin", 1993);
        Student student3 = new Student("Sveta", "Gopkina", 1991);

        group.addStudent(student1);
        group.addStudent (student2);
        assertFalse(group.hasStudent(student3));
        group.addStudent(student3);
        assertTrue(group.hasStudent(student3));
    }}