package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC10375b;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements j$.time.temporal.l {
    public ZoneId b;
    public j$.time.chrono.k c;
    public boolean d;
    public x e;
    public InterfaceC10375b f;
    public LocalTime g;
    public final HashMap a = new HashMap();
    public j$.time.n h = j$.time.n.d;

    @Override // j$.time.temporal.l
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.o.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ ValueRange r(TemporalField temporalField) {
        return j$.time.temporal.o.d(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        if (this.a.containsKey(temporalField)) {
            return true;
        }
        InterfaceC10375b interfaceC10375b = this.f;
        if (interfaceC10375b != null && interfaceC10375b.f(temporalField)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime == null || !localTime.f(temporalField)) {
            return (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.q(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l = (Long) this.a.get(temporalField);
        if (l != null) {
            return l.longValue();
        }
        InterfaceC10375b interfaceC10375b = this.f;
        if (interfaceC10375b != null && interfaceC10375b.f(temporalField)) {
            return this.f.u(temporalField);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.f(temporalField)) {
            return this.g.u(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", temporalField));
        }
        return temporalField.k(this);
    }

    @Override // j$.time.temporal.l
    public final Object k(j$.time.f fVar) {
        if (fVar == j$.time.temporal.o.a) {
            return this.b;
        }
        if (fVar == j$.time.temporal.o.b) {
            return this.c;
        }
        if (fVar == j$.time.temporal.o.f) {
            InterfaceC10375b interfaceC10375b = this.f;
            if (interfaceC10375b != null) {
                return LocalDate.M(interfaceC10375b);
            }
            return null;
        }
        if (fVar == j$.time.temporal.o.g) {
            return this.g;
        }
        if (fVar == j$.time.temporal.o.d) {
            Long l = (Long) this.a.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.R(l.intValue());
            }
            ZoneId zoneId = this.b;
            return zoneId instanceof ZoneOffset ? zoneId : fVar.h(this);
        }
        if (fVar == j$.time.temporal.o.e) {
            return fVar.h(this);
        }
        if (fVar == j$.time.temporal.o.c) {
            return null;
        }
        return fVar.h(this);
    }

    public final void y(TemporalField temporalField, ChronoField chronoField, Long l) {
        Long l2 = (Long) this.a.put(chronoField, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new j$.time.b("Conflict found: " + chronoField + " " + l2 + " differs from " + chronoField + " " + l + " while resolving  " + temporalField);
    }

    public final void l() {
        HashMap map = this.a;
        if (map.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                m(zoneId);
                return;
            }
            Long l = (Long) map.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                m(ZoneOffset.R(l.intValue()));
            }
        }
    }

    public final void m(ZoneId zoneId) {
        HashMap map = this.a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        w(this.c.F(Instant.K(((Long) map.remove(chronoField)).longValue(), 0), zoneId).c());
        y(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(r5.b().X()));
    }

    public final void w(InterfaceC10375b interfaceC10375b) {
        InterfaceC10375b interfaceC10375b2 = this.f;
        if (interfaceC10375b2 != null) {
            if (interfaceC10375b == null || interfaceC10375b2.equals(interfaceC10375b)) {
                return;
            }
            throw new j$.time.b("Conflict found: Fields resolved to two different dates: " + this.f + " " + interfaceC10375b);
        }
        if (interfaceC10375b != null) {
            if (!this.c.equals(interfaceC10375b.a())) {
                throw new j$.time.b("ChronoLocalDate must use the effective parsed chronology: " + this.c);
            }
            this.f = interfaceC10375b;
        }
    }

    public final void s() {
        HashMap map = this.a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(chronoField)) {
            long jLongValue = ((Long) map.remove(chronoField)).longValue();
            x xVar = this.e;
            if (xVar == x.STRICT || (xVar == x.SMART && jLongValue != 0)) {
                chronoField.K(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            y(chronoField, chronoField2, Long.valueOf(jLongValue));
        }
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(chronoField3)) {
            long jLongValue2 = ((Long) map.remove(chronoField3)).longValue();
            x xVar2 = this.e;
            if (xVar2 == x.STRICT || (xVar2 == x.SMART && jLongValue2 != 0)) {
                chronoField3.K(jLongValue2);
            }
            y(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (map.containsKey(chronoField4)) {
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (map.containsKey(chronoField5)) {
                long jLongValue3 = ((Long) map.remove(chronoField4)).longValue();
                long jLongValue4 = ((Long) map.remove(chronoField5)).longValue();
                if (this.e == x.LENIENT) {
                    y(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.U(jLongValue3, 12), jLongValue4)));
                } else {
                    chronoField4.K(jLongValue3);
                    chronoField5.K(jLongValue3);
                    y(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (map.containsKey(chronoField6)) {
            long jLongValue5 = ((Long) map.remove(chronoField6)).longValue();
            if (this.e != x.LENIENT) {
                chronoField6.K(jLongValue5);
            }
            y(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            y(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            y(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            y(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (map.containsKey(chronoField7)) {
            long jLongValue6 = ((Long) map.remove(chronoField7)).longValue();
            if (this.e != x.LENIENT) {
                chronoField7.K(jLongValue6);
            }
            y(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            y(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (map.containsKey(chronoField8)) {
            long jLongValue7 = ((Long) map.remove(chronoField8)).longValue();
            if (this.e != x.LENIENT) {
                chronoField8.K(jLongValue7);
            }
            y(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            y(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (map.containsKey(chronoField9)) {
            long jLongValue8 = ((Long) map.remove(chronoField9)).longValue();
            if (this.e != x.LENIENT) {
                chronoField9.K(jLongValue8);
            }
            y(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            y(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            y(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (map.containsKey(chronoField10)) {
            long jLongValue9 = ((Long) map.remove(chronoField10)).longValue();
            if (this.e != x.LENIENT) {
                chronoField10.K(jLongValue9);
            }
            y(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            y(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (map.containsKey(chronoField11)) {
            long jLongValue10 = ((Long) map.get(chronoField11)).longValue();
            x xVar3 = this.e;
            x xVar4 = x.LENIENT;
            if (xVar3 != xVar4) {
                chronoField11.K(jLongValue10);
            }
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (map.containsKey(chronoField12)) {
                long jLongValue11 = ((Long) map.remove(chronoField12)).longValue();
                if (this.e != xVar4) {
                    chronoField12.K(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                y(chronoField12, chronoField11, Long.valueOf(jLongValue10));
            }
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (map.containsKey(chronoField13)) {
                long jLongValue12 = ((Long) map.remove(chronoField13)).longValue();
                if (this.e != xVar4) {
                    chronoField13.K(jLongValue12);
                }
                y(chronoField13, chronoField11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (map.containsKey(chronoField14)) {
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (map.containsKey(chronoField15)) {
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (map.containsKey(chronoField16) && map.containsKey(chronoField11)) {
                    p(((Long) map.remove(chronoField14)).longValue(), ((Long) map.remove(chronoField15)).longValue(), ((Long) map.remove(chronoField16)).longValue(), ((Long) map.remove(chronoField11)).longValue());
                }
            }
        }
    }

    public final void p(long j, long j2, long j3, long j4) {
        if (this.e == x.LENIENT) {
            long jO = j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.U(j, 3600000000000L), j$.com.android.tools.r8.a.U(j2, 60000000000L)), j$.com.android.tools.r8.a.U(j3, 1000000000L)), j4);
            t(LocalTime.P(j$.com.android.tools.r8.a.S(jO, 86400000000000L)), j$.time.n.a(0, 0, (int) j$.com.android.tools.r8.a.T(jO, 86400000000000L)));
            return;
        }
        ChronoField chronoField = ChronoField.MINUTE_OF_HOUR;
        int iA = chronoField.c.a(j2, chronoField);
        ChronoField chronoField2 = ChronoField.NANO_OF_SECOND;
        int iA2 = chronoField2.c.a(j4, chronoField2);
        if (this.e == x.SMART && j == 24 && iA == 0 && j3 == 0 && iA2 == 0) {
            t(LocalTime.f, j$.time.n.a(0, 0, 1));
            return;
        }
        ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
        int iA3 = chronoField3.c.a(j, chronoField3);
        ChronoField chronoField4 = ChronoField.SECOND_OF_MINUTE;
        t(LocalTime.O(iA3, iA, chronoField4.c.a(j3, chronoField4), iA2), j$.time.n.d);
    }

    public final void t(LocalTime localTime, j$.time.n nVar) {
        LocalTime localTime2 = this.g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new j$.time.b("Conflict found: Fields resolved to different times: " + this.g + " " + localTime);
            }
            j$.time.n nVar2 = this.h;
            nVar2.getClass();
            j$.time.n nVar3 = j$.time.n.d;
            if (nVar2 != nVar3 && nVar != nVar3 && !this.h.equals(nVar)) {
                throw new j$.time.b("Conflict found: Fields resolved to different excess periods: " + this.h + " " + nVar);
            }
            this.h = nVar;
            return;
        }
        this.g = localTime;
        this.h = nVar;
    }

    public final void g(j$.time.temporal.l lVar) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (lVar.f(temporalField)) {
                try {
                    long jU = lVar.u(temporalField);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jU != jLongValue) {
                        throw new j$.time.b("Conflict found: Field " + temporalField + " " + jU + " differs from " + temporalField + " " + jLongValue + " derived from " + lVar);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            InterfaceC10375b interfaceC10375b = this.f;
            if (interfaceC10375b != null) {
                sb.append(interfaceC10375b);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
