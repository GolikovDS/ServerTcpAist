package ru.gds.entity;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aist")
public class AistXmlEntity {


    private byte state;

    public byte getState() {
        return state;
    }
    @XmlElement
    public void setState(byte state) {
        this.state = state;
    }
}
