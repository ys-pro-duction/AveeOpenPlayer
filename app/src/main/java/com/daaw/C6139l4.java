package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6139l4 extends AbstractC9284wK {
    public static final InterfaceC2420Ud0 b = AbstractC2628Wd0.k(C6139l4.class);

    public C6139l4(C8046ru c8046ru) {
        super(c8046ru);
    }

    public static /* synthetic */ Integer g(int i, AbstractC9284wK abstractC9284wK) {
        try {
            return Integer.valueOf(abstractC9284wK.d(i));
        } catch (C6623mo0 unused) {
            return Integer.MIN_VALUE;
        }
    }

    public static /* synthetic */ Integer h(int i, AbstractC9284wK abstractC9284wK) {
        try {
            return Integer.valueOf(abstractC9284wK.c(i));
        } catch (C6623mo0 unused) {
            return Integer.MIN_VALUE;
        }
    }

    @Override // com.daaw.AbstractC9284wK
    public List b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        try {
            int iC = c(i);
            while (iC < i2) {
                arrayList.add(Integer.valueOf(iC));
                iC = c(iC);
            }
        } catch (C6623mo0 e) {
            b.g("Catched expected exception while generating candidates", e);
        }
        return arrayList;
    }

    @Override // com.daaw.AbstractC9284wK
    public int c(final int i) throws C6623mo0 {
        List listI = i(new XQ() { // from class: com.daaw.j4
            @Override // com.daaw.XQ
            public final Object apply(Object obj) {
                return C6139l4.h(i, (AbstractC9284wK) obj);
            }
        });
        if (listI.isEmpty()) {
            throw new C6623mo0();
        }
        return ((Integer) listI.get(0)).intValue();
    }

    @Override // com.daaw.AbstractC9284wK
    public int d(final int i) throws C6623mo0 {
        List listI = i(new XQ() { // from class: com.daaw.k4
            @Override // com.daaw.XQ
            public final Object apply(Object obj) {
                return C6139l4.g(i, (AbstractC9284wK) obj);
            }
        });
        if (listI.isEmpty()) {
            throw new C6623mo0();
        }
        return ((Integer) listI.get(listI.size() - 1)).intValue();
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean e(int i) {
        boolean z;
        Iterator it = ((C5013h4) this.a.d()).f().iterator();
        while (true) {
            while (it.hasNext()) {
                z = z || j(new C8046ru(this.a.e(), (AbstractC3958dK) it.next(), this.a.c())).e(i);
            }
            return z;
        }
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean f(AbstractC3958dK abstractC3958dK) {
        return abstractC3958dK instanceof C5013h4;
    }

    public final List i(XQ xq) {
        C5013h4 c5013h4 = (C5013h4) this.a.d();
        ArrayList<Integer> arrayList = new ArrayList();
        Iterator it = c5013h4.f().iterator();
        while (it.hasNext()) {
            arrayList.add(xq.apply(j(new C8046ru(this.a.e(), (AbstractC3958dK) it.next(), this.a.c()))));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : arrayList) {
            if (num.intValue() >= 0) {
                arrayList2.add(num);
            }
        }
        Collections.sort(arrayList2);
        return arrayList2;
    }

    public final AbstractC9284wK j(C8046ru c8046ru) {
        AbstractC3958dK abstractC3958dKD = c8046ru.d();
        if (abstractC3958dKD instanceof Q3) {
            return new R3(c8046ru);
        }
        if (abstractC3958dKD instanceof C4325ef) {
            return new C5172hf(c8046ru);
        }
        if (abstractC3958dKD instanceof C5631jI) {
            return new C6201lI(c8046ru);
        }
        if (abstractC3958dKD instanceof C2676Wp0) {
            return new C7749qq0(c8046ru);
        }
        throw new IllegalArgumentException(String.format("FieldExpression %s not supported!", abstractC3958dKD.getClass()));
    }
}
