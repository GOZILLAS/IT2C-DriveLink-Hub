package config;
 
public class session {
    
    private static session instance;
    private int id;
    private String fn;
    private String ln;
    private String em;
    private String ct;
    private String pw;
    private String un;
    private String tacc;
    private String stat;
    private String imagePath;
    
    public static synchronized session getInstance(){
             if(instance == null){
                instance = new session();
        }return instance;
    }
    
    
    public static boolean isInstanceEmpty(){
            return instance == null;
    }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFn() {
            return fn;
        }

        public void setFn(String fn) {
            this.fn = fn;
        }

        public String getLn() {
            return ln;
        }

        public void setLn(String ln) {
            this.ln = ln;
        }

        public String getEm() {
            return em;
        }

        public void setEm(String em) {
            this.em = em;
        }

        public String getCt() {
            return ct;
        }

        public void setCt(String ct) {
            this.ct = ct;
        }

        public String getPw() {
            return pw;
        }

        public void setPw(String pw) {
            this.pw = pw;
        }

        public String getUn() {
            return un;
        }

        public void setUn(String un) {
            this.un = un;
        }

        public String getTacc() {
            return tacc;
        }

        public void setTacc(String tacc) {
            this.tacc = tacc;
        }
        
         public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }
        
        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }
        
        
}