package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;
    public static final DateTimeFormatter f;
    public final d a;
    public final Locale b;
    public final v c;
    public final x d;
    public final j$.time.chrono.r e;

    static {
        o oVar = new o();
        ChronoField chronoField = ChronoField.YEAR;
        y yVar = y.EXCEEDS_PAD;
        oVar.h(chronoField, 4, 10, yVar);
        oVar.c('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        oVar.g(chronoField2, 2);
        oVar.c('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        oVar.g(chronoField3, 2);
        x xVar = x.STRICT;
        j$.time.chrono.r rVar = j$.time.chrono.r.c;
        DateTimeFormatter dateTimeFormatterK = oVar.k(xVar, rVar);
        ISO_LOCAL_DATE = dateTimeFormatterK;
        o oVar2 = new o();
        l lVar = l.INSENSITIVE;
        oVar2.b(lVar);
        oVar2.a(dateTimeFormatterK);
        i iVar = i.e;
        oVar2.b(iVar);
        oVar2.k(xVar, rVar);
        o oVar3 = new o();
        oVar3.b(lVar);
        oVar3.a(dateTimeFormatterK);
        oVar3.j();
        oVar3.b(iVar);
        oVar3.k(xVar, rVar);
        o oVar4 = new o();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        oVar4.g(chronoField4, 2);
        oVar4.c(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        oVar4.g(chronoField5, 2);
        oVar4.j();
        oVar4.c(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        oVar4.g(chronoField6, 2);
        oVar4.j();
        oVar4.b(new f(ChronoField.NANO_OF_SECOND));
        DateTimeFormatter dateTimeFormatterK2 = oVar4.k(xVar, null);
        o oVar5 = new o();
        oVar5.b(lVar);
        oVar5.a(dateTimeFormatterK2);
        oVar5.b(iVar);
        oVar5.k(xVar, null);
        o oVar6 = new o();
        oVar6.b(lVar);
        oVar6.a(dateTimeFormatterK2);
        oVar6.j();
        oVar6.b(iVar);
        oVar6.k(xVar, null);
        o oVar7 = new o();
        oVar7.b(lVar);
        oVar7.a(dateTimeFormatterK);
        oVar7.c('T');
        oVar7.a(dateTimeFormatterK2);
        DateTimeFormatter dateTimeFormatterK3 = oVar7.k(xVar, rVar);
        ISO_LOCAL_DATE_TIME = dateTimeFormatterK3;
        o oVar8 = new o();
        oVar8.b(lVar);
        oVar8.a(dateTimeFormatterK3);
        l lVar2 = l.LENIENT;
        oVar8.b(lVar2);
        oVar8.b(iVar);
        l lVar3 = l.STRICT;
        oVar8.b(lVar3);
        DateTimeFormatter dateTimeFormatterK4 = oVar8.k(xVar, rVar);
        o oVar9 = new o();
        oVar9.a(dateTimeFormatterK4);
        oVar9.j();
        oVar9.c('[');
        l lVar4 = l.SENSITIVE;
        oVar9.b(lVar4);
        oVar9.b(new g(1));
        oVar9.c(']');
        oVar9.k(xVar, rVar);
        o oVar10 = new o();
        oVar10.a(dateTimeFormatterK3);
        oVar10.j();
        oVar10.b(iVar);
        oVar10.j();
        oVar10.c('[');
        oVar10.b(lVar4);
        oVar10.b(new g(1));
        oVar10.c(']');
        oVar10.k(xVar, rVar);
        o oVar11 = new o();
        oVar11.b(lVar);
        oVar11.h(chronoField, 4, 10, yVar);
        oVar11.c('-');
        oVar11.g(ChronoField.DAY_OF_YEAR, 3);
        oVar11.j();
        oVar11.b(iVar);
        oVar11.k(xVar, rVar);
        o oVar12 = new o();
        oVar12.b(lVar);
        oVar12.h(j$.time.temporal.h.c, 4, 10, yVar);
        oVar12.d("-W");
        oVar12.g(j$.time.temporal.h.b, 2);
        oVar12.c('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        oVar12.g(chronoField7, 1);
        oVar12.j();
        oVar12.b(iVar);
        oVar12.k(xVar, rVar);
        o oVar13 = new o();
        oVar13.b(lVar);
        oVar13.b(new g(0));
        f = oVar13.k(xVar, null);
        o oVar14 = new o();
        oVar14.b(lVar);
        oVar14.g(chronoField, 4);
        oVar14.g(chronoField2, 2);
        oVar14.g(chronoField3, 2);
        oVar14.j();
        oVar14.b(lVar2);
        oVar14.b(new i("+HHMMss", "Z"));
        oVar14.b(lVar3);
        oVar14.k(xVar, rVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        o oVar15 = new o();
        oVar15.b(lVar);
        oVar15.b(lVar2);
        oVar15.j();
        oVar15.e(chronoField7, map);
        oVar15.d(", ");
        oVar15.i();
        oVar15.h(chronoField3, 1, 2, y.NOT_NEGATIVE);
        oVar15.c(' ');
        oVar15.e(chronoField2, map2);
        oVar15.c(' ');
        oVar15.g(chronoField, 4);
        oVar15.c(' ');
        oVar15.g(chronoField4, 2);
        oVar15.c(':');
        oVar15.g(chronoField5, 2);
        oVar15.j();
        oVar15.c(':');
        oVar15.g(chronoField6, 2);
        oVar15.i();
        oVar15.c(' ');
        oVar15.b(new i("+HHMM", "GMT"));
        oVar15.k(x.SMART, rVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, x xVar, j$.time.chrono.r rVar) {
        v vVar = v.a;
        this.a = (d) Objects.requireNonNull(dVar, "printerParser");
        this.b = (Locale) Objects.requireNonNull(locale, "locale");
        this.c = (v) Objects.requireNonNull(vVar, "decimalStyle");
        this.d = (x) Objects.requireNonNull(xVar, "resolverStyle");
        this.e = rVar;
    }

    public final String a(j$.time.temporal.l lVar) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(lVar, "temporal");
        Objects.requireNonNull(sb, "appendable");
        try {
            this.a.k(new s(lVar, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.b(e.getMessage(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.format.w b(java.lang.CharSequence r26) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatter.b(java.lang.CharSequence):j$.time.format.w");
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
