package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.daaw.InterfaceC0992Gq;

/* JADX INFO: renamed from: com.daaw.uI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8712uI0 implements InterfaceC1556Mb0 {
    public final Context B;
    public final InterfaceC1141Ib0 C;
    public final InterfaceC9556xI0 D;
    public final C9835yI0 E;
    public final WS F;
    public final d G;

    /* JADX INFO: renamed from: com.daaw.uI0$a */
    public class a implements Runnable {
        public final /* synthetic */ InterfaceC1141Ib0 B;

        public a(InterfaceC1141Ib0 interfaceC1141Ib0) {
            this.B = interfaceC1141Ib0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.a(C8712uI0.this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.uI0$b */
    public interface b {
    }

    /* JADX INFO: renamed from: com.daaw.uI0$c */
    public final class c {
        public final InterfaceC0657Dk0 a;
        public final Class b;

        /* JADX INFO: renamed from: com.daaw.uI0$c$a */
        public final class a {
            public final Object a;
            public final Class b;
            public final boolean c = true;

            public a(Object obj) {
                this.a = obj;
                this.b = C8712uI0.s(obj);
            }

            public C7636qS a(Class cls) {
                C7636qS c7636qS = (C7636qS) C8712uI0.this.G.a(new C7636qS(C8712uI0.this.B, C8712uI0.this.F, this.b, c.this.a, c.this.b, cls, C8712uI0.this.E, C8712uI0.this.C, C8712uI0.this.G));
                if (this.c) {
                    c7636qS.q(this.a);
                }
                return c7636qS;
            }
        }

        public c(InterfaceC0657Dk0 interfaceC0657Dk0, Class cls) {
            this.a = interfaceC0657Dk0;
            this.b = cls;
        }

        public a c(Object obj) {
            return new a(obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.uI0$d */
    public class d {
        public d() {
        }

        public AbstractC7357pS a(AbstractC7357pS abstractC7357pS) {
            C8712uI0.p(C8712uI0.this);
            return abstractC7357pS;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uI0$e */
    public static class e implements InterfaceC0992Gq.a {
        public final C9835yI0 a;

        public e(C9835yI0 c9835yI0) {
            this.a = c9835yI0;
        }

        @Override // com.daaw.InterfaceC0992Gq.a
        public void a(boolean z) {
            if (z) {
                this.a.d();
            }
        }
    }

    public C8712uI0(Context context, InterfaceC1141Ib0 interfaceC1141Ib0, InterfaceC9556xI0 interfaceC9556xI0) {
        this(context, interfaceC1141Ib0, interfaceC9556xI0, new C9835yI0(), new C1200Iq());
    }

    public static /* synthetic */ b p(C8712uI0 c8712uI0) {
        c8712uI0.getClass();
        return null;
    }

    public static Class s(Object obj) {
        if (obj != null) {
            return obj.getClass();
        }
        return null;
    }

    public c A(InterfaceC0657Dk0 interfaceC0657Dk0, Class cls) {
        return new c(interfaceC0657Dk0, cls);
    }

    @Override // com.daaw.InterfaceC1556Mb0
    public void a() {
        y();
    }

    @Override // com.daaw.InterfaceC1556Mb0
    public void b() {
        z();
    }

    @Override // com.daaw.InterfaceC1556Mb0
    public void onDestroy() {
        this.E.a();
    }

    public ZD q() {
        return (ZD) v(Integer.class).v(AbstractC8225sa.a(this.B));
    }

    public ZD r() {
        return v(Uri.class);
    }

    public ZD t(Uri uri) {
        return (ZD) r().L(uri);
    }

    public ZD u(Integer num) {
        return (ZD) q().L(num);
    }

    public final ZD v(Class cls) {
        InterfaceC0657Dk0 interfaceC0657Dk0E = WS.e(cls, this.B);
        InterfaceC0657Dk0 interfaceC0657Dk0B = WS.b(cls, this.B);
        if (cls == null || interfaceC0657Dk0E != null || interfaceC0657Dk0B != null) {
            d dVar = this.G;
            return (ZD) dVar.a(new ZD(cls, interfaceC0657Dk0E, interfaceC0657Dk0B, this.B, this.F, this.E, this.C, dVar));
        }
        throw new IllegalArgumentException("Unknown type " + cls + ". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class");
    }

    public void w() {
        this.F.i();
    }

    public void x(int i) {
        this.F.s(i);
    }

    public void y() {
        AbstractC6559mb1.b();
        this.E.b();
    }

    public void z() {
        AbstractC6559mb1.b();
        this.E.e();
    }

    public C8712uI0(Context context, InterfaceC1141Ib0 interfaceC1141Ib0, InterfaceC9556xI0 interfaceC9556xI0, C9835yI0 c9835yI0, C1200Iq c1200Iq) {
        this.B = context.getApplicationContext();
        this.C = interfaceC1141Ib0;
        this.D = interfaceC9556xI0;
        this.E = c9835yI0;
        this.F = WS.j(context);
        this.G = new d();
        InterfaceC0992Gq interfaceC0992GqA = c1200Iq.a(context, new e(c9835yI0));
        if (AbstractC6559mb1.i()) {
            new Handler(Looper.getMainLooper()).post(new a(interfaceC1141Ib0));
        } else {
            interfaceC1141Ib0.a(this);
        }
        interfaceC1141Ib0.a(interfaceC0992GqA);
    }
}
