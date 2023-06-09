public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "MAT","5555");
        Teacher t2 = new Teacher("Graham Bell", "FZK","0000");
        Teacher t3 = new Teacher("Kül Yutmaz", "BIO","1111");

        Course mat = new Course("Matematik", "101", "MAT");
        mat.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "111", "4", mat, fizik, biyo);
        s1.addBulkExamNote(50, 40, 40);
        s1.addBulkVerbalGradeNote(100,60,80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "222", "4", mat, fizik, biyo);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkVerbalGradeNote(100,100,100);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "333", "4", mat, fizik, biyo);
        s3.addBulkExamNote(50, 20, 40);
        s3.addBulkVerbalGradeNote(20,20,20);
        s3.isPass();
    }
}