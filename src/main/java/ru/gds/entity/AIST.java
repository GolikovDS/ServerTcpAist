package ru.gds.entity;


public class AIST {

    public static byte data;
    private String er = "";
    private String rezp = "";
    private String er_gl = "";
    private String vnim_pt = "";
    private String pog_pt = "";
    private String pusk_pt = "";
    private String pog_ps = "";

    public AIST() {
    }

    public AIST(String er, String er_gl, String pog_ps, String pog_pt, String pusk_pt, String rezp, String vnim_pt) {
        this.er = er;
        this.rezp = rezp;
        this.er_gl = er_gl;
        this.vnim_pt = vnim_pt;
        this.pog_pt = pog_pt;
        this.pusk_pt = pusk_pt;
        this.pog_ps = pog_ps;
    }


    public String getEr() {
        return er;
    }

    public String getEr_gl() {
        return er_gl;
    }

    public String getPog_ps() {
        return pog_ps;
    }

    public String getPog_pt() {
        return pog_pt;
    }

    public String getPusk_pt() {
        return pusk_pt;
    }

    public String getRezp() {
        return rezp;
    }

    public String getVnim_pt() {
        return vnim_pt;
    }

    @Override
    public String toString() {
        return "AIST { " + er + " " + rezp + " " + er_gl + " "
                + vnim_pt + " " + pog_pt + " " + pusk_pt + " "
                + pog_ps + "}";
    }

    public AIST getAistState(byte b) {
        data = b;
        if ((b & (byte) 0b00000001) == 0x01) {
            er = "Неисправность";
        } else {
            er = "";
        }
        if ((b >> 1 & (byte) 0b00000001) == 0x01) {
            rezp = "Рез. питание";
        } else {
            rezp = "";
        }
        if ((b >> 2 & (byte) 0b00000001) == 0x01) {
            er_gl = "Неиспр. устройств";
        } else {
            er_gl = "";
        }

        if ((b >> 3 & (byte) 0b00000001) == 0x01) {
            vnim_pt = "Пожар1";
        } else {
            vnim_pt = "";
        }
        if ((b >> 4 & (byte) 0b00000001) == 0x01) {
            pog_pt = "Пожар2";
        } else {
            pog_pt = "";
        }
        if ((b >> 5 & (byte) 0b00000001) == 0x01) {
            pusk_pt = "Пуск";
        } else {
            pusk_pt = "";
        }
        if ((b >> 6 & (byte) 0b00000001) == 0x01) {
            pog_ps = "Пожар ПС";
        } else {
            pog_ps = "";
        }

        return new AIST(er, er_gl, pog_ps, pog_pt, pusk_pt, rezp, vnim_pt);

    }
}
