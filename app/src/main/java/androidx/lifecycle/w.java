package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.g;
import com.daaw.G10;
import com.daaw.InterfaceC1764Ob0;

/* JADX INFO: loaded from: classes.dex */
public class w {
    public final l a;
    public final Handler b;
    public a c;

    public static final class a implements Runnable {
        public final l B;
        public final g.a C;
        public boolean D;

        public a(l lVar, g.a aVar) {
            G10.g(lVar, "registry");
            G10.g(aVar, "event");
            this.B = lVar;
            this.C = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.D) {
                return;
            }
            this.B.i(this.C);
            this.D = true;
        }
    }

    public w(InterfaceC1764Ob0 interfaceC1764Ob0) {
        G10.g(interfaceC1764Ob0, "provider");
        this.a = new l(interfaceC1764Ob0);
        this.b = new Handler();
    }

    public g a() {
        return this.a;
    }

    public void b() {
        f(g.a.ON_START);
    }

    public void c() {
        f(g.a.ON_CREATE);
    }

    public void d() {
        f(g.a.ON_STOP);
        f(g.a.ON_DESTROY);
    }

    public void e() {
        f(g.a.ON_START);
    }

    public final void f(g.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        Handler handler = this.b;
        G10.d(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
