package com.daaw;

import com.daaw.AbstractC5674jS;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.nJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C6763nJ {
    public static final C6763nJ b = new C6763nJ(true);
    public final Map a;

    /* JADX INFO: renamed from: com.daaw.nJ$a */
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

    public C6763nJ() {
        this.a = new HashMap();
    }

    public static C6763nJ c() {
        return b;
    }

    public static C6763nJ d() {
        return new C6763nJ();
    }

    public final void a(AbstractC5674jS.f fVar) {
        this.a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public AbstractC5674jS.f b(InterfaceC2026Qj0 interfaceC2026Qj0, int i) {
        return (AbstractC5674jS.f) this.a.get(new a(interfaceC2026Qj0, i));
    }

    public C6763nJ(boolean z) {
        this.a = Collections.EMPTY_MAP;
    }
}
