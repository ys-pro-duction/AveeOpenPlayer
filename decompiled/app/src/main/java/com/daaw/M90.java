package com.daaw;

import com.daaw.E90;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M90 {
    public final E90 a;
    public final C9747xz b;
    public final List c;

    public M90(E90 e90, C9747xz c9747xz, List list) {
        G10.g(e90, "root");
        G10.g(c9747xz, "relayoutNodes");
        G10.g(list, "postponedMeasureRequests");
        this.a = e90;
        this.b = c9747xz;
        this.c = list;
    }

    public static final void e(M90 m90, StringBuilder sb, E90 e90, int i) {
        String strF = m90.f(e90);
        if (strF.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(strF);
            G10.f(sb, "append(value)");
            sb.append('\n');
            G10.f(sb, "append('\\n')");
            i++;
        }
        List listP = e90.P();
        int size = listP.size();
        for (int i3 = 0; i3 < size; i3++) {
            e(m90, sb, (E90) listP.get(i3), i);
        }
    }

    public final void a() {
        if (c(this.a)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }

    public final boolean b(E90 e90) {
        E90 e90L0 = e90.l0();
        if ((!e90.g() && (e90.m0() == Integer.MAX_VALUE || e90L0 == null || !e90L0.g())) || (e90.a0() && this.c.contains(e90))) {
            return true;
        }
        E90.g gVarY = e90L0 != null ? e90L0.Y() : null;
        return e90.a0() ? this.b.b(e90) || (e90L0 != null && e90L0.a0()) || gVarY == E90.g.Measuring : !e90.X() || this.b.b(e90) || (e90L0 != null && e90L0.a0()) || ((e90L0 != null && e90L0.X()) || gVarY == E90.g.Measuring || gVarY == E90.g.LayingOut);
    }

    public final boolean c(E90 e90) {
        if (!b(e90)) {
            return false;
        }
        List listP = e90.P();
        int size = listP.size();
        for (int i = 0; i < size; i++) {
            if (!c((E90) listP.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        G10.f(sb, "append(value)");
        sb.append('\n');
        G10.f(sb, "append('\\n')");
        e(this, sb, this.a, 0);
        String string = sb.toString();
        G10.f(string, "stringBuilder.toString()");
        return string;
    }

    public final String f(E90 e90) {
        StringBuilder sb = new StringBuilder();
        sb.append(e90);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(e90.Y());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!e90.g()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + e90.d0() + ']');
        if (!b(e90)) {
            sb.append("[INCONSISTENT]");
        }
        String string = sb.toString();
        G10.f(string, "with(StringBuilder()) {\n…     toString()\n        }");
        return string;
    }
}
