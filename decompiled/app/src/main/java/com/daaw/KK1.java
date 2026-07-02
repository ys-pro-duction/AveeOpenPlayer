package com.daaw;

import com.google.android.gms.ads.internal.util.zzcc;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class KK1 implements HI1 {
    public final /* synthetic */ InterfaceC8442tK1 a;
    public final /* synthetic */ zzcc b;
    public final /* synthetic */ C3685cL1 c;

    public KK1(C3685cL1 c3685cL1, C7782qx1 c7782qx1, InterfaceC8442tK1 interfaceC8442tK1, zzcc zzccVar) {
        this.c = c3685cL1;
        this.a = interfaceC8442tK1;
        this.b = zzccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.daaw.HI1, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        synchronized (this.c.a) {
            try {
                AbstractC4274eT1.zzi("JS Engine is requesting an update");
                if (this.c.i == 0) {
                    AbstractC4274eT1.zzi("Starting reload.");
                    this.c.i = 2;
                    this.c.d(null);
                }
                this.a.r("/requestReload", this.b.zza());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
