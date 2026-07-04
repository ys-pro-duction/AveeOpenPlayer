package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.g;
import com.daaw.AbstractC9204w2;
import com.daaw.YM0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class MP extends AbstractActivityC5776jo implements AbstractC9204w2.c, AbstractC9204w2.d {
    public boolean Z;
    public boolean a0;
    public final PP X = PP.b(new a());
    public final androidx.lifecycle.l Y = new androidx.lifecycle.l(this);
    public boolean b0 = true;

    public class a extends QP implements InterfaceC5506iq0, InterfaceC0681Dq0, InterfaceC8864uq0, InterfaceC9150vq0, InterfaceC0417Be1, InterfaceC3824cq0, I2, InterfaceC3135aN0, InterfaceC3425bQ, InterfaceC9952yj0 {
        public a() {
            super(MP.this);
        }

        @Override // com.daaw.QP
        public void B() {
            C();
        }

        public void C() {
            MP.this.V();
        }

        @Override // com.daaw.QP
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public MP y() {
            return MP.this;
        }

        @Override // com.daaw.InterfaceC0681Dq0
        public void a(InterfaceC8589tr interfaceC8589tr) {
            MP.this.a(interfaceC8589tr);
        }

        @Override // com.daaw.InterfaceC3425bQ
        public void b(FragmentManager fragmentManager, androidx.fragment.app.c cVar) {
            MP.this.j0(cVar);
        }

        @Override // com.daaw.InterfaceC3824cq0
        public C3267aq0 c() {
            return MP.this.c();
        }

        @Override // com.daaw.InterfaceC9150vq0
        public void d(InterfaceC8589tr interfaceC8589tr) {
            MP.this.d(interfaceC8589tr);
        }

        @Override // com.daaw.InterfaceC9952yj0
        public void e(InterfaceC0861Fj0 interfaceC0861Fj0) {
            MP.this.e(interfaceC0861Fj0);
        }

        @Override // com.daaw.InterfaceC8864uq0
        public void f(InterfaceC8589tr interfaceC8589tr) {
            MP.this.f(interfaceC8589tr);
        }

        @Override // com.daaw.InterfaceC8864uq0
        public void g(InterfaceC8589tr interfaceC8589tr) {
            MP.this.g(interfaceC8589tr);
        }

        @Override // com.daaw.InterfaceC5506iq0
        public void h(InterfaceC8589tr interfaceC8589tr) {
            MP.this.h(interfaceC8589tr);
        }

        @Override // com.daaw.InterfaceC5506iq0
        public void i(InterfaceC8589tr interfaceC8589tr) {
            MP.this.i(interfaceC8589tr);
        }

        @Override // com.daaw.OP
        public View k(int i) {
            return MP.this.findViewById(i);
        }

        @Override // com.daaw.I2
        public H2 l() {
            return MP.this.l();
        }

        @Override // com.daaw.OP
        public boolean m() {
            Window window = MP.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // com.daaw.InterfaceC0417Be1
        public C0313Ae1 n() {
            return MP.this.n();
        }

        @Override // com.daaw.InterfaceC3135aN0
        public YM0 p() {
            return MP.this.p();
        }

        @Override // com.daaw.InterfaceC0681Dq0
        public void q(InterfaceC8589tr interfaceC8589tr) {
            MP.this.q(interfaceC8589tr);
        }

        @Override // com.daaw.InterfaceC9952yj0
        public void u(InterfaceC0861Fj0 interfaceC0861Fj0) {
            MP.this.u(interfaceC0861Fj0);
        }

        @Override // com.daaw.InterfaceC9150vq0
        public void v(InterfaceC8589tr interfaceC8589tr) {
            MP.this.v(interfaceC8589tr);
        }

        @Override // com.daaw.InterfaceC1764Ob0
        public androidx.lifecycle.g w() {
            return MP.this.Y;
        }

        @Override // com.daaw.QP
        public void x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            MP.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // com.daaw.QP
        public LayoutInflater z() {
            return MP.this.getLayoutInflater().cloneInContext(MP.this);
        }
    }

    public MP() {
        g0();
    }

    public static /* synthetic */ Bundle c0(MP mp) {
        mp.h0();
        mp.Y.i(g.a.ON_STOP);
        return new Bundle();
    }

    private void g0() {
        p().h("android:support:lifecycle", new YM0.c() { // from class: com.daaw.IP
            @Override // com.daaw.YM0.c
            public final Bundle a() {
                return MP.c0(this.a);
            }
        });
        i(new InterfaceC8589tr() { // from class: com.daaw.JP
            @Override // com.daaw.InterfaceC8589tr
            public final void accept(Object obj) {
                this.a.X.m();
            }
        });
        Q(new InterfaceC8589tr() { // from class: com.daaw.KP
            @Override // com.daaw.InterfaceC8589tr
            public final void accept(Object obj) {
                this.a.X.m();
            }
        });
        P(new InterfaceC6075kq0() { // from class: com.daaw.LP
            @Override // com.daaw.InterfaceC6075kq0
            public final void a(Context context) {
                this.a.X.a(null);
            }
        });
    }

    public static boolean i0(FragmentManager fragmentManager, g.b bVar) {
        boolean zI0 = false;
        for (androidx.fragment.app.c cVar : fragmentManager.v0()) {
            if (cVar != null) {
                if (cVar.D() != null) {
                    zI0 |= i0(cVar.t(), bVar);
                }
                C6512mQ c6512mQ = cVar.x0;
                if (c6512mQ != null && c6512mQ.w().b().c(g.b.STARTED)) {
                    cVar.x0.g(bVar);
                    zI0 = true;
                }
                if (cVar.w0.b().c(g.b.STARTED)) {
                    cVar.w0.n(bVar);
                    zI0 = true;
                }
            }
        }
        return zI0;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (x(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.Z);
            printWriter.print(" mResumed=");
            printWriter.print(this.a0);
            printWriter.print(" mStopped=");
            printWriter.print(this.b0);
            if (getApplication() != null) {
                AbstractC1041Hc0.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.X.l().X(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final View e0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.X.n(view, str, context, attributeSet);
    }

    public FragmentManager f0() {
        return this.X.l();
    }

    public void h0() {
        while (i0(f0(), g.b.CREATED)) {
        }
    }

    public void k0() {
        this.Y.i(g.a.ON_RESUME);
        this.X.h();
    }

    @Override // com.daaw.AbstractActivityC5776jo, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.X.m();
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.daaw.AbstractActivityC5776jo, com.daaw.AbstractActivityC7459po, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Y.i(g.a.ON_CREATE);
        this.X.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewE0 = e0(view, str, context, attributeSet);
        return viewE0 == null ? super.onCreateView(view, str, context, attributeSet) : viewE0;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.X.f();
        this.Y.i(g.a.ON_DESTROY);
    }

    @Override // com.daaw.AbstractActivityC5776jo, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.X.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.a0 = false;
        this.X.g();
        this.Y.i(g.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        k0();
    }

    @Override // com.daaw.AbstractActivityC5776jo, android.app.Activity, com.daaw.AbstractC9204w2.c
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.X.m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.X.m();
        super.onResume();
        this.a0 = true;
        this.X.k();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.X.m();
        super.onStart();
        this.b0 = false;
        if (!this.Z) {
            this.Z = true;
            this.X.c();
        }
        this.X.k();
        this.Y.i(g.a.ON_START);
        this.X.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.X.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.b0 = true;
        h0();
        this.X.j();
        this.Y.i(g.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewE0 = e0(null, str, context, attributeSet);
        return viewE0 == null ? super.onCreateView(str, context, attributeSet) : viewE0;
    }

    @Override // com.daaw.AbstractC9204w2.d
    public final void b(int i) {
    }

    public void j0(androidx.fragment.app.c cVar) {
    }
}
