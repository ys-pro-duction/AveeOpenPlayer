package com.daaw;

import java.net.ProtocolException;

/* JADX INFO: renamed from: com.daaw.oX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7099oX0 {
    public final EnumC5886kB0 a;
    public final int b;
    public final String c;

    public C7099oX0(EnumC5886kB0 enumC5886kB0, int i, String str) {
        this.a = enumC5886kB0;
        this.b = i;
        this.c = str;
    }

    public static C7099oX0 a(String str) throws ProtocolException {
        EnumC5886kB0 enumC5886kB0;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC5886kB0 = EnumC5886kB0.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                enumC5886kB0 = EnumC5886kB0.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            enumC5886kB0 = EnumC5886kB0.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i + 4);
            }
            return new C7099oX0(enumC5886kB0, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == EnumC5886kB0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}
