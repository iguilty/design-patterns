package com.zero.mediator;

import com.zero.colleague.Colleague;
import com.zero.colleague.HouseOwner;
import com.zero.colleague.Tenant;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class MediatorStructure implements Mediator {
    //首先中介结构必须知道所有房主和租房者的信息
    private List<HouseOwner>houseOwners=new ArrayList<>();
    private List<Tenant>tenants=new ArrayList<>();
    public void add(Colleague colleague){
        if (colleague instanceof HouseOwner){
            houseOwners.add((HouseOwner) colleague);
        }else if(colleague instanceof Tenant){
            tenants.add((Tenant) colleague);
        }else{
            System.out.println("对不起，暂时不支持此类型");
        }
    }
    @Override
    public void contact(String message, Colleague coll) {
        if (coll instanceof HouseOwner){
            for (Tenant tenant:tenants) {
                tenant.getMessage(message);
            }
        }else {
            for (HouseOwner houseOwner:houseOwners){
                houseOwner.getMessage(message);
            }
        }
    }
}
