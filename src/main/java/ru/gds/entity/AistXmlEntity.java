package ru.gds.entity;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aist")
public class AistXmlEntity {


    private byte state;
    private int address;


    public AistXmlEntity() {
    }

//    private String er = "";
//    private String rezp = "";
//    private String er_gl = "";
//    private String vnim_pt = "";
//    private String pog_pt = "";
//    private String pusk_pt = "";
//    private String pog_ps = "";
//
//    public AistXmlEntity getAistState(byte b) {
//        data = b;
//        if ((b & (byte) 0b00000001) == 0x01) {
//            er = "Неисправность";
//        } else {
//            er = "";
//        }
//        if ((b >> 1 & (byte) 0b00000001) == 0x01) {
//            rezp = "Рез. питание";
//        } else {
//            rezp = "";
//        }
//        if ((b >> 2 & (byte) 0b00000001) == 0x01) {
//            er_gl = "Неиспр. устройств";
//        } else {
//            er_gl = "";
//        }
//
//        if ((b >> 3 & (byte) 0b00000001) == 0x01) {
//            vnim_pt = "Пожар1";
//        } else {
//            vnim_pt = "";
//        }
//        if ((b >> 4 & (byte) 0b00000001) == 0x01) {
//            pog_pt = "Пожар2";
//        } else {
//            pog_pt = "";
//        }
//        if ((b >> 5 & (byte) 0b00000001) == 0x01) {
//            pusk_pt = "Пуск";
//        } else {
//            pusk_pt = "";
//        }
//        if ((b >> 6 & (byte) 0b00000001) == 0x01) {
//            pog_ps = "Пожар ПС";
//        } else {
//            pog_ps = "";
//        }
//
//        return setAll(er, er_gl, pog_ps, pog_pt, pusk_pt, rezp, vnim_pt);
//
//    }
//
//    private AistXmlEntity setAll (String er, String er_gl, String pog_ps, String pog_pt, String pusk_pt, String rezp, String vnim_pt) {
//        this.er = er;
//        this.er_gl = er_gl;
//        this.pog_ps = pog_ps;
//        this.pog_pt = pog_pt;
//        this.pusk_pt = pusk_pt;
//        this.rezp = rezp;
//        this.vnim_pt = vnim_pt;
//        return this;
//    }
//
//
//
//    public String getEr() {
//        return er;
//    }
//
//    public void setEr(String er) {
//        this.er = er;
//    }
//
//    public String getEr_gl() {
//        return er_gl;
//    }
//
//    public void setEr_gl(String er_gl) {
//        this.er_gl = er_gl;
//    }
//
//    public String getPog_ps() {
//        return pog_ps;
//    }
//
//    public void setPog_ps(String pog_ps) {
//        this.pog_ps = pog_ps;
//    }
//
//    public String getPog_pt() {
//        return pog_pt;
//    }
//
//    public void setPog_pt(String pog_pt) {
//        this.pog_pt = pog_pt;
//    }
//
//    public String getPusk_pt() {
//        return pusk_pt;
//    }
//
//    public void setPusk_pt(String pusk_pt) {
//        this.pusk_pt = pusk_pt;
//    }
//
//    public String getRezp() {
//        return rezp;
//    }
//
//    public void setRezp(String rezp) {
//        this.rezp = rezp;
//    }
//
//    public String getVnim_pt() {
//        return vnim_pt;
//    }
//
//    public void setVnim_pt(String vnim_pt) {
//        this.vnim_pt = vnim_pt;
//    }
//
    public byte getState() {
        return state;
    }
    @XmlElement(name = "sate")
    public void setState(byte state) {
        this.state = state;
    }
}
