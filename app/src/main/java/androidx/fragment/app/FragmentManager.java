package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import androidx.lifecycle.g;
import com.daaw.A2;
import com.daaw.AbstractC2884Yp0;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC7855rD0;
import com.daaw.B2;
import com.daaw.C0313Ae1;
import com.daaw.C10007yu0;
import com.daaw.C1461Ld0;
import com.daaw.C2;
import com.daaw.C2419Ud;
import com.daaw.C2764Xl0;
import com.daaw.C3146aQ;
import com.daaw.C3267aq0;
import com.daaw.C4260eQ;
import com.daaw.C4828gQ;
import com.daaw.D2;
import com.daaw.F2;
import com.daaw.H2;
import com.daaw.I2;
import com.daaw.InterfaceC0417Be1;
import com.daaw.InterfaceC0681Dq0;
import com.daaw.InterfaceC0861Fj0;
import com.daaw.InterfaceC1764Ob0;
import com.daaw.InterfaceC3135aN0;
import com.daaw.InterfaceC3425bQ;
import com.daaw.InterfaceC3824cq0;
import com.daaw.InterfaceC5506iq0;
import com.daaw.InterfaceC6254lV0;
import com.daaw.InterfaceC8589tr;
import com.daaw.InterfaceC8864uq0;
import com.daaw.InterfaceC9150vq0;
import com.daaw.InterfaceC9952yj0;
import com.daaw.MP;
import com.daaw.OP;
import com.daaw.QP;
import com.daaw.RP;
import com.daaw.SP;
import com.daaw.YM0;
import com.revenuecat.purchases.common.Constants;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    public static boolean U = false;
    public static boolean V = true;
    public androidx.fragment.app.c A;
    public F2 F;
    public F2 G;
    public F2 H;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ArrayList O;
    public ArrayList P;
    public ArrayList Q;
    public C3146aQ R;
    public C4828gQ.c S;
    public boolean b;
    public ArrayList e;
    public C3267aq0 g;
    public QP x;
    public OP y;
    public androidx.fragment.app.c z;
    public final ArrayList a = new ArrayList();
    public final C4260eQ c = new C4260eQ();
    public ArrayList d = new ArrayList();
    public final RP f = new RP(this);
    public androidx.fragment.app.a h = null;
    public boolean i = false;
    public final AbstractC2884Yp0 j = new b(false);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = DesugarCollections.synchronizedMap(new HashMap());
    public final Map m = DesugarCollections.synchronizedMap(new HashMap());
    public final Map n = DesugarCollections.synchronizedMap(new HashMap());
    public ArrayList o = new ArrayList();
    public final SP p = new SP(this);
    public final CopyOnWriteArrayList q = new CopyOnWriteArrayList();
    public final InterfaceC8589tr r = new InterfaceC8589tr() { // from class: com.daaw.TP
        @Override // com.daaw.InterfaceC8589tr
        public final void accept(Object obj) {
            FragmentManager.f(this.a, (Configuration) obj);
        }
    };
    public final InterfaceC8589tr s = new InterfaceC8589tr() { // from class: com.daaw.UP
        @Override // com.daaw.InterfaceC8589tr
        public final void accept(Object obj) {
            FragmentManager.a(this.a, (Integer) obj);
        }
    };
    public final InterfaceC8589tr t = new InterfaceC8589tr() { // from class: com.daaw.VP
        @Override // com.daaw.InterfaceC8589tr
        public final void accept(Object obj) {
            FragmentManager.e(this.a, (C2764Xl0) obj);
        }
    };
    public final InterfaceC8589tr u = new InterfaceC8589tr() { // from class: com.daaw.WP
        @Override // com.daaw.InterfaceC8589tr
        public final void accept(Object obj) {
            FragmentManager.d(this.a, (C10007yu0) obj);
        }
    };
    public final InterfaceC0861Fj0 v = new c();
    public int w = -1;
    public androidx.fragment.app.e B = null;
    public androidx.fragment.app.e C = new d();
    public InterfaceC6254lV0 D = null;
    public InterfaceC6254lV0 E = new e();
    public ArrayDeque I = new ArrayDeque();
    public Runnable T = new f();

    public class a implements A2 {
        public a() {
        }

        @Override // com.daaw.A2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.I.pollFirst();
            if (launchedFragmentInfo == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfo.B;
            int i2 = launchedFragmentInfo.C;
            androidx.fragment.app.c cVarI = FragmentManager.this.c.i(str);
            if (cVarI == null) {
                return;
            }
            cVarI.L0(i2, strArr, iArr);
        }
    }

    public class b extends AbstractC2884Yp0 {
        public b(boolean z) {
            super(z);
        }

        @Override // com.daaw.AbstractC2884Yp0
        public void c() {
            if (FragmentManager.J0(3)) {
                boolean z = FragmentManager.U;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.p();
                FragmentManager.this.h = null;
            }
        }

        @Override // com.daaw.AbstractC2884Yp0
        public void d() {
            if (FragmentManager.J0(3)) {
                boolean z = FragmentManager.U;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager.this.F0();
        }

        @Override // com.daaw.AbstractC2884Yp0
        public void e(C2419Ud c2419Ud) {
            if (FragmentManager.J0(2)) {
                boolean z = FragmentManager.U;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.h != null) {
                Iterator it = fragmentManager.v(new ArrayList(Collections.singletonList(FragmentManager.this.h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((androidx.fragment.app.h) it.next()).y(c2419Ud);
                }
                Iterator it2 = FragmentManager.this.o.iterator();
                if (it2.hasNext()) {
                    AbstractC6314li0.a(it2.next());
                    throw null;
                }
            }
        }

        @Override // com.daaw.AbstractC2884Yp0
        public void f(C2419Ud c2419Ud) {
            if (FragmentManager.J0(3)) {
                boolean z = FragmentManager.U;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.Y();
                FragmentManager.this.c1();
            }
        }
    }

    public class c implements InterfaceC0861Fj0 {
        public c() {
        }

        @Override // com.daaw.InterfaceC0861Fj0
        public boolean a(MenuItem menuItem) {
            return FragmentManager.this.K(menuItem);
        }

        @Override // com.daaw.InterfaceC0861Fj0
        public void b(Menu menu) {
            FragmentManager.this.L(menu);
        }

        @Override // com.daaw.InterfaceC0861Fj0
        public void c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.D(menu, menuInflater);
        }

        @Override // com.daaw.InterfaceC0861Fj0
        public void d(Menu menu) {
            FragmentManager.this.P(menu);
        }
    }

    public class d extends androidx.fragment.app.e {
        public d() {
        }

        @Override // androidx.fragment.app.e
        public androidx.fragment.app.c a(ClassLoader classLoader, String str) {
            return FragmentManager.this.w0().j(FragmentManager.this.w0().r(), str, null);
        }
    }

    public class e implements InterfaceC6254lV0 {
        public e() {
        }

        @Override // com.daaw.InterfaceC6254lV0
        public androidx.fragment.app.h a(ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.b0(true);
        }
    }

    public class g implements InterfaceC3425bQ {
        public final /* synthetic */ androidx.fragment.app.c B;

        public g(androidx.fragment.app.c cVar) {
            this.B = cVar;
        }

        @Override // com.daaw.InterfaceC3425bQ
        public void b(FragmentManager fragmentManager, androidx.fragment.app.c cVar) {
            this.B.p0(cVar);
        }
    }

    public class h implements A2 {
        public h() {
        }

        @Override // com.daaw.A2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.I.pollLast();
            if (launchedFragmentInfo == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfo.B;
            int i = launchedFragmentInfo.C;
            androidx.fragment.app.c cVarI = FragmentManager.this.c.i(str);
            if (cVarI == null) {
                return;
            }
            cVarI.m0(i, activityResult.getResultCode(), activityResult.getData());
        }
    }

    public class i implements A2 {
        public i() {
        }

        @Override // com.daaw.A2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.I.pollFirst();
            if (launchedFragmentInfo == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfo.B;
            int i = launchedFragmentInfo.C;
            androidx.fragment.app.c cVarI = FragmentManager.this.c.i(str);
            if (cVarI == null) {
                return;
            }
            cVarI.m0(i, activityResult.getResultCode(), activityResult.getData());
        }
    }

    public static class j extends B2 {
        @Override // com.daaw.B2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.getIntentSender()).b(null).c(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.J0(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // com.daaw.B2
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public interface k {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public class l implements k {
        public final String a;
        public final int b;
        public final int c;

        public l(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.k
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            androidx.fragment.app.c cVar = FragmentManager.this.A;
            if (cVar == null || this.b >= 0 || this.a != null || !cVar.t().X0()) {
                return FragmentManager.this.a1(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    public class m implements k {
        public m() {
        }

        @Override // androidx.fragment.app.FragmentManager.k
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean zB1 = FragmentManager.this.b1(arrayList, arrayList2);
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.i = true;
            if (!fragmentManager.o.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.o0((androidx.fragment.app.a) it.next()));
                }
                Iterator it2 = FragmentManager.this.o.iterator();
                while (it2.hasNext()) {
                    AbstractC6314li0.a(it2.next());
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        throw null;
                    }
                }
            }
            return zB1;
        }
    }

    public static androidx.fragment.app.c D0(View view) {
        Object tag = view.getTag(AbstractC7855rD0.a);
        if (tag instanceof androidx.fragment.app.c) {
            return (androidx.fragment.app.c) tag;
        }
        return null;
    }

    public static boolean J0(int i2) {
        return U || Log.isLoggable("FragmentManager", i2);
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.L0() && num.intValue() == 80) {
            fragmentManager.G(false);
        }
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager) {
        Iterator it = fragmentManager.o.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, C10007yu0 c10007yu0) {
        if (fragmentManager.L0()) {
            fragmentManager.O(c10007yu0.a(), false);
        }
    }

    public static void d0(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                aVar.q(-1);
                aVar.v();
            } else {
                aVar.q(1);
                aVar.u();
            }
            i2++;
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, C2764Xl0 c2764Xl0) {
        if (fragmentManager.L0()) {
            fragmentManager.H(c2764Xl0.a(), false);
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.L0()) {
            fragmentManager.A(configuration, false);
        }
    }

    public static int h1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 == 8194) {
            return 4097;
        }
        if (i2 == 8197) {
            return 4100;
        }
        if (i2 != 4099) {
            return i2 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    public static FragmentManager l0(View view) {
        MP mp;
        androidx.fragment.app.c cVarM0 = m0(view);
        if (cVarM0 != null) {
            if (cVarM0.d0()) {
                return cVarM0.t();
            }
            throw new IllegalStateException("The Fragment " + cVarM0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                mp = null;
                break;
            }
            if (context instanceof MP) {
                mp = (MP) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (mp != null) {
            return mp.f0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static androidx.fragment.app.c m0(View view) {
        while (view != null) {
            androidx.fragment.app.c cVarD0 = D0(view);
            if (cVarD0 != null) {
                return cVarD0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public void A(Configuration configuration, boolean z) {
        if (z && (this.x instanceof InterfaceC5506iq0)) {
            q1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.c.o()) {
            if (cVar != null) {
                cVar.U0(configuration);
                if (z) {
                    cVar.Y.A(configuration, true);
                }
            }
        }
    }

    public androidx.fragment.app.c A0() {
        return this.A;
    }

    public boolean B(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (androidx.fragment.app.c cVar : this.c.o()) {
            if (cVar != null && cVar.V0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public InterfaceC6254lV0 B0() {
        InterfaceC6254lV0 interfaceC6254lV0 = this.D;
        if (interfaceC6254lV0 != null) {
            return interfaceC6254lV0;
        }
        androidx.fragment.app.c cVar = this.z;
        return cVar != null ? cVar.W.B0() : this.E;
    }

    public void C() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        T(1);
    }

    public C4828gQ.c C0() {
        return this.S;
    }

    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (androidx.fragment.app.c cVar : this.c.o()) {
            if (cVar != null && N0(cVar) && cVar.X0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cVar);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                androidx.fragment.app.c cVar2 = (androidx.fragment.app.c) this.e.get(i2);
                if (arrayList == null || !arrayList.contains(cVar2)) {
                    cVar2.x0();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public void E() {
        this.M = true;
        b0(true);
        Y();
        t();
        T(-1);
        Object obj = this.x;
        if (obj instanceof InterfaceC0681Dq0) {
            ((InterfaceC0681Dq0) obj).q(this.s);
        }
        Object obj2 = this.x;
        if (obj2 instanceof InterfaceC5506iq0) {
            ((InterfaceC5506iq0) obj2).h(this.r);
        }
        Object obj3 = this.x;
        if (obj3 instanceof InterfaceC8864uq0) {
            ((InterfaceC8864uq0) obj3).g(this.t);
        }
        Object obj4 = this.x;
        if (obj4 instanceof InterfaceC9150vq0) {
            ((InterfaceC9150vq0) obj4).v(this.u);
        }
        Object obj5 = this.x;
        if ((obj5 instanceof InterfaceC9952yj0) && this.z == null) {
            ((InterfaceC9952yj0) obj5).e(this.v);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.h();
            this.g = null;
        }
        F2 f2 = this.F;
        if (f2 != null) {
            f2.c();
            this.G.c();
            this.H.c();
        }
    }

    public C0313Ae1 E0(androidx.fragment.app.c cVar) {
        return this.R.m(cVar);
    }

    public void F() {
        T(1);
    }

    public void F0() {
        b0(true);
        if (!V || this.h == null) {
            if (this.j.g()) {
                J0(3);
                X0();
                return;
            } else {
                J0(3);
                this.g.k();
                return;
            }
        }
        if (!this.o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(o0(this.h));
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                AbstractC6314li0.a(it.next());
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = this.h.c.iterator();
        while (it3.hasNext()) {
            androidx.fragment.app.c cVar = ((g.a) it3.next()).b;
            if (cVar != null) {
                cVar.O = false;
            }
        }
        Iterator it4 = v(new ArrayList(Collections.singletonList(this.h)), 0, 1).iterator();
        while (it4.hasNext()) {
            ((androidx.fragment.app.h) it4.next()).f();
        }
        Iterator it5 = this.h.c.iterator();
        while (it5.hasNext()) {
            androidx.fragment.app.c cVar2 = ((g.a) it5.next()).b;
            if (cVar2 != null && cVar2.k0 == null) {
                w(cVar2).m();
            }
        }
        this.h = null;
        r1();
        if (J0(3)) {
            this.j.g();
            toString();
        }
    }

    public void G(boolean z) {
        if (z && (this.x instanceof InterfaceC0681Dq0)) {
            q1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.c.o()) {
            if (cVar != null) {
                cVar.d1();
                if (z) {
                    cVar.Y.G(true);
                }
            }
        }
    }

    public void G0(androidx.fragment.app.c cVar) {
        if (J0(2)) {
            Objects.toString(cVar);
        }
        if (cVar.d0) {
            return;
        }
        cVar.d0 = true;
        cVar.r0 = true ^ cVar.r0;
        n1(cVar);
    }

    public void H(boolean z, boolean z2) {
        if (z2 && (this.x instanceof InterfaceC8864uq0)) {
            q1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.c.o()) {
            if (cVar != null) {
                cVar.e1(z);
                if (z2) {
                    cVar.Y.H(z, true);
                }
            }
        }
    }

    public void H0(androidx.fragment.app.c cVar) {
        if (cVar.M && K0(cVar)) {
            this.J = true;
        }
    }

    public void I(androidx.fragment.app.c cVar) {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((InterfaceC3425bQ) it.next()).b(this, cVar);
        }
    }

    public boolean I0() {
        return this.M;
    }

    public void J() {
        for (androidx.fragment.app.c cVar : this.c.l()) {
            if (cVar != null) {
                cVar.B0(cVar.e0());
                cVar.Y.J();
            }
        }
    }

    public boolean K(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (androidx.fragment.app.c cVar : this.c.o()) {
            if (cVar != null && cVar.f1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean K0(androidx.fragment.app.c cVar) {
        return (cVar.h0 && cVar.i0) || cVar.Y.q();
    }

    public void L(Menu menu) {
        if (this.w < 1) {
            return;
        }
        for (androidx.fragment.app.c cVar : this.c.o()) {
            if (cVar != null) {
                cVar.g1(menu);
            }
        }
    }

    public final boolean L0() {
        androidx.fragment.app.c cVar = this.z;
        if (cVar == null) {
            return true;
        }
        return cVar.d0() && this.z.I().L0();
    }

    public final void M(androidx.fragment.app.c cVar) {
        if (cVar == null || !cVar.equals(g0(cVar.G))) {
            return;
        }
        cVar.k1();
    }

    public boolean M0(androidx.fragment.app.c cVar) {
        if (cVar == null) {
            return false;
        }
        return cVar.e0();
    }

    public void N() {
        T(5);
    }

    public boolean N0(androidx.fragment.app.c cVar) {
        if (cVar == null) {
            return true;
        }
        return cVar.g0();
    }

    public void O(boolean z, boolean z2) {
        if (z2 && (this.x instanceof InterfaceC9150vq0)) {
            q1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.c.o()) {
            if (cVar != null) {
                cVar.i1(z);
                if (z2) {
                    cVar.Y.O(z, true);
                }
            }
        }
    }

    public boolean O0(androidx.fragment.app.c cVar) {
        if (cVar == null) {
            return true;
        }
        FragmentManager fragmentManager = cVar.W;
        return cVar.equals(fragmentManager.A0()) && O0(fragmentManager.z);
    }

    public boolean P(Menu menu) {
        boolean z = false;
        if (this.w < 1) {
            return false;
        }
        for (androidx.fragment.app.c cVar : this.c.o()) {
            if (cVar != null && N0(cVar) && cVar.j1(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean P0(int i2) {
        return this.w >= i2;
    }

    public void Q() {
        r1();
        M(this.A);
    }

    public boolean Q0() {
        return this.K || this.L;
    }

    public void R() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        T(7);
    }

    public void R0(androidx.fragment.app.c cVar, Intent intent, int i2, Bundle bundle) {
        if (this.F == null) {
            this.x.A(cVar, intent, i2, bundle);
            return;
        }
        this.I.addLast(new LaunchedFragmentInfo(cVar.G, i2));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.F.a(intent);
    }

    public void S() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        T(5);
    }

    public void S0(int i2, boolean z) {
        QP qp;
        if (this.x == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.w) {
            this.w = i2;
            this.c.t();
            p1();
            if (this.J && (qp = this.x) != null && this.w == 7) {
                qp.B();
                this.J = false;
            }
        }
    }

    public final void T(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            S0(i2, false);
            Iterator it = u().iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.h) it.next()).q();
            }
            this.b = false;
            b0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public void T0() {
        if (this.x == null) {
            return;
        }
        this.K = false;
        this.L = false;
        this.R.p(false);
        for (androidx.fragment.app.c cVar : this.c.o()) {
            if (cVar != null) {
                cVar.k0();
            }
        }
    }

    public void U() {
        this.L = true;
        this.R.p(true);
        T(4);
    }

    public final void U0(FragmentContainerView fragmentContainerView) {
        View view;
        for (androidx.fragment.app.f fVar : this.c.k()) {
            androidx.fragment.app.c cVarK = fVar.k();
            if (cVarK.b0 == fragmentContainerView.getId() && (view = cVarK.l0) != null && view.getParent() == null) {
                cVarK.k0 = fragmentContainerView;
                fVar.b();
                fVar.m();
            }
        }
    }

    public void V() {
        T(2);
    }

    public void V0(androidx.fragment.app.f fVar) {
        androidx.fragment.app.c cVarK = fVar.k();
        if (cVarK.m0) {
            if (this.b) {
                this.N = true;
            } else {
                cVarK.m0 = false;
                fVar.m();
            }
        }
    }

    public final void W() {
        if (this.N) {
            this.N = false;
            p1();
        }
    }

    public void W0(int i2, int i3, boolean z) {
        if (i2 >= 0) {
            Z(new l(null, i2, i3), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                androidx.fragment.app.c cVar = (androidx.fragment.app.c) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
            }
        }
        int size2 = this.d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size2; i3++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.s(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size3 = this.a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size3; i4++) {
                        k kVar = (k) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(kVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.M);
        if (this.J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.J);
        }
    }

    public boolean X0() {
        return Z0(null, -1, 0);
    }

    public final void Y() {
        Iterator it = u().iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.h) it.next()).q();
        }
    }

    public boolean Y0(int i2, int i3) {
        if (i2 >= 0) {
            return Z0(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void Z(k kVar, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (!this.M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            r();
        }
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(kVar);
                    j1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean Z0(String str, int i2, int i3) {
        b0(false);
        a0(true);
        androidx.fragment.app.c cVar = this.A;
        if (cVar != null && i2 < 0 && str == null && cVar.t().X0()) {
            return true;
        }
        boolean zA1 = a1(this.O, this.P, str, i2, i3);
        if (zA1) {
            this.b = true;
            try {
                e1(this.O, this.P);
            } finally {
                s();
            }
        }
        r1();
        W();
        this.c.b();
        return zA1;
    }

    public final void a0(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.x == null) {
            if (!this.M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.x.t().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            r();
        }
        if (this.O == null) {
            this.O = new ArrayList();
            this.P = new ArrayList();
        }
    }

    public boolean a1(ArrayList arrayList, ArrayList arrayList2, String str, int i2, int i3) {
        int iH0 = h0(str, i2, (i3 & 1) != 0);
        if (iH0 < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iH0; size--) {
            arrayList.add((androidx.fragment.app.a) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean b0(boolean z) {
        a0(z);
        boolean z2 = false;
        while (p0(this.O, this.P)) {
            z2 = true;
            this.b = true;
            try {
                e1(this.O, this.P);
            } finally {
                s();
            }
        }
        r1();
        W();
        this.c.b();
        return z2;
    }

    public boolean b1(ArrayList arrayList, ArrayList arrayList2) {
        if (J0(2)) {
            Objects.toString(this.a);
        }
        if (this.d.isEmpty()) {
            return false;
        }
        ArrayList arrayList3 = this.d;
        androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList3.get(arrayList3.size() - 1);
        this.h = aVar;
        Iterator it = aVar.c.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.c cVar = ((g.a) it.next()).b;
            if (cVar != null) {
                cVar.O = true;
            }
        }
        return a1(arrayList, arrayList2, null, -1, 0);
    }

    public void c0(k kVar, boolean z) {
        if (z && (this.x == null || this.M)) {
            return;
        }
        a0(z);
        if (kVar.a(this.O, this.P)) {
            this.b = true;
            try {
                e1(this.O, this.P);
            } finally {
                s();
            }
        }
        r1();
        W();
        this.c.b();
    }

    public void c1() {
        Z(new m(), false);
    }

    public void d1(androidx.fragment.app.c cVar) {
        if (J0(2)) {
            Objects.toString(cVar);
            int i2 = cVar.V;
        }
        boolean zF0 = cVar.f0();
        if (cVar.e0 && zF0) {
            return;
        }
        this.c.u(cVar);
        if (K0(cVar)) {
            this.J = true;
        }
        cVar.N = true;
        n1(cVar);
    }

    public final void e0(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        boolean z = ((androidx.fragment.app.a) arrayList.get(i2)).r;
        ArrayList arrayList3 = this.Q;
        if (arrayList3 == null) {
            this.Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.Q.addAll(this.c.o());
        androidx.fragment.app.c cVarA0 = A0();
        boolean z2 = false;
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i4);
            cVarA0 = !((Boolean) arrayList2.get(i4)).booleanValue() ? aVar.w(this.Q, cVarA0) : aVar.z(this.Q, cVarA0);
            z2 = z2 || aVar.i;
        }
        this.Q.clear();
        if (!z && this.w >= 1) {
            for (int i5 = i2; i5 < i3; i5++) {
                Iterator it = ((androidx.fragment.app.a) arrayList.get(i5)).c.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.c cVar = ((g.a) it.next()).b;
                    if (cVar != null && cVar.W != null) {
                        this.c.r(w(cVar));
                    }
                }
            }
        }
        d0(arrayList, arrayList2, i2, i3);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
        if (z2 && !this.o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(o0((androidx.fragment.app.a) it2.next()));
            }
            if (this.h == null) {
                Iterator it3 = this.o.iterator();
                while (it3.hasNext()) {
                    AbstractC6314li0.a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = this.o.iterator();
                while (it5.hasNext()) {
                    AbstractC6314li0.a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i6 = i2; i6 < i3; i6++) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i6);
            if (zBooleanValue) {
                for (int size = aVar2.c.size() - 1; size >= 0; size--) {
                    androidx.fragment.app.c cVar2 = ((g.a) aVar2.c.get(size)).b;
                    if (cVar2 != null) {
                        w(cVar2).m();
                    }
                }
            } else {
                Iterator it7 = aVar2.c.iterator();
                while (it7.hasNext()) {
                    androidx.fragment.app.c cVar3 = ((g.a) it7.next()).b;
                    if (cVar3 != null) {
                        w(cVar3).m();
                    }
                }
            }
        }
        S0(this.w, true);
        for (androidx.fragment.app.h hVar : v(arrayList, i2, i3)) {
            hVar.B(zBooleanValue);
            hVar.x();
            hVar.n();
        }
        while (i2 < i3) {
            androidx.fragment.app.a aVar3 = (androidx.fragment.app.a) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue() && aVar3.v >= 0) {
                aVar3.v = -1;
            }
            aVar3.y();
            i2++;
        }
        if (z2) {
            f1();
        }
    }

    public final void e1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i2)).r) {
                if (i3 != i2) {
                    e0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i3)).r) {
                        i3++;
                    }
                }
                e0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            e0(arrayList, arrayList2, i3, size);
        }
    }

    public boolean f0() {
        boolean zB0 = b0(true);
        n0();
        return zB0;
    }

    public final void f1() {
        if (this.o.size() <= 0) {
            return;
        }
        AbstractC6314li0.a(this.o.get(0));
        throw null;
    }

    public androidx.fragment.app.c g0(String str) {
        return this.c.f(str);
    }

    public void g1(Parcelable parcelable) {
        androidx.fragment.app.f fVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.x.r().getClassLoader());
                this.m.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.x.r().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.c.x(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.c.v();
        Iterator it = fragmentManagerState.B.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.c.B((String) it.next(), null);
            if (bundleB != null) {
                androidx.fragment.app.c cVarI = this.R.i(((FragmentState) bundleB.getParcelable("state")).C);
                if (cVarI != null) {
                    if (J0(2)) {
                        cVarI.toString();
                    }
                    fVar = new androidx.fragment.app.f(this.p, this.c, cVarI, bundleB);
                } else {
                    fVar = new androidx.fragment.app.f(this.p, this.c, this.x.r().getClassLoader(), u0(), bundleB);
                }
                androidx.fragment.app.c cVarK = fVar.k();
                cVarK.C = bundleB;
                cVarK.W = this;
                if (J0(2)) {
                    cVarK.toString();
                }
                fVar.o(this.x.r().getClassLoader());
                this.c.r(fVar);
                fVar.s(this.w);
            }
        }
        for (androidx.fragment.app.c cVar : this.R.l()) {
            if (!this.c.c(cVar.G)) {
                if (J0(2)) {
                    cVar.toString();
                    Objects.toString(fragmentManagerState.B);
                }
                this.R.o(cVar);
                cVar.W = this;
                androidx.fragment.app.f fVar2 = new androidx.fragment.app.f(this.p, this.c, cVar);
                fVar2.s(1);
                fVar2.m();
                cVar.N = true;
                fVar2.m();
            }
        }
        this.c.w(fragmentManagerState.C);
        if (fragmentManagerState.D != null) {
            this.d = new ArrayList(fragmentManagerState.D.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.D;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarB = backStackRecordStateArr[i2].b(this);
                if (J0(2)) {
                    int i3 = aVarB.v;
                    aVarB.toString();
                    PrintWriter printWriter = new PrintWriter(new C1461Ld0("FragmentManager"));
                    aVarB.t("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVarB);
                i2++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(fragmentManagerState.E);
        String str3 = fragmentManagerState.F;
        if (str3 != null) {
            androidx.fragment.app.c cVarG0 = g0(str3);
            this.A = cVarG0;
            M(cVarG0);
        }
        ArrayList arrayList = fragmentManagerState.G;
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                this.l.put((String) arrayList.get(i4), (BackStackState) fragmentManagerState.H.get(i4));
            }
        }
        this.I = new ArrayDeque(fragmentManagerState.I);
    }

    public final int h0(String str, int i2, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.d.get(size);
            if ((str != null && str.equals(aVar.x())) || (i2 >= 0 && i2 == aVar.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.d.get(size - 1);
            if ((str == null || !str.equals(aVar2.x())) && (i2 < 0 || i2 != aVar2.v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public void i(androidx.fragment.app.a aVar) {
        this.d.add(aVar);
    }

    public androidx.fragment.app.c i0(int i2) {
        return this.c.g(i2);
    }

    public Bundle i1() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        n0();
        Y();
        b0(true);
        this.K = true;
        this.R.p(true);
        ArrayList arrayListY = this.c.y();
        HashMap mapM = this.c.m();
        if (mapM.isEmpty()) {
            J0(2);
            return bundle;
        }
        ArrayList arrayListZ = this.c.z();
        int size = this.d.size();
        if (size > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackRecordStateArr[i2] = new BackStackRecordState((androidx.fragment.app.a) this.d.get(i2));
                if (J0(2)) {
                    Objects.toString(this.d.get(i2));
                }
            }
        } else {
            backStackRecordStateArr = null;
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.B = arrayListY;
        fragmentManagerState.C = arrayListZ;
        fragmentManagerState.D = backStackRecordStateArr;
        fragmentManagerState.E = this.k.get();
        androidx.fragment.app.c cVar = this.A;
        if (cVar != null) {
            fragmentManagerState.F = cVar.G;
        }
        fragmentManagerState.G.addAll(this.l.keySet());
        fragmentManagerState.H.addAll(this.l.values());
        fragmentManagerState.I = new ArrayList(this.I);
        bundle.putParcelable("state", fragmentManagerState);
        for (String str : this.m.keySet()) {
            bundle.putBundle("result_" + str, (Bundle) this.m.get(str));
        }
        for (String str2 : mapM.keySet()) {
            bundle.putBundle("fragment_" + str2, (Bundle) mapM.get(str2));
        }
        return bundle;
    }

    public androidx.fragment.app.f j(androidx.fragment.app.c cVar) {
        String str = cVar.u0;
        if (str != null) {
            C4828gQ.f(cVar, str);
        }
        if (J0(2)) {
            cVar.toString();
        }
        androidx.fragment.app.f fVarW = w(cVar);
        cVar.W = this;
        this.c.r(fVarW);
        if (!cVar.e0) {
            this.c.a(cVar);
            cVar.N = false;
            if (cVar.l0 == null) {
                cVar.r0 = false;
            }
            if (K0(cVar)) {
                this.J = true;
            }
        }
        return fVarW;
    }

    public androidx.fragment.app.c j0(String str) {
        return this.c.h(str);
    }

    public void j1() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.x.t().removeCallbacks(this.T);
                    this.x.t().post(this.T);
                    r1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(InterfaceC3425bQ interfaceC3425bQ) {
        this.q.add(interfaceC3425bQ);
    }

    public androidx.fragment.app.c k0(String str) {
        return this.c.i(str);
    }

    public void k1(androidx.fragment.app.c cVar, boolean z) {
        ViewGroup viewGroupT0 = t0(cVar);
        if (viewGroupT0 == null || !(viewGroupT0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupT0).setDrawDisappearingViewsLast(!z);
    }

    public int l() {
        return this.k.getAndIncrement();
    }

    public void l1(androidx.fragment.app.c cVar, g.b bVar) {
        if (cVar.equals(g0(cVar.G)) && (cVar.X == null || cVar.W == this)) {
            cVar.v0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(QP qp, OP op, androidx.fragment.app.c cVar) {
        String str;
        if (this.x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.x = qp;
        this.y = op;
        this.z = cVar;
        if (cVar != null) {
            k(new g(cVar));
        } else if (qp instanceof InterfaceC3425bQ) {
            k((InterfaceC3425bQ) qp);
        }
        if (this.z != null) {
            r1();
        }
        if (qp instanceof InterfaceC3824cq0) {
            InterfaceC3824cq0 interfaceC3824cq0 = (InterfaceC3824cq0) qp;
            C3267aq0 c3267aq0C = interfaceC3824cq0.c();
            this.g = c3267aq0C;
            InterfaceC1764Ob0 interfaceC1764Ob0 = interfaceC3824cq0;
            if (cVar != null) {
                interfaceC1764Ob0 = cVar;
            }
            c3267aq0C.h(interfaceC1764Ob0, this.j);
        }
        if (cVar != null) {
            this.R = cVar.W.r0(cVar);
        } else if (qp instanceof InterfaceC0417Be1) {
            this.R = C3146aQ.k(((InterfaceC0417Be1) qp).n());
        } else {
            this.R = new C3146aQ(false);
        }
        this.R.p(Q0());
        this.c.A(this.R);
        Object obj = this.x;
        if ((obj instanceof InterfaceC3135aN0) && cVar == null) {
            YM0 ym0P = ((InterfaceC3135aN0) obj).p();
            ym0P.h("android:support:fragments", new YM0.c() { // from class: com.daaw.XP
                @Override // com.daaw.YM0.c
                public final Bundle a() {
                    return this.a.i1();
                }
            });
            Bundle bundleB = ym0P.b("android:support:fragments");
            if (bundleB != null) {
                g1(bundleB);
            }
        }
        Object obj2 = this.x;
        if (obj2 instanceof I2) {
            H2 h2L = ((I2) obj2).l();
            if (cVar != null) {
                str = cVar.G + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.F = h2L.l(str2 + "StartActivityForResult", new D2(), new h());
            this.G = h2L.l(str2 + "StartIntentSenderForResult", new j(), new i());
            this.H = h2L.l(str2 + "RequestPermissions", new C2(), new a());
        }
        Object obj3 = this.x;
        if (obj3 instanceof InterfaceC5506iq0) {
            ((InterfaceC5506iq0) obj3).i(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof InterfaceC0681Dq0) {
            ((InterfaceC0681Dq0) obj4).a(this.s);
        }
        Object obj5 = this.x;
        if (obj5 instanceof InterfaceC8864uq0) {
            ((InterfaceC8864uq0) obj5).f(this.t);
        }
        Object obj6 = this.x;
        if (obj6 instanceof InterfaceC9150vq0) {
            ((InterfaceC9150vq0) obj6).d(this.u);
        }
        Object obj7 = this.x;
        if ((obj7 instanceof InterfaceC9952yj0) && cVar == null) {
            ((InterfaceC9952yj0) obj7).u(this.v);
        }
    }

    public void m1(androidx.fragment.app.c cVar) {
        if (cVar == null || (cVar.equals(g0(cVar.G)) && (cVar.X == null || cVar.W == this))) {
            androidx.fragment.app.c cVar2 = this.A;
            this.A = cVar;
            M(cVar2);
            M(this.A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
    }

    public void n(androidx.fragment.app.c cVar) {
        if (J0(2)) {
            Objects.toString(cVar);
        }
        if (cVar.e0) {
            cVar.e0 = false;
            if (cVar.M) {
                return;
            }
            this.c.a(cVar);
            if (J0(2)) {
                cVar.toString();
            }
            if (K0(cVar)) {
                this.J = true;
            }
        }
    }

    public final void n0() {
        Iterator it = u().iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.h) it.next()).r();
        }
    }

    public final void n1(androidx.fragment.app.c cVar) {
        ViewGroup viewGroupT0 = t0(cVar);
        if (viewGroupT0 == null || cVar.v() + cVar.z() + cVar.K() + cVar.L() <= 0) {
            return;
        }
        if (viewGroupT0.getTag(AbstractC7855rD0.c) == null) {
            viewGroupT0.setTag(AbstractC7855rD0.c, cVar);
        }
        ((androidx.fragment.app.c) viewGroupT0.getTag(AbstractC7855rD0.c)).B1(cVar.J());
    }

    public androidx.fragment.app.g o() {
        return new androidx.fragment.app.a(this);
    }

    public Set o0(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < aVar.c.size(); i2++) {
            androidx.fragment.app.c cVar = ((g.a) aVar.c.get(i2)).b;
            if (cVar != null && aVar.i) {
                hashSet.add(cVar);
            }
        }
        return hashSet;
    }

    public void o1(androidx.fragment.app.c cVar) {
        if (J0(2)) {
            Objects.toString(cVar);
        }
        if (cVar.d0) {
            cVar.d0 = false;
            cVar.r0 = !cVar.r0;
        }
    }

    public void p() {
        androidx.fragment.app.a aVar = this.h;
        if (aVar != null) {
            aVar.u = false;
            aVar.o(true, new Runnable() { // from class: com.daaw.YP
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.c(this.B);
                }
            });
            this.h.f();
            f0();
        }
    }

    public final boolean p0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            try {
                int size = this.a.size();
                boolean zA = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zA |= ((k) this.a.get(i2)).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.a.clear();
                this.x.t().removeCallbacks(this.T);
            }
        }
    }

    public final void p1() {
        Iterator it = this.c.k().iterator();
        while (it.hasNext()) {
            V0((androidx.fragment.app.f) it.next());
        }
    }

    public boolean q() {
        boolean zK0 = false;
        for (androidx.fragment.app.c cVar : this.c.l()) {
            if (cVar != null) {
                zK0 = K0(cVar);
            }
            if (zK0) {
                return true;
            }
        }
        return false;
    }

    public int q0() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final void q1(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C1461Ld0("FragmentManager"));
        QP qp = this.x;
        try {
            if (qp != null) {
                qp.x("  ", null, printWriter, new String[0]);
            } else {
                X("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public final void r() {
        if (Q0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final C3146aQ r0(androidx.fragment.app.c cVar) {
        return this.R.j(cVar);
    }

    public final void r1() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.j(true);
                    if (J0(3)) {
                        toString();
                    }
                } else {
                    boolean z = q0() > 0 && O0(this.z);
                    if (J0(3)) {
                        toString();
                    }
                    this.j.j(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        this.b = false;
        this.P.clear();
        this.O.clear();
    }

    public OP s0() {
        return this.y;
    }

    public final void t() {
        QP qp = this.x;
        if (qp instanceof InterfaceC0417Be1 ? this.c.p().n() : qp.r() instanceof Activity ? !((Activity) this.x.r()).isChangingConfigurations() : true) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).B.iterator();
                while (it2.hasNext()) {
                    this.c.p().g((String) it2.next(), false);
                }
            }
        }
    }

    public final ViewGroup t0(androidx.fragment.app.c cVar) {
        ViewGroup viewGroup = cVar.k0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (cVar.b0 > 0 && this.y.m()) {
            View viewK = this.y.k(cVar.b0);
            if (viewK instanceof ViewGroup) {
                return (ViewGroup) viewK;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.fragment.app.c cVar = this.z;
        if (cVar != null) {
            sb.append(cVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            QP qp = this.x;
            if (qp != null) {
                sb.append(qp.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final Set u() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((androidx.fragment.app.f) it.next()).k().k0;
            if (viewGroup != null) {
                hashSet.add(androidx.fragment.app.h.v(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    public androidx.fragment.app.e u0() {
        androidx.fragment.app.e eVar = this.B;
        if (eVar != null) {
            return eVar;
        }
        androidx.fragment.app.c cVar = this.z;
        return cVar != null ? cVar.W.u0() : this.C;
    }

    public Set v(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator it = ((androidx.fragment.app.a) arrayList.get(i2)).c.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.c cVar = ((g.a) it.next()).b;
                if (cVar != null && (viewGroup = cVar.k0) != null) {
                    hashSet.add(androidx.fragment.app.h.u(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public List v0() {
        return this.c.o();
    }

    public androidx.fragment.app.f w(androidx.fragment.app.c cVar) {
        androidx.fragment.app.f fVarN = this.c.n(cVar.G);
        if (fVarN != null) {
            return fVarN;
        }
        androidx.fragment.app.f fVar = new androidx.fragment.app.f(this.p, this.c, cVar);
        fVar.o(this.x.r().getClassLoader());
        fVar.s(this.w);
        return fVar;
    }

    public QP w0() {
        return this.x;
    }

    public void x(androidx.fragment.app.c cVar) {
        if (J0(2)) {
            Objects.toString(cVar);
        }
        if (cVar.e0) {
            return;
        }
        cVar.e0 = true;
        if (cVar.M) {
            if (J0(2)) {
                cVar.toString();
            }
            this.c.u(cVar);
            if (K0(cVar)) {
                this.J = true;
            }
            n1(cVar);
        }
    }

    public LayoutInflater.Factory2 x0() {
        return this.f;
    }

    public void y() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        T(4);
    }

    public SP y0() {
        return this.p;
    }

    public void z() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        T(0);
    }

    public androidx.fragment.app.c z0() {
        return this.z;
    }

    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        public String B;
        public int C;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.B = str;
            this.C = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.B);
            parcel.writeInt(this.C);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.B = parcel.readString();
            this.C = parcel.readInt();
        }
    }
}
