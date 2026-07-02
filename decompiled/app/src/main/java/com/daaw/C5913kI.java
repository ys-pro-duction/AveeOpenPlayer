package com.daaw;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.kI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5913kI extends C6201lI {
    public final int d;
    public int e;
    public int f;
    public final Set g;

    public C5913kI(C8046ru c8046ru, int i, int i2, C2329Tg1 c2329Tg1) {
        super(c8046ru);
        AbstractC6948ny0.a(EnumC8325su.DAY_OF_WEEK.equals(c8046ru.e()), "CronField does not belong to day of week");
        this.e = i;
        this.f = i2;
        this.d = LocalDate.of(i, i2, 1).lengthOfMonth();
        int iIntValue = ((C5631jI) c8046ru.d()).f().a().intValue();
        AbstractC6948ny0.a(iIntValue > 0 && iIntValue < 8, "Cron Expression for day of week has an invalid period.");
        this.g = i(c2329Tg1, iIntValue, this.b, this.c);
    }

    public static Set i(C2329Tg1 c2329Tg1, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList(7);
        while (i2 <= i3) {
            arrayList.add(DayOfWeek.of(AbstractC3550br.a(c2329Tg1, AbstractC3550br.b, i2)));
            i2 += i;
        }
        return EnumSet.copyOf((Collection) arrayList);
    }

    @Override // com.daaw.C6201lI, com.daaw.AbstractC9284wK
    public List b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i < i2) {
            try {
                i = c(i);
                if (i < i2) {
                    arrayList.add(Integer.valueOf(i));
                }
            } catch (C6623mo0 unused) {
            }
        }
        return arrayList;
    }

    @Override // com.daaw.C6201lI, com.daaw.AbstractC9284wK
    public int c(int i) throws C6623mo0 {
        do {
            i++;
            if (e(i)) {
                break;
            }
        } while (i <= this.d);
        if (i <= this.d) {
            return i;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.C6201lI, com.daaw.AbstractC9284wK
    public int d(int i) throws C6623mo0 {
        do {
            i--;
            if (e(i)) {
                break;
            }
        } while (i > 0);
        if (i > 0) {
            return i;
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.C6201lI, com.daaw.AbstractC9284wK
    public boolean e(int i) {
        if (i > this.d || i < 1) {
            return false;
        }
        return this.g.contains(LocalDate.of(this.e, this.f, i).getDayOfWeek());
    }
}
