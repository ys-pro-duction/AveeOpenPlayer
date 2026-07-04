package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class NO0 {
    public static final String[] a = {"Waveform", "Spectrum", "Spectrum2"};

    public static InterfaceC10173zX a(String str, InterfaceC10173zX interfaceC10173zX) {
        if (b(interfaceC10173zX, "None").equals(str)) {
            return interfaceC10173zX;
        }
        str.getClass();
        switch (str) {
            case "Spectrum":
                return new HO0();
            case "None":
                return null;
            case "Spectrum2":
                return new IO0();
            case "Waveform":
                return new KO0();
            default:
                AbstractC0441Bk1.c("unknown typeName: " + str);
                return interfaceC10173zX == null ? new IO0() : interfaceC10173zX;
        }
    }

    public static String b(InterfaceC10173zX interfaceC10173zX, String str) {
        if (interfaceC10173zX == null) {
            return str;
        }
        if (interfaceC10173zX instanceof KO0) {
            return "Waveform";
        }
        if (interfaceC10173zX instanceof HO0) {
            return "Spectrum";
        }
        if (interfaceC10173zX instanceof IO0) {
            return "Spectrum2";
        }
        AbstractC0441Bk1.c("unknown instance type");
        return str;
    }
}
