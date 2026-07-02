package com.daaw;

import android.content.SharedPreferences;
import android.util.Pair;

/* JADX INFO: renamed from: com.daaw.bH2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3392bH2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ C5634jI2 e;

    public /* synthetic */ C3392bH2(C5634jI2 c5634jI2, String str, long j, AbstractC9829yG2 abstractC9829yG2) {
        this.e = c5634jI2;
        AbstractC7506py0.f("health_monitor");
        AbstractC7506py0.a(j > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j;
    }

    public final Pair a() {
        long jAbs;
        this.e.d();
        this.e.d();
        long jC = c();
        if (jC == 0) {
            d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jC - this.e.a.p().a());
        }
        long j = this.d;
        if (jAbs < j) {
            return null;
        }
        if (jAbs > j + j) {
            d();
            return null;
        }
        String string = this.e.k().getString(this.c, null);
        long j2 = this.e.k().getLong(this.b, 0L);
        d();
        return (string == null || j2 <= 0) ? C5634jI2.y : new Pair(string, Long.valueOf(j2));
    }

    public final void b(String str, long j) {
        this.e.d();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.k().getLong(this.b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = this.e.k().edit();
            editorEdit.putString(this.c, str);
            editorEdit.putLong(this.b, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = this.e.a.N().r().nextLong() & Long.MAX_VALUE;
        long j3 = j2 + 1;
        long j4 = Long.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = this.e.k().edit();
        if (jNextLong < j4) {
            editorEdit2.putString(this.c, str);
        }
        editorEdit2.putLong(this.b, j3);
        editorEdit2.apply();
    }

    public final long c() {
        return this.e.k().getLong(this.a, 0L);
    }

    public final void d() {
        this.e.d();
        long jA = this.e.a.p().a();
        SharedPreferences.Editor editorEdit = this.e.k().edit();
        editorEdit.remove(this.b);
        editorEdit.remove(this.c);
        editorEdit.putLong(this.a, jA);
        editorEdit.apply();
    }
}
