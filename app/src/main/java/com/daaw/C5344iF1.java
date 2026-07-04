package com.daaw;

/* JADX INFO: renamed from: com.daaw.iF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5344iF1 {
    public final String a;
    public final Object b;
    public final int c;

    public C5344iF1(String str, Object obj, int i) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public static C5344iF1 a(String str, double d) {
        return new C5344iF1(str, Double.valueOf(d), 3);
    }

    public static C5344iF1 b(String str, long j) {
        return new C5344iF1(str, Long.valueOf(j), 2);
    }

    public static C5344iF1 c(String str, String str2) {
        return new C5344iF1(str, str2, 4);
    }

    public static C5344iF1 d(String str, boolean z) {
        return new C5344iF1(str, Boolean.valueOf(z), 1);
    }

    public final Object e() {
        RF1 rf1A = TF1.a();
        if (rf1A == null) {
            TF1.b();
            return this.b;
        }
        int i = this.c - 1;
        return i != 0 ? i != 1 ? i != 2 ? rf1A.a(this.a, (String) this.b) : rf1A.b(this.a, ((Double) this.b).doubleValue()) : rf1A.c(this.a, ((Long) this.b).longValue()) : rf1A.d(this.a, ((Boolean) this.b).booleanValue());
    }
}
