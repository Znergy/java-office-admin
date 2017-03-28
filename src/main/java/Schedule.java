public class Schedule {
  private id_schedule;
  private id_doctor;
  private id_patient;

  public Schedule(int id_schedule, int id_doctor, int id_patient) {
    this.id = id_schedule;
    this.id_doctor = id_doctor;
    this.id_patient = id_patient;
  }

  public void getId() {
    return this.id_schedule;
  }

  public void getIdDoctor() {
    return this.id_doctor;
  }

  public void getPatientId() {
    return this.id_patient;
  }

  
}
