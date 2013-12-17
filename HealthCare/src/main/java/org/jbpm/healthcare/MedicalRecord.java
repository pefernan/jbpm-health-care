package org.jbpm.healthcare;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class MedicalRecord  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Position(value = 1)
    private java.util.List<org.jbpm.healthcare.MedicalEntry> entries;
    
    @org.kie.api.definition.type.Position(value = 0)
    private org.jbpm.healthcare.Patient patient;

    public MedicalRecord() {
    }

    public MedicalRecord(org.jbpm.healthcare.Patient patient, java.util.List<org.jbpm.healthcare.MedicalEntry> entries) {
        this.patient = patient;
        this.entries = entries;
    }


    
    public java.util.List<org.jbpm.healthcare.MedicalEntry> getEntries() {
        return this.entries;
    }

    public void setEntries(  java.util.List<org.jbpm.healthcare.MedicalEntry> entries ) {
        this.entries = entries;
    }
    
    public org.jbpm.healthcare.Patient getPatient() {
        return this.patient;
    }

    public void setPatient(  org.jbpm.healthcare.Patient patient ) {
        this.patient = patient;
    }
}