package olja.klisho.task05;

import java.util.*;

/**
 * Created by Ola-Mola on 17/04/16.
 */
public class Group<MT extends Number> {

    private final Disciplines discipline;
//    private final Set<Student> studentSet = new HashSet<>(); //for hasStudent
        private final Map<Student, List<MT>> studentMarks = new HashMap<>(); //student and his list of marks

  //private final Map<Student, Map<Disciplines, MT>> studentMarks = new HashMap<>(); //student and his list of marks


    public Group(Disciplines discipline) {
        this.discipline = discipline;
    }

//    public void addStudents(Student ... students) {
//        for (Student s : students) {
//            addStudent(s);
//        }
//    }

    public void addStudent(Student student) {
        List<MT> marks = new ArrayList<>();
        studentMarks.put(student, marks);
//adds student and empty list for his marks filling
    }

    public boolean removeStudent(Student student) {
        return studentMarks.remove(student) != null;
    }

    public boolean hasStudent (Student student) {
       return  studentMarks.containsKey(student);

    }

//    public addStudentMark(Student student, Number mark){
//
//        //по студенту найти его лист с оценками
//        //  и в него добавить оценку
//
//
//    }

//    public void addStudentMark (Student student, MT mark, Disciplines discipline){
//       Map<Student, List<MT>> studentMarks = new HashMap<>();
//        studentMarks.put(student, mark)
//    }
}
