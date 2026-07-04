package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Ab3 extends AbstractC7955rb3 {
    public Ab3() {
        super(4);
    }

    public final Ab3 a(Object... objArr) {
        Zb3.b(objArr, 15);
        int i = this.b;
        int i2 = i + 15;
        Object[] objArr2 = this.a;
        int length = objArr2.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i + 14);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(objArr2, i3);
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr2.clone();
            this.c = false;
        }
        System.arraycopy(objArr, 0, this.a, this.b, 15);
        this.b += 15;
        return this;
    }

    public final Rb3 b() {
        this.c = true;
        return Rb3.D(this.a, this.b);
    }
}
