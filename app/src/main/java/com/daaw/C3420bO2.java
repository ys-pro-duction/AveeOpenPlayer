package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.bO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3420bO2 {
    public final String a;
    public final ZN2 b;
    public ZN2 c;

    public /* synthetic */ C3420bO2(String str, AbstractC3141aO2 abstractC3141aO2) {
        ZN2 zn2 = new ZN2(null);
        this.b = zn2;
        this.c = zn2;
        str.getClass();
        this.a = str;
    }

    public final C3420bO2 a(Object obj) {
        ZN2 zn2 = new ZN2(null);
        this.c.b = zn2;
        this.c = zn2;
        zn2.a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        ZN2 zn2 = this.b.b;
        String str = "";
        while (zn2 != null) {
            Object obj = zn2.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zn2 = zn2.b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
