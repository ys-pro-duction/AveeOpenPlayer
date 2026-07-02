package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface k extends Comparable {
    InterfaceC10375b B(int i, int i2, int i3);

    InterfaceC10375b D(Map map, j$.time.format.x xVar);

    ValueRange E(ChronoField chronoField);

    ChronoZonedDateTime F(Instant instant, ZoneId zoneId);

    List G();

    l I(int i);

    boolean equals(Object obj);

    int g(l lVar, int i);

    int hashCode();

    InterfaceC10375b l(long j);

    String m();

    InterfaceC10375b p(j$.time.temporal.l lVar);

    ChronoLocalDateTime s(LocalDateTime localDateTime);

    String t();

    String toString();

    InterfaceC10375b w(int i, int i2);
}
