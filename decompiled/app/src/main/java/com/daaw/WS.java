package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.widget.ImageView;
import com.daaw.C3179aY0;
import com.daaw.C3458bY0;
import com.daaw.EW;
import com.daaw.GK;
import com.daaw.IK;
import com.daaw.JK;
import com.daaw.KK;
import com.daaw.PX0;
import com.daaw.SX0;
import com.daaw.WX0;
import com.daaw.XX0;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class WS {
    public static volatile WS o = null;
    public static boolean p = true;
    public final C6799nS a;
    public final KG b;
    public final InterfaceC1883Pf c;
    public final InterfaceC6319lj0 d;
    public final EnumC0591Cw e;
    public final EY f = new EY();
    public final C5020h51 g;
    public final C2387Tv h;
    public final C2443Uj i;
    public final GS j;
    public final HM k;
    public final GS l;
    public final Handler m;
    public final C1987Qf n;

    public WS(KG kg, InterfaceC6319lj0 interfaceC6319lj0, InterfaceC1883Pf interfaceC1883Pf, Context context, EnumC0591Cw enumC0591Cw) {
        C5020h51 c5020h51 = new C5020h51();
        this.g = c5020h51;
        this.b = kg;
        this.c = interfaceC1883Pf;
        this.d = interfaceC6319lj0;
        this.e = enumC0591Cw;
        this.a = new C6799nS(context);
        this.m = new Handler(Looper.getMainLooper());
        this.n = new C1987Qf(interfaceC6319lj0, interfaceC1883Pf, enumC0591Cw);
        C2387Tv c2387Tv = new C2387Tv();
        this.h = c2387Tv;
        NX0 nx0 = new NX0(interfaceC1883Pf, enumC0591Cw);
        c2387Tv.b(InputStream.class, Bitmap.class, nx0);
        EK ek = new EK(interfaceC1883Pf, enumC0591Cw);
        c2387Tv.b(ParcelFileDescriptor.class, Bitmap.class, ek);
        C9619xY c9619xY = new C9619xY(nx0, ek);
        c2387Tv.b(AY.class, Bitmap.class, c9619xY);
        JS js = new JS(context, interfaceC1883Pf);
        c2387Tv.b(InputStream.class, IS.class, js);
        c2387Tv.b(AY.class, AS.class, new C9898yY(c9619xY, js, interfaceC1883Pf));
        c2387Tv.b(InputStream.class, File.class, new RX0());
        r(File.class, ParcelFileDescriptor.class, new GK.a());
        r(File.class, InputStream.class, new SX0.a());
        IK.a aVar = new IK.a();
        Class cls = Integer.TYPE;
        r(cls, ParcelFileDescriptor.class, aVar);
        r(cls, InputStream.class, new WX0.a());
        r(Integer.class, ParcelFileDescriptor.class, new IK.a());
        r(Integer.class, InputStream.class, new WX0.a());
        r(String.class, ParcelFileDescriptor.class, new JK.a());
        r(String.class, InputStream.class, new XX0.a());
        r(Uri.class, ParcelFileDescriptor.class, new KK.a());
        r(Uri.class, InputStream.class, new C3179aY0.a());
        r(URL.class, InputStream.class, new C3458bY0.a());
        r(C4840gT.class, InputStream.class, new EW.a());
        r(byte[].class, InputStream.class, new PX0.a());
        c5020h51.b(Bitmap.class, ZS.class, new C3437bT(context.getResources(), interfaceC1883Pf));
        c5020h51.b(AS.class, AbstractC3994dT.class, new BS(new C3437bT(context.getResources(), interfaceC1883Pf)));
        C2443Uj c2443Uj = new C2443Uj(interfaceC1883Pf);
        this.i = c2443Uj;
        this.j = new GS(interfaceC1883Pf, c2443Uj);
        HM hm = new HM(interfaceC1883Pf);
        this.k = hm;
        this.l = new GS(interfaceC1883Pf, hm);
    }

    public static InterfaceC0657Dk0 b(Class cls, Context context) {
        return d(cls, ParcelFileDescriptor.class, context);
    }

    public static InterfaceC0657Dk0 d(Class cls, Class cls2, Context context) {
        if (cls == null) {
            return null;
        }
        return j(context).o().a(cls, cls2);
    }

    public static InterfaceC0657Dk0 e(Class cls, Context context) {
        return d(cls, InputStream.class, context);
    }

    public static void g(View view) {
        h(new a(view));
    }

    public static void h(InterfaceC3596c11 interfaceC3596c11) {
        AbstractC6559mb1.b();
        InterfaceC7039oI0 interfaceC7039oI0J = interfaceC3596c11.j();
        if (interfaceC7039oI0J != null) {
            interfaceC7039oI0J.clear();
            interfaceC3596c11.c(null);
        }
    }

    public static WS j(Context context) {
        if (o == null) {
            synchronized (WS.class) {
                try {
                    if (o == null) {
                        Context applicationContext = context.getApplicationContext();
                        C3715cT c3715cT = new C3715cT(applicationContext);
                        List listQ = q(applicationContext);
                        Iterator it = listQ.iterator();
                        if (it.hasNext()) {
                            AbstractC6314li0.a(it.next());
                            throw null;
                        }
                        o = c3715cT.a();
                        Iterator it2 = listQ.iterator();
                        if (it2.hasNext()) {
                            AbstractC6314li0.a(it2.next());
                            throw null;
                        }
                    }
                } finally {
                }
            }
        }
        return o;
    }

    public static List q(Context context) {
        return p ? new C7699qg0(context).a() : Collections.EMPTY_LIST;
    }

    public static C8712uI0 t(Context context) {
        return C9277wI0.f().d(context);
    }

    public InterfaceC2283Sv a(Class cls, Class cls2) {
        return this.h.a(cls, cls2);
    }

    public InterfaceC3596c11 c(ImageView imageView, Class cls) {
        return this.f.a(imageView, cls);
    }

    public WI0 f(Class cls, Class cls2) {
        return this.g.a(cls, cls2);
    }

    public void i() {
        AbstractC6559mb1.b();
        this.d.d();
        this.c.d();
    }

    public InterfaceC1883Pf k() {
        return this.c;
    }

    public GS l() {
        return this.j;
    }

    public GS m() {
        return this.l;
    }

    public KG n() {
        return this.b;
    }

    public final C6799nS o() {
        return this.a;
    }

    public Handler p() {
        return this.m;
    }

    public void r(Class cls, Class cls2, InterfaceC0761Ek0 interfaceC0761Ek0) {
        InterfaceC0761Ek0 interfaceC0761Ek0F = this.a.f(cls, cls2, interfaceC0761Ek0);
        if (interfaceC0761Ek0F != null) {
            interfaceC0761Ek0F.b();
        }
    }

    public void s(int i) {
        AbstractC6559mb1.b();
        this.d.c(i);
        this.c.c(i);
    }

    public static class a extends AbstractC1985Qe1 {
        public a(View view) {
            super(view);
        }

        @Override // com.daaw.AbstractC1256Je, com.daaw.InterfaceC3596c11
        public void i(Drawable drawable) {
        }

        @Override // com.daaw.AbstractC1256Je, com.daaw.InterfaceC3596c11
        public void k(Drawable drawable) {
        }

        @Override // com.daaw.InterfaceC3596c11
        public void d(Object obj, XS xs) {
        }

        @Override // com.daaw.AbstractC1256Je, com.daaw.InterfaceC3596c11
        public void h(Exception exc, Drawable drawable) {
        }
    }
}
