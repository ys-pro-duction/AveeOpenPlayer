package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Ks1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1418Ks1 {
    public Object[] a = new Object[8];
    public int b = 0;
    public C4392es1 c;

    public final C1418Ks1 a(Object obj, Object obj2) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(objArr, i3);
        }
        AbstractC0674Do1.a(obj, obj2);
        Object[] objArr2 = this.a;
        int i4 = this.b;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.b = i4 + 1;
        return this;
    }

    public final AbstractC7765qt1 b() {
        C4392es1 c4392es1 = this.c;
        if (c4392es1 != null) {
            throw c4392es1.a();
        }
        C6670my1 c6670my1H = C6670my1.h(this.b, this.a, this);
        C4392es1 c4392es12 = this.c;
        if (c4392es12 == null) {
            return c6670my1H;
        }
        throw c4392es12.a();
    }
}
