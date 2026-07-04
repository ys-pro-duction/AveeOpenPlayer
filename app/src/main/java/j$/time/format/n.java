package j$.time.format;

import j$.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements e {
    public final ChronoField a;
    public final z b;
    public final a c;
    public volatile h d;

    public n(ChronoField chronoField, z zVar, a aVar) {
        this.a = chronoField;
        this.b = zVar;
        this.c = aVar;
    }

    @Override // j$.time.format.e
    public final boolean k(s sVar, StringBuilder sb) {
        String strE;
        Long lA = sVar.a(this.a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.k kVar = (j$.time.chrono.k) sVar.a.k(j$.time.temporal.o.b);
        DateTimeFormatter dateTimeFormatter = sVar.b;
        if (kVar == null || kVar == j$.time.chrono.r.c) {
            long jLongValue = lA.longValue();
            Locale locale = dateTimeFormatter.b;
            a aVar = this.c;
            strE = aVar.a.e(jLongValue, this.b);
        } else {
            long jLongValue2 = lA.longValue();
            Locale locale2 = dateTimeFormatter.b;
            a aVar2 = this.c;
            strE = aVar2.a.e(jLongValue2, this.b);
        }
        if (strE != null) {
            sb.append(strE);
            return true;
        }
        if (this.d == null) {
            this.d = new h(this.a, 1, 19, y.NORMAL);
        }
        return this.d.k(sVar, sb);
    }

    @Override // j$.time.format.e
    public final int n(p pVar, CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        Iterator it = null;
        z zVar = pVar.c ? this.b : null;
        j$.time.chrono.k kVar = pVar.c().c;
        if (kVar == null && (kVar = pVar.a.e) == null) {
            kVar = j$.time.chrono.r.c;
        }
        j$.time.chrono.k kVar2 = kVar;
        a aVar = this.c;
        ChronoField chronoField = this.a;
        DateTimeFormatter dateTimeFormatter = pVar.a;
        if (kVar2 == null || kVar2 == j$.time.chrono.r.c) {
            Locale locale = dateTimeFormatter.b;
            List list = (List) ((HashMap) aVar.a.c).get(zVar);
            it = list != null ? list.iterator() : null;
        } else {
            Locale locale2 = dateTimeFormatter.b;
            List list2 = (List) ((HashMap) aVar.a.c).get(zVar);
            if (list2 != null) {
                it = list2.iterator();
            }
        }
        Iterator it2 = it;
        if (it2 != null) {
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str = (String) entry.getKey();
                if (pVar.g(str, 0, charSequence, i, str.length())) {
                    return pVar.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (chronoField == ChronoField.ERA && !pVar.c) {
                Iterator it3 = kVar2.G().iterator();
                while (it3.hasNext()) {
                    String string = ((j$.time.chrono.l) it3.next()).toString();
                    if (pVar.g(string, 0, charSequence, i, string.length())) {
                        return pVar.f(this.a, r7.getValue(), i, string.length() + i);
                    }
                }
            }
            if (pVar.c) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new h(this.a, 1, 19, y.NORMAL);
        }
        return this.d.n(pVar, charSequence, i);
    }

    public final String toString() {
        z zVar = z.FULL;
        ChronoField chronoField = this.a;
        z zVar2 = this.b;
        if (zVar2 == zVar) {
            return "Text(" + chronoField + ")";
        }
        return "Text(" + chronoField + "," + zVar2 + ")";
    }
}
