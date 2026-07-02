package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class V2 {
    public static final d b = new d(null);
    public static final V2 c = new a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public static final V2 d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});
    public static final V2 e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});
    public final float[] a;

    public static final class a extends V2 {
        public a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    public static final class b extends V2 {
        public b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    public static final class c extends V2 {
        public c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    public static final class d {
        public /* synthetic */ d(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final V2 a() {
            return V2.c;
        }

        public d() {
        }
    }

    public /* synthetic */ V2(float[] fArr, AbstractC2911Yw abstractC2911Yw) {
        this(fArr);
    }

    public final float[] b() {
        return this.a;
    }

    public V2(float[] fArr) {
        this.a = fArr;
    }
}
