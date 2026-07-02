package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends AbstractC10374a implements Serializable {
    public static final z c = new z();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.k
    public final String m() {
        return "Minguo";
    }

    @Override // j$.time.chrono.k
    public final l I(int i) {
        if (i == 0) {
            return C.BEFORE_ROC;
        }
        if (i == 1) {
            return C.ROC;
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.k
    public final String t() {
        return "roc";
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b B(int i, int i2, int i3) {
        return new B(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b w(int i, int i2) {
        return new B(LocalDate.ofYearDay(i + 1911, i2));
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b l(long j) {
        return new B(LocalDate.R(j));
    }

    @Override // j$.time.chrono.AbstractC10374a
    public final InterfaceC10375b n() {
        return new B(LocalDate.M(LocalDate.Q(j$.com.android.tools.r8.a.Z())));
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b p(j$.time.temporal.l lVar) {
        if (lVar instanceof B) {
            return (B) lVar;
        }
        return new B(LocalDate.M(lVar));
    }

    @Override // j$.time.chrono.k
    public final int g(l lVar, int i) {
        if (lVar instanceof C) {
            return lVar == C.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.k
    public final List G() {
        return j$.com.android.tools.r8.a.Q(C.values());
    }

    @Override // j$.time.chrono.k
    public final ValueRange E(ChronoField chronoField) {
        int i = y.a[chronoField.ordinal()];
        if (i == 1) {
            ValueRange valueRange = ChronoField.PROLEPTIC_MONTH.c;
            return ValueRange.f(valueRange.getMinimum() - 22932, valueRange.getMaximum() - 22932);
        }
        if (i == 2) {
            ValueRange valueRange2 = ChronoField.YEAR.c;
            return ValueRange.g(valueRange2.getMaximum() - 1911, (-valueRange2.getMinimum()) + 1912);
        }
        if (i != 3) {
            return chronoField.c;
        }
        ValueRange valueRange3 = ChronoField.YEAR.c;
        return ValueRange.f(valueRange3.getMinimum() - 1911, valueRange3.getMaximum() - 1911);
    }

    @Override // j$.time.chrono.AbstractC10374a, j$.time.chrono.k
    public final InterfaceC10375b D(Map map, j$.time.format.x xVar) {
        return (B) super.D(map, xVar);
    }

    private z() {
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
