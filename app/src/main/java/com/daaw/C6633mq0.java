package com.daaw;

import j$.time.DayOfWeek;
import j$.time.LocalDate;

/* JADX INFO: renamed from: com.daaw.mq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6633mq0 extends AbstractC6354lq0 {

    /* JADX INFO: renamed from: com.daaw.mq0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5128hV0.values().length];
            a = iArr;
            try {
                iArr[EnumC5128hV0.L.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC5128hV0.W.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC5128hV0.LW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6633mq0(C8046ru c8046ru, int i, int i2) {
        super(c8046ru, i, i2);
        AbstractC6948ny0.a(EnumC8325su.DAY_OF_MONTH.equals(c8046ru.e()), "CronField does not belong to day of month");
    }

    @Override // com.daaw.AbstractC9284wK
    public int c(int i) throws C6623mo0 {
        int iG = g((C2676Wp0) this.a.d(), this.b, this.c);
        if (iG > i) {
            return iG;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public int d(int i) throws C6623mo0 {
        int iG = g((C2676Wp0) this.a.d(), this.b, this.c);
        if (iG < i) {
            return iG;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean e(int i) {
        return i == g((C2676Wp0) this.a.d(), this.b, this.c);
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean f(AbstractC3958dK abstractC3958dK) {
        return abstractC3958dK instanceof C2676Wp0;
    }

    public final int g(C2676Wp0 c2676Wp0, int i, int i2) throws C6623mo0 {
        int i3;
        int iIntValue = c2676Wp0.h().a().intValue();
        int i4 = a.a[c2676Wp0.g().a().ordinal()];
        if (i4 == 1) {
            int iIntValue2 = c2676Wp0.e().a().intValue();
            int iLengthOfMonth = LocalDate.of(i, i2, 1).lengthOfMonth();
            if (iIntValue2 <= 0) {
                iIntValue2 = 0;
            }
            return iLengthOfMonth - iIntValue2;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                throw new C6623mo0();
            }
            LocalDate localDateOf = LocalDate.of(i, i2, LocalDate.of(i, i2, 1).lengthOfMonth());
            int value = localDateOf.getDayOfWeek().getValue() - 5;
            return value > 0 ? localDateOf.minusDays(value).getDayOfMonth() : localDateOf.getDayOfMonth();
        }
        LocalDate localDateOf2 = LocalDate.of(i, i2, iIntValue);
        if (localDateOf2.getDayOfWeek() != DayOfWeek.SATURDAY) {
            return (localDateOf2.getDayOfWeek() != DayOfWeek.SUNDAY || (i3 = iIntValue + 1) > localDateOf2.lengthOfMonth()) ? iIntValue : i3;
        }
        if (iIntValue == 1) {
            return 3;
        }
        return iIntValue - 1;
    }
}
