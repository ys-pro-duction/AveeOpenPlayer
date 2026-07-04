package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends AbstractC10374a implements Serializable {
    public static final F c = new F();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.k
    public final l I(int i) {
        if (i == 0) {
            return I.BEFORE_BE;
        }
        if (i == 1) {
            return I.BE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.k
    public final String t() {
        return "buddhist";
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b B(int i, int i2, int i3) {
        return new H(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b w(int i, int i2) {
        return new H(LocalDate.ofYearDay(i - 543, i2));
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b l(long j) {
        return new H(LocalDate.R(j));
    }

    @Override // j$.time.chrono.AbstractC10374a
    public final InterfaceC10375b n() {
        return new H(LocalDate.M(LocalDate.Q(j$.com.android.tools.r8.a.Z())));
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b p(j$.time.temporal.l lVar) {
        if (lVar instanceof H) {
            return (H) lVar;
        }
        return new H(LocalDate.M(lVar));
    }

    @Override // j$.time.chrono.k
    public final int g(l lVar, int i) {
        if (lVar instanceof I) {
            return lVar == I.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private F() {
    }

    @Override // j$.time.chrono.k
    public final List G() {
        return j$.com.android.tools.r8.a.Q(I.values());
    }

    @Override // j$.time.chrono.k
    public final ValueRange E(ChronoField chronoField) {
        int i = E.a[chronoField.ordinal()];
        if (i == 1) {
            ValueRange valueRange = ChronoField.PROLEPTIC_MONTH.c;
            return ValueRange.f(valueRange.getMinimum() + 6516, valueRange.getMaximum() + 6516);
        }
        if (i == 2) {
            ValueRange valueRange2 = ChronoField.YEAR.c;
            return ValueRange.g((-(valueRange2.getMinimum() + 543)) + 1, valueRange2.getMaximum() + 543);
        }
        if (i != 3) {
            return chronoField.c;
        }
        ValueRange valueRange3 = ChronoField.YEAR.c;
        return ValueRange.f(valueRange3.getMinimum() + 543, valueRange3.getMaximum() + 543);
    }

    @Override // j$.time.chrono.AbstractC10374a, j$.time.chrono.k
    public final InterfaceC10375b D(Map map, j$.time.format.x xVar) {
        return (H) super.D(map, xVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime F(Instant instant, ZoneId zoneId) {
        return j.L(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new D((byte) 1, this);
    }
}
