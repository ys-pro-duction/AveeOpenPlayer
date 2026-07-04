package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.ValueRange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class C implements l {
    public static final C BEFORE_ROC;
    public static final C ROC;
    public static final /* synthetic */ C[] a;

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

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) a.clone();
    }

    static {
        C c = new C("BEFORE_ROC", 0);
        BEFORE_ROC = c;
        C c2 = new C("ROC", 1);
        ROC = c2;
        a = new C[]{c, c2};
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        return j$.time.temporal.o.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        return kVar.d(getValue(), ChronoField.ERA);
    }
}
