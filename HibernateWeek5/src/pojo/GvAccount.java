package pojo;
// Generated Apr 4, 2018 9:25:36 AM by Hibernate Tools 4.3.1



/**
 * Gvaccount generated by hbm2java
 */
public class GvAccount  implements java.io.Serializable {


     private String idgvaccount;
     private String username;
     private String password;
     private GiaoVu giaoVu;

    public GiaoVu getGiaoVu() {
        return giaoVu;
    }

    public void setGiaoVu(GiaoVu giaoVu) {
        this.giaoVu = giaoVu;
    }

    public GvAccount() {
    }

	
    public GvAccount(String idgvaccount) {
        this.idgvaccount = idgvaccount;
    }
    public GvAccount(String idgvaccount, String username, String password) {
       this.idgvaccount = idgvaccount;
       this.username = username;
       this.password = password;
    }
   
    public String getIdgvaccount() {
        return this.idgvaccount;
    }
    
    public void setIdgvaccount(String idgvaccount) {
        this.idgvaccount = idgvaccount;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


