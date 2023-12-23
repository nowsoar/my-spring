package github.nowsoar.springframework.test.bean;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/19
 */
public class UserService {

    private String uId;

    private UserDao userDao;

    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;

    public void queryUserInfo() {
        System.out.println("查询用户信息: " + userDao.queryUserName(uId)
        +"，" + company + "，" + location);
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
