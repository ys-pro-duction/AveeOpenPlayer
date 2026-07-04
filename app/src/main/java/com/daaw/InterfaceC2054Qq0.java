package com.daaw;

/* JADX INFO: renamed from: com.daaw.Qq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2054Qq0 {
    public static final b.c a;
    public static final b.C0114b b;

    /* JADX INFO: renamed from: com.daaw.Qq0$b */
    public static abstract class b {

        /* JADX INFO: renamed from: com.daaw.Qq0$b$a */
        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* JADX INFO: renamed from: com.daaw.Qq0$b$b, reason: collision with other inner class name */
        public static final class C0114b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0114b() {
            }
        }

        /* JADX INFO: renamed from: com.daaw.Qq0$b$c */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }

    static {
        a = new b.c();
        b = new b.C0114b();
    }
}
