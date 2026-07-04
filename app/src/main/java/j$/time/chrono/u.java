package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjusters;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC10374a implements Serializable {
    public static final u c = new u();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.k
    public final String m() {
        return "Japanese";
    }

    @Override // j$.time.chrono.k
    public final String t() {
        return "japanese";
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b B(int i, int i2, int i3) {
        return new w(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b w(int i, int i2) {
        return new w(LocalDate.ofYearDay(i, i2));
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b l(long j) {
        return new w(LocalDate.R(j));
    }

    @Override // j$.time.chrono.AbstractC10374a
    public final InterfaceC10375b n() {
        return new w(LocalDate.M(LocalDate.Q(j$.com.android.tools.r8.a.Z())));
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b p(j$.time.temporal.l lVar) {
        if (lVar instanceof w) {
            return (w) lVar;
        }
        return new w(LocalDate.M(lVar));
    }

    @Override // j$.time.chrono.k
    public final List G() {
        x[] xVarArr = x.e;
        return j$.com.android.tools.r8.a.Q((x[]) Arrays.copyOf(xVarArr, xVarArr.length));
    }

    private u() {
    }

    @Override // j$.time.chrono.k
    public final int g(l lVar, int i) {
        if (!(lVar instanceof x)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = ((x) lVar).b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || lVar != x.g(LocalDate.of(i3, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return i3;
    }

    @Override // j$.time.chrono.k
    public final l I(int i) {
        return x.m(i);
    }

    @Override // j$.time.chrono.k
    public final ValueRange E(ChronoField chronoField) {
        switch (t.a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.p("Unsupported field: " + chronoField);
            case 5:
                x[] xVarArr = x.e;
                int i = xVarArr[xVarArr.length - 1].b.a;
                int iMin = 1000000000 - xVarArr[xVarArr.length - 1].b.a;
                int i2 = xVarArr[0].b.a;
                for (int i3 = 1; i3 < xVarArr.length; i3++) {
                    x xVar = xVarArr[i3];
                    iMin = Math.min(iMin, (xVar.b.a - i2) + 1);
                    i2 = xVar.b.a;
                }
                return ValueRange.g(iMin, 999999999 - i);
            case 6:
                x xVar2 = x.d;
                ValueRange valueRange = ChronoField.DAY_OF_YEAR.c;
                x[] xVarArr2 = x.e;
                long jMin = valueRange.c;
                for (x xVar3 : xVarArr2) {
                    jMin = Math.min(jMin, (xVar3.b.lengthOfYear() - xVar3.b.getDayOfYear()) + 1);
                    if (xVar3.l() != null) {
                        jMin = Math.min(jMin, xVar3.l().b.getDayOfYear() - 1);
                    }
                }
                return ValueRange.g(jMin, ChronoField.DAY_OF_YEAR.c.getMaximum());
            case 7:
                return ValueRange.f(w.d.a, 999999999L);
            case 8:
                long j = x.d.a;
                x[] xVarArr3 = x.e;
                return ValueRange.f(j, xVarArr3[xVarArr3.length - 1].a);
            default:
                return chronoField.c;
        }
    }

    @Override // j$.time.chrono.AbstractC10374a, j$.time.chrono.k
    public final InterfaceC10375b D(Map map, j$.time.format.x xVar) {
        return (w) super.D(map, xVar);
    }

    @Override // j$.time.chrono.AbstractC10374a
    public final InterfaceC10375b K(Map map, j$.time.format.x xVar) {
        w wVarS;
        ChronoField chronoField = ChronoField.ERA;
        Long l = (Long) map.get(chronoField);
        x xVarM = l != null ? x.m(E(chronoField).a(l.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l2 = (Long) map.get(chronoField2);
        int iA = l2 != null ? E(chronoField2).a(l2.longValue(), chronoField2) : 0;
        if (xVarM == null && l2 != null && !map.containsKey(ChronoField.YEAR) && xVar != j$.time.format.x.STRICT) {
            x[] xVarArr = x.e;
            xVarM = ((x[]) Arrays.copyOf(xVarArr, xVarArr.length))[((x[]) Arrays.copyOf(xVarArr, xVarArr.length)).length - 1];
        }
        if (l2 != null && xVarM != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            boolean zContainsKey = map.containsKey(chronoField3);
            LocalDate localDate = xVarM.b;
            if (zContainsKey) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (xVar == j$.time.format.x.LENIENT) {
                        return new w(LocalDate.of((localDate.a + iA) - 1, 1, 1)).P(j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField3)).longValue(), 1L), ChronoUnit.MONTHS).P(j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = E(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iA3 = E(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (xVar != j$.time.format.x.SMART) {
                        LocalDate localDate2 = w.d;
                        Objects.requireNonNull(xVarM, "era");
                        LocalDate localDateOf = LocalDate.of((localDate.a + iA) - 1, iA2, iA3);
                        if (localDateOf.O(localDate) || xVarM != x.g(localDateOf)) {
                            throw new j$.time.b("year, month, and day not valid for Era");
                        }
                        return new w(xVarM, iA, localDateOf);
                    }
                    if (iA < 1) {
                        throw new j$.time.b("Invalid YearOfEra: " + iA);
                    }
                    int i = (localDate.a + iA) - 1;
                    try {
                        wVarS = new w(LocalDate.of(i, iA2, iA3));
                    } catch (j$.time.b unused) {
                        wVarS = new w(LocalDate.of(i, iA2, 1)).S(TemporalAdjusters.lastDayOfMonth());
                    }
                    if (wVarS.b == xVarM || j$.time.temporal.o.a(wVarS, ChronoField.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return wVarS;
                    }
                    throw new j$.time.b("Invalid YearOfEra for Era: " + xVarM + " " + iA);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (xVar == j$.time.format.x.LENIENT) {
                    return new w(LocalDate.ofYearDay((localDate.a + iA) - 1, 1)).P(j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = E(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5);
                LocalDate localDate3 = w.d;
                Objects.requireNonNull(xVarM, "era");
                LocalDate localDateOfYearDay = iA == 1 ? LocalDate.ofYearDay(localDate.a, (localDate.getDayOfYear() + iA4) - 1) : LocalDate.ofYearDay((localDate.a + iA) - 1, iA4);
                if (localDateOfYearDay.O(localDate) || xVarM != x.g(localDateOfYearDay)) {
                    throw new j$.time.b("Invalid parameters");
                }
                return new w(xVarM, iA, localDateOfYearDay);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime F(Instant instant, ZoneId zoneId) {
        return j.L(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new D((byte) 1, this);
    }
}
