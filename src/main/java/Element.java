public class Element {
    private String vri_id;              // Идентификатор элемента
    private String org_title;           // Наименование организации-поверителя
    private String mit_number;          // Регистрационный номер типа СИ
    private String mit_title;           // Наименование типа СИ
    private String mit_notation;        // Обозначение типа СИ
    private String mi_modification;     // Модификация СИ
    private String mi_number;           // Заводской (серийный) номер
    private String verification_date;   // Дата поверки
    private String valid_date;          // Действительна до
    private String result_docnum;       // Номер свидетельства
    private boolean applicability;      // Пригодность

    public String getVri_id() {
        return vri_id;
    }

    public String getOrg_title() {
        return org_title;
    }

    public String getMit_number() {
        return mit_number;
    }

    public String getMit_title() {
        return mit_title;
    }

    public String getMit_notation() {
        return mit_notation;
    }

    public String getMi_modification() {
        return mi_modification;
    }

    public String getMi_number() {
        return mi_number;
    }

    public String getVerification_date() {
        return verification_date;
    }

    public String getValid_date() {
        return valid_date;
    }

    public String getResult_docnum() {
        return result_docnum;
    }

    public boolean isApplicability() {
        return applicability;
    }

    public void setVri_id(String vri_id) {
        this.vri_id = vri_id;
    }

    public void setOrg_title(String org_title) {
        this.org_title = org_title;
    }

    public void setMit_number(String mit_number) {
        this.mit_number = mit_number;
    } // номер СИ в ФГИС

    public void setMit_title(String mit_title) {
        this.mit_title = mit_title;
    }

    public void setMit_notation(String mit_notation) {
        this.mit_notation = mit_notation;
    }

    public void setMi_modification(String mi_modification) {
        this.mi_modification = mi_modification;
    }

    public void setMi_number(String mi_number) {
        this.mi_number = mi_number;
    } // заводской номер

    public void setVerification_date(String verification_date) {
        this.verification_date = verification_date;
    }

    public void setValid_date(String valid_date) {
        if (valid_date == null){
            this.valid_date = "empty_data";
        } else {
            this.valid_date = valid_date;
        }
    }

    public void setResult_docnum(String result_docnum) {
        this.result_docnum = result_docnum;
    }

    public void setApplicability(boolean applicability) {
        this.applicability = applicability;
    }

    @Override
    public String toString() {
        return "Element{" +
                "vri_id='" + vri_id + '\'' +
                ", org_title='" + org_title + '\'' +
                ", mit_number='" + mit_number + '\'' +
                ", mit_title='" + mit_title + '\'' +
                ", mit_notation='" + mit_notation + '\'' +
                ", mi_modification='" + mi_modification + '\'' +
                ", mi_number='" + mi_number + '\'' +
                ", verification_date='" + verification_date + '\'' +
                ", valid_date='" + valid_date + '\'' +
                ", result_docnum='" + result_docnum + '\'' +
                ", applicability=" + applicability +
                '}';
    }
}
