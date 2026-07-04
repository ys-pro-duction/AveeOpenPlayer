package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.jc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5719jc2 extends AbstractC4448f42 {
    public final Context i;
    public final WeakReference j;
    public final C8512tb2 k;
    public final InterfaceC3761cd2 l;
    public final E42 m;
    public final C5090hL2 n;
    public final C4184e72 o;
    public final RS1 p;
    public boolean q;

    public C5719jc2(C4169e42 c4169e42, Context context, InterfaceC9334wW1 interfaceC9334wW1, C8512tb2 c8512tb2, InterfaceC3761cd2 interfaceC3761cd2, E42 e42, C5090hL2 c5090hL2, C4184e72 c4184e72, RS1 rs1) {
        super(c4169e42);
        this.q = false;
        this.i = context;
        this.j = new WeakReference(interfaceC9334wW1);
        this.k = c8512tb2;
        this.l = interfaceC3761cd2;
        this.m = e42;
        this.n = c5090hL2;
        this.o = c4184e72;
        this.p = rs1;
    }

    public final void finalize() throws Throwable {
        try {
            final InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) this.j.get();
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.H6)).booleanValue()) {
                if (!this.q && interfaceC9334wW1 != null) {
                    AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.ic2
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

    public final boolean h() {
        return this.m.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(boolean r5, android.app.Activity r6) {
        /*
            r4 = this;
            com.daaw.tb2 r0 = r4.k
            r0.zzb()
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.A0
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4e
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r0 = r4.i
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzF(r0)
            if (r0 == 0) goto L4e
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.daaw.AbstractC4274eT1.zzj(r5)
            com.daaw.e72 r5 = r4.o
            r5.zzb()
            com.daaw.qE1 r5 = com.daaw.AbstractC9820yE1.B0
            com.daaw.wE1 r6 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r5 = r6.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lc4
            com.daaw.hL2 r5 = r4.n
            com.daaw.wF2 r6 = r4.a
            com.daaw.vF2 r6 = r6.b
            com.daaw.jF2 r6 = r6.b
            java.lang.String r6 = r6.b
            r5.a(r6)
            goto Lc4
        L4e:
            java.lang.ref.WeakReference r0 = r4.j
            java.lang.Object r0 = r0.get()
            com.daaw.wW1 r0 = (com.daaw.InterfaceC9334wW1) r0
            com.daaw.qE1 r2 = com.daaw.AbstractC9820yE1.Pa
            com.daaw.wE1 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L92
            if (r0 == 0) goto L92
            com.daaw.fF2 r0 = r0.b()
            if (r0 == 0) goto L92
            boolean r2 = r0.s0
            if (r2 == 0) goto L92
            int r0 = r0.t0
            com.daaw.RS1 r2 = r4.p
            int r2 = r2.a()
            if (r0 == r2) goto L92
            java.lang.String r5 = "The interstitial consent form has been shown."
            com.daaw.AbstractC4274eT1.zzj(r5)
            com.daaw.e72 r5 = r4.o
            r6 = 12
            java.lang.String r0 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r6 = com.daaw.AbstractC5908kG2.d(r6, r0, r3)
            r5.d(r6)
            goto Lc4
        L92:
            boolean r0 = r4.q
            if (r0 == 0) goto La6
            java.lang.String r0 = "The interstitial ad has been shown."
            com.daaw.AbstractC4274eT1.zzj(r0)
            com.daaw.e72 r0 = r4.o
            r2 = 10
            com.google.android.gms.ads.internal.client.zze r2 = com.daaw.AbstractC5908kG2.d(r2, r3, r3)
            r0.d(r2)
        La6:
            boolean r0 = r4.q
            if (r0 != 0) goto Lc4
            if (r6 != 0) goto Lae
            android.content.Context r6 = r4.i
        Lae:
            com.daaw.cd2 r0 = r4.l     // Catch: com.daaw.C3483bd2 -> Lbe
            com.daaw.e72 r2 = r4.o     // Catch: com.daaw.C3483bd2 -> Lbe
            r0.a(r5, r6, r2)     // Catch: com.daaw.C3483bd2 -> Lbe
            com.daaw.tb2 r5 = r4.k     // Catch: com.daaw.C3483bd2 -> Lbe
            r5.zza()     // Catch: com.daaw.C3483bd2 -> Lbe
            r5 = 1
            r4.q = r5
            return r5
        Lbe:
            r5 = move-exception
            com.daaw.e72 r6 = r4.o
            r6.U(r5)
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5719jc2.i(boolean, android.app.Activity):boolean");
    }
}
