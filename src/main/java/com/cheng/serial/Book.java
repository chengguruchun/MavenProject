package com.cheng.serial;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 10:35 2018/8/24
 * @Reference:
 */
@XmlRootElement
public class Book {

    @Protobuf(fieldType = FieldType.INT32, order=1)
    int  id;

    @Protobuf(fieldType = FieldType.STRING, order=2)
    String name;

    @Protobuf(fieldType = FieldType.STRING, order=3)
    String address;

    @Protobuf(fieldType = FieldType.STRING, order=4)
    String buyer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", address=" + address + ", buyer=" + buyer + "]";
    }


}