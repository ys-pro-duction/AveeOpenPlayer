package com.daaw;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2615Wa extends AbstractC2511Va {
    public static final a D = new a(null);
    public Object[] B;
    public int C;

    /* JADX INFO: renamed from: com.daaw.Wa$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Wa$b */
    public static final class b extends H {
        public int D = -1;

        public b() {
        }

        @Override // com.daaw.H
        public void b() {
            do {
                int i = this.D + 1;
                this.D = i;
                if (i >= C2615Wa.this.B.length) {
                    break;
                }
            } while (C2615Wa.this.B[this.D] == null);
            if (this.D >= C2615Wa.this.B.length) {
                d();
                return;
            }
            Object obj = C2615Wa.this.B[this.D];
            G10.e(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            e(obj);
        }
    }

    public C2615Wa(Object[] objArr, int i) {
        super(null);
        this.B = objArr;
        this.C = i;
    }

    private final void s(int i) {
        Object[] objArr = this.B;
        if (objArr.length > i) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i);
        Object[] objArrCopyOf = Arrays.copyOf(this.B, length);
        G10.f(objArrCopyOf, "copyOf(...)");
        this.B = objArrCopyOf;
    }

    @Override // com.daaw.AbstractC2511Va
    public int e() {
        return this.C;
    }

    @Override // com.daaw.AbstractC2511Va
    public Object get(int i) {
        return AbstractC5431ib.J(this.B, i);
    }

    @Override // com.daaw.AbstractC2511Va, java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }

    @Override // com.daaw.AbstractC2511Va
    public void m(int i, Object obj) {
        G10.g(obj, "value");
        s(i);
        if (this.B[i] == null) {
            this.C = e() + 1;
        }
        this.B[i] = obj;
    }

    public C2615Wa() {
        this(new Object[20], 0);
    }
}
