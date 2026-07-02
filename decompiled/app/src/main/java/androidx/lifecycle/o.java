package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.q;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC4499fG;
import com.daaw.G10;
import com.daaw.InterfaceC1764Ob0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements InterfaceC1764Ob0 {
    public static final b J = new b(null);
    public static final o K = new o();
    public int B;
    public int C;
    public Handler F;
    public boolean D = true;
    public boolean E = true;
    public final l G = new l(this);
    public final Runnable H = new Runnable() { // from class: com.daaw.Az0
        @Override // java.lang.Runnable
        public final void run() {
            androidx.lifecycle.o.j(this.B);
        }
    };
    public final q.a I = new d();

    public static final class a {
        public static final a a = new a();

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            G10.g(activity, "activity");
            G10.g(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final InterfaceC1764Ob0 a() {
            return o.K;
        }

        public final void b(Context context) {
            G10.g(context, "context");
            o.K.i(context);
        }

        public b() {
        }
    }

    public static final class c extends AbstractC4499fG {

        public static final class a extends AbstractC4499fG {
            final /* synthetic */ o this$0;

            public a(o oVar) {
                this.this$0 = oVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                G10.g(activity, "activity");
                this.this$0.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                G10.g(activity, "activity");
                this.this$0.g();
            }
        }

        public c() {
        }

        @Override // com.daaw.AbstractC4499fG, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            G10.g(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                q.INSTANCE.b(activity).e(o.this.I);
            }
        }

        @Override // com.daaw.AbstractC4499fG, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            G10.g(activity, "activity");
            o.this.e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            G10.g(activity, "activity");
            a.a(activity, new a(o.this));
        }

        @Override // com.daaw.AbstractC4499fG, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            G10.g(activity, "activity");
            o.this.h();
        }
    }

    public static final class d implements q.a {
        public d() {
        }

        @Override // androidx.lifecycle.q.a
        public void b() {
            o.this.g();
        }

        @Override // androidx.lifecycle.q.a
        public void c() {
        }

        @Override // androidx.lifecycle.q.a
        public void onResume() {
            o.this.f();
        }
    }

    public static final void j(o oVar) {
        G10.g(oVar, "this$0");
        oVar.k();
        oVar.l();
    }

    public static final InterfaceC1764Ob0 m() {
        return J.a();
    }

    public final void e() {
        int i = this.C - 1;
        this.C = i;
        if (i == 0) {
            Handler handler = this.F;
            G10.d(handler);
            handler.postDelayed(this.H, 700L);
        }
    }

    public final void f() {
        int i = this.C + 1;
        this.C = i;
        if (i == 1) {
            if (this.D) {
                this.G.i(g.a.ON_RESUME);
                this.D = false;
            } else {
                Handler handler = this.F;
                G10.d(handler);
                handler.removeCallbacks(this.H);
            }
        }
    }

    public final void g() {
        int i = this.B + 1;
        this.B = i;
        if (i == 1 && this.E) {
            this.G.i(g.a.ON_START);
            this.E = false;
        }
    }

    public final void h() {
        this.B--;
        l();
    }

    public final void i(Context context) {
        G10.g(context, "context");
        this.F = new Handler();
        this.G.i(g.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        G10.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void k() {
        if (this.C == 0) {
            this.D = true;
            this.G.i(g.a.ON_PAUSE);
        }
    }

    public final void l() {
        if (this.B == 0 && this.D) {
            this.G.i(g.a.ON_STOP);
            this.E = true;
        }
    }

    @Override // com.daaw.InterfaceC1764Ob0
    public g w() {
        return this.G;
    }
}
