package com.daaw;

/* JADX INFO: renamed from: com.daaw.in, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5490in {
    public static final C5490in a = new C5490in();
    public static final float[] b;
    public static final float[] c;
    public static final C5576j51 d;
    public static final C5576j51 e;
    public static final C9002vJ0 f;
    public static final C9002vJ0 g;
    public static final C9002vJ0 h;
    public static final C9002vJ0 i;
    public static final C9002vJ0 j;
    public static final C9002vJ0 k;
    public static final C9002vJ0 l;
    public static final C9002vJ0 m;
    public static final C9002vJ0 n;
    public static final C9002vJ0 o;
    public static final C9002vJ0 p;
    public static final C9002vJ0 q;
    public static final C9002vJ0 r;
    public static final C9002vJ0 s;
    public static final AbstractC4933gn t;
    public static final AbstractC4933gn u;
    public static final C9002vJ0 v;
    public static final AbstractC4933gn w;
    public static final AbstractC4933gn[] x;

    /* JADX INFO: renamed from: com.daaw.in$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        public final Double a(double d) {
            return Double.valueOf(AbstractC5212hn.a(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.in$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        public final Double a(double d) {
            return Double.valueOf(AbstractC5212hn.b(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        c = fArr2;
        C5576j51 c5576j51 = new C5576j51(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        d = c5576j51;
        C5576j51 c5576j512 = new C5576j51(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        e = c5576j512;
        C4292eY c4292eY = C4292eY.a;
        C9002vJ0 c9002vJ0 = new C9002vJ0("sRGB IEC61966-2.1", fArr, c4292eY.e(), c5576j51, 0);
        f = c9002vJ0;
        C9002vJ0 c9002vJ02 = new C9002vJ0("sRGB IEC61966-2.1 (Linear)", fArr, c4292eY.e(), 1.0d, 0.0f, 1.0f, 1);
        g = c9002vJ02;
        C9002vJ0 c9002vJ03 = new C9002vJ0("scRGB-nl IEC 61966-2-2:2003", fArr, c4292eY.e(), null, a.B, b.B, -0.799f, 2.399f, c5576j51, 2);
        h = c9002vJ03;
        C9002vJ0 c9002vJ04 = new C9002vJ0("scRGB IEC 61966-2-2:2003", fArr, c4292eY.e(), 1.0d, -0.5f, 7.499f, 3);
        i = c9002vJ04;
        C9002vJ0 c9002vJ05 = new C9002vJ0("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c4292eY.e(), new C5576j51(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        j = c9002vJ05;
        C9002vJ0 c9002vJ06 = new C9002vJ0("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c4292eY.e(), new C5576j51(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        k = c9002vJ06;
        C9002vJ0 c9002vJ07 = new C9002vJ0("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C2433Ug1(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        l = c9002vJ07;
        C9002vJ0 c9002vJ08 = new C9002vJ0("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c4292eY.e(), c5576j51, 7);
        m = c9002vJ08;
        C9002vJ0 c9002vJ09 = new C9002vJ0("NTSC (1953)", fArr2, c4292eY.a(), new C5576j51(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        n = c9002vJ09;
        C9002vJ0 c9002vJ010 = new C9002vJ0("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c4292eY.e(), new C5576j51(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        o = c9002vJ010;
        C9002vJ0 c9002vJ011 = new C9002vJ0("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c4292eY.e(), 2.2d, 0.0f, 1.0f, 10);
        p = c9002vJ011;
        C9002vJ0 c9002vJ012 = new C9002vJ0("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, c4292eY.b(), new C5576j51(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        q = c9002vJ012;
        C9002vJ0 c9002vJ013 = new C9002vJ0("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c4292eY.d(), 1.0d, -65504.0f, 65504.0f, 12);
        r = c9002vJ013;
        C9002vJ0 c9002vJ014 = new C9002vJ0("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c4292eY.d(), 1.0d, -65504.0f, 65504.0f, 13);
        s = c9002vJ014;
        C0758Ej1 c0758Ej1 = new C0758Ej1("Generic XYZ", 14);
        t = c0758Ej1;
        C3914d90 c3914d90 = new C3914d90("Generic L*a*b*", 15);
        u = c3914d90;
        C9002vJ0 c9002vJ015 = new C9002vJ0("None", fArr, c4292eY.e(), c5576j512, 16);
        v = c9002vJ015;
        C2572Vp0 c2572Vp0 = new C2572Vp0("Oklab", 17);
        w = c2572Vp0;
        x = new AbstractC4933gn[]{c9002vJ0, c9002vJ02, c9002vJ03, c9002vJ04, c9002vJ05, c9002vJ06, c9002vJ07, c9002vJ08, c9002vJ09, c9002vJ010, c9002vJ011, c9002vJ012, c9002vJ013, c9002vJ014, c0758Ej1, c3914d90, c9002vJ015, c2572Vp0};
    }

    public final C9002vJ0 a() {
        return r;
    }

    public final C9002vJ0 b() {
        return s;
    }

    public final C9002vJ0 c() {
        return p;
    }

    public final C9002vJ0 d() {
        return k;
    }

    public final C9002vJ0 e() {
        return j;
    }

    public final AbstractC4933gn f() {
        return u;
    }

    public final AbstractC4933gn g() {
        return t;
    }

    public final AbstractC4933gn[] h() {
        return x;
    }

    public final C9002vJ0 i() {
        return l;
    }

    public final C9002vJ0 j() {
        return m;
    }

    public final C9002vJ0 k() {
        return h;
    }

    public final C9002vJ0 l() {
        return i;
    }

    public final C9002vJ0 m() {
        return g;
    }

    public final C9002vJ0 n() {
        return n;
    }

    public final float[] o() {
        return c;
    }

    public final C9002vJ0 p() {
        return q;
    }

    public final C9002vJ0 q() {
        return o;
    }

    public final C9002vJ0 r() {
        return f;
    }

    public final float[] s() {
        return b;
    }

    public final C9002vJ0 t() {
        return v;
    }
}
