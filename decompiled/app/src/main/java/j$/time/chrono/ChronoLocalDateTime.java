package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.chrono.InterfaceC10375b;
import j$.time.temporal.TemporalAdjuster;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends InterfaceC10375b> extends j$.time.temporal.k, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    k a();

    LocalTime b();

    InterfaceC10375b c();

    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    ChronoZonedDateTime o(ZoneId zoneId);
}
