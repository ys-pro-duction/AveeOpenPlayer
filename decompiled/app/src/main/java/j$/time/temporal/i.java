package j$.time.temporal;

import j$.time.format.w;
import j$.time.format.x;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements TemporalField {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;
    public static final /* synthetic */ i[] e;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient ChronoUnit b;
    public final transient ValueRange c;
    public final transient long d;

    @Override // j$.time.temporal.TemporalField
    public final boolean y() {
        return true;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) e.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        e = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str2;
        this.b = chronoUnit;
        this.c = ValueRange.f((-365243219162L) + j, 365241780471L + j);
        this.d = j;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalUnit getBaseUnit() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalField
    public final ValueRange range() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean q(l lVar) {
        return lVar.f(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final ValueRange u(l lVar) {
        if (lVar.f(ChronoField.EPOCH_DAY)) {
            return this.c;
        }
        throw new j$.time.b("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    public final long k(l lVar) {
        return lVar.u(ChronoField.EPOCH_DAY) + this.d;
    }

    @Override // j$.time.temporal.TemporalField
    public final k r(k kVar, long j) {
        if (!this.c.e(j)) {
            throw new j$.time.b("Invalid value: " + this.a + " " + j);
        }
        return kVar.d(j$.com.android.tools.r8.a.V(j, this.d), ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final l n(HashMap map, w wVar, x xVar) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.k kVarM = j$.com.android.tools.r8.a.M(wVar);
        x xVar2 = x.LENIENT;
        long j = this.d;
        if (xVar == xVar2) {
            return kVarM.l(j$.com.android.tools.r8.a.V(jLongValue, j));
        }
        this.c.b(jLongValue, this);
        return kVarM.l(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
