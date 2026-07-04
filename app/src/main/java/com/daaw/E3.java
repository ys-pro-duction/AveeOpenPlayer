package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Size;
import android.widget.ImageView;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public class E3 {
    public static final boolean a = !AbstractC0405Bb1.a;
    public static C0850Fg1 b = new C0850Fg1();
    public static final Drawable c = null;

    public class b implements NI0 {
        public final InterfaceC1883Pf a;
        public Context b;
        public boolean c;
        public final String d;
        public final String e;
        public final int f;
        public final int g;
        public final boolean h;
        public String i;

        public b(InterfaceC1883Pf interfaceC1883Pf, Context context, boolean z, String str, String str2, int i, int i2, boolean z2) {
            this.a = interfaceC1883Pf;
            this.b = context;
            this.c = z;
            this.d = str;
            this.e = str2;
            this.f = i;
            this.g = i2;
            this.h = z2;
            StringBuilder sb = new StringBuilder();
            sb.append("src:");
            sb.append(str);
            sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb.append(i);
            sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb.append(i2);
            sb.append("t:");
            sb.append(z2 ? "t" : "f");
            this.i = sb.toString();
        }

        @Override // com.daaw.NI0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public KI0 c(AY ay, int i, int i2) {
            String str;
            Bitmap bitmapP = ((this.f & 4) == 0 && this.h && (str = this.d) != null && str.length() > 0) ? E3.this.p(this.d) : null;
            if (bitmapP == null) {
                bitmapP = E3.this.s(this.d, this.e, i, i2, this.f, this.g);
            }
            if (bitmapP == null) {
                return null;
            }
            return new CS(new AS(C2113Rf.d(bitmapP, this.a), null));
        }

        @Override // com.daaw.NI0
        public String getId() {
            return this.i;
        }
    }

    public class c extends b implements InterfaceC8433tI0 {
        public c(InterfaceC1883Pf interfaceC1883Pf, Context context, boolean z, String str, String str2, int i, int i2) {
            super(interfaceC1883Pf, context, z, str, str2, i, i2, false);
        }

        @Override // com.daaw.InterfaceC8433tI0
        public boolean a(Exception exc, Object obj, InterfaceC3596c11 interfaceC3596c11, boolean z) {
            XD xdU = E3.this.m(this.b).u(Integer.valueOf(AbstractC3374bD0.h));
            if (!this.c) {
                xdU = xdU.w(true);
            }
            xdU.h(this).v(new C5699jY0(this.i)).i(EnumC4772gC.NONE).o(interfaceC3596c11);
            return true;
        }

        @Override // com.daaw.InterfaceC8433tI0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(AbstractC3994dT abstractC3994dT, Object obj, InterfaceC3596c11 interfaceC3596c11, boolean z, boolean z2) {
            return false;
        }
    }

    public static /* synthetic */ void b(C7027oF0 c7027oF0, C7027oF0 c7027oF02) {
        c7027oF0.a = null;
        Object obj = c7027oF02.a;
        if (obj != null) {
            ((Bitmap) obj).recycle();
        }
        c7027oF02.a = null;
    }

    public static /* synthetic */ AbstractC3994dT c(XD xd, int i, int i2, AsyncTaskC2517Vb1 asyncTaskC2517Vb1) {
        try {
            return (AbstractC3994dT) xd.m(i, i2).get(9000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            return null;
        } catch (TimeoutException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ void d(Object obj, C7027oF0 c7027oF0, C7027oF0 c7027oF02) {
        synchronized (obj) {
            try {
                c7027oF0.a = null;
                Object obj2 = c7027oF02.a;
                if (obj2 != null) {
                    ((Bitmap) obj2).recycle();
                }
                c7027oF02.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Bitmap e(Object obj, HS hs, C6265lY c6265lY, C7027oF0 c7027oF0, C7027oF0 c7027oF02) {
        Bitmap bitmapD;
        synchronized (obj) {
            bitmapD = AbstractC2975Zm.d(hs.i(), c6265lY, c7027oF0, c7027oF02);
        }
        return bitmapD;
    }

    public static void t(InterfaceC7381pY interfaceC7381pY, AbstractC3994dT abstractC3994dT, String str, String str2, final C6265lY c6265lY) {
        if (abstractC3994dT == null) {
            interfaceC7381pY.b(new C8217sY(null), str, str2);
            return;
        }
        if (abstractC3994dT instanceof ZS) {
            final C7027oF0 c7027oF0 = new C7027oF0(null);
            final C7027oF0 c7027oF02 = new C7027oF0(null);
            interfaceC7381pY.b(new C8217sY(AbstractC2975Zm.d(((ZS) abstractC3994dT).d(), c6265lY, c7027oF02, c7027oF0), new InterfaceC6408m2() { // from class: com.daaw.y3
                @Override // com.daaw.InterfaceC6408m2
                public final void a() {
                    E3.b(c7027oF0, c7027oF02);
                }
            }), str, str2);
        } else if (abstractC3994dT instanceof IS) {
            IS is = (IS) abstractC3994dT;
            final HS hsE = is.e();
            final Object obj = new Object();
            final C7027oF0 c7027oF03 = new C7027oF0(null);
            final C7027oF0 c7027oF04 = new C7027oF0(null);
            Bitmap bitmapF = is.f();
            Objects.requireNonNull(hsE);
            interfaceC7381pY.b(new C8496tY(bitmapF, new KQ() { // from class: com.daaw.z3
                @Override // com.daaw.KQ
                public final Object a() {
                    return Integer.valueOf(hsE.f());
                }
            }, new InterfaceC6408m2() { // from class: com.daaw.A3
                @Override // com.daaw.InterfaceC6408m2
                public final void a() {
                    hsE.m();
                }
            }, new InterfaceC6408m2() { // from class: com.daaw.B3
                @Override // com.daaw.InterfaceC6408m2
                public final void a() {
                    hsE.a();
                }
            }, new KQ() { // from class: com.daaw.C3
                @Override // com.daaw.KQ
                public final Object a() {
                    return E3.e(obj, hsE, c6265lY, c7027oF04, c7027oF03);
                }
            }, new InterfaceC6408m2() { // from class: com.daaw.D3
                @Override // com.daaw.InterfaceC6408m2
                public final void a() {
                    E3.d(obj, c7027oF03, c7027oF04);
                }
            }), str, str2);
        }
    }

    public void j(ImageView imageView) {
        WS.g(imageView);
    }

    public final InterfaceC1883Pf k(Context context) {
        return WS.j(context).k();
    }

    public final NI0 l(Context context, InterfaceC1883Pf interfaceC1883Pf) {
        EnumC0591Cw enumC0591Cw = EnumC0591Cw.PREFER_ARGB_8888;
        return new DS(new C9340wY(new OX0(interfaceC1883Pf, enumC0591Cw), new FK(interfaceC1883Pf, enumC0591Cw)), new SS(context, interfaceC1883Pf), interfaceC1883Pf);
    }

    public final C8712uI0 m(Context context) {
        return WS.t(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(boolean r23, android.net.Uri r24, final java.lang.String r25, java.lang.String r26, final com.daaw.InterfaceC7381pY r27, final int r28, final int r29, int r30, int r31, boolean r32, final com.daaw.C6265lY r33, java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.E3.n(boolean, android.net.Uri, java.lang.String, java.lang.String, com.daaw.pY, int, int, int, int, boolean, com.daaw.lY, java.lang.Object):void");
    }

    public void o(Uri uri, String str, String str2, ImageView imageView, boolean z) {
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return;
        }
        Bitmap bitmapR = r(contextK, uri, imageView.getWidth(), imageView.getHeight());
        if (bitmapR != null) {
            imageView.setImageBitmap(bitmapR);
            return;
        }
        String strDecode = Uri.decode(uri.toString());
        boolean zX = x(strDecode);
        if (str != null && !str.isEmpty() && str.charAt(0) == '/') {
            str = "file://" + str;
        }
        Uri uri2 = Uri.parse(str != null ? str : "file://");
        InterfaceC1883Pf interfaceC1883PfK = k(contextK);
        (zX ? u(z, interfaceC1883PfK, contextK, true, strDecode, str2, 0, -1) : v(uri2, z, interfaceC1883PfK, contextK, true, strDecode, str2, 0, -1)).n(imageView);
    }

    public final Bitmap p(String str) {
        byte[] bArrA;
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return null;
            }
            C0869Fl0 c0869Fl0 = new C0869Fl0(uri.getPath());
            if (!c0869Fl0.f() || (bArrA = c0869Fl0.d().a()) == null) {
                return null;
            }
            return BitmapFactory.decodeStream(new ByteArrayInputStream(bArrA));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void q(boolean z, Uri uri, String str, String str2, InterfaceC7381pY interfaceC7381pY, int i, int i2, int i3, int i4, boolean z2, C6265lY c6265lY, Object obj) {
        int iMax = i2;
        int iMax2 = i;
        if (iMax2 < 2) {
            iMax2 = Math.max(2, Math.max(i, i2));
        }
        int i5 = iMax2;
        if (iMax < 2) {
            iMax = Math.max(2, Math.max(i5, iMax));
        }
        n(z, uri, str, str2, interfaceC7381pY, i5, iMax, i3, i4, z2, c6265lY, obj);
    }

    public final Bitmap r(Context context, Uri uri, int i, int i2) {
        if (a) {
            boolean z = i < 1;
            boolean z2 = i2 < 1;
            if (z2 || z) {
                AbstractC0441Bk1.c("Dimensions were too small");
            }
            if (z) {
                i = RCHTTPStatusCodes.SUCCESS;
            }
            if (z2) {
                i2 = RCHTTPStatusCodes.SUCCESS;
            }
            try {
                return context.getContentResolver().loadThumbnail(uri, new Size(i, i2), null);
            } catch (IOException e) {
                AbstractC0441Bk1.b(e, "");
            }
        }
        return null;
    }

    public final Bitmap s(String str, String str2, int i, int i2, int i3, int i4) {
        Bitmap bitmapA;
        Uri uri = Uri.parse(str);
        boolean z = (i3 & 1) != 0;
        boolean z2 = (i3 & 4) != 0;
        boolean z3 = (i3 & 2) != 0;
        if (!z2 && uri != null) {
            String path = uri.getPath();
            String strJ = AbstractC0934Gb1.j(path);
            if (!"mp3".equals(strJ) && !"wav".equals(strJ) && !"ogg".equals(strJ) && (bitmapA = AbstractC1497Lm0.a(path, 3)) != null) {
                return bitmapA;
            }
        }
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        float[] fArr = new float[3];
        AbstractC6338ln.g(i4, fArr);
        if (fArr[2] > 0.99f) {
            fArr[1] = 1.0f;
        }
        int iAlpha = Color.alpha(i4);
        float fE = (XS0.e(str2.charAt(0)) * 360.0f) + (z ? 15.0f : 0.0f);
        float f = fArr[2];
        return XS0.c(i, i2, str2, AbstractC6338ln.o(AbstractC6338ln.a(new float[]{0.0f + fE, 0.2f, 1.0f}), z3 ? 0 : 255), AbstractC6338ln.o(AbstractC6338ln.a(new float[]{fE, 0.9f, 0.6f * f}), iAlpha), AbstractC6338ln.o(AbstractC6338ln.a(new float[]{(((int) fE) + 30) % 360, 0.9f, f * 0.4f}), iAlpha), c);
    }

    public XD u(boolean z, InterfaceC1883Pf interfaceC1883Pf, Context context, boolean z2, String str, String str2, int i, int i2) {
        XD xdU = m(context).u(Integer.valueOf(AbstractC3374bD0.F));
        xdU.O(AbstractC3374bD0.q0);
        xdU.H(AbstractC3374bD0.q0);
        if (z) {
            xdU.J();
        }
        if (!z2) {
            xdU = xdU.w(true);
        }
        b bVar = new b(interfaceC1883Pf, context, z2, str, str2, i, i2, true);
        xdU.v(new C5699jY0(bVar.i));
        xdU.h(bVar);
        xdU.i(EnumC4772gC.NONE);
        return xdU;
    }

    public XD v(Uri uri, boolean z, InterfaceC1883Pf interfaceC1883Pf, Context context, boolean z2, String str, String str2, int i, int i2) {
        XD xdE = m(context).t(uri).O(AbstractC3374bD0.q0).H(AbstractC3374bD0.q0).i(EnumC4772gC.NONE);
        if (z) {
            xdE.J();
        }
        c cVar = new c(interfaceC1883Pf, context, z2, str, str2, i, i2);
        xdE.v(new C5699jY0(cVar.i));
        xdE.K(cVar);
        xdE.h(l(context, interfaceC1883Pf));
        return xdE;
    }

    public XD w(Integer num, boolean z, InterfaceC1883Pf interfaceC1883Pf, Context context, boolean z2, String str, String str2, int i, int i2) {
        XD xdE = m(context).u(num).O(AbstractC3374bD0.q0).H(AbstractC3374bD0.q0).i(EnumC4772gC.NONE);
        if (z) {
            xdE.J();
        }
        c cVar = new c(interfaceC1883Pf, context, z2, str, str2, i, i2);
        xdE.v(new C5699jY0(cVar.i));
        xdE.K(cVar);
        return xdE;
    }

    public final boolean x(String str) {
        Uri uri;
        if (str == null || str.length() <= 0 || (uri = Uri.parse(str)) == null) {
            return false;
        }
        return "mp3".equals(AbstractC0934Gb1.j(uri.getPath()));
    }

    public class a implements InterfaceC3596c11 {
        public final /* synthetic */ InterfaceC7381pY B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;
        public final /* synthetic */ C6265lY E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;

        public a(InterfaceC7381pY interfaceC7381pY, String str, String str2, C6265lY c6265lY, int i, int i2) {
            this.B = interfaceC7381pY;
            this.C = str;
            this.D = str2;
            this.E = c6265lY;
            this.F = i;
            this.G = i2;
        }

        @Override // com.daaw.InterfaceC3596c11
        public void e(ET0 et0) {
            int i;
            int i2 = this.F;
            if (i2 <= 0 || (i = this.G) <= 0) {
                et0.f(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            } else {
                et0.f(i2, i);
            }
        }

        @Override // com.daaw.InterfaceC3596c11
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(AbstractC3994dT abstractC3994dT, XS xs) {
            E3.t(this.B, abstractC3994dT, this.C, this.D, this.E);
        }

        @Override // com.daaw.InterfaceC3596c11
        public void h(Exception exc, Drawable drawable) {
            this.B.b(null, this.C, this.D);
        }

        @Override // com.daaw.InterfaceC3596c11
        public InterfaceC7039oI0 j() {
            return null;
        }

        @Override // com.daaw.InterfaceC1556Mb0
        public void a() {
        }

        @Override // com.daaw.InterfaceC1556Mb0
        public void b() {
        }

        @Override // com.daaw.InterfaceC1556Mb0
        public void onDestroy() {
        }

        @Override // com.daaw.InterfaceC3596c11
        public void c(InterfaceC7039oI0 interfaceC7039oI0) {
        }

        @Override // com.daaw.InterfaceC3596c11
        public void i(Drawable drawable) {
        }

        @Override // com.daaw.InterfaceC3596c11
        public void k(Drawable drawable) {
        }
    }
}
