package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class R3 extends AbstractC9284wK {
    public R3(C8046ru c8046ru) {
        super(c8046ru);
    }

    @Override // com.daaw.AbstractC9284wK
    public List b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            i++;
            if (i >= i2) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // com.daaw.AbstractC9284wK
    public int c(int i) throws C6623mo0 {
        int i2 = i + 1;
        if (i2 <= this.a.c().a()) {
            return i2;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public int d(int i) throws C6623mo0 {
        int i2 = i - 1;
        if (i2 >= this.a.c().d()) {
            return i2;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean e(int i) {
        return this.a.e() == EnumC8325su.DAY_OF_WEEK || this.a.c().g(i);
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean f(AbstractC3958dK abstractC3958dK) {
        return abstractC3958dK instanceof Q3;
    }
}
