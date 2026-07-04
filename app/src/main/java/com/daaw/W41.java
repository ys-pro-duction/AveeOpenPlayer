package com.daaw;

import com.daaw.Z41;

/* JADX INFO: loaded from: classes.dex */
public final class W41 {
    public final boolean a;
    public final String b;
    public final Z41.a c;
    public final int d;
    public final byte[] e;

    public W41(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        AbstractC7115ob.a((bArr2 == null) ^ (i == 0));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        this.c = new Z41.a(a(str), bArr, i2, i3);
    }

    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        switch (str) {
        }
        return 1;
    }
}
