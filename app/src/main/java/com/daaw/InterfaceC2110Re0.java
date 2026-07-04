package com.daaw;

/* JADX INFO: renamed from: com.daaw.Re0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2110Re0 {

    /* JADX INFO: renamed from: com.daaw.Re0$a */
    public static final class a implements InterfaceC2110Re0 {
        public final int a;

        public /* synthetic */ a(int i) {
            this.a = i;
        }

        public static final /* synthetic */ a a(int i) {
            return new a(i);
        }

        public static boolean c(int i, Object obj) {
            return (obj instanceof a) && i == ((a) obj).f();
        }

        public static String e(int i) {
            return "RawRes(resId=" + i + ')';
        }

        public boolean equals(Object obj) {
            return c(this.a, obj);
        }

        public final /* synthetic */ int f() {
            return this.a;
        }

        public int hashCode() {
            return d(this.a);
        }

        public String toString() {
            return e(this.a);
        }

        public static int b(int i) {
            return i;
        }

        public static int d(int i) {
            return i;
        }
    }
}
