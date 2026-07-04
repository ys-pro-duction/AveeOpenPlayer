package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbwi;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.zh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10223zh2 extends AbstractC4448f42 {
    public final Context i;
    public final WeakReference j;
    public final InterfaceC3761cd2 k;
    public final C8512tb2 l;
    public final C4184e72 m;
    public final U72 n;
    public final E42 o;
    public final InterfaceC7351pQ1 p;
    public final C5090hL2 q;
    public final C9825yF2 r;
    public boolean s;

    public C10223zh2(C4169e42 c4169e42, Context context, InterfaceC9334wW1 interfaceC9334wW1, InterfaceC3761cd2 interfaceC3761cd2, C8512tb2 c8512tb2, C4184e72 c4184e72, U72 u72, E42 e42, C4498fF2 c4498fF2, C5090hL2 c5090hL2, C9825yF2 c9825yF2) {
        super(c4169e42);
        this.s = false;
        this.i = context;
        this.k = interfaceC3761cd2;
        this.j = new WeakReference(interfaceC9334wW1);
        this.l = c8512tb2;
        this.m = c4184e72;
        this.n = u72;
        this.o = e42;
        this.q = c5090hL2;
        zzbwi zzbwiVar = c4498fF2.n;
        this.p = new NQ1(zzbwiVar != null ? zzbwiVar.B : "", zzbwiVar != null ? zzbwiVar.C : 1);
        this.r = c9825yF2;
    }

    public final void finalize() throws Throwable {
        try {
            final InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) this.j.get();
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.H6)).booleanValue()) {
                if (!this.s && interfaceC9334wW1 != null) {
                    AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.yh2
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC9334wW1.destroy();
                        }
                    });
                }
            } else if (interfaceC9334wW1 != null) {
                interfaceC9334wW1.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final Bundle h() {
        return this.n.B0();
    }

    public final InterfaceC7351pQ1 i() {
        return this.p;
    }

    public final C9825yF2 j() {
        return this.r;
    }

    public final boolean k() {
        return this.o.a();
    }

    public final boolean l() {
        return this.s;
    }

    public final boolean m() {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) this.j.get();
        return (interfaceC9334wW1 == null || interfaceC9334wW1.x()) ? false : true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean n(boolean z, Activity activity) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.A0)).booleanValue()) {
            zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzF(this.i)) {
                AbstractC4274eT1.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.m.zzb();
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.B0)).booleanValue()) {
                    this.q.a(this.a.b.b.b);
                }
                return false;
            }
        }
        if (this.s) {
            AbstractC4274eT1.zzj("The rewarded ad have been showed.");
            this.m.d(AbstractC5908kG2.d(10, null, null));
            return false;
        }
        this.s = true;
        this.l.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.i;
        }
        try {
            this.k.a(z, context, this.m);
            this.l.zza();
            return true;
        } catch (C3483bd2 e) {
            this.m.U(e);
            return false;
        }
    }
}
