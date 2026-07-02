package com.daaw;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.daaw.AbstractC4512fJ0;
import com.daaw.InterfaceC2110Re0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.yG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9827yG0 {

    /* JADX INFO: renamed from: com.daaw.yG0$a */
    public static final class a implements InterfaceC6011kf0 {
        public final /* synthetic */ InterfaceC3788cj a;

        public a(InterfaceC3788cj interfaceC3788cj) {
            this.a = interfaceC3788cj;
        }

        @Override // com.daaw.InterfaceC6011kf0
        public final void onResult(Object obj) {
            if (this.a.o()) {
                return;
            }
            this.a.x(AbstractC4512fJ0.a(obj));
        }
    }

    /* JADX INFO: renamed from: com.daaw.yG0$b */
    public static final class b implements InterfaceC6011kf0 {
        public final /* synthetic */ InterfaceC3788cj a;

        public b(InterfaceC3788cj interfaceC3788cj) {
            this.a = interfaceC3788cj;
        }

        @Override // com.daaw.InterfaceC6011kf0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(Throwable th) {
            if (this.a.o()) {
                return;
            }
            InterfaceC3788cj interfaceC3788cj = this.a;
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            G10.f(th, "e");
            interfaceC3788cj.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(th)));
        }
    }

    /* JADX INFO: renamed from: com.daaw.yG0$c */
    public static final class c extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ C0737Ee0 G;
        public final /* synthetic */ Context H;
        public final /* synthetic */ String I;
        public final /* synthetic */ String J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0737Ee0 c0737Ee0, Context context, String str, String str2, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = c0737Ee0;
            this.H = context;
            this.I = str;
            this.J = str2;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new c(this.G, this.H, this.I, this.J, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            for (C6504mO c6504mO : this.G.g().values()) {
                Context context = this.H;
                G10.f(c6504mO, "font");
                AbstractC9827yG0.q(context, c6504mO, this.I, this.J);
            }
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((c) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yG0$d */
    public static final class d extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ C0737Ee0 G;
        public final /* synthetic */ Context H;
        public final /* synthetic */ String I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0737Ee0 c0737Ee0, Context context, String str, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = c0737Ee0;
            this.H = context;
            this.I = str;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new d(this.G, this.H, this.I, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            for (C5732jf0 c5732jf0 : this.G.j().values()) {
                G10.f(c5732jf0, "asset");
                AbstractC9827yG0.o(c5732jf0);
                AbstractC9827yG0.p(this.H, c5732jf0, this.I);
            }
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((d) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yG0$e */
    public static final class e extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public /* synthetic */ Object I;
        public int J;

        public e(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.I = obj;
            this.J |= Integer.MIN_VALUE;
            return AbstractC9827yG0.m(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yG0$f */
    public static final class f extends SZ0 implements InterfaceC3986dR {
        public int F;

        public f(InterfaceC1416Ks interfaceC1416Ks) {
            super(3, interfaceC1416Ks);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return u(((Number) obj).intValue(), (Throwable) obj2, (InterfaceC1416Ks) obj3);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            return AbstractC0527Cg.a(false);
        }

        public final Object u(int i, Throwable th, InterfaceC1416Ks interfaceC1416Ks) {
            return new f(interfaceC1416Ks).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yG0$g */
    public static final class g extends SZ0 implements InterfaceC3429bR {
        public Object F;
        public int G;
        public int H;
        public final /* synthetic */ InterfaceC3986dR I;
        public final /* synthetic */ Context J;
        public final /* synthetic */ InterfaceC2110Re0 K;
        public final /* synthetic */ String L;
        public final /* synthetic */ String M;
        public final /* synthetic */ String N;
        public final /* synthetic */ String O;
        public final /* synthetic */ InterfaceC8007rm0 P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC3986dR interfaceC3986dR, Context context, InterfaceC2110Re0 interfaceC2110Re0, String str, String str2, String str3, String str4, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.I = interfaceC3986dR;
            this.J = context;
            this.K = interfaceC2110Re0;
            this.L = str;
            this.M = str2;
            this.N = str3;
            this.O = str4;
            this.P = interfaceC8007rm0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new g(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, interfaceC1416Ks);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (((java.lang.Boolean) r14).booleanValue() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (r14 == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ba A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:43:0x0093). Please report as a decompilation issue!!! */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r1 = com.daaw.I10.c()
                int r0 = r13.H
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L34
                if (r0 == r3) goto L2a
                if (r0 != r2) goto L22
                int r4 = r13.G
                java.lang.Object r0 = r13.F
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                com.daaw.AbstractC4801gJ0.b(r14)     // Catch: java.lang.Throwable -> L1a
                r11 = r13
                goto L93
            L1a:
                r0 = move-exception
                r14 = r0
                r11 = r4
                r4 = r14
                r14 = r11
                r11 = r13
                goto Lab
            L22:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L2a:
                int r0 = r13.G
                java.lang.Object r4 = r13.F
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                com.daaw.AbstractC4801gJ0.b(r14)
                goto L5f
            L34:
                com.daaw.AbstractC4801gJ0.b(r14)
                r14 = 0
                r0 = 0
                r4 = r14
            L3a:
                com.daaw.rm0 r14 = r13.P
                com.daaw.Qe0 r14 = com.daaw.AbstractC9827yG0.g(r14)
                boolean r14 = r14.r()
                if (r14 != 0) goto L6b
                if (r0 == 0) goto L67
                com.daaw.dR r14 = r13.I
                java.lang.Integer r5 = com.daaw.AbstractC0527Cg.c(r0)
                com.daaw.G10.d(r4)
                r13.F = r4
                r13.G = r0
                r13.H = r3
                java.lang.Object r14 = r14.invoke(r5, r4, r13)
                if (r14 != r1) goto L5f
                r11 = r13
                goto L92
            L5f:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L6b
            L67:
                r12 = r4
                r4 = r0
                r0 = r12
                goto L6d
            L6b:
                r11 = r13
                goto Lae
            L6d:
                android.content.Context r5 = r13.J     // Catch: java.lang.Throwable -> La8
                com.daaw.Re0 r6 = r13.K     // Catch: java.lang.Throwable -> La8
                java.lang.String r14 = r13.L     // Catch: java.lang.Throwable -> La8
                java.lang.String r7 = com.daaw.AbstractC9827yG0.b(r14)     // Catch: java.lang.Throwable -> La8
                java.lang.String r14 = r13.M     // Catch: java.lang.Throwable -> La8
                java.lang.String r8 = com.daaw.AbstractC9827yG0.b(r14)     // Catch: java.lang.Throwable -> La8
                java.lang.String r14 = r13.N     // Catch: java.lang.Throwable -> La8
                java.lang.String r9 = com.daaw.AbstractC9827yG0.a(r14)     // Catch: java.lang.Throwable -> La8
                java.lang.String r10 = r13.O     // Catch: java.lang.Throwable -> La8
                r13.F = r0     // Catch: java.lang.Throwable -> La8
                r13.G = r4     // Catch: java.lang.Throwable -> La8
                r13.H = r2     // Catch: java.lang.Throwable -> La8
                r11 = r13
                java.lang.Object r14 = com.daaw.AbstractC9827yG0.c(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La2
                if (r14 != r1) goto L93
            L92:
                return r1
            L93:
                com.daaw.Ee0 r14 = (com.daaw.C0737Ee0) r14     // Catch: java.lang.Throwable -> La2
                com.daaw.rm0 r5 = r11.P     // Catch: java.lang.Throwable -> La2
                com.daaw.Qe0 r5 = com.daaw.AbstractC9827yG0.g(r5)     // Catch: java.lang.Throwable -> La2
                r5.e(r14)     // Catch: java.lang.Throwable -> La2
                r12 = r4
                r4 = r0
                r0 = r12
                goto L3a
            La2:
                r0 = move-exception
            La3:
                r14 = r0
                r12 = r4
                r4 = r14
                r14 = r12
                goto Lab
            La8:
                r0 = move-exception
                r11 = r13
                goto La3
            Lab:
                int r0 = r14 + 1
                goto L3a
            Lae:
                com.daaw.rm0 r14 = r11.P
                com.daaw.Qe0 r14 = com.daaw.AbstractC9827yG0.g(r14)
                boolean r14 = r14.q()
                if (r14 != 0) goto Lc5
                if (r4 == 0) goto Lc5
                com.daaw.rm0 r14 = r11.P
                com.daaw.Qe0 r14 = com.daaw.AbstractC9827yG0.g(r14)
                r14.m(r4)
            Lc5:
                com.daaw.G91 r14 = com.daaw.G91.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9827yG0.g.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((g) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final Object h(C7972rf0 c7972rf0, InterfaceC1416Ks interfaceC1416Ks) {
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        c7972rf0.d(new a(c4067dj)).c(new b(c4067dj));
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU;
    }

    public static final String i(String str) {
        return (BY0.O(str) || AY0.u(str, ".", false, 2, null)) ? str : G10.n(".", str);
    }

    public static final String j(String str) {
        if (str == null || BY0.O(str)) {
            return null;
        }
        return BY0.C(str, '/', false, 2, null) ? str : G10.n(str, "/");
    }

    public static final Object k(Context context, C0737Ee0 c0737Ee0, String str, String str2, InterfaceC1416Ks interfaceC1416Ks) {
        if (c0737Ee0.g().isEmpty()) {
            return G91.a;
        }
        Object objF = AbstractC8539th.f(C7850rC.b(), new c(c0737Ee0, context, str, str2, null), interfaceC1416Ks);
        return objF == I10.c() ? objF : G91.a;
    }

    public static final Object l(Context context, C0737Ee0 c0737Ee0, String str, InterfaceC1416Ks interfaceC1416Ks) {
        if (!c0737Ee0.r()) {
            return G91.a;
        }
        Object objF = AbstractC8539th.f(C7850rC.b(), new d(c0737Ee0, context, str, null), interfaceC1416Ks);
        return objF == I10.c() ? objF : G91.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(android.content.Context r6, com.daaw.InterfaceC2110Re0 r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.daaw.InterfaceC1416Ks r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9827yG0.m(android.content.Context, com.daaw.Re0, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.daaw.Ks):java.lang.Object");
    }

    public static final C7972rf0 n(Context context, InterfaceC2110Re0 interfaceC2110Re0, String str, boolean z) {
        if (interfaceC2110Re0 instanceof InterfaceC2110Re0.a) {
            return G10.c(str, "__LottieInternalDefaultCacheKey__") ? AbstractC1672Ne0.s(context, ((InterfaceC2110Re0.a) interfaceC2110Re0).f()) : AbstractC1672Ne0.t(context, ((InterfaceC2110Re0.a) interfaceC2110Re0).f(), str);
        }
        throw new C6902no0();
    }

    public static final void o(C5732jf0 c5732jf0) {
        if (c5732jf0.a() != null) {
            return;
        }
        String strB = c5732jf0.b();
        G10.f(strB, "filename");
        if (!AY0.u(strB, "data:", false, 2, null) || BY0.M(strB, "base64,", 0, false, 6, null) <= 0) {
            return;
        }
        try {
            String strSubstring = strB.substring(BY0.L(strB, ',', 0, false, 6, null) + 1);
            G10.f(strSubstring, "this as java.lang.String).substring(startIndex)");
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            c5732jf0.f(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
        } catch (IllegalArgumentException e2) {
            AbstractC1876Pd0.d("data URL did not have correct base64 format.", e2);
        }
    }

    public static final void p(Context context, C5732jf0 c5732jf0, String str) {
        if (c5732jf0.a() != null || str == null) {
            return;
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(G10.n(str, c5732jf0.b()));
            G10.f(inputStreamOpen, "try {\n        context.as…, e)\n        return\n    }");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                c5732jf0.f(AbstractC0301Ab1.l(BitmapFactory.decodeStream(inputStreamOpen, null, options), c5732jf0.e(), c5732jf0.c()));
            } catch (IllegalArgumentException e2) {
                AbstractC1876Pd0.d("Unable to decode image.", e2);
            }
        } catch (IOException e3) {
            AbstractC1876Pd0.d("Unable to open asset.", e3);
        }
    }

    public static final void q(Context context, C6504mO c6504mO, String str, String str2) {
        String str3 = ((Object) str) + ((Object) c6504mO.a()) + str2;
        try {
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                G10.f(typefaceCreateFromAsset, "typefaceWithDefaultStyle");
                String strC = c6504mO.c();
                G10.f(strC, "font.style");
                c6504mO.e(t(typefaceCreateFromAsset, strC));
            } catch (Exception e2) {
                AbstractC1876Pd0.b("Failed to create " + ((Object) c6504mO.a()) + " typeface with style=" + ((Object) c6504mO.c()) + '!', e2);
            }
        } catch (Exception e3) {
            AbstractC1876Pd0.b("Failed to find typeface in assets with path " + str3 + '.', e3);
        }
    }

    public static final InterfaceC1880Pe0 r(InterfaceC2110Re0 interfaceC2110Re0, String str, String str2, String str3, String str4, InterfaceC3986dR interfaceC3986dR, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        G10.g(interfaceC2110Re0, "spec");
        interfaceC5781jp.e(1388713460);
        String str5 = (i2 & 2) != 0 ? null : str;
        if ((i2 & 4) != 0) {
            str2 = "fonts/";
        }
        String str6 = str2;
        String str7 = (i2 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i2 & 16) != 0 ? "__LottieInternalDefaultCacheKey__" : str4;
        InterfaceC3986dR fVar = (i2 & 32) != 0 ? new f(null) : interfaceC3986dR;
        Context context = (Context) interfaceC5781jp.O(B5.g());
        int i3 = i & 14;
        interfaceC5781jp.e(-3686930);
        boolean zP = interfaceC5781jp.P(interfaceC2110Re0);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            objF = AbstractC9046vU0.d(new C1984Qe0(), null, 2, null);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
        int i4 = i3 | ((i >> 9) & 112);
        interfaceC5781jp.e(-3686552);
        boolean zP2 = interfaceC5781jp.P(interfaceC2110Re0) | interfaceC5781jp.P(str8);
        Object objF2 = interfaceC5781jp.f();
        if (zP2 || objF2 == InterfaceC5781jp.a.a()) {
            interfaceC5781jp.H(n(context, interfaceC2110Re0, str8, true));
        }
        interfaceC5781jp.L();
        AbstractC8420tF.d(interfaceC2110Re0, str8, new g(fVar, context, interfaceC2110Re0, str5, str6, str7, str8, interfaceC8007rm0, null), interfaceC5781jp, i4);
        C1984Qe0 c1984Qe0S = s(interfaceC8007rm0);
        interfaceC5781jp.L();
        return c1984Qe0S;
    }

    public static final C1984Qe0 s(InterfaceC8007rm0 interfaceC8007rm0) {
        return (C1984Qe0) interfaceC8007rm0.getValue();
    }

    public static final Typeface t(Typeface typeface, String str) {
        int i = 0;
        boolean z = BY0.z(str, "Italic", false, 2, null);
        boolean z2 = BY0.z(str, "Bold", false, 2, null);
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 2;
        } else if (z2) {
            i = 1;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
