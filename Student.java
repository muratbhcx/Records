package Hafta_5.Haftalik_Teknik_İcerik_1.Student_Registration_System;

public record Student(String name, String surname, String studentNumber) {

    @Override
    public String toString() {
        return "-------------------------" + "\n" +
                "Öğrenci Adı : " + name + "\n" +
                "Öğrenci Soyadı : " + surname + "\n" +
                "Öğrenci numarası : " + studentNumber;
    }
}
