package service;

public class Service02 {
    public boolean register(String uname,String pwd,String confrimPwd){
        if(uname == null || uname.length() < 3){
            System.out.println("用户名长度不能小于3位");
            return false;
        }
        if(pwd == null || pwd.length() < 6){
            System.out.println("密码长度不能小于6位");
            return false;
        }
        if(!pwd.equals(confrimPwd)){
            System.out.println("两次密码输入不一致");
            return false;
        }
        System.out.println("注册成功");
        return true;
    }
}
