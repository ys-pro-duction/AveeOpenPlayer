package com.daaw;

/* JADX INFO: renamed from: com.daaw.bP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3422bP0 {
    public static final String[] a = {"None", "Bars", "Line", "SharpBars", "RoundBars"};

    public static BX a(String str, BX bx) {
        if (b(bx).equals(str)) {
            return bx;
        }
        str.getClass();
        switch (str) {
            case "Bars":
                break;
            case "Line":
                break;
            case "None":
                break;
            case "SharpBars":
                break;
            case "RoundBars":
                break;
            default:
                AbstractC0441Bk1.c("unknown typeName: " + str);
                break;
        }
        return bx;
    }

    public static String b(BX bx) {
        if (bx == null) {
            return "None";
        }
        if (bx instanceof ZO0) {
            return "Bars";
        }
        if (bx instanceof C3700cP0) {
            return "Line";
        }
        if (bx instanceof C4257eP0) {
            return "SharpBars";
        }
        if (bx instanceof C3979dP0) {
            return "RoundBars";
        }
        AbstractC0441Bk1.c("unknown instance type");
        return "unk";
    }
}
