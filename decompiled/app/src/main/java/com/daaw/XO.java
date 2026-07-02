package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class XO {
    public static final String[] a = {"None", "Vortex"};

    public static InterfaceC5135hX a(String str, InterfaceC5135hX interfaceC5135hX) {
        if (b(interfaceC5135hX).equals(str)) {
            return interfaceC5135hX;
        }
        str.getClass();
        if (str.equals("Vortex")) {
            return new C4054dg1();
        }
        if (str.equals("None")) {
            return null;
        }
        AbstractC0441Bk1.c("unknown typeName: " + str);
        return interfaceC5135hX;
    }

    public static String b(InterfaceC5135hX interfaceC5135hX) {
        if (interfaceC5135hX == null) {
            return "None";
        }
        if (interfaceC5135hX instanceof C4054dg1) {
            return "Vortex";
        }
        AbstractC0441Bk1.c("unknown instance type");
        return "unk";
    }
}
