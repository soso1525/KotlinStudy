package chap05.section6.association

/**
 * 연관 관계란 2개의 서로 분리된 클래스가 연결을 가지는 것입니다.
 * 단방향 혹은 양방향으로 연결될 수 있습니다.
 * 핵심은 두 요소가 서로 다른 생명주기를 가지고 있다는 점입니다.
 * 아래의 예시는 양방향 참조를 가집니다.
 */

class Patient(val name: String) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) {
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doctor = Doctor("KimSabu")
    val patient = Patient("kildong")

    doctor.patientList(patient)
    patient.doctorList(doctor)
}