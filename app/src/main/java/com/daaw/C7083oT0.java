package com.daaw;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjusters;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: com.daaw.oT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7083oT0 implements AI {
    public static final LocalTime j = LocalTime.MAX.truncatedTo(ChronoUnit.SECONDS);
    public final C7210ou a;
    public final AbstractC9284wK b;
    public final C8046ru c;
    public final C8046ru d;
    public final C8046ru e;
    public final F31 f;
    public final F31 g;
    public final F31 h;
    public final F31 i;

    /* JADX INFO: renamed from: com.daaw.oT0$b */
    public static final class b {
        public final ZonedDateTime a;
        public final boolean b;

        public ZonedDateTime a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public String toString() {
            return "ExecutionTimeResult{time=" + this.a + ", isMatch=" + this.b + '}';
        }

        public b(ZonedDateTime zonedDateTime, boolean z) {
            this.a = zonedDateTime;
            this.b = z;
        }
    }

    public C7083oT0(C7210ou c7210ou, C8046ru c8046ru, C8046ru c8046ru2, C8046ru c8046ru3, C8046ru c8046ru4, F31 f31, F31 f312, F31 f313, F31 f314) {
        this.a = (C7210ou) AbstractC6948ny0.b(c7210ou);
        EnumC8325su enumC8325su = EnumC8325su.YEAR;
        if (c7210ou.a(enumC8325su)) {
            if (!c7210ou.d(enumC8325su).e()) {
                AbstractC6948ny0.b(c8046ru);
            }
            this.b = c8046ru == null ? AbstractC9563xK.e(new C8046ru(enumC8325su, AbstractC3958dK.b(), c7210ou.d(enumC8325su).c())) : AbstractC9563xK.d(c8046ru);
        } else {
            this.b = AbstractC9563xK.e(new C8046ru(enumC8325su, AbstractC3958dK.b(), VJ.i().f()));
        }
        this.c = (C8046ru) AbstractC6948ny0.b(c8046ru2);
        this.d = (C8046ru) AbstractC6948ny0.b(c8046ru3);
        this.e = c8046ru4;
        this.f = (F31) AbstractC6948ny0.b(f31);
        this.g = (F31) AbstractC6948ny0.b(f312);
        this.h = (F31) AbstractC6948ny0.b(f313);
        this.i = (F31) AbstractC6948ny0.b(f314);
    }

    public static /* synthetic */ boolean b(ZonedDateTime zonedDateTime, Integer num) {
        return num.intValue() < zonedDateTime.getYear();
    }

    public static /* synthetic */ boolean c(ZonedDateTime zonedDateTime, Integer num) {
        return num.intValue() <= zonedDateTime.getDayOfMonth();
    }

    public static /* synthetic */ boolean e(int i, int i2, Integer num) {
        return num.intValue() >= i && num.intValue() < i2;
    }

    public static b r(ZonedDateTime zonedDateTime, F31 f31, TemporalField temporalField) throws C6623mo0 {
        HashSet hashSet = new HashSet(f31.a);
        TemporalUnit baseUnit = temporalField.getBaseUnit();
        long maximum = temporalField.range().getMaximum() - temporalField.range().getMinimum();
        for (long j2 = 0; j2 < 2 * maximum; j2++) {
            zonedDateTime = zonedDateTime.n(1L, baseUnit);
            if (hashSet.contains(Integer.valueOf(zonedDateTime.get(temporalField)))) {
                return new b(zonedDateTime.truncatedTo(baseUnit).e(1L, baseUnit).minusSeconds(1L), false);
            }
        }
        throw new C6623mo0();
    }

    @Override // com.daaw.AI
    public Optional a(ZonedDateTime zonedDateTime) {
        AbstractC6948ny0.b(zonedDateTime);
        try {
            ZonedDateTime zonedDateTimeV = v(zonedDateTime);
            if (zonedDateTimeV.equals(zonedDateTime)) {
                zonedDateTimeV = v(zonedDateTime.minusSeconds(1L));
            }
            return Optional.of(zonedDateTimeV);
        } catch (C6623mo0 unused) {
            return Optional.empty();
        }
    }

    public final List f(int i, int i2, C2329Tg1 c2329Tg1) {
        int iLengthOfMonth = LocalDate.of(i, i2, 1).lengthOfMonth();
        if ((this.d.d() instanceof Q3) && (this.c.d() instanceof Q3)) {
            return (List) Collection.EL.stream(AbstractC9563xK.a(this.d, i, i2).a(1, iLengthOfMonth)).distinct().sorted().collect(Collectors.toList());
        }
        if (this.d.d() instanceof Q3) {
            return (List) Collection.EL.stream(AbstractC9563xK.b(this.c, i, i2, c2329Tg1).a(1, iLengthOfMonth)).distinct().sorted().collect(Collectors.toList());
        }
        if (this.c.d() instanceof Q3) {
            return (List) Collection.EL.stream(AbstractC9563xK.a(this.d, i, i2).a(1, iLengthOfMonth)).distinct().sorted().collect(Collectors.toList());
        }
        List listA = AbstractC9563xK.b(this.c, i, i2, c2329Tg1).a(1, iLengthOfMonth);
        List listA2 = AbstractC9563xK.a(this.d, i, i2).a(1, iLengthOfMonth);
        if (!this.a.f()) {
            return (List) Stream.CC.concat(Collection.EL.stream(listA), Collection.EL.stream(listA2)).distinct().sorted().collect(Collectors.toList());
        }
        final HashSet hashSet = new HashSet(listA);
        return (List) Collection.EL.stream(listA2).filter(new Predicate() { // from class: com.daaw.nT0
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return hashSet.contains((Integer) obj);
            }
        }).distinct().sorted().collect(Collectors.toList());
    }

    public final List g(int i, int i2, C2329Tg1 c2329Tg1) {
        int iLengthOfMonth = LocalDate.of(i, i2, 1).lengthOfMonth();
        if ((this.d.d() instanceof Q3) && (this.c.d() instanceof Q3)) {
            return (List) Collection.EL.stream(AbstractC9563xK.a(this.d, i, i2).a(1, iLengthOfMonth)).distinct().sorted().collect(Collectors.toList());
        }
        if (this.d.d() instanceof C8688uC0) {
            return (List) Collection.EL.stream(AbstractC9563xK.b(this.c, i, i2, c2329Tg1).a(1, iLengthOfMonth)).distinct().sorted().collect(Collectors.toList());
        }
        if (this.c.d() instanceof C8688uC0) {
            return (List) Collection.EL.stream(AbstractC9563xK.a(this.d, i, i2).a(1, iLengthOfMonth)).distinct().sorted().collect(Collectors.toList());
        }
        HashSet hashSet = new HashSet(AbstractC9563xK.a(this.d, i, i2).a(1, iLengthOfMonth));
        hashSet.retainAll(new HashSet(AbstractC9563xK.b(this.c, i, i2, c2329Tg1).a(1, iLengthOfMonth)));
        return (List) Collection.EL.stream(hashSet).sorted().collect(Collectors.toList());
    }

    public final Optional h(ZonedDateTime zonedDateTime) {
        List list = (List) Collection.EL.stream(AbstractC9563xK.a(this.d, zonedDateTime.getYear(), zonedDateTime.getMonthValue()).a(1, LocalDate.of(zonedDateTime.getYear(), zonedDateTime.getMonthValue(), 1).lengthOfMonth())).distinct().sorted().collect(Collectors.toList());
        return list.isEmpty() ? Optional.empty() : Optional.of(new F31(list));
    }

    public final F31 i(ZonedDateTime zonedDateTime, C2329Tg1 c2329Tg1) {
        return new F31((List) Collection.EL.stream(AbstractC9563xK.b(this.c, zonedDateTime.getYear(), zonedDateTime.getMonthValue(), c2329Tg1).a(1, LocalDate.of(zonedDateTime.getYear(), zonedDateTime.getMonthValue(), 1).lengthOfMonth())).distinct().sorted().collect(Collectors.toList()));
    }

    public final Optional j(final ZonedDateTime zonedDateTime) {
        int year = zonedDateTime.getYear();
        int monthValue = zonedDateTime.getMonthValue();
        List listA = AbstractC9563xK.c(this.e, year).a(1, LocalDate.of(year, 1, 1).lengthOfYear());
        final int dayOfYear = LocalDate.of(year, monthValue, 1).getDayOfYear();
        final int dayOfYear2 = monthValue == 12 ? LocalDate.of(year, 12, 31).getDayOfYear() + 1 : LocalDate.of(year, monthValue + 1, 1).getDayOfYear();
        return Optional.of((List) Collection.EL.stream(listA).filter(new Predicate() { // from class: com.daaw.jT0
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C7083oT0.e(dayOfYear, dayOfYear2, (Integer) obj);
            }
        }).map(new Function() { // from class: com.daaw.kT0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(LocalDate.ofYearDay(zonedDateTime.getYear(), ((Integer) obj).intValue()).getDayOfMonth());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList())).filter(AbstractC3307az0.a(new C6246lT0())).map(new C6525mT0());
    }

    public final Optional k(C7210ou c7210ou, ZonedDateTime zonedDateTime) {
        if (t(c7210ou)) {
            return j(zonedDateTime);
        }
        EnumC8325su enumC8325su = EnumC8325su.DAY_OF_WEEK;
        return (c7210ou.d(enumC8325su) == null || c7210ou.d(EnumC8325su.DAY_OF_MONTH) == null) ? c7210ou.d(enumC8325su) == null ? h(zonedDateTime) : Optional.of(i(zonedDateTime, ((C5532iw) c7210ou.d(enumC8325su)).f())) : l(c7210ou, zonedDateTime);
    }

    public final Optional l(C7210ou c7210ou, ZonedDateTime zonedDateTime) {
        EnumC8325su enumC8325su = EnumC8325su.DAY_OF_WEEK;
        return c7210ou.d(enumC8325su).c().c().contains(EnumC5128hV0.QUESTION_MARK) ? Optional.of(g(zonedDateTime.getYear(), zonedDateTime.getMonthValue(), ((C5532iw) c7210ou.d(enumC8325su)).f())).filter(AbstractC3307az0.a(new C6246lT0())).map(new C6525mT0()) : Optional.of(f(zonedDateTime.getYear(), zonedDateTime.getMonthValue(), ((C5532iw) c7210ou.d(enumC8325su)).f())).filter(AbstractC3307az0.a(new C6246lT0())).map(new C6525mT0());
    }

    public final b m(ZonedDateTime zonedDateTime, F31 f31, int i, int i2, int i3) {
        boolean z = false;
        C7455pn0 c7455pn0B = f31.b(zonedDateTime.getDayOfMonth(), 0);
        return c7455pn0B.a() > 0 ? new b(ZonedDateTime.of(LocalDate.of(zonedDateTime.getYear(), zonedDateTime.getMonthValue(), 1), j, zonedDateTime.getZone()).minusMonths(c7455pn0B.a()).q(TemporalAdjusters.lastDayOfMonth()), z) : new b(zonedDateTime.withDayOfMonth(c7455pn0B.b()).q(LocalTime.of(i, i2, i3)).truncatedTo(ChronoUnit.SECONDS), z);
    }

    public final b n(ZonedDateTime zonedDateTime) {
        return r(zonedDateTime, this.g, ChronoField.HOUR_OF_DAY);
    }

    public final b o(ZonedDateTime zonedDateTime) {
        return r(zonedDateTime, this.h, ChronoField.MINUTE_OF_HOUR);
    }

    public final b p(ZonedDateTime zonedDateTime, int i, int i2, int i3, int i4) {
        boolean z = false;
        C7455pn0 c7455pn0B = this.f.b(zonedDateTime.getMonthValue(), 0);
        c7455pn0B.b();
        return c7455pn0B.a() > 0 ? new b(ZonedDateTime.of(LocalDate.of(zonedDateTime.getYear(), 12, 31), j, zonedDateTime.getZone()).minusYears(c7455pn0B.a()), z) : new b(ZonedDateTime.of(zonedDateTime.getYear(), zonedDateTime.getMonthValue(), 1, 0, 0, 0, 0, zonedDateTime.getZone()).minusNanos(1L), z);
    }

    public final b q(ZonedDateTime zonedDateTime) {
        return r(zonedDateTime, this.i, ChronoField.SECOND_OF_MINUTE);
    }

    public final b s(ZonedDateTime zonedDateTime, F31 f31, int i, int i2, int i3, int i4, int i5) {
        int iD = this.b.d(zonedDateTime.getYear());
        boolean z = false;
        if (i2 > 28 && i2 > LocalDate.of(iD, i, 1).lengthOfMonth()) {
            C7455pn0 c7455pn0B = f31.b(i2, 1);
            if (c7455pn0B.a() > 0) {
                return new b(ZonedDateTime.of(LocalDate.of(iD, i, 1), j, zonedDateTime.getZone()).minusMonths(c7455pn0B.a()).q(TemporalAdjusters.lastDayOfMonth()), z);
            }
            i2 = c7455pn0B.b();
        }
        return new b(ZonedDateTime.of(LocalDate.of(iD, i, i2), LocalTime.of(i3, i4, i5), zonedDateTime.getZone()), z);
    }

    public final boolean t(C7210ou c7210ou) {
        EnumC8325su enumC8325su = EnumC8325su.DAY_OF_YEAR;
        if (!c7210ou.a(enumC8325su)) {
            return false;
        }
        if (c7210ou.d(enumC8325su).c().c().contains(EnumC5128hV0.QUESTION_MARK)) {
            return !(this.e.d() instanceof C8688uC0);
        }
        return true;
    }

    public final b u(final ZonedDateTime zonedDateTime) {
        List listA = this.b.a(zonedDateTime.getYear(), zonedDateTime.getYear());
        Optional optionalK = k(this.a, zonedDateTime);
        if (!optionalK.isPresent() || !Collection.EL.stream(((F31) optionalK.get()).d()).anyMatch(new Predicate() { // from class: com.daaw.gT0
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C7083oT0.c(zonedDateTime, (Integer) obj);
            }
        })) {
            return new b(w(zonedDateTime), false);
        }
        F31 f31 = (F31) optionalK.get();
        boolean z = true;
        int iIntValue = ((Integer) this.f.d().get(this.f.d().size() - 1)).intValue();
        int iIntValue2 = ((Integer) f31.d().get(f31.d().size() - 1)).intValue();
        int iIntValue3 = ((Integer) this.g.d().get(this.g.d().size() - 1)).intValue();
        int iIntValue4 = ((Integer) this.h.d().get(this.h.d().size() - 1)).intValue();
        int iIntValue5 = ((Integer) this.i.d().get(this.i.d().size() - 1)).intValue();
        if (listA.isEmpty()) {
            return s(zonedDateTime, f31, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5);
        }
        if (listA.contains(Integer.valueOf(zonedDateTime.getYear()))) {
            return !this.f.d().contains(Integer.valueOf(zonedDateTime.getMonthValue())) ? p(zonedDateTime, iIntValue2, iIntValue3, iIntValue4, iIntValue5) : !f31.d().contains(Integer.valueOf(zonedDateTime.getDayOfMonth())) ? m(zonedDateTime, f31, iIntValue3, iIntValue4, iIntValue5) : !this.g.d().contains(Integer.valueOf(zonedDateTime.getHour())) ? n(zonedDateTime) : !this.h.d().contains(Integer.valueOf(zonedDateTime.getMinute())) ? o(zonedDateTime) : !this.i.d().contains(Integer.valueOf(zonedDateTime.getSecond())) ? q(zonedDateTime) : new b(zonedDateTime.truncatedTo(ChronoUnit.SECONDS), z);
        }
        return Collection.EL.stream(listA).filter(new Predicate() { // from class: com.daaw.hT0
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C7083oT0.b(zonedDateTime, (Integer) obj);
            }
        }).max(new Comparator() { // from class: com.daaw.iT0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Integer) obj).compareTo((Integer) obj2);
            }
        }).isPresent() ? s(zonedDateTime.minusYears(zonedDateTime.getYear() - ((Integer) r0.get()).intValue()), f31, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5) : s(zonedDateTime.minusYears(1L), f31, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5);
    }

    public final ZonedDateTime v(ZonedDateTime zonedDateTime) throws C6623mo0 {
        b bVar = new b(zonedDateTime, 0 == true ? 1 : 0);
        for (int i = 0; i < 100000; i++) {
            bVar = u(bVar.a());
            if (bVar.b()) {
                return bVar.a();
            }
        }
        throw new C6623mo0();
    }

    public final ZonedDateTime w(ZonedDateTime zonedDateTime) {
        ZonedDateTime zonedDateTimeQ = zonedDateTime.minusMonths(1L).q(TemporalAdjusters.lastDayOfMonth());
        return ZonedDateTime.of(zonedDateTimeQ.getYear(), zonedDateTimeQ.getMonth().getValue(), zonedDateTimeQ.getDayOfMonth(), ((Integer) this.g.d().get(this.g.d().size() - 1)).intValue(), ((Integer) this.h.d().get(this.h.d().size() - 1)).intValue(), ((Integer) this.i.d().get(this.i.d().size() - 1)).intValue(), 0, zonedDateTimeQ.getZone());
    }
}
