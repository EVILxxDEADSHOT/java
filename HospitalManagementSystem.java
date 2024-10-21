public class HospitalManagementSystem {

    class Patient {
        public static void showPatientInfo(String id, String fullName, int age, String gender, String phoneNumber) {
            System.out.println("Patient ID: " + id);
            System.out.println("Name: " + fullName);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Contact Number: " + phoneNumber);
        }
    }

    class Doctor {
        public static void showDoctorInfo(String id, String fullName, String specialty, String phoneNumber) {
            System.out.println("Doctor ID: " + id);
            System.out.println("Name: " + fullName);
            System.out.println("Specialization: " + specialty);
            System.out.println("Contact Number: " + phoneNumber);
        }
    }

    class Appointment {
        public static void showAppointmentInfo(String id, String date, String time,
                                               String doctorId, String doctorName, String doctorSpecialty, String doctorPhoneNumber,
                                               String patientId, String patientName, int patientAge, String patientGender, String patientPhoneNumber) {
            System.out.println("Appointment ID: " + id);
            System.out.println("Appointment Date: " + date);
            System.out.println("Appointment Time: " + time);
            System.out.println("Doctor Details:");
            Doctor.showDoctorInfo(doctorId, doctorName, doctorSpecialty, doctorPhoneNumber);
            System.out.println("Patient Details:");
            Patient.showPatientInfo(patientId, patientName, patientAge, patientGender, patientPhoneNumber);
        }
    }

    public static void main(String[] args) {
        String patientId = "P001";
        String patientName = "Patient 1";
        int patientAge = 30;
        String patientGender = "Male";
        String patientPhoneNumber = "1234567891";

        String doctorId = "D001";
        String doctorName = "Doctor 1";
        String doctorSpecialty = "Cardiology";
        String doctorPhoneNumber = "9876543219";

        String appointmentId = "A001";
        String appointmentDate = "2024-08-25";
        String appointmentTime = "10:00 AM";

        Appointment.showAppointmentInfo(appointmentId, appointmentDate, appointmentTime,
                doctorId, doctorName, doctorSpecialty, doctorPhoneNumber,
                patientId, patientName, patientAge, patientGender, patientPhoneNumber);
    }
}
