import java.util.Date;

public class Emp {
    private int empNo;
    private String ename;
    private String efirst;
    private String job;
    private Emp mgr;
    private Date hireDate;
    private int sal;
    private int comm;
    private String tel;
    private Dept department;

    public Emp() {}

    public Emp(int empNo, String ename, String efirst, String job, Emp mgr, Date hireDate, int sal, int comm, String tel, Dept department) {
        this.empNo = empNo;
        this.ename = ename;
        this.efirst = efirst;
        this.job = job;
        this.mgr = mgr;
        this.hireDate = hireDate;
        this.sal = sal;
        this.comm = comm;
        this.tel = tel;
        this.department = department;
    }

    // Getters et Setters
    public int getEmpNo() { return empNo; }
    public void setEmpNo(int empNo) { this.empNo = empNo; }

    public String getEname() { return ename; }
    public void setEname(String ename) { this.ename = ename; }

    public String getEfirst() { return efirst; }
    public void setEfirst(String efirst) { this.efirst = efirst; }

    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }

    public Emp getMgr() { return mgr; }
    public void setMgr(Emp mgr) { this.mgr = mgr; }

    public Date getHireDate() { return hireDate; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    public int getSal() { return sal; }
    public void setSal(int sal) { this.sal = sal; }

    public int getComm() { return comm; }
    public void setComm(int comm) { this.comm = comm; }

    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel = tel; }

    public Dept getDepartment() { return department; }
    public void setDepartment(Dept department) { this.department = department; }
}
