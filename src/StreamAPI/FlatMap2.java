package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student
{
     String sName;
     int sid;
     Character grade;

     public Student(String sName,int sid,char grade)
     {
         this.sName=sName;
         this.sid=sid;
         this.grade=grade;
     }
}

public class FlatMap2 {
    public static void main(String[] args) {


        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Ashif",101,'C'));
        list1.add(new Student("Ashiyana",102,'B'));
        list1.add(new Student("Duaa",103,'A'));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("John",104,'C'));
        list2.add(new Student("Nick",105,'B'));
        list2.add(new Student("Herry",106,'A'));

        //Before Java 8
        List<List<Student>> finalList = Arrays.asList(list1,list2);
        for (int i = 0; i < finalList.size(); i++) {
            for (int j = 0; j < finalList.get(i).size(); j++) {
                System.out.println(finalList.get(i).get(j).sName);
            }
        }
        for (List<Student> s:finalList)
        {
            for (Student stu:s)
            {
                System.out.println(stu.sid);
            }
        }

        //After Java8
        List<String> studentName=finalList.stream().flatMap(slist->slist.stream()).map(s->s.sName).toList();
        System.out.println(studentName);
        List<Integer> StudentId=finalList.stream().flatMap(slist->slist.stream()).map(st->st.sid).toList();
        System.out.println(StudentId.toString());
        List<Integer> sidList=StudentId.stream().filter(s->s>103).toList();
        System.out.println(sidList);
        List<Character> name=finalList.stream().flatMap(sList->sList.stream()).map(stu->stu.grade).toList();
        System.out.println(name.toString());


        List<Student>stList=finalList.stream().flatMap(s->s.stream()).toList();
        List<String> stNames=stList.stream().filter(e->e.grade.equals('A')).map(s->s.sName).toList();
        System.out.println(stNames);

    }
}
