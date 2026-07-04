package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.fJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4512fJ0 implements Serializable {
    public static final a B = new a(null);

    /* JADX INFO: renamed from: com.daaw.fJ0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.fJ0$b */
    public static final class b implements Serializable {
        public final Throwable B;

        public b(Throwable th) {
            G10.g(th, "exception");
            this.B = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && G10.c(this.B, ((b) obj).B);
        }

        public int hashCode() {
            return this.B.hashCode();
        }

        public String toString() {
            return "Failure(" + this.B + ')';
        }
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).B;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }

    public static Object a(Object obj) {
        return obj;
    }
}
