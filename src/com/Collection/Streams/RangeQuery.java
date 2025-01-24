package com.Collection.Streams;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Student implements Comparable<Student>{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    private String name;
    private int marks;
    Student(String name , int marks){
        this.name=name;
        this.marks=marks;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if(this ==o){
            return true;
        }
        Student student = (Student) o;
        return   Objects.equals(name, student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public String toString(){
        return "name\t"+name+"\t marks\t"+marks+" || ";
    }

    @Override
    public int compareTo(Student o) {
        if(o.getMarks()==marks){
            return name.compareTo(o.getName());
        }
        return o.getMarks()-marks;
    }
}
public class RangeQuery {
    public static void main(String[] args) {
        TreeMap<Student,Integer> students=new TreeMap<>((s1,s2)-> {int answer=s2.getMarks()-s1.getMarks();
        return answer!=0? answer: s1.getName().compareTo(s2.getName());});
        students.put(new Student("Rohit",67),1);
        students.put(new Student("Neeraj",66),2);
        students.put(new Student("Vishal",56),3);
        students.put(new Student("Vishnu",60),4);
        students.put(new Student("sai",60),5);
        students.put(new Student("sasank",70),6);
        students.put(new Student("phani",70),7);
        students.put(new Student("praneet",55),7);
        System.out.println(students);
        // first way
      Map<Student,Integer> filterdStudents=  students.entrySet().stream().filter(entry->entry.getKey().getName().startsWith("p"))
                .collect(Collectors.toMap(entry->entry.getKey(),entry->entry.getValue()));
        System.out.println(filterdStudents);
      //second way

      TreeMap<Student,Integer> filteredTreeMap= students.entrySet().stream()
              .filter(entry->entry.getKey().getName().startsWith("s"))
              .collect(Collectors.toMap(entry->entry.getKey(),entry->entry.getValue(),(v1,v2)->v1,(TreeMap::new)));
        System.out.println(filteredTreeMap);
    }
}
