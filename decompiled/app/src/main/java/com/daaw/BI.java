package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class BI {
    public final InterfaceC6094ku a;
    public AbstractC9284wK b;
    public C8046ru c;
    public C8046ru d;
    public C8046ru e;
    public F31 f;
    public F31 g;
    public F31 h;
    public F31 i;

    public BI(InterfaceC6094ku interfaceC6094ku) {
        this.a = interfaceC6094ku;
    }

    public AI a() {
        boolean z;
        if (this.i == null) {
            this.i = l(EnumC8325su.SECOND, 0, 59);
            z = false;
        } else {
            z = true;
        }
        if (this.h == null) {
            EnumC8325su enumC8325su = EnumC8325su.MINUTE;
            this.h = z ? k(enumC8325su, 0, 59) : l(enumC8325su, 0, 59);
        } else {
            z = true;
        }
        if (this.g == null) {
            EnumC8325su enumC8325su2 = EnumC8325su.HOUR;
            this.g = z ? k(enumC8325su2, 0, 23) : l(enumC8325su2, 0, 23);
        } else {
            z = true;
        }
        if (this.d == null) {
            EnumC8325su enumC8325su3 = EnumC8325su.DAY_OF_MONTH;
            UJ ujJ = j(enumC8325su3);
            this.d = z ? new C8046ru(enumC8325su3, AbstractC3958dK.b(), ujJ) : new C8046ru(enumC8325su3, new C2676Wp0(new M00(1)), ujJ);
        } else {
            z = true;
        }
        if (this.c == null) {
            EnumC8325su enumC8325su4 = EnumC8325su.DAY_OF_WEEK;
            UJ ujJ2 = j(enumC8325su4);
            this.c = z ? new C8046ru(enumC8325su4, AbstractC3958dK.b(), ujJ2) : new C8046ru(enumC8325su4, new C2676Wp0(new M00(1)), ujJ2);
        } else {
            z = true;
        }
        if (this.f == null) {
            EnumC8325su enumC8325su5 = EnumC8325su.MONTH;
            this.f = z ? k(enumC8325su5, 1, 12) : l(enumC8325su5, 1, 12);
        }
        if (this.b == null) {
            EnumC8325su enumC8325su6 = EnumC8325su.YEAR;
            this.b = AbstractC9563xK.e(new C8046ru(enumC8325su6, AbstractC3958dK.b(), j(enumC8325su6)));
        }
        if (this.e == null) {
            EnumC8325su enumC8325su7 = EnumC8325su.DAY_OF_YEAR;
            this.e = new C8046ru(enumC8325su7, z ? AbstractC3958dK.d() : AbstractC3958dK.b(), j(enumC8325su7));
        }
        return new C7083oT0(this.a.v(), this.a.p(EnumC8325su.YEAR), this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public BI b(C8046ru c8046ru) {
        m(EnumC8325su.DAY_OF_MONTH, c8046ru);
        this.d = c8046ru;
        return this;
    }

    public BI c(C8046ru c8046ru) {
        m(EnumC8325su.DAY_OF_WEEK, c8046ru);
        this.c = c8046ru;
        return this;
    }

    public BI d(C8046ru c8046ru) {
        m(EnumC8325su.DAY_OF_YEAR, c8046ru);
        this.e = c8046ru;
        return this;
    }

    public BI e(C8046ru c8046ru) {
        m(EnumC8325su.HOUR, c8046ru);
        this.g = new F31(AbstractC9563xK.e(c8046ru).a(0, 23));
        return this;
    }

    public BI f(C8046ru c8046ru) {
        m(EnumC8325su.MINUTE, c8046ru);
        this.h = new F31(AbstractC9563xK.e(c8046ru).a(0, 59));
        return this;
    }

    public BI g(C8046ru c8046ru) {
        m(EnumC8325su.MONTH, c8046ru);
        this.f = new F31(AbstractC9563xK.e(c8046ru).a(1, 12));
        return this;
    }

    public BI h(C8046ru c8046ru) {
        m(EnumC8325su.SECOND, c8046ru);
        this.i = new F31(AbstractC9563xK.e(c8046ru).a(0, 59));
        return this;
    }

    public BI i(C8046ru c8046ru) {
        m(EnumC8325su.YEAR, c8046ru);
        this.b = AbstractC9563xK.e(c8046ru);
        return this;
    }

    public final UJ j(EnumC8325su enumC8325su) {
        return this.a.v().d(enumC8325su) != null ? this.a.v().d(enumC8325su).c() : VJ.i().h(enumC8325su).f();
    }

    public final F31 k(EnumC8325su enumC8325su, int i, int i2) {
        return new F31(AbstractC9563xK.e(new C8046ru(enumC8325su, AbstractC3958dK.b(), j(enumC8325su))).a(i, i2));
    }

    public final F31 l(EnumC8325su enumC8325su, int i, int i2) {
        return new F31(AbstractC9563xK.e(new C8046ru(enumC8325su, new C2676Wp0(new M00(i)), j(enumC8325su))).a(i, i2));
    }

    public final void m(EnumC8325su enumC8325su, C8046ru c8046ru) {
        AbstractC6948ny0.c(enumC8325su, "Reference CronFieldName cannot be null");
        AbstractC6948ny0.c(c8046ru.e(), "CronField's CronFieldName cannot be null");
        if (!enumC8325su.equals(c8046ru.e())) {
            throw new IllegalArgumentException(String.format("Invalid argument! Expected CronField instance for field %s but found %s", c8046ru.e(), enumC8325su));
        }
    }
}
