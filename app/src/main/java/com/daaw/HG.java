package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HG {
    public static final HG a = new HG();

    public static final class a {
        public final String a;
        public final String b;
        public final boolean c;

        public a(String str, String str2, boolean z) {
            G10.g(str, "name");
            G10.g(str2, "mimeType");
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G10.c(this.a, aVar.a) && G10.c(this.b, aVar.b) && this.c == aVar.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            boolean z = this.c;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        public String toString() {
            return "Codec(name=" + this.a + ", mimeType=" + this.b + ", supportsHighProfile=" + this.c + ")";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List a(int[] r16) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.HG.a(int[]):java.util.List");
    }

    public static final ArrayList b() {
        return AbstractC1599Mm.g("Baseline", "Main");
    }

    public static final String[] c(List list) {
        G10.g(list, "codecs");
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).b());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
