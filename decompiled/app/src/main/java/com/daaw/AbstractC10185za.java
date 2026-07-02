package com.daaw;

/* JADX INFO: renamed from: com.daaw.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10185za {
    public static final String[] a = {"HorizontalLine", "Rectangle"};
    public static final String[] b = {"None", "HorizontalLine", "Rectangle"};

    public static HW a(String str, HW hw) {
        if (b(hw).equals(str)) {
            return hw;
        }
        str.getClass();
        switch (str) {
            case "HorizontalLineRandom":
                break;
            case "Rectangle":
                break;
            case "Line":
                break;
            case "None":
                break;
            case "VerticalLine":
                break;
            case "Rectangle3D":
                break;
            case "HorizontalLine":
                break;
            default:
                AbstractC0441Bk1.c("unknown typeName: " + str);
                break;
        }
        return hw;
    }

    public static String b(HW hw) {
        if (hw == null) {
            return "None";
        }
        if (hw instanceof C0295Aa) {
            return "HorizontalLine";
        }
        if (hw instanceof C0399Ba) {
            return "HorizontalLineRandom";
        }
        if (hw instanceof C0720Ea) {
            return "Line";
        }
        if (hw instanceof C0607Da) {
            return "Rectangle";
        }
        if (hw instanceof C0503Ca) {
            return "Rectangle3D";
        }
        AbstractC0441Bk1.c("unknown instance type");
        return "unk";
    }
}
