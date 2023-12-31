package github.nowsoar.springframework.test.bean;

import java.util.Date;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public class Husband {

    String wifiName;

    private Date marriageDate;

    private Wife wife;

    public String queryWife() {
        return "" + wife;
    }

    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public Date getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(Date marriageDate) {
        this.marriageDate = marriageDate;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
