package com.daaw;

import android.graphics.Shader;
import com.daaw.C2559Vm;

/* JADX INFO: loaded from: classes.dex */
public abstract class SQ0 extends AbstractC2117Rg {
    public Shader c;
    public long d;

    public SQ0() {
        super(null);
        this.d = C9879yT0.b.a();
    }

    @Override // com.daaw.AbstractC2117Rg
    public final void a(long j, InterfaceC8595ts0 interfaceC8595ts0, float f) {
        G10.g(interfaceC8595ts0, "p");
        Shader shaderB = this.c;
        if (shaderB == null || !C9879yT0.f(this.d, j)) {
            shaderB = b(j);
            this.c = shaderB;
            this.d = j;
        }
        long jA = interfaceC8595ts0.a();
        C2559Vm.a aVar = C2559Vm.b;
        if (!C2559Vm.o(jA, aVar.a())) {
            interfaceC8595ts0.t(aVar.a());
        }
        if (!G10.c(interfaceC8595ts0.j(), shaderB)) {
            interfaceC8595ts0.i(shaderB);
        }
        if (interfaceC8595ts0.o() == f) {
            return;
        }
        interfaceC8595ts0.c(f);
    }

    public abstract Shader b(long j);
}
