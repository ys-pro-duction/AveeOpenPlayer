package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcl;

/* JADX INFO: loaded from: classes3.dex */
public final class C62 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ Context H;
    public final /* synthetic */ Bundle I;
    public final /* synthetic */ C3831cr2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62(C3831cr2 c3831cr2, String str, String str2, Context context, Bundle bundle) {
        super(c3831cr2, true);
        this.J = c3831cr2;
        this.F = str;
        this.G = str2;
        this.H = context;
        this.I = bundle;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.J.m(this.F, this.G)) {
                str3 = this.G;
                str2 = this.F;
                str = this.J.a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC7506py0.l(this.H);
            C3831cr2 c3831cr2 = this.J;
            c3831cr2.i = c3831cr2.s(this.H, true);
            if (this.J.i == null) {
                String unused = this.J.a;
                return;
            }
            int iA = DynamiteModule.a(this.H, ModuleDescriptor.MODULE_ID);
            ((ST1) AbstractC7506py0.l(this.J.i)).initialize(BinderC7744qp0.Z2(this.H), new zzcl(79000L, Math.max(iA, r0), DynamiteModule.c(this.H, ModuleDescriptor.MODULE_ID) < iA, str, str2, str3, this.I, AbstractC8742uP2.a(this.H)), this.B);
        } catch (Exception e) {
            this.J.j(e, true, false);
        }
    }
}
