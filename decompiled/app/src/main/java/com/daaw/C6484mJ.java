package com.daaw;

import com.daaw.AbstractC5394iS;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.mJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6484mJ {
    public static boolean b = true;
    public static volatile C6484mJ c;
    public static final C6484mJ d = new C6484mJ(true);
    public final Map a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: com.daaw.mJ$a */
    public static final class a {
        public final Object a;
        public final int b;

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public C6484mJ(boolean z) {
    }

    public static C6484mJ b() {
        C6484mJ c6484mJA;
        C6484mJ c6484mJ = c;
        if (c6484mJ != null) {
            return c6484mJ;
        }
        synchronized (C6484mJ.class) {
            try {
                c6484mJA = c;
                if (c6484mJA == null) {
                    c6484mJA = b ? AbstractC6205lJ.a() : d;
                    c = c6484mJA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6484mJA;
    }

    public AbstractC5394iS.c a(InterfaceC1900Pj0 interfaceC1900Pj0, int i) {
        AbstractC6314li0.a(this.a.get(new a(interfaceC1900Pj0, i)));
        return null;
    }
}
