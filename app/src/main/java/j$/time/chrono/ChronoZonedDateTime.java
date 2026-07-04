package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC10375b;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends InterfaceC10375b> extends j$.time.temporal.k, Comparable<ChronoZonedDateTime<?>> {
    ChronoLocalDateTime A();

    long J();

    k a();

    LocalTime b();

    InterfaceC10375b c();

    int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime);

    ZoneId getZone();

    ZoneOffset h();

    ChronoZonedDateTime i(ZoneId zoneId);
}
