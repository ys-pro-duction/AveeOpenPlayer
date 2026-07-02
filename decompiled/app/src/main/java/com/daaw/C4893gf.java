package com.daaw;

import j$.time.LocalDate;
import j$.util.function.IntConsumer$CC;
import j$.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: com.daaw.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4893gf extends AbstractC9284wK {
    public final int b;
    public final int c;
    public final C2329Tg1 d;
    public final Set e;

    public C4893gf(C8046ru c8046ru, int i, int i2, C2329Tg1 c2329Tg1) {
        super(c8046ru);
        AbstractC6948ny0.a(EnumC8325su.DAY_OF_WEEK.equals(c8046ru.e()), "CronField does not belong to day of week");
        this.b = i;
        this.c = i2;
        this.d = c2329Tg1;
        final HashSet hashSet = new HashSet();
        this.e = hashSet;
        C4325ef c4325ef = (C4325ef) c8046ru.d();
        int iIntValue = ((Integer) c4325ef.e().a()).intValue();
        int iIntValue2 = ((Integer) c4325ef.f().a()).intValue();
        if (iIntValue2 >= iIntValue) {
            IntStream.CC.rangeClosed(iIntValue, iIntValue2).forEach(new IntConsumer() { // from class: com.daaw.ff
                @Override // java.util.function.IntConsumer
                public final void accept(int i3) {
                    hashSet.add(Integer.valueOf(i3));
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer$CC.$default$andThen(this, intConsumer);
                }
            });
        } else {
            IntStream.CC.rangeClosed(iIntValue, c8046ru.c().a()).forEach(new IntConsumer() { // from class: com.daaw.ff
                @Override // java.util.function.IntConsumer
                public final void accept(int i3) {
                    hashSet.add(Integer.valueOf(i3));
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer$CC.$default$andThen(this, intConsumer);
                }
            });
            IntStream.CC.rangeClosed(c8046ru.c().d(), iIntValue2).forEach(new IntConsumer() { // from class: com.daaw.ff
                @Override // java.util.function.IntConsumer
                public final void accept(int i3) {
                    hashSet.add(Integer.valueOf(i3));
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer$CC.$default$andThen(this, intConsumer);
                }
            });
        }
    }

    @Override // com.daaw.AbstractC9284wK
    public List b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.e) {
            VJ vjI = VJ.i();
            EnumC8325su enumC8325su = EnumC8325su.DAY_OF_WEEK;
            List listA = new C6912nq0(new C0375Au(enumC8325su, vjI.h(enumC8325su).f()).e(num.toString()), this.b, this.c, this.d).a(i, i2);
            if (listA != null) {
                arrayList.addAll(listA);
            }
        }
        Collections.sort(arrayList);
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
        return this.e.contains(Integer.valueOf((LocalDate.of(this.b, this.c, i).getDayOfWeek().getValue() % 7) + (this.d.c() - 1)));
    }

    @Override // com.daaw.AbstractC9284wK
    public boolean f(AbstractC3958dK abstractC3958dK) {
        return abstractC3958dK instanceof C4325ef;
    }
}
