package vn.nganhangso;

public class Province {
    private String id = new String() ;
    private String name = new String() ;
    public Province(String id,String name){
        this.id = id;
        this.name = name;
    }

    public void setProvince(String id , String name ){
        this.id = id ;
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return  this.name;
    }
}

