package com.daaw;

import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.s61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8103s61 {

    /* JADX INFO: renamed from: com.daaw.s61$a */
    public static final class a {
        public final String a;
        public final int b;
        public final byte[] c;

        public a(String str, int i, byte[] bArr) {
            this.a = str;
            this.b = i;
            this.c = bArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.s61$b */
    public static final class b {
        public final int a;
        public final String b;
        public final List c;
        public final byte[] d;

        public b(int i, String str, List list, byte[] bArr) {
            this.a = i;
            this.b = str;
            this.c = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
            this.d = bArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.s61$c */
    public interface c {
        InterfaceC8103s61 a(int i, b bVar);

        SparseArray b();
    }

    /* JADX INFO: renamed from: com.daaw.s61$d */
    public static final class d {
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.a + this.d;
        }

        public String b() {
            d();
            return this.e;
        }

        public int c() {
            d();
            return this.d;
        }

        public final void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
        }
    }

    void a(C2584Vs0 c2584Vs0, boolean z);

    void b();

    void c(R31 r31, InterfaceC9838yJ interfaceC9838yJ, d dVar);
}
