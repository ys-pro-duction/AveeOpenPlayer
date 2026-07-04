package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5172hf extends AbstractC9284wK {
    public C5172hf(C8046ru c8046ru) {
        super(c8046ru);
    }

    public static int g(AbstractC9005vK abstractC9005vK) {
        if (abstractC9005vK instanceof M00) {
            return ((M00) abstractC9005vK).a().intValue();
        }
        throw new IllegalArgumentException("Non integer values at intervals are not fully supported yet.");
    }

    @Override // com.daaw.AbstractC9284wK
    public List b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C4325ef c4325ef = (C4325ef) this.a.d();
        int iG = g(c4325ef.e());
        int iG2 = g(c4325ef.f());
        if (i <= iG2 && iG <= i2) {
            if (iG2 >= i2) {
                iG2 = i2;
            }
            if (g(c4325ef.e()) <= i) {
                iG = i;
            }
            if (iG != i) {
                try {
                    arrayList.add(Integer.valueOf(iG));
                } catch (C6623mo0 unused) {
                }
            }
            int iC = c(iG);
            while (iC < iG2) {
                arrayList.add(Integer.valueOf(iC));
                iC = c(iC);
            }
            if (iG2 != i2) {
                arrayList.add(Integer.valueOf(iC));
            }
        }
        return arrayList;
    }

    @Override // com.daaw.AbstractC9284wK
    public int c(int i) throws C6623mo0 {
        C4325ef c4325ef = (C4325ef) this.a.d();
        do {
            i++;
        } while (i < g(c4325ef.e()));
        if (i <= g(c4325ef.f())) {
            return i;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public int d(int i) throws C6623mo0 {
        C4325ef c4325ef = (C4325ef) this.a.d();
        do {
            i--;
        } while (i > g(c4325ef.f()));
        if (i >= g(c4325ef.e())) {
            return i;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean e(int i) {
        C4325ef c4325ef = (C4325ef) this.a.d();
        return i >= g(c4325ef.e()) && i <= g(c4325ef.f());
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean f(AbstractC3958dK abstractC3958dK) {
        return abstractC3958dK instanceof C4325ef;
    }
}
