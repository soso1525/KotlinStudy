package chap05.section6.dependency

class Patient(val name: String, var id: Int) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

/**
 * 한 클래스가 다른 클래스에 의존되어 있어 영향을 주는 경우 의존 관계라고 합니다.
 * 예를 들어, Doctor 클래스를 생성하려고 하는데 Patient 객체가 필요한 경우
 * Doctor는 Patient 객체에 의존하는 관계가 됩니다.
 */

class Doctor(val name: String, val p: Patient) {
    val customerId: Int = p.id

    fun patientList() {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    val patient = Patient("kildong", 1234)
    val doctor = Doctor("kimsabu", patient)
    doctor.patientList()
}