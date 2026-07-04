package com.daaw;

import com.daaw.AbstractC0304Ac0;
import com.daaw.AbstractC2560Vm0;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Bc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0408Bc0 extends AbstractC0304Ac0.c {
    public static final AbstractC2560Vm0.b a = AbstractC2560Vm0.b.a(new a());

    /* JADX INFO: renamed from: com.daaw.Bc0$a */
    public static final class a {
        public String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public abstract AbstractC2560Vm0.b e(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return AbstractC6329ll0.b(this).d("policy", b()).b("priority", c()).e("available", d()).toString();
    }
}
