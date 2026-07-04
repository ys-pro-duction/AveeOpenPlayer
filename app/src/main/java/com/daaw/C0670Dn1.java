package com.daaw;

/* JADX INFO: renamed from: com.daaw.Dn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0670Dn1 {
    public final String a;

    public C0670Dn1(int i, int i2, String str) {
        this.a = str;
    }

    public static C0670Dn1 a(C5900kE2 c5900kE2) {
        String str;
        c5900kE2.h(2);
        int iU = c5900kE2.u();
        int i = iU >> 1;
        int i2 = iU & 1;
        int iU2 = c5900kE2.u() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        int i3 = iU2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new C0670Dn1(i, i3, sb.toString());
    }
}
