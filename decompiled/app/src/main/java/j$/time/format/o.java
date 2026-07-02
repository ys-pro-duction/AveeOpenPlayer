package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static final j$.time.f f = new j$.time.f(1);
    public o a;
    public final o b;
    public final ArrayList c;
    public final boolean d;
    public int e;

    static {
        HashMap map = new HashMap();
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.a;
        map.put('Q', fVar);
        map.put('q', fVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.a);
    }

    public o() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    public o(o oVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = oVar;
        this.d = true;
    }

    public final void g(TemporalField temporalField, int i) {
        Objects.requireNonNull(temporalField, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        f(new h(temporalField, i, i, y.NOT_NEGATIVE));
    }

    public final void h(TemporalField temporalField, int i, int i2, y yVar) {
        if (i == i2 && yVar == y.NOT_NEGATIVE) {
            g(temporalField, i2);
            return;
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(yVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
        f(new h(temporalField, i, i2, yVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(j$.time.format.h r6) {
        /*
            r5 = this;
            j$.time.format.o r0 = r5.a
            int r1 = r0.e
            if (r1 < 0) goto L3e
            java.util.ArrayList r0 = r0.c
            java.lang.Object r0 = r0.get(r1)
            j$.time.format.h r0 = (j$.time.format.h) r0
            int r2 = r6.b
            int r3 = r6.c
            if (r2 != r3) goto L2a
            j$.time.format.y r2 = j$.time.format.y.NOT_NEGATIVE
            j$.time.format.y r4 = r6.d
            if (r4 != r2) goto L2a
            j$.time.format.h r0 = r0.c(r3)
            j$.time.format.h r6 = r6.b()
            r5.b(r6)
            j$.time.format.o r6 = r5.a
            r6.e = r1
            goto L36
        L2a:
            j$.time.format.h r0 = r0.b()
            j$.time.format.o r2 = r5.a
            int r6 = r5.b(r6)
            r2.e = r6
        L36:
            j$.time.format.o r6 = r5.a
            java.util.ArrayList r6 = r6.c
            r6.set(r1, r0)
            return
        L3e:
            int r6 = r5.b(r6)
            r0.e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.o.f(j$.time.format.h):void");
    }

    public final void e(ChronoField chronoField, HashMap map) {
        Objects.requireNonNull(chronoField, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        z zVar = z.FULL;
        b(new n(chronoField, zVar, new a(new u(Collections.singletonMap(zVar, linkedHashMap)))));
    }

    public final void c(char c) {
        b(new c(c));
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new c(str.charAt(0)));
        } else {
            b(new m(str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        b(dVar);
    }

    public final void j() {
        o oVar = this.a;
        oVar.e = -1;
        this.a = new o(oVar);
    }

    public final void i() {
        o oVar = this.a;
        if (oVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (oVar.c.size() > 0) {
            o oVar2 = this.a;
            d dVar = new d(oVar2.c, oVar2.d);
            this.a = this.a.b;
            b(dVar);
            return;
        }
        this.a = this.a.b;
    }

    public final int b(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        o oVar = this.a;
        oVar.getClass();
        oVar.c.add(eVar);
        this.a.e = -1;
        return r2.c.size() - 1;
    }

    public final DateTimeFormatter k(x xVar, j$.time.chrono.r rVar) {
        return l(Locale.getDefault(), xVar, rVar);
    }

    public final DateTimeFormatter l(Locale locale, x xVar, j$.time.chrono.r rVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            i();
        }
        d dVar = new d(this.c, false);
        v vVar = v.a;
        return new DateTimeFormatter(dVar, locale, xVar, rVar);
    }
}
