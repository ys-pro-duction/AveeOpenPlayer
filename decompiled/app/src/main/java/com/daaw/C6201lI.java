package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.lI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6201lI extends AbstractC9284wK {
    public final int b;
    public final int c;

    public C6201lI(C8046ru c8046ru) {
        super(c8046ru);
        AbstractC3958dK abstractC3958dKE = ((C5631jI) c8046ru.d()).e();
        if (abstractC3958dKE instanceof C4325ef) {
            C4325ef c4325ef = (C4325ef) abstractC3958dKE;
            this.b = Math.max(c8046ru.c().d(), C5172hf.g(c4325ef.e()));
            this.c = Math.min(c8046ru.c().a(), C5172hf.g(c4325ef.f()));
        } else if (abstractC3958dKE instanceof C2676Wp0) {
            this.b = ((C2676Wp0) abstractC3958dKE).h().a().intValue();
            this.c = c8046ru.c().a();
        } else {
            this.b = c8046ru.c().d();
            this.c = c8046ru.c().a();
        }
    }

    @Override // com.daaw.AbstractC9284wK
    public List b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        try {
            int iH = h();
            if (i < iH && iH < i2) {
                arrayList.add(Integer.valueOf(iH));
            }
            int iC = c(i);
            while (iC < i2) {
                if (iC != iH) {
                    arrayList.add(Integer.valueOf(iC));
                }
                iC = c(iC);
            }
        } catch (C6623mo0 unused) {
        }
        return arrayList;
    }

    @Override // com.daaw.AbstractC9284wK
    public int c(int i) throws C6623mo0 {
        if (i >= this.c) {
            throw new C6623mo0();
        }
        int iG = g(i, (C5631jI) this.a.d());
        int i2 = this.b;
        if (iG < i2) {
            return i2;
        }
        if (iG <= this.c) {
            return iG;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public int d(int i) throws C6623mo0 {
        C5631jI c5631jI = (C5631jI) this.a.d();
        if (i < this.b) {
            throw new C6623mo0();
        }
        int i2 = this.c;
        if (i > i2) {
            return i2;
        }
        int iIntValue = c5631jI.f().a().intValue();
        int i3 = (i - this.b) % iIntValue;
        return i3 == 0 ? i - iIntValue : i - i3;
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean e(int i) {
        C5631jI c5631jI = (C5631jI) this.a.d();
        int iH = h();
        return i >= iH && (i - iH) % c5631jI.f().a().intValue() == 0 && i >= this.b && i <= this.c;
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean f(AbstractC3958dK abstractC3958dK) {
        return abstractC3958dK instanceof C5631jI;
    }

    public final int g(int i, C5631jI c5631jI) {
        int iH = h();
        if (i < iH) {
            return iH;
        }
        int iIntValue = c5631jI.f().a().intValue();
        return i + (iIntValue - ((i - iH) % iIntValue));
    }

    public int h() {
        AbstractC3958dK abstractC3958dKE = ((C5631jI) this.a.d()).e();
        return abstractC3958dKE instanceof C2676Wp0 ? ((C2676Wp0) abstractC3958dKE).h().a().intValue() : this.b;
    }
}
