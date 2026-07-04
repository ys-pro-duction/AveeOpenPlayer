package com.daaw;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import j$.util.Objects;

/* JADX INFO: renamed from: com.daaw.Mg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1577Mg1 extends C1631Mu {
    public final long P;
    public final long Q;

    /* JADX INFO: renamed from: com.daaw.Mg1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Mg1$b */
    public static class b {
        public long a;
        public long b;
        public SpannableStringBuilder c;
        public Layout.Alignment d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public float j;

        public b() {
            c();
        }

        public C1577Mg1 a() {
            if (this.h != Float.MIN_VALUE && this.i == Integer.MIN_VALUE) {
                b();
            }
            return new C1577Mg1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public final b b() {
            Layout.Alignment alignment = this.d;
            if (alignment == null) {
                this.i = Integer.MIN_VALUE;
                return this;
            }
            int i = a.a[alignment.ordinal()];
            if (i == 1) {
                this.i = 0;
                return this;
            }
            if (i == 2) {
                this.i = 1;
                return this;
            }
            if (i == 3) {
                this.i = 2;
                return this;
            }
            Objects.toString(this.d);
            this.i = 0;
            return this;
        }

        public void c() {
            this.a = 0L;
            this.b = 0L;
            this.c = null;
            this.d = null;
            this.e = Float.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = Float.MIN_VALUE;
            this.i = Integer.MIN_VALUE;
            this.j = Float.MIN_VALUE;
        }

        public b d(long j) {
            this.b = j;
            return this;
        }

        public b e(float f) {
            this.e = f;
            return this;
        }

        public b f(int i) {
            this.g = i;
            return this;
        }

        public b g(int i) {
            this.f = i;
            return this;
        }

        public b h(float f) {
            this.h = f;
            return this;
        }

        public b i(int i) {
            this.i = i;
            return this;
        }

        public b j(long j) {
            this.a = j;
            return this;
        }

        public b k(SpannableStringBuilder spannableStringBuilder) {
            this.c = spannableStringBuilder;
            return this;
        }

        public b l(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b m(float f) {
            this.j = f;
            return this;
        }
    }

    public C1577Mg1(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public boolean a() {
        return this.E == Float.MIN_VALUE && this.H == Float.MIN_VALUE;
    }

    public C1577Mg1(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C1577Mg1(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.P = j;
        this.Q = j2;
    }
}
