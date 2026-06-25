package extend;

/**
 * 车类，定义载客量
 * @author hyf
 * @date 2025/6/1
 */
public class CarCopy {
    private int site = 4; //座位数
    CarCopy(){
        System.out.println("载客量是"+site+"人");
    }
    public void setSite(int site){
        this.site = site;
    }
    void print(){
        System.out.print("载客量是"+site+"人");
    }
}



