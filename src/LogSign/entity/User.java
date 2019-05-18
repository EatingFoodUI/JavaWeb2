package LogSign.entity;

// 模拟ORM
public class User {
    private int id;
    private String name;
    private String pwd;
    private String sex;
    private String home;
    private String info;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = this.id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = this.name;
    }

    public String getPwd(){
        return pwd;
    }

    public void setPwd(String pwd){
        this.pwd = this.pwd;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = this.sex;
    }

    public String getHome(){
        return home;
    }

    public void setHome(String home){
        this.home = this.home;
    }

    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info = this.info;
    }
}
