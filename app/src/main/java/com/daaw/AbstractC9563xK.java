package com.daaw;

/* JADX INFO: renamed from: com.daaw.xK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9563xK {
    public static AbstractC9284wK a(C8046ru c8046ru, int i, int i2) {
        AbstractC3958dK abstractC3958dKD = c8046ru.d();
        return (!(abstractC3958dKD instanceof C2676Wp0) || EnumC5128hV0.NONE.equals(((C2676Wp0) abstractC3958dKD).g().a())) ? e(c8046ru) : new C6633mq0(c8046ru, i, i2);
    }

    public static AbstractC9284wK b(C8046ru c8046ru, int i, int i2, C2329Tg1 c2329Tg1) {
        AbstractC3958dK abstractC3958dKD = c8046ru.d();
        return abstractC3958dKD instanceof C2676Wp0 ? new C6912nq0(c8046ru, i, i2, c2329Tg1) : abstractC3958dKD instanceof C4325ef ? new C4893gf(c8046ru, i, i2, c2329Tg1) : abstractC3958dKD instanceof C5013h4 ? new C5292i4(c8046ru, i, i2, c2329Tg1) : abstractC3958dKD instanceof C5631jI ? new C5913kI(c8046ru, i, i2, c2329Tg1) : e(c8046ru);
    }

    public static AbstractC9284wK c(C8046ru c8046ru, int i) {
        return e(c8046ru);
    }

    public static AbstractC9284wK d(C8046ru c8046ru) {
        return e(c8046ru);
    }

    public static AbstractC9284wK e(C8046ru c8046ru) {
        AbstractC3958dK abstractC3958dKD = c8046ru.d();
        if (abstractC3958dKD instanceof Q3) {
            return new R3(c8046ru);
        }
        if (abstractC3958dKD instanceof C5013h4) {
            return new C6139l4(c8046ru);
        }
        if (abstractC3958dKD instanceof C4325ef) {
            return new C5172hf(c8046ru);
        }
        if (abstractC3958dKD instanceof C5631jI) {
            return new C6201lI(c8046ru);
        }
        if (!(abstractC3958dKD instanceof C2676Wp0)) {
            return new C2046Qo0(c8046ru);
        }
        C2676Wp0 c2676Wp0 = (C2676Wp0) abstractC3958dKD;
        if (EnumC5128hV0.NONE.equals(c2676Wp0.g().a())) {
            return new C7749qq0(c8046ru);
        }
        throw new IllegalArgumentException(String.format("Cannot create instance for On instance with %s value", c2676Wp0.g()));
    }
}
