/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 *
 * @author JVVQX
 */
public class Address {
    private String province;
    private String amphur;

    public Address() {
    }

    public Address(String province, String amphur) {
        this.province = province;
        this.amphur = amphur;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAmphur() {
        return amphur;
    }

    public void setAmphur(String amphur) {
        this.amphur = amphur;
    }
    
    public static LinkedHashSet<Address> filterAddress(ArrayList<Campaign> campaign){
        LinkedHashSet<Address> totalAddress = new LinkedHashSet<>();
        for(Campaign camp:campaign){
            totalAddress.add(camp.getCampaignAddress());
        }
        return totalAddress;
    }
}