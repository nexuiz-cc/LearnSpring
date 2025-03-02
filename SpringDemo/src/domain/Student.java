package domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.logging.Handler;

public class Student {

    private Integer sid;
    private String sname;
    private String ssex;
    private Integer sage;
    private static final Logger logger = LogManager.getLogger(Student.class);


    public Student() {
        logger.info("Student无参数构造方法执行了！");
    }

    public Student(Integer sid, String sname, String ssex, Integer sage) {
        logger.info("Student带参数构造方法执行了！");
        this.sid = sid;
        this.sname = sname;
        this.ssex = ssex;
        this.sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sage=" + sage +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        System.out.println("setSid方法执行啦");
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }
}
