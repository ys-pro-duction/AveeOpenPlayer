package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.ValueRange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements l {
    public static final q AH;
    public static final /* synthetic */ q[] a;

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean f(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.s(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.n(this, (ChronoField) temporalField);
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object k(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.w(this, fVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ long u(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.p(this, temporalField);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) a.clone();
    }

    static {
        q qVar = new q("AH", 0);
        AH = qVar;
        a = new q[]{qVar};
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return ValueRange.f(1L, 1L);
        }
        return j$.time.temporal.o.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        return kVar.d(1, ChronoField.ERA);
    }
}
