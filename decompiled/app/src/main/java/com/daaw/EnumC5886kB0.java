package com.daaw;

import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.kB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5886kB0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    public final String B;

    EnumC5886kB0(String str) {
        this.B = str;
    }

    public static EnumC5886kB0 a(String str) throws IOException {
        EnumC5886kB0 enumC5886kB0 = HTTP_1_0;
        if (str.equals(enumC5886kB0.B)) {
            return enumC5886kB0;
        }
        EnumC5886kB0 enumC5886kB02 = HTTP_1_1;
        if (str.equals(enumC5886kB02.B)) {
            return enumC5886kB02;
        }
        EnumC5886kB0 enumC5886kB03 = HTTP_2;
        if (str.equals(enumC5886kB03.B)) {
            return enumC5886kB03;
        }
        EnumC5886kB0 enumC5886kB04 = SPDY_3;
        if (str.equals(enumC5886kB04.B)) {
            return enumC5886kB04;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.B;
    }
}
