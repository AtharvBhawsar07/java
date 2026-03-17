class Student
{
    int marks;
    int rollno;
    String name;
}

class arrobj{
public static void main(String[] args) {
    
 Student  s1 = new Student();
 s1.name = "SITA";
 s1.rollno = 108;
 s1.marks = 229;
  
 Student  s2 = new Student();
 s2.name = "RAM";
 s2.rollno = 111;
 s2.marks = 27;

 Student  s3 = new Student();
 s3.name = "HANUMAN";
 s3.rollno = 11171;
 s3.marks = 9;

    Student students[] = new Student[3];
    students[0]= s1;
    students[1]= s2;
    students[2]= s3;
    //for(int i=0;i<students.length; i++){
//
    //    System.out.println(students[i].name  +   " = " + students[i].marks);
    //}
    for(Student st : students){
        System.out.println(st.name  +   " = " + st.marks);  
    }
}
}