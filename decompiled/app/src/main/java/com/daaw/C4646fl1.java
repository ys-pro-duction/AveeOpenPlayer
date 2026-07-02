package com.daaw;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import com.daaw.AbstractC9878yT;
import com.daaw.C5033h8;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.fl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4646fl1 implements AbstractC9878yT.a, AbstractC9878yT.b {
    public final C5033h8.f C;
    public final H8 D;
    public final C2241Sk1 E;
    public final int H;
    public final BinderC9684xl1 I;
    public boolean J;
    public final /* synthetic */ C10157zT N;
    public final Queue B = new LinkedList();
    public final Set F = new HashSet();
    public final Map G = new HashMap();
    public final List K = new ArrayList();
    public ConnectionResult L = null;
    public int M = 0;

    public C4646fl1(C10157zT c10157zT, AbstractC8476tT abstractC8476tT) {
        this.N = c10157zT;
        C5033h8.f fVarJ = abstractC8476tT.j(c10157zT.O.getLooper(), this);
        this.C = fVarJ;
        this.D = abstractC8476tT.g();
        this.E = new C2241Sk1();
        this.H = abstractC8476tT.i();
        if (fVarJ.requiresSignIn()) {
            this.I = abstractC8476tT.k(c10157zT.F, c10157zT.O);
        } else {
            this.I = null;
        }
    }

    public static /* bridge */ /* synthetic */ void y(C4646fl1 c4646fl1, C5204hl1 c5204hl1) {
        if (c4646fl1.K.contains(c5204hl1) && !c4646fl1.J) {
            if (c4646fl1.C.isConnected()) {
                c4646fl1.g();
            } else {
                c4646fl1.C();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(C4646fl1 c4646fl1, C5204hl1 c5204hl1) {
        Feature[] featureArrG;
        if (c4646fl1.K.remove(c5204hl1)) {
            c4646fl1.N.O.removeMessages(15, c5204hl1);
            c4646fl1.N.O.removeMessages(16, c5204hl1);
            Feature feature = c5204hl1.b;
            ArrayList arrayList = new ArrayList(c4646fl1.B.size());
            for (AbstractC2349Tl1 abstractC2349Tl1 : c4646fl1.B) {
                if ((abstractC2349Tl1 instanceof AbstractC7725ql1) && (featureArrG = ((AbstractC7725ql1) abstractC2349Tl1).g(c4646fl1)) != null && AbstractC3470bb.b(featureArrG, feature)) {
                    arrayList.add(abstractC2349Tl1);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC2349Tl1 abstractC2349Tl12 = (AbstractC2349Tl1) arrayList.get(i);
                c4646fl1.B.remove(abstractC2349Tl12);
                abstractC2349Tl12.b(new C5149ha1(feature));
            }
        }
    }

    public final void A() {
        AbstractC7506py0.d(this.N.O);
        this.L = null;
    }

    @Override // com.daaw.InterfaceC0359Aq
    public final void B(int i) {
        if (Looper.myLooper() == this.N.O.getLooper()) {
            i(i);
        } else {
            this.N.O.post(new RunnableC3800cl1(this, i));
        }
    }

    public final void C() {
        AbstractC7506py0.d(this.N.O);
        if (this.C.isConnected() || this.C.isConnecting()) {
            return;
        }
        try {
            C10157zT c10157zT = this.N;
            int iB = c10157zT.H.b(c10157zT.F, this.C);
            if (iB != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iB, null);
                this.C.getClass();
                connectionResult.toString();
                F(connectionResult, null);
                return;
            }
            C10157zT c10157zT2 = this.N;
            C5033h8.f fVar = this.C;
            C5763jl1 c5763jl1 = new C5763jl1(c10157zT2, fVar, this.D);
            if (fVar.requiresSignIn()) {
                ((BinderC9684xl1) AbstractC7506py0.l(this.I)).c3(c5763jl1);
            }
            try {
                this.C.connect(c5763jl1);
            } catch (SecurityException e) {
                F(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            F(new ConnectionResult(10), e2);
        }
    }

    public final void D(AbstractC2349Tl1 abstractC2349Tl1) {
        AbstractC7506py0.d(this.N.O);
        if (this.C.isConnected()) {
            if (m(abstractC2349Tl1)) {
                j();
                return;
            } else {
                this.B.add(abstractC2349Tl1);
                return;
            }
        }
        this.B.add(abstractC2349Tl1);
        ConnectionResult connectionResult = this.L;
        if (connectionResult == null || !connectionResult.s()) {
            C();
        } else {
            F(this.L, null);
        }
    }

    public final void E() {
        this.M++;
    }

    public final void F(ConnectionResult connectionResult, Exception exc) {
        AbstractC7506py0.d(this.N.O);
        BinderC9684xl1 binderC9684xl1 = this.I;
        if (binderC9684xl1 != null) {
            binderC9684xl1.d3();
        }
        A();
        this.N.H.c();
        d(connectionResult);
        if ((this.C instanceof C4930gm1) && connectionResult.e() != 24) {
            this.N.C = true;
            C10157zT c10157zT = this.N;
            c10157zT.O.sendMessageDelayed(c10157zT.O.obtainMessage(19), 300000L);
        }
        if (connectionResult.e() == 4) {
            e(C10157zT.R);
            return;
        }
        if (this.B.isEmpty()) {
            this.L = connectionResult;
            return;
        }
        if (exc != null) {
            AbstractC7506py0.d(this.N.O);
            f(null, exc, false);
            return;
        }
        if (!this.N.P) {
            e(C10157zT.f(this.D, connectionResult));
            return;
        }
        f(C10157zT.f(this.D, connectionResult), null, true);
        if (this.B.isEmpty() || n(connectionResult) || this.N.e(connectionResult, this.H)) {
            return;
        }
        if (connectionResult.e() == 18) {
            this.J = true;
        }
        if (!this.J) {
            e(C10157zT.f(this.D, connectionResult));
            return;
        }
        C10157zT c10157zT2 = this.N;
        c10157zT2.O.sendMessageDelayed(Message.obtain(c10157zT2.O, 9, this.D), 5000L);
    }

    @Override // com.daaw.InterfaceC5787jq0
    public final void G(ConnectionResult connectionResult) {
        F(connectionResult, null);
    }

    public final void H(ConnectionResult connectionResult) {
        AbstractC7506py0.d(this.N.O);
        C5033h8.f fVar = this.C;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        F(connectionResult, null);
    }

    @Override // com.daaw.InterfaceC0359Aq
    public final void I(Bundle bundle) {
        if (Looper.myLooper() == this.N.O.getLooper()) {
            h();
        } else {
            this.N.O.post(new RunnableC3522bl1(this));
        }
    }

    public final void J() {
        AbstractC7506py0.d(this.N.O);
        if (this.J) {
            C();
        }
    }

    public final void K() {
        AbstractC7506py0.d(this.N.O);
        e(C10157zT.Q);
        this.E.d();
        for (AbstractC8794uc0 abstractC8794uc0 : (AbstractC8794uc0[]) this.G.keySet().toArray(new AbstractC8794uc0[0])) {
            D(new C2035Ql1(null, new C7521q11()));
        }
        d(new ConnectionResult(4));
        if (this.C.isConnected()) {
            this.C.onUserSignOut(new C4357el1(this));
        }
    }

    public final void L() {
        AbstractC7506py0.d(this.N.O);
        if (this.J) {
            l();
            C10157zT c10157zT = this.N;
            e(c10157zT.G.g(c10157zT.F) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.C.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.C.requiresSignIn();
    }

    public final boolean b() {
        return o(true);
    }

    public final Feature c(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.C.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            C2407Ua c2407Ua = new C2407Ua(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                c2407Ua.put(feature.getName(), Long.valueOf(feature.e()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) c2407Ua.get(feature2.getName());
                if (l == null || l.longValue() < feature2.e()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void d(ConnectionResult connectionResult) {
        Iterator it = this.F.iterator();
        if (!it.hasNext()) {
            this.F.clear();
            return;
        }
        AbstractC6314li0.a(it.next());
        if (AbstractC8022rp0.a(connectionResult, ConnectionResult.F)) {
            this.C.getEndpointPackageName();
        }
        throw null;
    }

    public final void e(Status status) {
        AbstractC7506py0.d(this.N.O);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z) {
        AbstractC7506py0.d(this.N.O);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            AbstractC2349Tl1 abstractC2349Tl1 = (AbstractC2349Tl1) it.next();
            if (!z || abstractC2349Tl1.a == 2) {
                if (status != null) {
                    abstractC2349Tl1.a(status);
                } else {
                    abstractC2349Tl1.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.B);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC2349Tl1 abstractC2349Tl1 = (AbstractC2349Tl1) arrayList.get(i);
            if (!this.C.isConnected()) {
                return;
            }
            if (m(abstractC2349Tl1)) {
                this.B.remove(abstractC2349Tl1);
            }
        }
    }

    public final void h() {
        A();
        d(ConnectionResult.F);
        l();
        Iterator it = this.G.values().iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
        g();
        j();
    }

    public final void i(int i) {
        A();
        this.J = true;
        this.E.c(i, this.C.getLastDisconnectMessage());
        H8 h8 = this.D;
        C10157zT c10157zT = this.N;
        c10157zT.O.sendMessageDelayed(Message.obtain(c10157zT.O, 9, h8), 5000L);
        H8 h82 = this.D;
        C10157zT c10157zT2 = this.N;
        c10157zT2.O.sendMessageDelayed(Message.obtain(c10157zT2.O, 11, h82), 120000L);
        this.N.H.c();
        Iterator it = this.G.values().iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
    }

    public final void j() {
        this.N.O.removeMessages(12, this.D);
        H8 h8 = this.D;
        C10157zT c10157zT = this.N;
        c10157zT.O.sendMessageDelayed(c10157zT.O.obtainMessage(12, h8), this.N.B);
    }

    public final void k(AbstractC2349Tl1 abstractC2349Tl1) {
        abstractC2349Tl1.d(this.E, a());
        try {
            abstractC2349Tl1.c(this);
        } catch (DeadObjectException unused) {
            B(1);
            this.C.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void l() {
        if (this.J) {
            C10157zT c10157zT = this.N;
            c10157zT.O.removeMessages(11, this.D);
            C10157zT c10157zT2 = this.N;
            c10157zT2.O.removeMessages(9, this.D);
            this.J = false;
        }
    }

    public final boolean m(AbstractC2349Tl1 abstractC2349Tl1) {
        if (!(abstractC2349Tl1 instanceof AbstractC7725ql1)) {
            k(abstractC2349Tl1);
            return true;
        }
        AbstractC7725ql1 abstractC7725ql1 = (AbstractC7725ql1) abstractC2349Tl1;
        Feature featureC = c(abstractC7725ql1.g(this));
        if (featureC == null) {
            k(abstractC2349Tl1);
            return true;
        }
        this.C.getClass();
        featureC.getName();
        featureC.e();
        if (!this.N.P || !abstractC7725ql1.f(this)) {
            abstractC7725ql1.b(new C5149ha1(featureC));
            return true;
        }
        C5204hl1 c5204hl1 = new C5204hl1(this.D, featureC, null);
        int iIndexOf = this.K.indexOf(c5204hl1);
        if (iIndexOf >= 0) {
            C5204hl1 c5204hl12 = (C5204hl1) this.K.get(iIndexOf);
            this.N.O.removeMessages(15, c5204hl12);
            C10157zT c10157zT = this.N;
            c10157zT.O.sendMessageDelayed(Message.obtain(c10157zT.O, 15, c5204hl12), 5000L);
            return false;
        }
        this.K.add(c5204hl1);
        C10157zT c10157zT2 = this.N;
        c10157zT2.O.sendMessageDelayed(Message.obtain(c10157zT2.O, 15, c5204hl1), 5000L);
        C10157zT c10157zT3 = this.N;
        c10157zT3.O.sendMessageDelayed(Message.obtain(c10157zT3.O, 16, c5204hl1), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (n(connectionResult)) {
            return false;
        }
        this.N.e(connectionResult, this.H);
        return false;
    }

    public final boolean n(ConnectionResult connectionResult) {
        synchronized (C10157zT.S) {
            try {
                C10157zT c10157zT = this.N;
                if (c10157zT.L == null || !c10157zT.M.contains(this.D)) {
                    return false;
                }
                this.N.L.s(connectionResult, this.H);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o(boolean z) {
        AbstractC7506py0.d(this.N.O);
        if (!this.C.isConnected() || !this.G.isEmpty()) {
            return false;
        }
        if (!this.E.e()) {
            this.C.disconnect("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        j();
        return false;
    }

    public final int p() {
        return this.H;
    }

    public final int q() {
        return this.M;
    }

    public final C5033h8.f s() {
        return this.C;
    }

    public final Map u() {
        return this.G;
    }
}
