package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10375b extends j$.time.temporal.k, TemporalAdjuster, Comparable {
    InterfaceC10375b C(j$.time.temporal.n nVar);

    /* JADX INFO: renamed from: H */
    int compareTo(InterfaceC10375b interfaceC10375b);

    k a();

    @Override // j$.time.temporal.k
    InterfaceC10375b d(long j, TemporalField temporalField);

    @Override // j$.time.temporal.k
    InterfaceC10375b e(long j, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    @Override // j$.time.temporal.l
    boolean f(TemporalField temporalField);

    int hashCode();

    /* JADX INFO: renamed from: j */
    InterfaceC10375b q(TemporalAdjuster temporalAdjuster);

    String toString();

    long v();

    ChronoLocalDateTime x(LocalTime localTime);

    l z();
}
