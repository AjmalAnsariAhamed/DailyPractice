package com.Collection;

import com.OOPs.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ObjectWithArrayList {
    public static void main(String args[]){

        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("zoro",1239,9,51,"Donbosco",2333344,"zoro@gamil.com","permbur"));
        students.add(new Student("Luffy", 1240, 3,50, "Mugiwara University", 99887766, "luffy@example.com", "Grand Line"));
        students.add(new Student("Nami", 1241, 2,100, "Weather College", 88776655, "nami@example.com", "Weatheria"));
        students.add(new Student("Sanji", 1242, 4,69, "All Blue Culinary School", 77665544, "sanji@example.com", "Baratie"));
        students.add(new Student("Usopp", 1243, 1,100, "Sniper Academy", 66554433, "usopp@example.com", "Syrup Village"));
        students.add(new Student("Robin", 1244, 5,84, "Ohara University", 55443322, "robin@example.com", "Ohara"));
        students.add(new Student("Chopper", 1245, 1,82, "Medical Institute", 44332211, "chopper@example.com", "Drum Island"));
        students.add(new Student("Franky", 1246, 3,68, "Cyborg Engineering College", 33221100, "franky@example.com", "Water 7"));
        students.add(new Student("Brook", 1247, 6,60, "Soul Music School", 22110099, "brook@example.com", "Florian Triangle"));
        students.add(new Student("Jinbei", 1248, 4,72, "Fishman Academy", 11009988, "jinbei@example.com", "Fishman Island"));

        System.out.println(students);
        ArrayList<Student> topStudents=  students.stream()
                .filter(x-> x.getGrade()>=75)
                .collect(Collectors.toCollection(ArrayList::new));
        // another way is below
        // .collect(Collectors.toCollection(()-> new ArrayList()))
        System.out.println(students);
        System.out.println("toppers of the college are \n"+topStudents);

        // sorting the students
        Comparator<Student> ascComparator = Comparator.comparing(Student::getGrade).reversed();
        students.sort(ascComparator);
        System.out.println("sorted students \n \n"+students);

    }
}
