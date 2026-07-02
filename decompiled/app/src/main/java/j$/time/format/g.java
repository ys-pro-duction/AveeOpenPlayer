package j$.time.format;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements e {
    public static volatile AbstractMap.SimpleImmutableEntry b;
    public static volatile AbstractMap.SimpleImmutableEntry c;
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // j$.time.format.e
    public final boolean k(s sVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lA = sVar.a(ChronoField.INSTANT_SECONDS);
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                j$.time.temporal.l lVar = sVar.a;
                Long lValueOf = lVar.f(chronoField) ? Long.valueOf(lVar.u(chronoField)) : null;
                int i = 0;
                if (lA == null) {
                    return false;
                }
                long jLongValue = lA.longValue();
                int iA = chronoField.c.a(lValueOf != null ? lValueOf.longValue() : 0L, chronoField);
                if (jLongValue >= -62167219200L) {
                    long j = jLongValue - 253402300800L;
                    long jT = j$.com.android.tools.r8.a.T(j, 315569520000L) + 1;
                    LocalDateTime localDateTimeO = LocalDateTime.O(j$.com.android.tools.r8.a.S(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                    if (jT > 0) {
                        sb.append('+');
                        sb.append(jT);
                    }
                    sb.append(localDateTimeO);
                    if (localDateTimeO.b.c == 0) {
                        sb.append(":00");
                    }
                } else {
                    long j2 = jLongValue + 62167219200L;
                    long j3 = j2 / 315569520000L;
                    long j4 = j2 % 315569520000L;
                    LocalDateTime localDateTimeO2 = LocalDateTime.O(j4 - 62167219200L, 0, ZoneOffset.UTC);
                    int length = sb.length();
                    sb.append(localDateTimeO2);
                    if (localDateTimeO2.b.c == 0) {
                        sb.append(":00");
                    }
                    if (j3 < 0) {
                        if (localDateTimeO2.a.a == -10000) {
                            sb.replace(length, length + 2, Long.toString(j3 - 1));
                        } else if (j4 == 0) {
                            sb.insert(length, j3);
                        } else {
                            sb.insert(length + 1, Math.abs(j3));
                        }
                    }
                }
                if (iA > 0) {
                    sb.append('.');
                    int i2 = 100000000;
                    while (true) {
                        if (iA > 0 || i % 3 != 0 || i < -2) {
                            int i3 = iA / i2;
                            sb.append((char) (i3 + 48));
                            iA -= i3 * i2;
                            i2 /= 10;
                            i++;
                        }
                    }
                }
                sb.append('Z');
                return true;
            default:
                j$.time.f fVar = o.f;
                j$.time.temporal.l lVar2 = sVar.a;
                Object objK = lVar2.k(fVar);
                if (objK == null && sVar.c == 0) {
                    throw new j$.time.b("Unable to extract " + fVar + " from temporal " + lVar2);
                }
                ZoneId zoneId = (ZoneId) objK;
                if (zoneId == null) {
                    return false;
                }
                sb.append(zoneId.m());
                return true;
        }
    }

    @Override // j$.time.format.e
    public final int n(p pVar, CharSequence charSequence, int i) {
        int i2;
        int i3 = 1;
        switch (this.a) {
            case 0:
                o oVar = new o();
                oVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
                oVar.c('T');
                ChronoField chronoField = ChronoField.HOUR_OF_DAY;
                oVar.g(chronoField, 2);
                oVar.c(':');
                ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
                oVar.g(chronoField2, 2);
                oVar.c(':');
                ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
                oVar.g(chronoField3, 2);
                ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
                oVar.b(new f(chronoField4));
                oVar.c('Z');
                d dVar = oVar.l(Locale.getDefault(), x.SMART, null).a;
                if (dVar.b) {
                    dVar = new d(dVar.a, false);
                }
                p pVar2 = new p(pVar.a);
                pVar2.b = pVar.b;
                pVar2.c = pVar.c;
                int iN = dVar.n(pVar2, charSequence, i);
                if (iN < 0) {
                    return iN;
                }
                long jLongValue = pVar2.d(ChronoField.YEAR).longValue();
                int iIntValue = pVar2.d(ChronoField.MONTH_OF_YEAR).intValue();
                int iIntValue2 = pVar2.d(ChronoField.DAY_OF_MONTH).intValue();
                int iIntValue3 = pVar2.d(chronoField).intValue();
                int iIntValue4 = pVar2.d(chronoField2).intValue();
                Long lD = pVar2.d(chronoField3);
                Long lD2 = pVar2.d(chronoField4);
                int iIntValue5 = lD != null ? lD.intValue() : 0;
                int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
                if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
                    iIntValue3 = 0;
                } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                    pVar.c().d = true;
                    i3 = 0;
                    iIntValue5 = 59;
                } else {
                    i3 = 0;
                }
                int i4 = ((int) jLongValue) % 10000;
                try {
                    LocalDateTime localDateTime = LocalDateTime.MIN;
                    LocalDate localDateOf = LocalDate.of(i4, iIntValue, iIntValue2);
                    LocalTime localTimeO = LocalTime.O(iIntValue3, iIntValue4, iIntValue5, 0);
                    return pVar.f(chronoField4, iIntValue6, i, pVar.f(ChronoField.INSTANT_SECONDS, j$.com.android.tools.r8.a.x(new LocalDateTime(localDateOf, localTimeO).U(localDateOf.T(i3), localTimeO), ZoneOffset.UTC) + j$.com.android.tools.r8.a.U(jLongValue / 10000, 315569520000L), i, iN));
                } catch (RuntimeException unused) {
                    return ~i;
                }
            default:
                int length = charSequence.length();
                if (i > length) {
                    throw new IndexOutOfBoundsException();
                }
                if (i != length) {
                    char cCharAt = charSequence.charAt(i);
                    if (cCharAt == '+' || cCharAt == '-') {
                        return a(pVar, charSequence, i, i, i.e);
                    }
                    int i5 = 2 + i;
                    if (length >= i5) {
                        char cCharAt2 = charSequence.charAt(i + 1);
                        if (pVar.a(cCharAt, 'U') && pVar.a(cCharAt2, 'T')) {
                            int i6 = i + 3;
                            return (length < i6 || !pVar.a(charSequence.charAt(i5), 'C')) ? a(pVar, charSequence, i, i5, i.f) : a(pVar, charSequence, i, i6, i.f);
                        }
                        if (pVar.a(cCharAt, 'G') && length >= (i2 = i + 3) && pVar.a(cCharAt2, 'M') && pVar.a(charSequence.charAt(i5), 'T')) {
                            int i7 = i + 4;
                            if (length < i7 || !pVar.a(charSequence.charAt(i2), '0')) {
                                return a(pVar, charSequence, i, i2, i.f);
                            }
                            pVar.e(ZoneId.L("GMT0", true));
                            return i7;
                        }
                    }
                    Set<String> set = j$.time.zone.i.d;
                    int size = set.size();
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry = pVar.b ? b : c;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        synchronized (this) {
                            try {
                                simpleImmutableEntry = pVar.b ? b : c;
                                if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                    Integer numValueOf = Integer.valueOf(size);
                                    k kVar = pVar.b ? new k("", null, null) : new j("", null, null);
                                    for (String str : set) {
                                        kVar.a(str, str);
                                    }
                                    simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, kVar);
                                    if (pVar.b) {
                                        b = simpleImmutableEntry;
                                    } else {
                                        c = simpleImmutableEntry;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    k kVar2 = (k) simpleImmutableEntry.getValue();
                    ParsePosition parsePosition = new ParsePosition(i);
                    String strC = kVar2.c(charSequence, parsePosition);
                    if (strC != null) {
                        pVar.e(ZoneId.L(strC, true));
                        return parsePosition.getIndex();
                    }
                    if (pVar.a(cCharAt, 'Z')) {
                        pVar.e(ZoneOffset.UTC);
                        return i + 1;
                    }
                    break;
                }
                return ~i;
        }
    }

    public static int a(p pVar, CharSequence charSequence, int i, int i2, i iVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            pVar.e(ZoneId.L(upperCase, true));
            return i2;
        }
        if (charSequence.charAt(i2) != '0' && !pVar.a(charSequence.charAt(i2), 'Z')) {
            p pVar2 = new p(pVar.a);
            pVar2.b = pVar.b;
            pVar2.c = pVar.c;
            int iN = iVar.n(pVar2, charSequence, i2);
            try {
                if (iN < 0) {
                    if (iVar == i.e) {
                        return ~i;
                    }
                    pVar.e(ZoneId.L(upperCase, true));
                    return i2;
                }
                pVar.e(ZoneId.M(upperCase, ZoneOffset.R((int) pVar2.d(ChronoField.OFFSET_SECONDS).longValue())));
                return iN;
            } catch (j$.time.b unused) {
                return ~i;
            }
        }
        pVar.e(ZoneId.L(upperCase, true));
        return i2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
