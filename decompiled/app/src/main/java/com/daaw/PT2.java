package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class PT2 {
    public final Object a;
    public final Object b;
    public final byte[] c;
    public final EnumC3603c23 d;
    public final int e;
    public final String f;
    public final AbstractC8758uT2 g;
    public final int h;

    public PT2(Object obj, Object obj2, byte[] bArr, int i, EnumC3603c23 enumC3603c23, int i2, String str, AbstractC8758uT2 abstractC8758uT2) {
        this.a = obj;
        this.b = obj2;
        this.c = Arrays.copyOf(bArr, bArr.length);
        this.h = i;
        this.d = enumC3603c23;
        this.e = i2;
        this.f = str;
        this.g = abstractC8758uT2;
    }

    public final int a() {
        return this.e;
    }

    public final AbstractC8758uT2 b() {
        return this.g;
    }

    public final EnumC3603c23 c() {
        return this.d;
    }

    public final Object d() {
        return this.a;
    }

    public final Object e() {
        return this.b;
    }

    public final String f() {
        return this.f;
    }

    public final byte[] g() {
        byte[] bArr = this.c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int h() {
        return this.h;
    }
}
