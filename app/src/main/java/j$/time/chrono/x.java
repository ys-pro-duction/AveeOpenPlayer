package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements l, Serializable {
    public static final x d;
    public static final x[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean f(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.s(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.n(this, (ChronoField) temporalField);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object k(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.w(this, fVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ long u(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.p(this, temporalField);
    }

    static {
        x xVar = new x(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = xVar;
        e = new x[]{xVar, new x(0, LocalDate.of(1912, 7, 30), "Taisho"), new x(1, LocalDate.of(1926, 12, 25), "Showa"), new x(2, LocalDate.of(1989, 1, 8), "Heisei"), new x(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public final x l() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return m(this.a + 1);
    }

    public x(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static x m(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            x[] xVarArr = e;
            if (i2 < xVarArr.length) {
                return xVarArr[i2];
            }
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        return kVar.d(getValue(), ChronoField.ERA);
    }

    public static x g(LocalDate localDate) {
        if (localDate.O(w.d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 are not supported");
        }
        x[] xVarArr = e;
        for (int length = xVarArr.length - 1; length >= 0; length--) {
            x xVar = xVarArr[length];
            if (localDate.compareTo(xVar.b) >= 0) {
                return xVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        if (temporalField != chronoField) {
            return j$.time.temporal.o.d(this, temporalField);
        }
        return u.c.E(chronoField);
    }

    public final String toString() {
        return this.c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 5, this);
    }
}
