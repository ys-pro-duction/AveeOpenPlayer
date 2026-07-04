package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class WJ extends C7882rK {
    public int e;

    public WJ(C7489pu c7489pu, EnumC8325su enumC8325su) {
        super(c7489pu, enumC8325su);
        this.e = 1;
        AbstractC6948ny0.a(EnumC8325su.DAY_OF_WEEK.equals(enumC8325su), "CronFieldName must be DAY_OF_WEEK");
    }

    @Override // com.daaw.ZJ
    public C7489pu a() {
        this.a.g(new C5532iw(this.b, this.c.f(), this.d, new C2329Tg1(this.e, this.c.f().g(0))));
        return this.a;
    }

    public WJ m(int i, int i2) {
        super.k(i, i2);
        return this;
    }

    public WJ n(int i) {
        this.c.l(i - this.e);
        this.e = i;
        return this;
    }

    @Override // com.daaw.C7882rK
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WJ l(int i, int i2) {
        super.l(i, i2);
        return this;
    }
}
