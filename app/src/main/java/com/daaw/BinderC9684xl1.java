package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.daaw.AbstractC9878yT;
import com.daaw.C5033h8;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.xl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC9684xl1 extends AbstractBinderC7446pl1 implements AbstractC9878yT.a, AbstractC9878yT.b {
    public static final C5033h8.a I = AbstractC0549Cl1.c;
    public final Context B;
    public final Handler C;
    public final C5033h8.a D;
    public final Set E;
    public final C2763Xl F;
    public InterfaceC0870Fl1 G;
    public InterfaceC9405wl1 H;

    public BinderC9684xl1(Context context, Handler handler, C2763Xl c2763Xl) {
        C5033h8.a aVar = I;
        this.B = context;
        this.C = handler;
        this.F = (C2763Xl) AbstractC7506py0.m(c2763Xl, "ClientSettings must not be null");
        this.E = c2763Xl.e();
        this.D = aVar;
    }

    public static /* bridge */ /* synthetic */ void b3(BinderC9684xl1 binderC9684xl1, zak zakVar) {
        ConnectionResult connectionResultE = zakVar.e();
        if (connectionResultE.v()) {
            zav zavVar = (zav) AbstractC7506py0.l(zakVar.m());
            ConnectionResult connectionResultE2 = zavVar.e();
            if (!connectionResultE2.v()) {
                String strValueOf = String.valueOf(connectionResultE2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                binderC9684xl1.H.b(connectionResultE2);
                binderC9684xl1.G.disconnect();
                return;
            }
            binderC9684xl1.H.c(zavVar.m(), binderC9684xl1.E);
        } else {
            binderC9684xl1.H.b(connectionResultE);
        }
        binderC9684xl1.G.disconnect();
    }

    @Override // com.daaw.InterfaceC0359Aq
    public final void B(int i) {
        this.H.d(i);
    }

    @Override // com.daaw.InterfaceC5787jq0
    public final void G(ConnectionResult connectionResult) {
        this.H.b(connectionResult);
    }

    @Override // com.daaw.InterfaceC0359Aq
    public final void I(Bundle bundle) {
        this.G.b(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.daaw.Fl1, com.daaw.h8$f] */
    public final void c3(InterfaceC9405wl1 interfaceC9405wl1) {
        InterfaceC0870Fl1 interfaceC0870Fl1 = this.G;
        if (interfaceC0870Fl1 != null) {
            interfaceC0870Fl1.disconnect();
        }
        this.F.i(Integer.valueOf(System.identityHashCode(this)));
        C5033h8.a aVar = this.D;
        Context context = this.B;
        Handler handler = this.C;
        C2763Xl c2763Xl = this.F;
        this.G = aVar.b(context, handler.getLooper(), c2763Xl, c2763Xl.f(), this, this);
        this.H = interfaceC9405wl1;
        Set set = this.E;
        if (set == null || set.isEmpty()) {
            this.C.post(new RunnableC8840ul1(this));
        } else {
            this.G.c();
        }
    }

    public final void d3() {
        InterfaceC0870Fl1 interfaceC0870Fl1 = this.G;
        if (interfaceC0870Fl1 != null) {
            interfaceC0870Fl1.disconnect();
        }
    }

    @Override // com.daaw.InterfaceC0974Gl1
    public final void t0(zak zakVar) {
        this.C.post(new RunnableC9126vl1(this, zakVar));
    }
}
