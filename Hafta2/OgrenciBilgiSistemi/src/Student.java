public class Student {
    Course mat;
    Course fizik;
    Course biyo;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course mat, Course fizik, Course biyo) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.biyo = biyo;
        calcAvarage();
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 > 0 && note1 <= 100) {
            this.mat.note = note1;
        }
        if (note2 > 0 && note2 <= 100) {
            this.fizik.note = note2;
        }
        if (note3 > 0 && note3 <= 100) {
            this.biyo.note = note3;
        }
    }

    void addBulkVerbalGradeNote(int verbalGradeMat, int verbalGradeFizik, int verbalGradeBiyo) {
        if (verbalGradeMat > 0 && verbalGradeMat <= 100) {
            this.mat.verbalGrade = verbalGradeMat;
        }
        if (verbalGradeFizik > 0 && verbalGradeFizik <= 100) {
            this.fizik.verbalGrade = verbalGradeFizik;
        }
        if (verbalGradeBiyo > 0 && verbalGradeBiyo <= 100) {
            this.biyo.verbalGrade = verbalGradeBiyo;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.biyo.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ( ((this.mat.note * 0.8) + (this.mat.verbalGrade * 0.2)) +
                ((this.fizik.note * 0.8) + (this.fizik.verbalGrade * 0.2)) +
                (this.biyo.note * 0.8) + (this.biyo.verbalGrade * 0.2) ) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    void printNote() {
        System.out.println("=======================================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println(this.mat.name + " Notu : " + this.mat.note);
        System.out.println(this.mat.name + " Sözlü Notu : " + this.mat.verbalGrade);
        System.out.println(this.fizik.name + " Notu : " + this.fizik.note);
        System.out.println(this.fizik.name + " Sözlü Notu : " + this.fizik.verbalGrade);
        System.out.println(this.biyo.name + " Notu : " + this.biyo.note);
        System.out.println(this.biyo.name + " Sözlü Notu : " + this.biyo.verbalGrade);
    }
}
