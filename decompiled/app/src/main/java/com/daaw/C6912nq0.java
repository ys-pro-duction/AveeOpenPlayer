package com.daaw;

import j$.time.DayOfWeek;
import j$.time.LocalDate;

/* JADX INFO: renamed from: com.daaw.nq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6912nq0 extends AbstractC6354lq0 {
    public static final C2676Wp0 e = new C2676Wp0(new M00(7));
    public final C2329Tg1 d;

    /* JADX INFO: renamed from: com.daaw.nq0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5128hV0.values().length];
            a = iArr;
            try {
                iArr[EnumC5128hV0.HASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC5128hV0.L.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC5128hV0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6912nq0(C8046ru c8046ru, int i, int i2, C2329Tg1 c2329Tg1) {
        super(c8046ru, i, i2);
        AbstractC6948ny0.a(EnumC8325su.DAY_OF_WEEK.equals(c8046ru.e()), "CronField does not belong to day of week");
        this.d = c2329Tg1;
    }

    @Override // com.daaw.AbstractC9284wK
    public int c(int i) throws C6623mo0 {
        int iJ = j((C2676Wp0) this.a.d(), this.b, this.c, i);
        if (iJ > i) {
            return iJ;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public int d(int i) throws C6623mo0 {
        int iJ = j((C2676Wp0) this.a.d(), this.b, this.c, i);
        if (iJ < i) {
            return iJ;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean e(int i) {
        return i == j((C2676Wp0) this.a.d(), this.b, this.c, i + (-1));
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean f(AbstractC3958dK abstractC3958dK) {
        return abstractC3958dK instanceof C2676Wp0;
    }

    public final int g(C2676Wp0 c2676Wp0, int i, int i2) {
        DayOfWeek dayOfWeek = LocalDate.of(i, i2, 1).getDayOfWeek();
        int iA = AbstractC3550br.a(this.d, AbstractC3550br.b, c2676Wp0.h().a().intValue());
        int iIntValue = c2676Wp0.e().a().intValue();
        int value = dayOfWeek.getValue() - iA;
        int iAbs = value < 0 ? Math.abs(value) + 1 : 1;
        if (value > 0) {
            iAbs = (iAbs + 7) - value;
        }
        return ((iIntValue - 1) * 7) + iAbs;
    }

    public final int h(C2676Wp0 c2676Wp0, int i, int i2) throws C6623mo0 {
        LocalDate localDateOf = LocalDate.of(i, i2, LocalDate.of(i, i2, 1).lengthOfMonth());
        int value = localDateOf.getDayOfWeek().getValue();
        int iA = AbstractC3550br.a(this.d, AbstractC3550br.b, c2676Wp0.h().a().intValue());
        int i3 = value - iA;
        if (i3 == 0) {
            return localDateOf.getDayOfMonth();
        }
        if (i3 < 0) {
            return localDateOf.minusDays(((long) value) + ((long) (7 - iA))).getDayOfMonth();
        }
        if (i3 > 0) {
            return localDateOf.minusDays(i3).getDayOfMonth();
        }
        throw new C6623mo0();
    }

    public final int i(C2676Wp0 c2676Wp0, int i, int i2, int i3) {
        int value = LocalDate.of(i, i2, 1).getDayOfWeek().getValue() - AbstractC3550br.a(this.d, AbstractC3550br.b, c2676Wp0.h().a().intValue());
        int iAbs = value < 0 ? Math.abs(value) + 1 : 1;
        if (value > 0) {
            iAbs = (iAbs + 7) - value;
        }
        if (i3 < 1) {
            return iAbs;
        }
        while (iAbs <= i3) {
            iAbs += 7;
        }
        return iAbs;
    }

    public final int j(C2676Wp0 c2676Wp0, int i, int i2, int i3) throws C6623mo0 {
        int i4 = a.a[c2676Wp0.g().a().ordinal()];
        if (i4 == 1) {
            return g(c2676Wp0, i, i2);
        }
        if (i4 == 2) {
            return c2676Wp0.h().a().intValue() == -1 ? i(e, i, i2, i3) : h(c2676Wp0, i, i2);
        }
        if (i4 == 3) {
            return i(c2676Wp0, i, i2, i3);
        }
        throw new C6623mo0();
    }
}
