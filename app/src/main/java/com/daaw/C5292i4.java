package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5292i4 extends AbstractC9284wK {
    public final int b;
    public final int c;
    public final C2329Tg1 d;

    public C5292i4(C8046ru c8046ru, int i, int i2, C2329Tg1 c2329Tg1) {
        super(c8046ru);
        AbstractC6948ny0.a(EnumC8325su.DAY_OF_WEEK.equals(c8046ru.e()), "CronField does not belong to day of week");
        this.b = i;
        this.c = i2;
        this.d = c2329Tg1;
    }

    @Override // com.daaw.AbstractC9284wK
    public List b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C5013h4) this.a.d()).f().iterator();
        while (it.hasNext()) {
            List listA = AbstractC9563xK.b(new C8046ru(EnumC8325su.DAY_OF_WEEK, (AbstractC3958dK) it.next(), this.a.c()), this.b, this.c, this.d).a(i, i2);
            if (listA != null) {
                arrayList.addAll(listA);
            }
        }
        return arrayList;
    }

    @Override // com.daaw.AbstractC9284wK
    public int c(int i) {
        return 0;
    }

    @Override // com.daaw.AbstractC9284wK
    public int d(int i) {
        return 0;
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean e(int i) {
        return false;
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean f(AbstractC3958dK abstractC3958dK) {
        return abstractC3958dK instanceof C5013h4;
    }
}
