package com.daaw;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class P22 extends AbstractC4448f42 {
    public final InterfaceC9334wW1 i;
    public final int j;
    public final Context k;
    public final E22 l;
    public final InterfaceC3761cd2 m;
    public final C8512tb2 n;
    public final C4184e72 o;
    public final boolean p;
    public final RS1 q;
    public boolean r;

    public P22(C4169e42 c4169e42, Context context, InterfaceC9334wW1 interfaceC9334wW1, int i, E22 e22, InterfaceC3761cd2 interfaceC3761cd2, C8512tb2 c8512tb2, C4184e72 c4184e72, RS1 rs1) {
        super(c4169e42);
        this.r = false;
        this.i = interfaceC9334wW1;
        this.k = context;
        this.j = i;
        this.l = e22;
        this.m = interfaceC3761cd2;
        this.n = c8512tb2;
        this.o = c4184e72;
        this.p = ((Boolean) zzba.zzc().b(AbstractC9820yE1.h5)).booleanValue();
        this.q = rs1;
    }

    @Override // com.daaw.AbstractC4448f42
    public final void a() {
        super.a();
        InterfaceC9334wW1 interfaceC9334wW1 = this.i;
        if (interfaceC9334wW1 != null) {
            interfaceC9334wW1.destroy();
        }
    }

    public final int h() {
        return this.j;
    }

    public final void i(InterfaceC8967vA1 interfaceC8967vA1) {
        InterfaceC9334wW1 interfaceC9334wW1 = this.i;
        if (interfaceC9334wW1 != null) {
            interfaceC9334wW1.p0(interfaceC8967vA1);
        }
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
    public final void j(Activity activity, IA1 ia1, boolean z) {
        InterfaceC9334wW1 interfaceC9334wW1;
        C4498fF2 c4498fF2B;
        Context context = activity;
        if (activity == null) {
            context = this.k;
        }
        if (this.p) {
            this.n.zzb();
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.A0)).booleanValue()) {
            zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzF(context)) {
                AbstractC4274eT1.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.o.zzb();
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.B0)).booleanValue()) {
                    new C5090hL2(context.getApplicationContext(), zzt.zzt().zzb()).a(this.a.b.b.b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Pa)).booleanValue() && (interfaceC9334wW1 = this.i) != null && (c4498fF2B = interfaceC9334wW1.b()) != null && c4498fF2B.s0 && c4498fF2B.t0 != this.q.a()) {
            AbstractC4274eT1.zzj("The app open consent form has been shown.");
            this.o.d(AbstractC5908kG2.d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.r) {
            AbstractC4274eT1.zzj("App open interstitial ad is already visible.");
            this.o.d(AbstractC5908kG2.d(10, null, null));
        }
        if (this.r) {
            return;
        }
        try {
            this.m.a(z, context, this.o);
            if (this.p) {
                this.n.zza();
            }
            this.r = true;
        } catch (C3483bd2 e) {
            this.o.U(e);
        }
    }

    public final void k(long j, int i) {
        this.l.a(j, i);
    }
}
