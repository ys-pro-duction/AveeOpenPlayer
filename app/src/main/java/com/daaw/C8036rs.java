package com.daaw;

import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.rs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C8036rs implements Cloneable {
    public final String[] B;
    public final String[] C;
    public final C0592Cw0[] D;
    public String E;

    public C8036rs(String[] strArr, String[] strArr2, C0592Cw0[] c0592Cw0Arr, String str) {
        if (strArr.length <= 0) {
            throw new IllegalArgumentException("Empty extension array");
        }
        if (strArr2.length <= 0) {
            throw new IllegalArgumentException("Empty MIME type array");
        }
        this.B = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.B[i] = strArr[i].toLowerCase(Locale.ENGLISH);
        }
        this.C = new String[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            this.C[i2] = strArr2[i2].toLowerCase(Locale.ENGLISH);
        }
        this.E = str;
        this.D = c0592Cw0Arr == null ? new C0592Cw0[0] : (C0592Cw0[]) c0592Cw0Arr.clone();
    }

    public boolean b(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        boolean z = false;
        for (String str2 : this.B) {
            z = z || lowerCase.endsWith(str2);
        }
        return z;
    }

    public Object clone() {
        return super.clone();
    }
}
