package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class RO0 {
    public static final String[] a = {"HorizontalLine", "Circle", "SidedPolygon", "Letter"};
    public static final String[] b = {"HorizontalLine", "Circle", "SidedPolygon", "Letter", "Year"};
    public static final String[] c = {"None", "Circle", "SidedPolygon"};

    public static AX a(String str, AX ax) {
        if (b(ax).equals(str)) {
            return ax;
        }
        str.getClass();
        switch (str) {
            case "Letter":
                break;
            case "None":
                break;
            case "Year":
                break;
            case "SidedPolygon":
                break;
            case "HorizontalLine":
                break;
            case "Circle":
                break;
            default:
                AbstractC0441Bk1.c("unknown typeName: " + str);
                break;
        }
        return ax;
    }

    public static String b(AX ax) {
        if (ax == null) {
            return "None";
        }
        if (ax instanceof TO0) {
            return "HorizontalLine";
        }
        if (ax instanceof QO0) {
            return "Circle";
        }
        if (ax instanceof VO0) {
            return "SidedPolygon";
        }
        if (ax instanceof UO0) {
            return "Letter";
        }
        if (ax instanceof XO0) {
            return "Year";
        }
        AbstractC0441Bk1.c("unknown instance type");
        return "unk";
    }
}
