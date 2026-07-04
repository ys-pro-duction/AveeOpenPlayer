package com.daaw;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Rg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2119Rg1 implements InterfaceC6549mZ0 {
    public final List B;
    public final int C;
    public final long[] D;
    public final long[] E;

    public C2119Rg1(List list) {
        this.B = list;
        int size = list.size();
        this.C = size;
        this.D = new long[size * 2];
        for (int i = 0; i < this.C; i++) {
            C1577Mg1 c1577Mg1 = (C1577Mg1) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.D;
            jArr[i2] = c1577Mg1.P;
            jArr[i2 + 1] = c1577Mg1.Q;
        }
        long[] jArr2 = this.D;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.E = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public int a(long j) {
        int iC = AbstractC6280lb1.c(this.E, j, false, false);
        if (iC < this.E.length) {
            return iC;
        }
        return -1;
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public long c(int i) {
        AbstractC7115ob.a(i >= 0);
        AbstractC7115ob.a(i < this.E.length);
        return this.E[i];
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public List g(long j) {
        SpannableStringBuilder spannableStringBuilder = null;
        C1577Mg1 c1577Mg1 = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.C; i++) {
            long[] jArr = this.D;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C1577Mg1 c1577Mg12 = (C1577Mg1) this.B.get(i);
                if (!c1577Mg12.a()) {
                    arrayList.add(c1577Mg12);
                } else if (c1577Mg1 == null) {
                    c1577Mg1 = c1577Mg12;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(c1577Mg1.B).append((CharSequence) "\n").append(c1577Mg12.B);
                } else {
                    spannableStringBuilder.append((CharSequence) "\n").append(c1577Mg12.B);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new C1577Mg1(spannableStringBuilder));
        } else if (c1577Mg1 != null) {
            arrayList.add(c1577Mg1);
        }
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public int h() {
        return this.E.length;
    }
}
