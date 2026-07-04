package com.daaw;

/* JADX INFO: renamed from: com.daaw.n91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6724n91 implements Comparable {
    public static final a C = new a(null);
    public final long B;

    /* JADX INFO: renamed from: com.daaw.n91$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C6724n91(long j) {
        this.B = j;
    }

    public static final /* synthetic */ C6724n91 a(long j) {
        return new C6724n91(j);
    }

    public static boolean g(long j, Object obj) {
        return (obj instanceof C6724n91) && j == ((C6724n91) obj).l();
    }

    public static int h(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String k(long j) {
        return AbstractC3745ca1.c(j, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC3745ca1.a(l(), ((C6724n91) obj).l());
    }

    public boolean equals(Object obj) {
        return g(this.B, obj);
    }

    public int hashCode() {
        return h(this.B);
    }

    public final /* synthetic */ long l() {
        return this.B;
    }

    public String toString() {
        return k(this.B);
    }

    public static long c(long j) {
        return j;
    }
}
